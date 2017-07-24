/*!
 * oneSocket.js v0.1.0
 * (c) 2017 Payne Pandaroid Wang
 * 封装对 socket 使用，处理跨父子页面共用 socket 的差异。接收分发协议、被调用发送协议。
 */


var DEVICE_TYPE_LOGIN = 1;
var DEVICE_TYPE_WULI = 2;


layui.define(function (exports) {
    var $ = layui.jquery;
    console.log('【layui.tools】加载完毕后执行回调');
    // 导出的模块名和接口函数
    exports('tools', {
        getQueryString: getQueryString,
        deviceid2des: deviceid2des,
        renderSelectOption: renderSelectOption,
    });
    // Start: 所有的 function
    function getQueryString(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)", "i");
        var r = window.location.search.substr(1).match(reg);
        if (r != null) return decodeURIComponent(r[2]);
        return null;
    }

    // End  : 所有的 function
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
});

