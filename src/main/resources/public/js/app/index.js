layui.use(['tools'], function () {
    layui.tools.indexLeftNavTopTab();
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
