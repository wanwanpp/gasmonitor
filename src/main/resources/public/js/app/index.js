/*layui.use(['tools'], function () {
    layui.tools.indexLeftNavTopTab();
});*/

// Start: 在父页面初始化 oneSocket
(function() {
    layui.use(['oneSocket', 'tools', 'webStorageCache'], function() {
        // 初始化左侧菜单和顶部 tab
        layui.tools.indexLeftNavTopTab();
        // 处理 oneSocket
        var $ = layui.jquery
            , webStorageCache = layui.webStorageCache;
        $(function() {
            var oneSocket = layui.oneSocket;
            oneSocket(SockJS, Stomp);
            oneSocket.setHandler(oneSocket.Event.GAS_EVENT, handler_gatherGasEventMonitorData);
            // 定义 oneSocket 的 handler
            function handler_gatherGasEventMonitorData(oneSocketMsgBody) {
                debugger;
                console.log('[index.js handler_gatherGasEventMonitorData]oneSocketMsgBody: ');
                console.log(oneSocketMsgBody);
                // 1. gasEvent
                var jsonObj_monitorData = JSON.parse(oneSocketMsgBody)
                    , jsonObj_gasEvent = jsonObj_monitorData.gasEvent;
                // 2. jsonObj_gasEvent: {"hardwareId":"t21s1d1","temperature":1212.0,"pressure":781.0,"standard":9061.0
                // ,"running":758.0,"summary":1929391.0,"surplus":2.1421421E7,"analog1":2.1421421E7,"analog2":2.1421421E7
                // ,"analog3":2.1421421E7,"analog4":2.1421421E7,"switch1":21421421,"switch2":21421421,"switch3":21421421
                // ,"switch4":21421421,"ac220":21421421,"battery":21421421,"solar":21421421,"pointtime":1501833236607}
                // ,"gaojing":true,"msg":"温度太高"}


            }
        });
    });
})();
// End  : 在父页面初始化 oneSocket
