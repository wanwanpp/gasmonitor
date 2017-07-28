(function() {
    var $, oneSocket, laytpl, layer, tools;

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
                data:[subTitle/*, 'summary'*/]
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
                    saveAsImage: {},
                    // Start: 自定义的工具栏按钮 - 对比
                    myTool_compare: {
                        show: true,
                        title: '对比',
                        icon: 'path://M247.1424 794.9824c-1.0752 0-2.176-0.0768-3.2768-0.2304-10.8032-1.3568-19.6096-9.3952-21.9648-20.0448L112.64 282.112c-3.0976-13.952 5.7088-27.7504 19.6608-30.848 13.8752-3.1232 27.7504 5.7088 30.848 19.6608l93.6704 422.3232 218.5472-428.4928c6.5024-12.7232 22.016-17.792 34.7904-11.2896 12.7232 6.5024 17.7664 22.0672 11.2896 34.7904l-251.2384 492.6208C265.7024 789.6064 256.768 794.9824 247.1424 794.9824zM669.184 793.7792c-4.8128 0-9.7024-0.128-14.6176-0.3584-58.4448-3.0976-104.9344-22.912-134.4-57.3696-24.1664-28.2112-34.8416-63.7696-30.848-102.784l0.5888-5.0176c1.9712-14.1568 14.9248-24.0128 29.2096-22.0672 14.1568 1.9712 24.0128 15.0272 22.0672 29.2096l-0.3584 3.1488c-2.5088 24.576 3.9424 46.6432 18.6624 63.8208 20.0704 23.424 53.888 37.0432 97.8432 39.3728 85.9648 4.48 151.8848-41.9584 169.9584-87.9616 18.0736-45.9776-27.6992-74.7776-48.1792-85.0176-10.3424-5.1712-31.4624-10.9056-53.7856-16.9984-65.3312-17.7664-146.6368-39.8848-174.8736-95.0784-12.1088-23.6288-12.8256-49.9968-2.176-78.336 19.0208-50.56 51.1488-86.2464 95.488-106.0096 51.5072-22.9632 119.8848-22.0416 182.8608 2.5344 75.8016 29.568 89.7792 108.3136 86.5792 145.8176-1.2032 14.2336-13.568 24.8064-27.9808 23.6032-14.208-1.2032-24.7296-13.6448-23.6032-27.8528l0 0c0.2304-2.8672 4.5568-70.5792-53.7856-93.3376-50.3552-19.6352-103.7824-20.9664-142.976-3.4816-31.2576 13.9264-54.1696 39.8592-68.1472 76.9792-7.1936 19.072-3.5584 30.0032-0.2048 36.5568 17.792 34.816 92.7488 55.1936 142.3872 68.7104 26.0096 7.0656 48.4352 13.1584 63.36 20.6336 68.1728 34.0992 96.2304 91.648 73.1904 150.2208C851.2256 734.2848 773.4272 793.7792 669.184 793.7792zM1024 214.6048 1024 732.928c0 14.08-11.52 25.6-25.6 25.6s-25.6-11.52-25.6-25.6L972.8 214.6048c0-33.536-28.416-60.928-61.952-60.928L112.128 153.6768C78.592 153.6768 51.2 178.2528 51.2 211.7888l0 597.8624c0 33.536 27.392 60.928 60.928 60.928l742.7584 0c14.08 0 25.6 11.52 25.6 25.6s-11.52 25.6-25.6 25.6L112.128 921.7792c-61.952 0-112.128-50.176-112.128-112.128L0 211.7888c0-61.952 50.176-109.312 112.128-109.312l798.72 0C972.544 102.4768 1024 152.6528 1024 214.6048z',
                        onclick: function () {
                            layer.open({
                                type: 1
                                , title: '折线图对比'
                                , area: ['100%', '100%']
                                , shadeClose: true //开启遮罩关闭
                                , maxmin: true
                                , content: '折线图对比 content'
                                , btn: ['取消', '提交']
                                , yes: function (index, layero) {
                                    alert('点击了按钮 取消');
                                    //按钮【按钮一】的回调
                                    layer.close(index);
                                    // alert("点击了按钮1");
                                }
                                , btn2: function (index, layero) {
                                    alert("点击了按钮 提交");
                                    //按钮【按钮二】的回调
                                    //return false 开启该代码可禁止点击该按钮关闭
                                }
                                ,
                            });
                        }
                    }
                    // End  : 自定义的工具栏按钮 - 对比
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
                    type: 'time',
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
                }/*,
                {
                    name:'summary',
                    type:'line',
                    areaStyle: {normal: {}},
                    data: []
                    /!*data:(function (){
                        var res = [];
                        var len = 0;
                        while (len < 10) {
                            res.push((Math.random()*1000 + 5).toFixed(1) - 0);
                            len++;
                        }
                        return res;
                    })()*!/
                }*/
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
        // var data1 = myChart2RenderOption.series[1].data;

        if(data0.length >= 10) {
            data0.shift();
        }
        // data0.push(Math.round(Math.random() * 1000));
        data0.push(jDataFieldVal);

        /*if(data1.length >= 10) {
            data1.shift();
        }
        // data1.push((Math.random() * 1000 + 5).toFixed(1) - 0);
        data1.push(jDataSummaryVal);*/

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
    // Start: 请求服务器数据，更新左侧树
    function searchTreeList() {
        // 0. 请求相关的 url 、参数表、回调
        var url_allSitesAndDevices = '/site/ajax/allSitesAndDevices';
        var params_allSitesAndDevices = {};
        var callback_allSitesAndDevices = function(data_allSitesAndDevices) {
            console.log("查询到的所有站点设备 tree list 信息:" + JSON.stringify(data_allSitesAndDevices));
            var data_allSitesAndDevices_sitesArr = data_allSitesAndDevices.data;
            console.log('查询到的所有站点 tree list 信息 data_allSitesAndDevices_sitesArr： ' + JSON.stringify(data_allSitesAndDevices_sitesArr));
            // Start: 触发第一个设备的 click
            var urlHardwareId = tools.getQueryString('hardwareId');
            // End  : 触发第一个设备的 click
            // Start: 测试渲染树
            layui.tree({
                elem: '#devicesTreeList' //指定元素
                ,target: '_blank' //是否新选项卡打开（比如节点返回href才有效）
                ,click: function(item) { //点击节点回调
                    layer.msg('当前节名称：'+ item.name + '<br>全部参数：'+ JSON.stringify(item));
                    console.log(item);
                }
                ,nodes: createDevicesTreeListNodes(data_allSitesAndDevices_sitesArr, urlHardwareId)
            });
            // End  : 测试渲染树
        };
        // 1. 打开 layer loading
        layer.load();
        // 2. $.get 请求服务器 tree list 数据，并调用回调
        $.get(url_allSitesAndDevices, params_allSitesAndDevices, callback_allSitesAndDevices, "json");
    }
    // End  : 请求服务器数据，更新左侧树
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
                var urlHardwareId = tools.getQueryString('hardwareId');
                var deviceTableTr;
                if(urlHardwareId) {
                    deviceTableTr = $(['.device-table-tr[data-hardware-id=', urlHardwareId,']'].join(''));
                }
                if(!deviceTableTr) {
                    deviceTableTr = $('.device-table-tr:first')
                }
                deviceTableTr.click();
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
    var myChartsArr;    // 用于记录有哪些 eChartsInstance
    function refreshECharts(hardwareId) {
        // var hardwareId = 's1';

        // 4 个折线图每个的 title
        var subTitlesArr = ['温度', '压力', 'standard', 'running'];

        // 基于准备好的dom，初始化echarts实例
        var myChart0 = echarts.init(document.getElementById('echarts-0'));
        var myChart1 = echarts.init(document.getElementById('echarts-1'));
        var myChart2 = echarts.init(document.getElementById('echarts-2'));
        var myChart3 = echarts.init(document.getElementById('echarts-3'));
        myChartsArr = [myChart0, myChart1, myChart2, myChart3];


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
            oneSocket.setHandler(oneSocket.Event.GAS_EVENT, function(data) {
                console.log('[documentEvent oneSocketEvent] data: ');
                console.log(data);
                var jData = JSON.parse(data);
                console.log('[documentEvent oneSocketEvent] jData: ');
                var jDataGasEvent = jData.gasEvent;
                /*myChartsArr.forEach(function(myChartItem) {
                 renderUpdatedData2Charts(myChartItem, jData);
                 });*/
                // Start: 判断 hardwareId 相符，才进行刷新
                console.info(['[documentEvent oneSocketEvent][hardwareId: ', hardwareId, '][jDataGasEvent.hardwareId: ', jDataGasEvent.hardwareId, '] 不相等？： ', hardwareId != jDataGasEvent.hardwareId].join(''));
                if(hardwareId != jDataGasEvent.hardwareId) {
                    return ;
                }
                // End  : 判断 hardwareId 相符，才进行刷新
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
            // deviceEchartsContainerEle.css('width', deviceEchartsContainerEle.width());
            deviceEchartsContainerEle.css('width', '100%');
            deviceEchartsContainerEle.parent().css('overflow-x', 'auto');
        });
    }
    // 调用以创建 layui.tree nodes
    function createDevicesTreeListNodes(data_allSitesAndDevices_sitesArr, urlHardwareId) {
        // Start: 本 function 中所有被调用的子 function 定义
        /**
         * 创建站点的子设备
         */
        function createSiteChildrenDevices(devices, urlHardwareId) {
            console.log('[device_manage_echarts.js createDevicesTreeListNodes createSiteChildrenDevices] devices: ', JSON.stringify(devices));
            var arr_siteChildrenDevices = [];
            if(devices && devices.length && devices.length > 0) {
                devices.forEach(function(item_device) {
                    var id = item_device.id
                        , hardwareId = item_device.hardwareId
                        , siteId = item_device.siteId
                        , name = item_device.name
                        , logic = item_device.logic
                        , children = item_device.children;
                    console.log('[device_manage_echarts.js createDevicesTreeListNodes createSiteChildrenDevices] item_device id: ' + id);
                    console.log('[device_manage_echarts.js createDevicesTreeListNodes createSiteChildrenDevices] item_device hardwareId: ' + hardwareId);
                    console.log('[device_manage_echarts.js createDevicesTreeListNodes createSiteChildrenDevices] item_device siteId: ' + siteId);
                    console.log('[device_manage_echarts.js createDevicesTreeListNodes createSiteChildrenDevices] item_device name: ' + name);
                    console.log('[device_manage_echarts.js createDevicesTreeListNodes createSiteChildrenDevices] item_device logic: ' + logic);
                    var node_siteChildrenDevice = {name: name, id: id, alias: name, children: createSiteChildrenDevices(children, urlHardwareId)};
                    arr_siteChildrenDevices.push(node_siteChildrenDevice);
                });
            }
            return arr_siteChildrenDevices;
        }
        /**
         * 检查 urlHardwareId 是否在 devices 中。
         * 0. devices 为空，则返回 null 。
         * 1. urlHardwareId 为空，则返回 firstDeviceHardwareId ; 若 firstDeviceHardwareId 为空，则返回 devices 中第一个 device 的 hardwareId 。
         * 2. urlHardwareId 非空， 检查 devices 中是否有 （hardwareId == urlHardwareId） 的 device ，有则返回 hardwareId ；否则返回空。
         * @param urlHardwareId
         * @param devices
         * @param firstDeviceHardwareId
         */
        function checkUrlHardwareIdInDevices(urlHardwareId, devices, firstDeviceHardwareId) {
            debugger;
            // 0. devices 为空，则返回 null 。
            if(!devices || !devices.length || !(devices.length > 0)) {
                return null;
            }
            // 1. urlHardwareId 为空，则返回 firstDeviceHardwareId ; 若 firstDeviceHardwareId 为空，
            //    则返回 devices 中第一个 device 的 hardwareId 。
            if(!urlHardwareId) {
                // firstDeviceHardwareId 非空则返回
                if(firstDeviceHardwareId) {
                    return firstDeviceHardwareId;
                }
                // 若 firstDeviceHardwareId 为空，则返回 devices 中第一个 device 的 hardwareId 。
                return devices[0].hardwareId;
            } else {
                // 2. urlHardwareId 非空， 检查 devices 中是否有 （hardwareId == urlHardwareId） 的 device ，有则返回 hardwareId ；否则返回空。
                var isUrlHardwareIdInDevices = false;
                devices.forEach(function(item_device) {
                    if(isUrlHardwareIdInDevices) {
                        return false;   // 当 isUrlHardwareIdInDevices 为 true ，已经找到对应 hardwareId 的 device ，不用再比较
                    }
                    if(urlHardwareId == item_device.hardwareId) {
                        isUrlHardwareIdInDevices = true;
                    } else {    // 当前节点不匹配，看子节点
                        // item_device.children 为空，返回 null ; urlHardwareId 必非空，检查无匹配子节点也返回 null ；
                        // 返回具体 tmpFirstDeviceHardwareId 则有匹配
                        var tmpFirstDeviceHardwareId = checkUrlHardwareIdInDevices(urlHardwareId,
                            item_device.children, firstDeviceHardwareId);
                        if(tmpFirstDeviceHardwareId && tmpFirstDeviceHardwareId == urlHardwareId) {
                            isUrlHardwareIdInDevices = true;
                        }
                    }
                });
                // 有则返回 hardwareId ；否则返回空
                if(isUrlHardwareIdInDevices) {
                    return urlHardwareId;
                } else {
                    return null;
                }
            }
        }
        /**
         * 检查 urlHardwareId 是否在 data_allSitesAndDevices_sitesArr 中的 devices 中，若不在则赋予第一个 device 的 hardwareId
         */
        function checkUrlHardwareId(urlHardwareId, data_allSitesAndDevices_sitesArr) {
            // Start: 本 function 中所有被调用的 function

            // End  : 本 function 中所有被调用的 function
            var firstDeviceHardwareId = null;
            if(data_allSitesAndDevices_sitesArr && data_allSitesAndDevices_sitesArr.length
                && data_allSitesAndDevices_sitesArr.length > 0) {
                data_allSitesAndDevices_sitesArr.forEach(function(item_site) {
                    var devices = item_site.devices;
                    var tmpFirstDeviceHardwareId = checkUrlHardwareIdInDevices(urlHardwareId, devices, firstDeviceHardwareId);
                    // 如果 tmpFirstDeviceHardwareId 为 null ，则 urlHardwareId 不在当前这组 devices 里
                    // 否则，可能 urlHardwareId 和 firstDeviceHardwareId 都为 null ，返回的值是一个保底值先赋值给 firstDeviceHardwareId
                    if(tmpFirstDeviceHardwareId) {
                        firstDeviceHardwareId = tmpFirstDeviceHardwareId;
                    }
                });
                // 检查 urlHardwareId 如果为空，则把 firstDeviceHardwareId 赋值给它
                if(!urlHardwareId) {
                    urlHardwareId = firstDeviceHardwareId;
                } else {
                    // urlHardwareId 存在，但 firstDeviceHardwareId 不存在，说明没找到过 urlHardwareId 对应的 device ，
                    // 则 urlHardwareId 重新赋值为新找的 firstDeviceHardwareId
                    if(!firstDeviceHardwareId) {
                        urlHardwareId = firstDeviceHardwareId = checkUrlHardwareIdInDevices(urlHardwareId = null,
                            data_allSitesAndDevices_sitesArr[0].devices, firstDeviceHardwareId);
                    }
                }
            } else {    // 相当于 urlHardwareId = null , 因为此时 data_allSitesAndDevices_sitesArr 为空
                urlHardwareId = firstDeviceHardwareId;
            }

            return urlHardwareId;
        }

        /**
         * 判断当前 treeNode 是否展开。
         */
        function judgeIsTreeNodeSpread(devices, urlHardwareId) {
            // Start: 此 function 中使用的 function 定义
            debugger;
            // End  : 此 function 中使用的 function 定义
            if(!devices || !devices.length || !(devices.length > 0)) {
                return false;   // 没有 devices 子节点，不需要展开
            }
            // 有 devices 子节点，检查 urlHardwareId 是否在子节点里
            var firstDeviceHardwareId = null;
            firstDeviceHardwareId = checkUrlHardwareIdInDevices(urlHardwareId, devices, firstDeviceHardwareId);
            return !!firstDeviceHardwareId;
        }
        // End  : 本 function 中所有被调用的子 function 定义
        // Start: 检查 urlHardwareId 是否在 data_allSitesAndDevices_sitesArr 中的 devices 中，若不在则赋予第一个 device 的 hardwareId
        urlHardwareId = checkUrlHardwareId(urlHardwareId, data_allSitesAndDevices_sitesArr);
        debugger;
        // End  : 检查 urlHardwareId 是否在 data_allSitesAndDevices_sitesArr 中的 devices 中，若不在则赋予第一个 device 的 hardwareId
        var devicesTreeListNodes = [];
        if(data_allSitesAndDevices_sitesArr && data_allSitesAndDevices_sitesArr.length
            && data_allSitesAndDevices_sitesArr.length > 0) {
            data_allSitesAndDevices_sitesArr.forEach(function(siteItem) {
                var id = siteItem.id
                    , name = siteItem.name
                    , devices = siteItem.devices;
                console.log('[device_manage_echarts.js createDevicesTreeListNodes] id: ' + id);
                console.log('[device_manage_echarts.js createDevicesTreeListNodes] name: ' + name);
                console.log('[device_manage_echarts.js createDevicesTreeListNodes] devices: ' + JSON.stringify(devices));
                //
                debugger;
                var deviceTreeListNode = {
                    name: name
                    , id: id
                    , alias: name
                    , children: createSiteChildrenDevices(devices, urlHardwareId)
                    , spread: judgeIsTreeNodeSpread(devices, urlHardwareId)
                };
                devicesTreeListNodes.push(deviceTreeListNode);
            });
        }
        return devicesTreeListNodes/* || [ //节点
            {
                name: 'device-1'
                ,id: 1
                ,alias: 'device-1'
                ,children: [
                {
                    name: 'device-1-1'
                    ,id: 11
                    ,href: 'http://www.layui.com/'
                    ,alias: 'device-1-1'
                }, {
                    name: 'device-1-2'
                    ,id: 12
                }, {
                    name: 'device-1-3'
                    ,id: 13
                }
            ]
            }, {
                name: 'device-2'
                ,id: 2
                ,spread: true
                ,children: [
                    {
                        name: 'device-2-1'
                        ,id: 21
                        ,spread: true
                        ,children: [
                        {
                            name: 'device-2-1-1'
                            ,id: 211
                            ,children: [
                            {
                                name: 'device-2-1-1-1'
                                ,id: 2111
                            }, {
                                name: 'device-2-1-1-2'
                                ,id: 2112
                            }, {
                                name: 'device-2-1-1-3'
                                ,id: 2113
                            }
                        ]
                        }, {
                            name: 'device-2-1-2'
                            ,id: 212
                        }, {
                            name: 'device-2-1-3'
                            ,id: 213
                        }
                    ]
                    }, {
                        name: 'device-2-2'
                        ,id: 22
                        ,children: [
                            {
                                name: 'device-2-2-1'
                                ,id: 221
                            }, {
                                name: 'device-2-2-2'
                                ,id: 222
                            }, {
                                name: 'device-2-2-3'
                                ,id: 223
                            }
                        ]
                    }
                ]
            }
            ,{
                name: 'device-3'
                ,id: 3
                ,alias: 'device-3'
                ,children: [
                    {
                        name: 'device-3-1'
                        ,id: 31
                        ,alias: 'device-3-1'
                    }, {
                        name: 'device-3-2'
                        ,id: 12
                        ,children: [
                            {
                                name: 'device-3-2-1'
                                ,id: 121
                            }
                            ,{
                                name: 'device-3-2-2'
                                ,id: 122
                            }
                        ]
                    }
                ]
            }
        ]*/;
    }
    // End  : 所有被本模块调用的函数定义在此
    layui.use(['jquery', 'oneSocket', 'laytpl', 'layer', 'form', 'tools', 'tree'], function() {
        $ = layui.jquery;
        oneSocket = layui.oneSocket(/*SockJS, Stomp*/);
        laytpl = layui.laytpl;
        layer = layui.layer;
        var form = layui.form();
        tools = layui.tools;

        //第一次加载数据
        searchList();
        // 第一次加载左侧 tree list 数据
        searchTreeList();

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
        // End  : [设备列表]中某设备被点击

        // Start: 绑定窗口的 resize 事件
        var timerId_resize;
        $(window).on('resize', function() {
            if(myChartsArr && myChartsArr.length && myChartsArr.length > 0) {
                console.log('[device_manage_echarts.js] triggered resize function out');
                if(timerId_resize) {
                    clearInterval(timerId_resize);
                }
                timerId_resize = setTimeout(function() {
                    console.log('[device_manage_echarts.js] triggered resize function inner');
                    myChartsArr.forEach(function(myChartItem) {
                        myChartItem.resize();
                    });
                }, 100);
            }
        });
        // End  : 绑定窗口的 resize 事件
    });
})();