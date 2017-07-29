(function() {
    layui.use(['jquery'], function() {
        var $ = layui.jquery;
        // hide ： 【提交】或【取消】按钮组
        var submitOrCancelEditSiteInfoBtnContainer = $('#submit-or-cancel-edit-site-info-btn-container');
        submitOrCancelEditSiteInfoBtnContainer.hide();
        // 【编辑站点详情】按钮被点击后
        var click2EditSiteInfoBtnIdStr = '#click-2-edit-site-info-btn';
        var click2EditSiteInfoBtn = $(click2EditSiteInfoBtnIdStr);
        // fadeIn 和 fadeOut 的速度
        var fadeSpeedStr = 'normal'
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
            debugger;
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
                debugger;
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
    });
})();