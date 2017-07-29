(function() {
    layui.use(['laytpl', 'jquery', 'layer', 'tools', 'form'], function() {
        var laytpl = layui.laytpl;
        var $ = layui.jquery;
        var getUrl = "/site/ajax/list";
        var layer = layui.layer;
        var tools = layui.tools;
        var form = layui.form();

        // Start: 所有 function 定义
        var sitesId2MarkerMap = {}; // 站点 marker map
        layui.SitesManageGlobal['sitesId2MarkerMap'] = sitesId2MarkerMap;

        // Start: 地图相关 functions
        var opts = {
            width : 250,     // 信息窗口宽度
            height: 80,     // 信息窗口高度
            title : "信息窗口" , // 信息窗口标题
            enableMessage:true//设置允许信息窗发送短息
        };
        function addClickHandler(content, marker) {
            marker.addEventListener("click",function(e){
                openInfo(content,e)}
            );
        }
        function openInfo(content, e){
            var p = e.target;
            var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat + 0.009);
            var infoWindow = new BMap.InfoWindow(content, opts);  // 创建信息窗口对象
            layui.SitesManageGlobal['map'].openInfoWindow(infoWindow, point); //开启信息窗口
        }
        // End  : 地图相关 functions

        /**
         * 重新渲染 select search sites options
         * @param selectedSiteId
         */
        function renderSelectSearchSitesOptions(selectedSiteId) {
            var sitesDataArr = renderSelectSearchSitesOptions.sitesDataArr;
            if(sitesDataArr && sitesDataArr.length && sitesDataArr.length > 0) {
                var arr_options_sites = [];
                sitesDataArr.forEach(function(item_siteData) {
                    arr_options_sites.push([
                        '<option value="'
                        , item_siteData.id
                        , '"'
                        , ((selectedSiteId && selectedSiteId == item_siteData.id) ? ' selected' : '')
                        , '>'
                        , item_siteData.name
                        , '</option>'].join(''));
                });
                $('#select-search_site').html(arr_options_sites.join(''));
                form.render();
            }
        }

        function triggerSiteNodeClick(siteId) {
            var siteTableTr;
            if(siteId) {
                siteTableTr = $(['.site-table-tr[data-id=', siteId,']'].join(''));
            }
            if(!siteTableTr) {
                siteTableTr = $('.site-table-tr:first');
            }
            siteTableTr.click();
        }

        function searchList(currPage) {
            console.log("开始查询站点 list 的信息 ...");
            layer.load();   // loading
            $.get(
                getUrl,
                {"currPage": currPage || 1},
                function (data) {
                    console.log("查询到的站点 list 信息:" + JSON.stringify(data));
                    var total = data.total;
                    var page = data.page;
                    var totalPage = data.totalPage;
                    var sitesDataArr = data.data;
                    console.log(['[sites-manage searchList]total: ', total].join(''));
                    console.log(['[sites-manage searchList]page: ', page].join(''));
                    console.log(['[sites-manage searchList]totalPage: ', totalPage].join(''));
                    console.log(['[sites-manage searchList]sitesDataArr: ', JSON.stringify(sitesDataArr)].join(''));
                    // Start: 站点列表刷新
                    laytpl(sitesList.innerHTML).render(sitesDataArr, function (html) {
                        sitesListTableView.innerHTML = html;
                        layer.closeAll('loading');   //关闭所有的loading
                    });
                    // End  : 站点列表刷新

                    // Start: 站点在地图上增加 marker
                    if(sitesDataArr && sitesDataArr.length && sitesDataArr.length > 0) {
                        sitesDataArr.forEach(function(siteDataItem, siteDataIndex) {
                            // var pointChengDu4 = new BMap.Point(pointChengDu.lng + siteDataItem.longitude / 1000, pointChengDu.lat + siteDataItem.latitude / 1000);
                            var pointChengDu4 = new BMap.Point(siteDataItem.longitude, siteDataItem.latitude);
                            var marker = new BMap.Marker(pointChengDu4);// 创建标注
                            map.addOverlay(marker);             // 将标注添加到地图中
                            // 记录 marker
                            markersArr.push(marker);
                            sitesId2MarkerMap[siteDataItem.id] = marker;
                            // Start: marker 点击后的弹出层
                            addClickHandler(['[站点 id ： ', siteDataItem.id, '][站点 name ： ', siteDataItem.name, '][站点经度： ',
                                siteDataItem.longitude, '][站点纬度： ', siteDataItem.latitude, ']'].join(''), marker);
                            // End  : marker 点击后的弹出层
                        });
                    }
                    // End  : 站点在地图上增加 marker
                    // Start: 触发第一个站点的 click
                    var urlSiteId = tools.getQueryString('siteId');
                    triggerSiteNodeClick(urlSiteId);
                    // End  : 触发第一个站点的 click

                    // Start: 初始化 select search site
                    renderSelectSearchSitesOptions.sitesDataArr = sitesDataArr; // 缓存用于反复渲染
                    renderSelectSearchSitesOptions();
                    // End  : 初始化 select search site
                },
                "json"
            );
        }

        /**
         * 展示 layerContent_tpl 于 layer 中
         */
        function showLayerContentTplInLayer(title, content) {
            laytpl(layerContent_tpl.innerHTML).render(content, function(html) {
                layer.open({
                    type: 1
                    , title: title
                    , area: ['400px', '300px']
                    , shadeClose: true //开启遮罩关闭
                    , maxmin: true
                    , content: html
                    , btn: ['取消', '提交']
                    , yes: function (index, layero) {
                        alert('点击了按钮 yes');
                        //按钮【按钮一】的回调
                        layer.close(index);
                        // alert("点击了按钮1");
                    }
                    , btn2: function (index, layero) {
                        alert("点击了按钮 2");
                        //按钮【按钮二】的回调
                        //return false 开启该代码可禁止点击该按钮关闭
                    }
                    ,
                });
            });
        }
        // End  : 所有 function 定义

        // Start: 逻辑
        searchList();   // 第一次加载数据
        // End  : 逻辑

        // Start: 所有事件绑定
        /**
         * 【查看设备】按钮被点击
         */
        $(document).on('click', '.view-devices-by-site-id', function() {
            var thisBtn = $(this);
            var siteId = thisBtn.data('id');
            //
            showLayerContentTplInLayer('根据站点查询设备', ['siteId: ', siteId].join(''))
        });

        /**
         * [站点列表]中某站点被点击
         */
        $(document).on('click', '.site-table-tr', function() {
            var thisTr = $(this);
            var siteId = thisTr.data('id');
            var siteName = thisTr.data('name');
            var siteLongitude = thisTr.data('longitude');
            var siteLatitude = thisTr.data('latitude');
            var siteParent = thisTr.data('parent');
            // Start: 被选中的 tr addClass 以区分
            var siteTrSelectedClassStr = 'site-tr-selected';
            $('.site-table-tr').removeClass(siteTrSelectedClassStr);
            thisTr.addClass(siteTrSelectedClassStr);
            // End  : 被选中的 tr addClass 以区分
            //
            /*showLayerContentTplInLayer('站点信息', ['[siteId: ', siteId, '][siteName: ',
              siteName, '][siteLongitude: ', siteLongitude, '][siteLatitude: ', siteLatitude, ']'].join(''));*/
            console.log(['站点信息[siteId: ', siteId, '][siteName: ', siteName, '][siteLongitude: ',
                siteLongitude, '][siteLatitude: ', siteLatitude, ']'].join(''));
            // Start: 从 sitesId2MarkerMap 中得到对应 marker 并展示（1. 表格中展示详情； 2. marker focus 调整地图到 marker ； 3. marker 弹跳）
            var trMarker = sitesId2MarkerMap[siteId];
            // 其他 marker 停止动画，当前选中 marker 开始动画
            markersArr.forEach(function (markerItem) {
                markerItem.setAnimation(null);
            });
            trMarker.setAnimation(BMAP_ANIMATION_BOUNCE); //跳动的动画
            // 移动到 trMarker 为中心的点
            var trMarkerPosition = trMarker.getPosition();
            layui.SitesManageGlobal['map'].panTo(new BMap.Point(trMarkerPosition.lng, trMarkerPosition.lat));
            // layui.SitesManageGlobal['map'].panTo(new BMap.Point(siteLongitude, siteLatitude));
            // End  : 从 sitesId2MarkerMap 中得到对应 marker 并展示（1. 表格中展示详情； 2. marker focus 调整地图到 marker ； 3. marker 弹跳）
            // Start: 展示站点详情于表格中
            var siteDetailInfoData = {
                siteId: siteId,
                siteName: siteName,
                siteLongitude: siteLongitude,
                siteLatitude: siteLatitude,
                siteParent: siteParent
            };
            laytpl(siteDetailInfo_tpl.innerHTML).render(siteDetailInfoData, function (html) {
                siteDetailInfo.innerHTML = html;
            });
            // End  : 展示站点详情于表格中
            // Start: 重新渲染 select search site
            renderSelectSearchSitesOptions(siteId);
            // End  : 重新渲染 select search site
            // Start: 在编辑地图按钮上附加 siteId ，以便获取到当前应该编辑的 siteId
            $('#button-edit_site_pos_in_map').data('siteId', siteId);
            // End  : 在编辑地图按钮上附加 siteId ，以便获取到当前应该编辑的 siteId
        });
        /**
         * 绑定事件： select search site 的 option 被点击后，要触发相应 site tr 的 click
         */
        form.on('select(search-site)', function(data){
            console.log(data.elem); //得到select原始DOM对象
            console.log(data.value); //得到被选中的值
            console.log(data.othis); //得到美化后的DOM对象
            //
            var siteId = data.value;
            triggerSiteNodeClick(siteId);
        });
        // End  : 所有事件绑定

    });
})();