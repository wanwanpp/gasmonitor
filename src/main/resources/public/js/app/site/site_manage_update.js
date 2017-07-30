(function() {
    layui.use(['jquery', 'laytpl'], function() {
        var $ = layui.jquery;
        var laytpl = layui.laytpl;
        // hide ： 【提交】或【取消】按钮组
        var submitOrCancelEditSiteInfoBtnContainer = $('#submit-or-cancel-edit-site-info-btn-container');
        submitOrCancelEditSiteInfoBtnContainer.hide();
        // 【编辑站点详情】按钮被点击后
        var click2EditSiteInfoBtnIdStr = '#click-2-edit-site-info-btn';
        var click2EditSiteInfoBtn = $(click2EditSiteInfoBtnIdStr);
        // fadeIn 和 fadeOut 的速度
        var fadeSpeedStr = 'normal';
        // 表单数据处理对象
        var SiteInfoEditManager = {
            // 保存表单数据，【取消】后可以恢复
            saveSiteInfo: function() {
                console.log('[saveSiteInfo]保存表单数据，【取消】后可以恢复');

            },
            // load 【function saveSiteInfo】保存的数据
            loadSavedSiteInfo: function() {
                console.log('[loadSavedSiteInfo]load 【function saveSiteInfo】保存的数据');

            },
            // 激活站点详情表单可编辑
            enableSiteInfoTableFormEdit: function() {
                console.log('[enableSiteInfoTableFormEdit]激活站点详情表单可编辑');
                // $('.site-edit-labels').hide();
                $('.site-edit-td').addClass('site-editing');
                // $('.site-edit-inputs').show();
            },
            // 恢复表单不可编辑状态
            disableSiteInfoTableFormEdit: function() {
                console.log('[disableSiteInfoTableFormEdit]恢复站点详情表单不可编辑');
                // $('.site-edit-inputs').hide();
                $('.site-edit-td').removeClass('site-editing');
                // $('.site-edit-labels').show();
            },
            // 刷新表单
            reloadSiteInfo2Table: function(siteId) {
                console.log('[reloadSiteInfo2Table]刷新表单');
                window.location.replace(['/site/sites-manage?siteId=', siteId].join(''));
            }
        };
        // 【编辑】按钮被点击
        $(document).on('click', click2EditSiteInfoBtnIdStr, function() {
            // 隐藏【编辑】按钮
            click2EditSiteInfoBtn.fadeOut(fadeSpeedStr, function() {
                // 显示【提交】或【取消】按钮组
                submitOrCancelEditSiteInfoBtnContainer.fadeIn(fadeSpeedStr);
            });
            // 保存表单数据，【取消】后可以恢复
            SiteInfoEditManager.saveSiteInfo();
            // 激活站点详情表单可编辑
            SiteInfoEditManager.enableSiteInfoTableFormEdit();
        });
        // 【提交】或【取消】按钮被点击以后
        function hideSubmitOrCancelAndShowEditBtn() {
            submitOrCancelEditSiteInfoBtnContainer.fadeOut(fadeSpeedStr, function() {
                click2EditSiteInfoBtn.fadeIn(fadeSpeedStr);
            });
        }
        $(document).on('click', '#submit-edited-site-info-btn', function() {
            layer.load();   // loading
            // Start: 搜集参数
            var element_siteTrSelected = $('.site-tr-selected');
            var siteId = element_siteTrSelected.data('id');
            var siteName = element_siteTrSelected.data('name');
            var siteLongitude = element_siteTrSelected.data('longitude');
            var siteLatitude = element_siteTrSelected.data('latitude');
            var siteParent = element_siteTrSelected.data('parent');
            console.log('[site_manage_update.js submit-edit] siteId：' + siteId);
            console.log('[site_manage_update.js submit-edit] siteName：' + siteName);
            console.log('[site_manage_update.js submit-edit] siteLongitude：' + siteLongitude);
            console.log('[site_manage_update.js submit-edit] siteLatitude：' + siteLatitude);
            console.log('[site_manage_update.js submit-edit] siteParent：' + siteParent);
            // End  : 搜集参数
            // Start: post 的 url 、 param 和 callback
            var url = '/site/ajax/update';
            var params = {id: siteId, name: $('#siteName').val(), longitude: $('#siteLongitude').val()
                , latitude: $('#siteLatitude').val()};
            var callback = function(data) {
                console.log('[post: /site/ajax/update] callback data: ', data);
                // 切换【提交】【取消】按钮和【提交按钮】
                hideSubmitOrCancelAndShowEditBtn();
                // 恢复表单不可编辑状态
                SiteInfoEditManager.disableSiteInfoTableFormEdit();
                // 用服务器返回的数据刷新表单
                SiteInfoEditManager.reloadSiteInfo2Table(siteId);
                // 隐藏遮罩菊花
                layer.closeAll('loading');   //关闭所有的loading
            };
            // End  : post 的 url 、 param 和 callback
            // 1. 提交，先显示遮罩菊花，同时 ajax 请求服务器，若回复成功，才隐藏【提交】和【取消】
            $.post(url, params, callback, "json");
        }).on('click', '#cancel-edited-site-info-btn', function() {
            hideSubmitOrCancelAndShowEditBtn();
            // 取消，先恢复表单不可编辑状态
            SiteInfoEditManager.disableSiteInfoTableFormEdit();
            // 用客户端保存的数据刷新表单
            var savedSiteInfo = SiteInfoEditManager.loadSavedSiteInfo();
            SiteInfoEditManager.reloadSiteInfo2Table(savedSiteInfo);
        });

        // Start: 绑定拖动地图上坐标后的经纬度获取回调
        function processMarkerDragend(marker) {
            var pos = marker.getPosition();       //获取marker的位置
            layer.msg("站点当前位置是（经度： " + pos.lng + ", 纬度： " + pos.lat + "）");
        }

        var sitesId2MarkerMap = null;
        function onEventSitesId2MarkerMapInited() {
            sitesId2MarkerMap = layui.SitesManageGlobal['sitesId2MarkerMap'];
            /*debugger;
            for(var siteId in sitesId2MarkerMap) {
                var marker = sitesId2MarkerMap[siteId];
                marker.addEventListener("dragend", function() {
                    processMarkerDragend(marker);
                });
            }*/
        }
        $('body').on('event_sitesId2MarkerMap', onEventSitesId2MarkerMapInited);

        $(document).on('click', '#button-edit_site_pos_in_map', function() {
            var thisBtn = $(this);
            var siteId = thisBtn.data('siteId')
                , siteName = thisBtn.data('siteName')
                , siteLongitude = thisBtn.data('siteLongitude')
                , siteLatitude = thisBtn.data('siteLatitude');
            //
            if(!sitesId2MarkerMap) {
                layer.msg("页面环境更新中，请稍候再尝试编辑，谢谢 ^_^");
                return ;
            }
            // Start: 原来的在地图中编辑的代码
            /*var marker = sitesId2MarkerMap[siteId];
            marker.setAnimation(null);
            marker.enableDragging();
            marker.addEventListener("dragend", function() {
                processMarkerDragend(marker);
            });
            //
            // var str_class_hide = 'hide';
            // thisBtn.addClass(str_class_hide);
            thisBtn.hide('normal', function() {
                $('#button-submit_site_pos_in_map').show('normal');
            });*/
            // End  : 原来的在地图中编辑的代码
            // 打开 layer ，初始化编辑地图，进行编辑
            laytpl(tpl_layerContent_siteEditMap.innerHTML).render({}, function (html_laytpl) {
                layer.open({
                    type: 1
                    , title: ['编辑站点位置【', siteName, '】'].join('')
                    , area: ['100%', '100%']
                    , shadeClose: true //开启遮罩关闭
                    , maxmin: true
                    , content: html_laytpl
                    , btn: ['提交', '取消']
                    , yes: function (index, layero) {
                        layer.msg("提交中，请稍候 。。。");
                        //按钮【按钮一】的回调
                        // layer.close(index);
                    }
                    , btn2: function (index, layero) {
                        layer.msg('取消编辑站点位置');
                        //按钮【按钮二】的回调
                        //return false 开启该代码可禁止点击该按钮关闭
                    }
                });
            });
            // 初始化 layer 中 laytpl 中的地图
            var map_edit = new BMap.Map("site-edit-map", { enableMapClick: false });  // 创建Map实例
            var point_chengDu = new BMap.Point(104.072, 30.663);
            // map.centerAndZoom("成都", 12);      // 初始化地图,用城市名设置地图中心点
            map_edit.centerAndZoom(point_chengDu, 12);      // 初始化地图，用 point 设置地图中心点
            map_edit.enableScrollWheelZoom(true);  // 启用缩放
            // 在地图中添加 marker
            // var position_point_chengDu = point_chengDu.getPosition();
            var point_site2Edit = new BMap.Point(siteLongitude || point_chengDu.lng
                , siteLatitude || point_chengDu.lat);
            var marker_site2Edit = new BMap.Marker(point_site2Edit);
            map_edit.addOverlay(marker_site2Edit);            //增加点
            marker_site2Edit.enableDragging();           // 可拖拽
            // 拖拽后获取 marker 信息
            marker_site2Edit.addEventListener("dragend", function() {
                processMarkerDragend(marker_site2Edit);
            });
            // 移动地图到该点
            map_edit.panTo(point_site2Edit);
        })
        // End  : 绑定拖动地图上坐标后的经纬度获取回调
    });
})();