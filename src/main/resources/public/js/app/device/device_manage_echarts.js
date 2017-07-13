(function() {
    // Start: 所有被本模块调用的函数定义在此
    function genOption() {
        var option = {
            title: {
                text: '设备监测曲线图',
                subtext: '[设备或站点名]'
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
                data:['今日压力', '历史压力']
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
                    name: '压力值',
                    nameGap: 8,
                    min: 0,
                    boundaryGap: [0.2, 0.2]
                }
            ],
            series: [
                {
                    name:'今日压力',
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
                    name:'历史压力',
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
    // End  : 所有被本模块调用的函数定义在此
    layui.use(['jquery', 'oneSocket'], function() {
        var $ = layui.jquery;

        // 基于准备好的dom，初始化echarts实例
        var myChart0 = echarts.init(document.getElementById('echarts-0'));
        var myChart1 = echarts.init(document.getElementById('echarts-1'));
        var myChart2 = echarts.init(document.getElementById('echarts-2'));
        var myChart3 = echarts.init(document.getElementById('echarts-3'));
        var myChartsArr = [myChart0, myChart1, myChart2, myChart3];

        // 指定图表的配置项和数据
        var option0 = genOption();
        var option1 = genOption();
        var option2 = genOption();
        var option3 = genOption();
        var optionsArr = [option0, option1, option2, option3];

        // 测试 demo ： 定时刷新
        /*setInterval(function (){
         renderUpdatedData2Charts();
         }, 3000);*/
        // 实际： 监听事件进行刷新
        $(function() {
            var oneSocket = layui.oneSocket(/*SockJS, Stomp*/);
            var oneSocketEvent = oneSocket.EVENT;
            oneSocket.addHandler(function(data) {
                console.log('[documentEvent oneSocketEvent] data: ');
                console.log(data);
                var jData = JSON.parse(data);
                console.log('[documentEvent oneSocketEvent] jData: ');
                var jDataGasEvent = jData.gasEvent;
                /*myChartsArr.forEach(function(myChartItem) {
                 renderUpdatedData2Charts(myChartItem, jData);
                 });*/
                renderUpdatedData2Charts(myChartsArr[0], optionsArr[0], jDataGasEvent.hardwareId, '温度', jDataGasEvent.temperature, jDataGasEvent.summary);
                renderUpdatedData2Charts(myChartsArr[1], optionsArr[1], jDataGasEvent.hardwareId, '压力', jDataGasEvent.pressure, jDataGasEvent.summary);
                renderUpdatedData2Charts(myChartsArr[2], optionsArr[2], jDataGasEvent.hardwareId, 'standard', jDataGasEvent.standard, jDataGasEvent.summary);
                renderUpdatedData2Charts(myChartsArr[3], optionsArr[3], jDataGasEvent.hardwareId, 'running', jDataGasEvent.running, jDataGasEvent.summary);
            });
            oneSocket.setStation('s1');
            /*$(oneSocket.EventEmitter).on(oneSocketEvent.GM_EVENT_handleNotifications, '', function(event, data) {
             console.log(['[documentEvent oneSocketEvent ', oneSocketEvent.GM_EVENT_handleNotifications, '] data: '].join(''));
             console.log(data);
             renderUpdatedData2Charts(JSON.parse(data));
             });*/
        });

        // render function
        function renderUpdatedData2Charts(myChart2Render, myChart2RenderOption, jDataHardwareId, jDataTitle, jDataFieldVal, jDataSummaryVal) {
            if(!myChart2Render || !myChart2RenderOption || !jDataHardwareId || !jDataTitle || (!jDataFieldVal && jDataFieldVal !== 0) || (!jDataSummaryVal && jDataSummaryVal !== 0)) {
                console.error('[renderUpdatedData2Charts] 参数检查有误：');
                console.info(['[renderUpdatedData2Charts] myChart2Render: ',        myChart2Render      ].join(''));
                console.info(['[renderUpdatedData2Charts] myChart2RenderOption: ',  myChart2RenderOption].join(''));
                console.info(['[renderUpdatedData2Charts] jDataHardwareId: ',       jDataHardwareId     ].join(''));
                console.info(['[renderUpdatedData2Charts] jDataTitle: ',            jDataTitle          ].join(''));
                console.info(['[renderUpdatedData2Charts] jDataFieldVal: ',         jDataFieldVal       ].join(''));
                console.info(['[renderUpdatedData2Charts] jDataSummaryVal: ',       jDataSummaryVal     ].join(''));
                return ;
            }

            var axisData = (new Date()).toLocaleTimeString().replace(/^\D*/,'');
            // var axisData = jData.timeStr;

            myChart2RenderOption.title.subtext = ['[', jDataHardwareId, ' - ', jDataTitle, ']'].join('');

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
    });
})();