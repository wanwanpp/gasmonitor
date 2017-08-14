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
            , webStorageCache = layui.webStorageCache
            , monitorDataCacheManager = webStorageCache.monitorDataCacheManager;
        $(function() {
            // Start: oneSocket 相关代码
            var oneSocket = layui.oneSocket;
            oneSocket(SockJS, Stomp);
            // 1. 设置 oneSocket 的 handler ，在其中进行 webStorageCache 的增量更新
            oneSocket.setHandler(oneSocket.Event.GAS_EVENT, handler_gatherGasEventMonitorData);
            // 定义 oneSocket 的 handler
            function handler_gatherGasEventMonitorData(oneSocketMsgBody) {
                console.log('[index.js handler_gatherGasEventMonitorData]oneSocketMsgBody: ');
                console.log(oneSocketMsgBody);
                // 1. gasEvent
                var jsonObj_monitorData = JSON.parse(oneSocketMsgBody);
                monitorDataCacheManager.addJsonMonitorData2Cache(jsonObj_monitorData);

            }
            // 2. 进行一次今日的全量拉取，拉取后 add 到 webStorageCache
            // 经下面这行代码测试成功： 同 domain 下的 cache 可跨 iframe 共享
            // webStorageCache.wsCache.set('Pandaroid', '王沛', {exp : 300});
            // End  : oneSocket 相关代码
        });
    });
})();
// End  : 在父页面初始化 oneSocket
