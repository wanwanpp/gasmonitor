layui.use(['layer', 'element'], function () {
    var element = layui.element();
    var layer = layui.layer;
    var $ = layui.jquery;

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
            } else { //不存在 iframe
                //显示加载层
                layer.load();
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
        debugger;
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
});

// Start: 在父页面初始化 oneSocket
(function() {
    layui.use(['jquery', 'oneSocket'], function() {
        var $ = layui.jquery;
        $(function() {
            layui.oneSocket(SockJS, Stomp);
        });
    });
})();
// End  : 在父页面初始化 oneSocket