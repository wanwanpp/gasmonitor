/*!
 * oneSocket.js v0.1.0
 * (c) 2017 Payne Pandaroid Wang
 * 封装对 socket 使用，处理跨父子页面共用 socket 的差异。接收分发协议、被调用发送协议。
 */
var DEVICE_TYPE_LOGIN = 1;
var DEVICE_TYPE_WULI = 2;

layui.define(['jquery', 'layer', 'element'], function(exports) {
    var $ = layui.jquery;
    var layer = layui.layer;
    var element = layui.element();

    console.log('【layui.tools】加载完毕后执行回调');
    // Start: 所有的 function
    var LeftNavTabManager = {
        check: {},
        jumpLeftNavTab: function(url) {
            console.log(['jumpLeftNavTab url: ', url].join(''));
            var arr_element_leftNav = $('.layui-side-scroll .layui-nav .layui-nav-item a[data-url]');
            if(!arr_element_leftNav || !arr_element_leftNav.length || !(arr_element_leftNav.length > 0)) {
                if(window && window.parent && (window !== window.parent)
                        && window.parent.layui && window.parent.layui.tools) {
                    window.parent.layui.tools.jumpLeftNavTab(url);
                }
                return ;
            }
            //
            var arr_urlAndParamStr = url.split('?');
            var url_pureLeftNav = arr_urlAndParamStr[0];
            //
            for(var i = 0, len = arr_element_leftNav.length; i < len; ++i) {
                var item_element_leftNav = $(arr_element_leftNav[i]);
                var str_dataUrl = item_element_leftNav.data('url');
                if(str_dataUrl == url_pureLeftNav) {
                    // item_element_leftNav.attr('data-url', url);
                    //
                    LeftNavTabManager.check = {
                        dataId: item_element_leftNav.data('id')
                        , dataUrl: url
                    };
                    //
                    item_element_leftNav.trigger('click');
                    // $(arr_element_leftNav[i]).click();
                    // item_element_leftNav.attr('data-url', url_pureLeftNav);
                    break;
                }
            }
        },
        indexLeftNavTopTab: function () {
            var navfilter = 'left-nav';
            var nav = $('.layui-nav[lay-filter=' + navfilter + ']').eq(0);

            var tabfilter = 'top-tab';
            var tab = $('.layui-tab[lay-filter=' + tabfilter + ']').eq(0);
            var tabcontent = tab.children('.layui-tab-content').eq(0);
            var tabtitle = tab.children('.layui-tab-title').eq(0);

            /**
             * iframe自适应
             */
            $(window).resize(function () {
                //设置顶部切换卡容器度
                tabcontent.height($(this).height() - 60 - 41 - 44); //头部高度 顶部切换卡高度 底部高度
                //设置顶部切换卡容器内每个iframe高度
                tabcontent.find('iframe').each(function () {
                    $(this).height(tabcontent.height());
                });
            }).resize();

            /**
             * 监听侧边栏导航点击事件
             */
            element.on('nav(' + navfilter + ')', function (elem) {
                var a = elem.children('a');
                var title = a.text();
                var src = elem.children('a').attr('data-url');
                var id = elem.children('a').attr('data-id');
                var iframe = tabcontent.find('iframe[data-id=' + id + ']').eq(0);
                var tabindex = tabtitle.children('li').length;

                if (src != undefined && src != null && id != undefined && id != null) {
                    if (iframe.length) { //存在 iframe
                        //获取iframe身上的tab index
                        tabindex = iframe.attr('data-tabindex');
                        //
                        if(id == LeftNavTabManager.check.dataId) {
                            iframe.attr('src', LeftNavTabManager.check.dataUrl);
                            LeftNavTabManager.check = {};
                        }
                    } else { //不存在 iframe
                        //显示加载层
                        layer.load();
                        //
                        if(id == LeftNavTabManager.check.dataId) {
                            src = LeftNavTabManager.check.dataUrl;
                            LeftNavTabManager.check = {};
                        }
                        //拼接iframe
                        var iframe = '<iframe';
                        iframe += ' src="' + src + '" data-id="' + id + '" data-tabindex="' + tabindex + '"';
                        iframe += ' style="width: 100%; height: ' + tabcontent.height() + 'px; border: 0px;"';
                        iframe += '></iframe>';
                        //顶部切换卡新增一个卡片
                        element.tabAdd(tabfilter, {title: title, content: iframe, id: id});
                        layer.closeAll('loading');
                    }

                    //切换到指定索引的卡片
                    element.tabChange(tabfilter, id);
                }
            });

            /**
             * 初始化点击侧边栏第一个导航
             */
            nav.find('li a[data-url]').eq(0).click();

            // Start: 点击按钮收起或展开侧边栏
            $(document).on('click', '#layui-left-menu-toggle', function() {
                // class strings
                var classStr_layuiSideHide = 'layui-side-hide';
                var classStr_layuiBodyOnSideHide = 'layui-body-on-side-hide';
                var classStr_layuiLeftMenuToggleHide = 'layui-left-menu-toggle-hide';
                // dom elements
                var domEle_layuiSideLayuiBgBlack = $('.layui-side.layui-bg-black');
                var domEle_layuiBody = $('.layui-layout-admin .layui-body');
                var domEle_layuiLeftMenuToggle = $('#layui-left-menu-toggle');
                // 具体点击后 toggle
                if(domEle_layuiSideLayuiBgBlack.hasClass(classStr_layuiSideHide)) {
                    domEle_layuiSideLayuiBgBlack.removeClass(classStr_layuiSideHide);
                    domEle_layuiBody.removeClass(classStr_layuiBodyOnSideHide);
                    domEle_layuiLeftMenuToggle.removeClass(classStr_layuiLeftMenuToggleHide);
                } else {
                    domEle_layuiSideLayuiBgBlack.addClass(classStr_layuiSideHide);
                    domEle_layuiBody.addClass(classStr_layuiBodyOnSideHide);
                    domEle_layuiLeftMenuToggle.addClass(classStr_layuiLeftMenuToggleHide);
                }
            });
            // End  : 点击按钮收起或展开侧边栏
        }
    };
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return decodeURIComponent(r[2]);
        return null;
    }

    function deviceid2des(l) {
        if (l == DEVICE_TYPE_LOGIN) {
            return "逻辑设备";
        } else if (l == DEVICE_TYPE_WULI) {
            return "物理设备";
        } else {
            return "其他设备";
        }
    }

    //动态渲染select的option
    function renderSelectOption(url, p, key, value, select) {
        $.ajax({
            type: "post",
            url: url,
            data: p,
            async: false,
            success: function (data) {
                //得到数据之后来操作
                console.log("得到的select option的数据:", JSON.stringify(data));
                var op = "<option value='0'>根节点</option>"
                for (var i = 0; i < data.data.length; i++) {
                    op += "<option value=" + data.data[i][key] + ">" + data.data[i][value] + "</option>"
                }
                console.log("开始渲染html:" + op);
                select.html(op);
            }
        });
    }

    function timestampToString(tm) {
        return new Date(parseInt(tm)).toLocaleString().replace(/年|月/g, "-").replace(/日/g, " ")
    }
    // End  : 所有的 function

    // 导出的模块名和接口函数
    exports('tools', {
        getQueryString: getQueryString
        // Start: 左侧导航菜单和顶部 tab 相关
        , indexLeftNavTopTab:   LeftNavTabManager.indexLeftNavTopTab
        , jumpLeftNavTab:       LeftNavTabManager.jumpLeftNavTab
        // End  : 左侧导航菜单和顶部 tab 相关
        , deviceid2des: deviceid2des
        , renderSelectOption: renderSelectOption
        , timestampToString: timestampToString
    });
});
