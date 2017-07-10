/*!
 * oneSocket.js v0.1.0
 * (c) 2017 Payne Pandaroid Wang
 * 封装对 socket 使用，处理跨父子页面共用 socket 的差异。接收分发协议、被调用发送协议。
 */
layui.define(['jquery'], function(exports) {
    var $ = layui.jquery;
    console.log('【oneSocket】加载完毕后执行回调');
    // 导出的模块名和接口函数
    exports('oneSocket', function(SockJS, Stomp) {
        console.log('【oneSocket】调用模块接口');
        // 2. 只有通过注册事件来维持父子页面间的 socket ，当 use 本模块时，注册
        if(window && window.parent && (window !== window.parent)
            && window.parent.layui && window.parent.layui.oneSocket) {
            console.log('【oneSocket】父元素已经初始化了 oneSocket');
            // 本页面的 layui.oneSocket 继承父页面的
            layui.oneSocket = window.parent.layui.oneSocket;
            // layui.oneSocket.EventEmitter = window.parent.document;
            return layui.oneSocket;
        }
        // 3. 初始化 oneSocket 的 socket 连接
        // 3.0.5 处理 oneSocket 初始化 error 的 Function
        function handleInitError(errMsg) {
            layui.oneSocket = null; // oneSocket 置为 null，没有正常初始化
            console.error(errMsg);
            alert(errMsg);
        }
        // 3.1 检查 SockJS
        if(!SockJS || !SockJS instanceof Function) {
            handleInitError('【oneSocket】没有提前引入 SockJS ，oneSocket 模块不能正常使用');
            return ;
        }
        // 3.2 检查 Stomp
        if(!Stomp || !Stomp instanceof Function) {
            handleInitError('【oneSocket】没有提前引入 Stomp ，oneSocket 模块不能正常使用');
            return ;
        }
        // 3.3 开始正常初始化
        // sockjs stomp
        var sock = new SockJS("/endpointChat");
        var stomp = Stomp.over(sock);
        stomp.connect('guest', 'guest', function (frame) {
            stomp.subscribe("/user/queue/notifications", handleNotifications);
            // set station
            stomp.send("/setStations", {}, "s1");
            setTimeout(function () {
                stomp.send("/setStations", {}, "s2");
            }, 5000);
        });
        // 收到消息的处理
        // layui.oneSocket.EventEmitter = $(document);
        var handlerFuncArr = [];
        function handleNotifications(message) {
            console.log(["【oneSocket】[handleNotifications]received: ", message.body].join(''));
            // layui.oneSocket.EventEmitter.trigger(layui.oneSocket.EVENT.GM_EVENT_handleNotifications, message.body);
            if(handlerFuncArr && handlerFuncArr.length > 0) {
                handlerFuncArr.forEach(function (itemHandlerFunc) {
                    itemHandlerFunc(message.body);
                });
            }
        }

        //
        layui.oneSocket.addHandler = function(handlerFunc) {
            handlerFuncArr.push(handlerFunc);
        }

        return layui.oneSocket;
    });
    // 4. 定义 oneSocket 的事件
    layui.oneSocket.EVENT = {
        GM_EVENT_handleNotifications: 'GM_EVENT_handleNotifications'
    };

});