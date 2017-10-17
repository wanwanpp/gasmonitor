(function() {
    layui.use(['laytpl', 'jquery', 'layer', 'tools', 'form', 'webStorageCache', 'laydate'], function() {
        var laytpl = layui.laytpl;
        var $ = layui.jquery;
        var getUrl = "/site/ajax/list";
        var layer = layui.layer;
        var tools = layui.tools;
        var form = layui.form();

        // 经下面几行代码测试成功： 同 domain 下的 cache 可跨 iframe 共享
        /*debugger;
        var cache_pandaroid = layui.webStorageCache.wsCache.get('Pandaroid');
        console.log('cache_pandaroid: ' + cache_pandaroid);*/

        // Start: 所有 function 定义
        var sitesId2MarkerMap = {}; // 站点 marker map
        layui.SitesManageGlobal['sitesId2MarkerMap'] = sitesId2MarkerMap;

        // Start: 地图相关 functions
        var opts = {
            width : 0,     // 信息窗口宽度
            height: 0,     // 信息窗口高度
            title : "<h4 style='font-weight: bold; font-size: 16px; margin: -3px 0 3px;'>站点包含的设备</h4>" , // 信息窗口标题
            enableMessage:false // 设置不允许信息窗发送短息
        };
        function addClickHandler(content, marker, siteId) {
            console.log('[addClickHandler]marker: ');
            console.log(marker);
            marker.addEventListener("click", function(e) {
                console.log('[addEventListener]e: ');
                console.log(e);
                // 1. 请求 /device/ajax/list?siteId=1 ，得到设备列表
                var DeviceAjaxListGetter = (function(siteId) {
                    var _url = '/device/ajax/list'
                        , _params = {siteId: siteId};
                    return {
                        execute: function(callbackSuccess) {
                            var urlWithParams = _url + tools.serializeParams(_params);
                            $.get(urlWithParams, {}, callbackSuccess, 'json');
                        }
                    };
                })(siteId);
                // 2. 设备列表数据渲染 laytpl ，得到 content_html
                var callback_renderDevicesListTpl = function(data_deviceAjaxList) {
                    if(!data_deviceAjaxList) {
                        return ;
                    }
                    var devicesArr = data_deviceAjaxList.data;
                    if(!devicesArr) {
                        return ;
                    }
                    /*laytpl(tpl_bMapOpenInfoWindow_content.innerHTML).render(devicesArr, function(html_tpl_bMapOpenInfoWindow_content) {
                        // 3. openInfo 显示 content_html
                        openInfo(html_tpl_bMapOpenInfoWindow_content, e);
                    });*/
                    // 3. openInfo 显示 content_html
                    openInfo(tpl_bMapOpenInfoWindow_content_vue.innerHTML, e, function() {
                        // layer.alert('eventFucntionOpen 触发 Vue 初始化');
                        // 下面的手动释放代码有问题，经测试自动释放没有问题， n 次 new Vue 后内存无过多上升
                        /*if(openInfo.vue_bMapOpenInfoWindow_content_tbody) {
                            openInfo.vue_bMapOpenInfoWindow_content_tbody.delete();
                        }*/
                        openInfo.vue_bMapOpenInfoWindow_content_tbody = new Vue({
                            el: '#tpl_bMapOpenInfoWindow_content_vue-tbody',
                            data: {
                                devicesArr: devicesArr
                            },
                            filters: {
                                capitalize: function (value) {
                                    if (!value) return '';
                                    value = value.toString();
                                    return value.charAt(0).toUpperCase() + value.slice(1);
                                },
                                formatTimeStr: function(timestamp) {
                                    return laydate.now(timestamp, 'YYYY-MM-DD hh:mm:ss');
                                }
                            }
                        });
                    });
                };
                DeviceAjaxListGetter.execute(callback_renderDevicesListTpl);
            });
        }
        function openInfo(content, e, eventFunctionOpen){
            var p = e.target;
            var point = new BMap.Point(p.getPosition().lng, p.getPosition().lat + 0.009);
            var infoWindow = new BMap.InfoWindow(content, opts);  // 创建信息窗口对象
            // Start: 测试 infoWindow addEventListener open
            infoWindow.addEventListener('open', function() {
                if(eventFunctionOpen && eventFunctionOpen instanceof Function) {
                    eventFunctionOpen();
                }
            });
            // End  : 测试 infoWindow addEventListener open
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
                            /*addClickHandler(['[站点 id ： ', siteDataItem.id, '][站点 name ： ', siteDataItem.name, '][站点经度： ',
                                siteDataItem.longitude, '][站点纬度： ', siteDataItem.latitude, ']'].join(''), marker);*/
                            addClickHandler((function() {
                                return ['站点： ', siteDataItem.name].join('');
                            })(), marker, siteDataItem.id);
                            // End  : marker 点击后的弹出层
                        });
                    }
                    // sitesId2MarkerMap 已完成初始化，现在触发事件
                    $('body').trigger('event_sitesId2MarkerMap');
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
                    , btn: ['关闭']
                    , yes: function (index, layero) {
                        layer.msg('关闭');
                        //按钮【按钮一】的回调
                        layer.close(index);
                    }
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
        /*$(document).on('click', '.view-devices-by-site-id', function() {
            var thisBtn = $(this);
            var siteId = thisBtn.data('id')
                , siteName = thisBtn.data('name');
            //
            /!*showLayerContentTplInLayer(['根据站点查询设备【站点： ', siteName, '】'].join('')
                , ['siteId: ', siteId].join(''))*!/
            tools.jumpLeftNavTab(['/device/list?siteId=', siteId].join(''));
        });*/
        $(document).on('click', '#button-view_site_devices', function () {
            var element_siteTrSelected = $('.site-table-tr.site-tr-selected');
            var siteId = element_siteTrSelected.data('id')
                , siteName = element_siteTrSelected.data('name');
            //
            /*showLayerContentTplInLayer(['根据站点查询设备【站点： ', siteName, '】'].join('')
                , ['siteId: ', siteId].join(''));*/
            tools.jumpLeftNavTab(['/device/list?siteId=', siteId].join(''));
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
            $('#button-edit_site_pos_in_map').data('siteName', siteName);
            $('#button-edit_site_pos_in_map').data('siteLongitude', siteLongitude);
            $('#button-edit_site_pos_in_map').data('siteLatitude', siteLatitude);
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