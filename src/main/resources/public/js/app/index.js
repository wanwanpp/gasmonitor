layui.use(['tools'], function () {
    layui.tools.indexLeftNavTopTab();
});

// Start: 测试 oneSocket
(function() {
    layui.use(['jquery', 'oneSocket'], function() {
        var $ = layui.jquery;
        $(function() {
            layui.oneSocket(SockJS, Stomp);
        });
    });
})();
// End  : 测试 oneSocket