/*!
 * oneSocket.js v0.1.0
 * (c) 2017 Payne Pandaroid Wang
 * 封装对 socket 使用，处理跨父子页面共用 socket 的差异。接收分发协议、被调用发送协议。
 */
layui.define(function(exports) {
    var $ = layui.jquery;
    console.log('【layui.tools】加载完毕后执行回调');
    // 导出的模块名和接口函数
    exports('tools', {
        getQueryString: getQueryString
    });
    // Start: 所有的 function
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return unescape(r[2]); return null;
    }
    // End  : 所有的 function
});