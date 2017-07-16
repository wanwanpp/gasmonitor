(function() {
    var $, oneSocket, laytpl, layer;

    // Start: 所有被本模块调用的函数定义在此
    function genOption(hardwareId, subTitle) {
        var option = {
            title: {
                text: subTitle,
                subtext: ['[', hardwareId, ']'].join('')
            },
            tooltip: {
                trigger: 'axis',
                axisPointer: {
                    type: 'cross',
                    label: {
                        backgroundColor: '#6a7985'
                    }
                }
            },
            legend: {
                data:[subTitle, 'summary']
            },
            toolbox: {
                show: true,
                feature: {
                    dataZoom: {
                        yAxisIndex: 'none'
                    },
                    dataView: {readOnly: false},
                    // magicType: {type: ['line', 'bar']},
                    restore: {},
                    saveAsImage: {}
                }
            },
            dataZoom: {
                show: false,
                start: 0,
                end: 100
            },
            grid: {
                left: '0%',
                right: '6%',
                bottom: '0%',
                top: 75,
                containLabel: true
            },
            xAxis: [
                {
                    type: 'category',
                    name: '时间',
                    boundaryGap: false,
                    data: (function (){
                        var now = new Date();
                        var res = [];
                        var len = 10;
                        while (len--) {
                            res.unshift(now.toLocaleTimeString().replace(/^\D*/,''));
                            now = new Date(now - 2000);
                        }
                        return res;
                    })()
                }
            ],
            yAxis: [
                {
                    type: 'value',
                    scale: true,
                    name: [subTitle, '值'].join(''),
                    nameGap: 8,
                    min: 0,
                    boundaryGap: [0.2, 0.2]
                }
            ],
            series: [
                {
                    name: subTitle,
                    type:'line',
                    areaStyle: {normal: {}},
                    data: []
                    /*data:(function (){
                        var res = [];
                        var len = 10;
                        while (len--) {
                            res.push(Math.round(Math.random() * 1000));
                        }
                        return res;
                    })()*/
                },
                {
                    name:'summary',
                    type:'line',
                    areaStyle: {normal: {}},
                    data: []
                    /*data:(function (){
                        var res = [];
                        var len = 0;
                        while (len < 10) {
                            res.push((Math.random()*1000 + 5).toFixed(1) - 0);
                            len++;
                        }
                        return res;
                    })()*/
                }
            ]
        };

        return option;
    }
    // render function
    function renderUpdatedData2Charts(myChart2Render, myChart2RenderOption, jDataHardwareId, jDataFieldVal, jDataSummaryVal) {
        if(!myChart2Render || !myChart2RenderOption || !jDataHardwareId || (!jDataFieldVal && jDataFieldVal !== 0) || (!jDataSummaryVal && jDataSummaryVal !== 0)) {
            console.error('[renderUpdatedData2Charts] 参数检查有误：');
            console.info(['[renderUpdatedData2Charts] myChart2Render: ',        myChart2Render      ].join(''));
            console.info(['[renderUpdatedData2Charts] myChart2RenderOption: ',  myChart2RenderOption].join(''));
            console.info(['[renderUpdatedData2Charts] jDataHardwareId: ',       jDataHardwareId     ].join(''));
            console.info(['[renderUpdatedData2Charts] jDataFieldVal: ',         jDataFieldVal       ].join(''));
            console.info(['[renderUpdatedData2Charts] jDataSummaryVal: ',       jDataSummaryVal     ].join(''));
            return ;
        }

        var axisData = (new Date()).toLocaleTimeString().replace(/^\D*/,'');
        // var axisData = jData.timeStr;

        myChart2RenderOption.title.subtext = ['[', jDataHardwareId, ']'].join('');

        var data0 = myChart2RenderOption.series[0].data;
        var data1 = myChart2RenderOption.series[1].data;

        if(data0.length >= 10) {
            data0.shift();
        }
        // data0.push(Math.round(Math.random() * 1000));
        data0.push(jDataFieldVal);

        if(data1.length >= 10) {
            data1.shift();
        }
        // data1.push((Math.random() * 1000 + 5).toFixed(1) - 0);
        data1.push(jDataSummaryVal);

        myChart2RenderOption.xAxis[0].data.shift();
        myChart2RenderOption.xAxis[0].data.push(axisData);

        myChart2Render.setOption(myChart2RenderOption);
    }
    // init function
    function renderInitData2Charts(myChart2Render, myChart2RenderOption) {
        if(!myChart2Render || !myChart2RenderOption) {
            console.error('[renderUpdatedData2Charts] 参数检查有误：');
            console.info(['[renderUpdatedData2Charts] myChart2Render: ',        myChart2Render      ].join(''));
            console.info(['[renderUpdatedData2Charts] myChart2RenderOption: ',  myChart2RenderOption].join(''));
            return ;
        }

        myChart2Render.setOption(myChart2RenderOption);
    }
    function searchList(currPage) {
        console.log("开始查询设备 list 的信息 ...");
        layer.load();   // loading
        $.get(
            "/device/ajax/list/",
            {"currPage": currPage || 1, siteId: 1},
            function (data) {
                console.log("查询到的设备 list 信息:" + JSON.stringify(data));
                var total = data.total;
                var page = data.page;
                var totalPage = data.totalPage;
                var devicesDataArr = data.data;
                console.log(['[sites-manage searchList]total: ', total].join(''));
                console.log(['[sites-manage searchList]page: ', page].join(''));
                console.log(['[sites-manage searchList]totalPage: ', totalPage].join(''));
                console.log(['[sites-manage searchList]devicesDataArr: ', JSON.stringify(devicesDataArr)].join(''));
                // Start: 设备列表刷新
                laytpl(devicesList.innerHTML).render(devicesDataArr, function (html) {
                    devicesListTableView.innerHTML = html;
                    layer.closeAll('loading');   //关闭所有的loading
                });
                // End  : 设备列表刷新

                // Start: 触发第一个设备的 click
                $('.device-table-tr:first').click();
                // End  : 触发第一个设备的 click
            },
            "json"
        );
    }
    // Start: 展示 layerContent_tpl 于 layer 中
    function showLayerContentTplInLayer(title, content) {
        laytpl(layerContent_tpl.innerHTML).render(content, function(html) {
            layer.open({
                type: 1
                , title: title
                , area: ['400px', '300px']
                , shadeClose: true //开启遮罩关闭
                , maxmin: true
                , content: html
                , btn: ['取消', '提交']
                , yes: function (index, layero) {
                    alert('点击了按钮 yes');
                    //按钮【按钮一】的回调
                    layer.close(index);
                    // alert("点击了按钮1");
                }
                , btn2: function (index, layero) {
                    alert("点击了按钮 2");
                    //按钮【按钮二】的回调
                    //return false 开启该代码可禁止点击该按钮关闭
                }
                ,
            });
        });
    }
    // End  : 展示 layerContent_tpl 于 layer 中
    // 刷新折线图
    function refreshECharts(hardwareId) {
        // var hardwareId = 's1';

        // 4 个折线图每个的 title
        var subTitlesArr = ['温度', '压力', 'standard', 'running'];

        // 基于准备好的dom，初始化echarts实例
        var myChart0 = echarts.init(document.getElementById('echarts-0'));
        var myChart1 = echarts.init(document.getElementById('echarts-1'));
        var myChart2 = echarts.init(document.getElementById('echarts-2'));
        var myChart3 = echarts.init(document.getElementById('echarts-3'));
        var myChartsArr = [myChart0, myChart1, myChart2, myChart3];


        // 指定图表的配置项和数据
        var option0 = genOption(hardwareId, subTitlesArr[0]);
        var option1 = genOption(hardwareId, subTitlesArr[1]);
        var option2 = genOption(hardwareId, subTitlesArr[2]);
        var option3 = genOption(hardwareId, subTitlesArr[3]);
        var optionsArr = [option0, option1, option2, option3];

        // 测试 demo ： 定时刷新
        /*setInterval(function (){
         renderUpdatedData2Charts();
         }, 3000);*/
        // 实际： 监听事件进行刷新
        $(function() {
            renderInitData2Charts(myChartsArr[0], optionsArr[0]);
            renderInitData2Charts(myChartsArr[1], optionsArr[1]);
            renderInitData2Charts(myChartsArr[2], optionsArr[2]);
            renderInitData2Charts(myChartsArr[3], optionsArr[3]);

            // var oneSocketEvent = oneSocket.EVENT;
            oneSocket.addHandler(function(data) {
                console.log('[documentEvent oneSocketEvent] data: ');
                console.log(data);
                var jData = JSON.parse(data);
                console.log('[documentEvent oneSocketEvent] jData: ');
                var jDataGasEvent = jData.gasEvent;
                /*myChartsArr.forEach(function(myChartItem) {
                 renderUpdatedData2Charts(myChartItem, jData);
                 });*/
                renderUpdatedData2Charts(myChartsArr[0], optionsArr[0], jDataGasEvent.hardwareId, jDataGasEvent.temperature,   jDataGasEvent.summary);
                renderUpdatedData2Charts(myChartsArr[1], optionsArr[1], jDataGasEvent.hardwareId, jDataGasEvent.pressure,      jDataGasEvent.summary);
                renderUpdatedData2Charts(myChartsArr[2], optionsArr[2], jDataGasEvent.hardwareId, jDataGasEvent.standard,      jDataGasEvent.summary);
                renderUpdatedData2Charts(myChartsArr[3], optionsArr[3], jDataGasEvent.hardwareId, jDataGasEvent.running,       jDataGasEvent.summary);
            });
            oneSocket.setStation(hardwareId);
            /*$(oneSocket.EventEmitter).on(oneSocketEvent.GM_EVENT_handleNotifications, '', function(event, data) {
             console.log(['[documentEvent oneSocketEvent ', oneSocketEvent.GM_EVENT_handleNotifications, '] data: '].join(''));
             console.log(data);
             renderUpdatedData2Charts(JSON.parse(data));
             });*/
            // 最后，固定 echarts 容器宽度，并指定父容器滚动
            var deviceEchartsContainerEle = $('#device-echarts-container');
            deviceEchartsContainerEle.css('width', deviceEchartsContainerEle.width());
            deviceEchartsContainerEle.parent().css('overflow-x', 'auto');
        });
    }
    // End  : 所有被本模块调用的函数定义在此
    layui.use(['jquery', 'oneSocket', 'laytpl', 'layer', 'form'], function() {
        $ = layui.jquery;
        oneSocket = layui.oneSocket(/*SockJS, Stomp*/);
        laytpl = layui.laytpl;
        layer = layui.layer;
        var form = layui.form();

        //第一次加载数据
        searchList();

        // Start: [设备列表]中某设备被点击
        $(document).on('click', '.device-table-tr', function() {
            var thisTr = $(this);
            // 获取当前行的设备信息
            var deviceId = thisTr.data('id');
            var hardwareId = thisTr.data('hardwareId');
            var tokenId = thisTr.data('tokenId');
            var deviceName = thisTr.data('name');
            var logic = thisTr.data('logic');
            var watcher = thisTr.data('watcher');
            var phone = thisTr.data('phone');
            var created = thisTr.data('created');
            var status = thisTr.data('status');
            var parent = thisTr.data('parent');
            var siteId = thisTr.data('siteId');
            // Start: 被选中的 tr addClass 以区分
            var siteTrSelectedClassStr = 'site-tr-selected';
            $('.device-table-tr').removeClass(siteTrSelectedClassStr);
            thisTr.addClass(siteTrSelectedClassStr);
            // End  : 被选中的 tr addClass 以区分
            //
            console.log(['设备信息[deviceId: ', deviceId, '][hardwareId: ', hardwareId, '][tokenId: ', tokenId, '][deviceName: ', deviceName, '][logic: ', logic,
                '][watcher: ', watcher, '][phone: ', phone, '][created: ', created, '][status: ', status, '][parent: ', parent, '][siteId: ', siteId, ']'].join(''));
            // Start: 根据用户的点击，清空折线图，然后重新 setStationId
            refreshECharts(hardwareId);
            // End  : 根据用户的点击，清空折线图，然后重新 setStationId
        });
        // Start: [设备列表]中某设备被点击


    });
})();