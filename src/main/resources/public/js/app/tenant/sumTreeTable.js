(function () {
    layui.use(['treeTable', 'webStorageCache', 'laytpl', 'laydate', 'oneSocket'], function() {
        var $ = layui.jquery
            , treeTable = layui.treeTable
            , webStorageCache = layui.webStorageCache
            , monitorDataCacheManager = webStorageCache.monitorDataCacheManager
            , sitesAndDevicesTreeCacheManager = webStorageCache.sitesAndDevicesTreeCacheManager
            , laytpl = layui.laytpl
            , laydate = layui.laydate
            , oneSocket = layui.oneSocket();

        $(function () {
            // Start: 测试 vue 渲染
            /*var vueRenderSumTable = new Vue({
                el: '#vue_render-table',
                data: {
                    message: 'Hello Sum Table!'
                    , isHaveSumTableData: true
                    , sumTreeTableDatasArr: []
                }
            });*/
            /*setTimeout(function() {
                vueRenderSumTable.message = 'Hello, Pandaroid Word!';
                vueRenderSumTable.isHaveSumTableData = true;
            }, 5000);*/
            var Vue_SumTreeTableDatasManager = {
                sumTreeTableDatasObj: {}
                , genVueLabel4Laytpl: function(id_siteOrDevice, fieldName_siteOrDevice) {
                    return ['{{ sumTreeTableDatasObj["', id_siteOrDevice, '"].', fieldName_siteOrDevice, ' }}'].join('');
                }
            };
            // End  : 测试 vue 渲染
            // Start: 使用 webStorageCache 请求站点设备树信息
            function callback_sumTreeTableDataLoaded(data_allSitesAndDevices_sumTreeTable) {
                console.log('[callback_sumTreeTableDataLoaded]data_allSitesAndDevices_sumTreeTable: ');
                console.log(data_allSitesAndDevices_sumTreeTable);
                // 处理总表信息的第一次初始化
                function processSumTreeTableSiteArr(data_siteArr) {
                    if(!data_siteArr || !data_siteArr.length || data_siteArr.length < 1) {
                        console.log('[processSumTreeTableSiteArr]data_siteArr 为空，不继续处理');
                        // vueRenderSumTable.isHaveSumTableData = false;
                        return ;
                    }
                    // 先清空 treeTable
                    tbody_sumTable.innerHTML = '';
                    // 处理每一个 site
                    function processSumTreeTableSite(data_siteArr, index_data_siteArr) {
                        if(!data_siteArr || !data_siteArr.length || data_siteArr.length < 1) {
                            console.log('[processSumTreeTableSite]data_siteArr 为空，不继续处理');
                            // vueRenderSumTable.isHaveSumTableData = false;
                            return ;
                        }
                        var len_data_siteArr = data_siteArr.length;
                        if(index_data_siteArr >= len_data_siteArr) {
                            console.log('[processSumTreeTableSite](index_data_siteArr >= len_data_siteArr): 为 true ，不继续处理，但要执行 initSumTreeTable()');
                            // 如果是最后一个 site (进此处的判断条件已说明)，且没有 devices ，则执行 initSumTreeTable
                            /*initSumTreeTable.isLastSite = true;
                            var lastSite = data_siteArr[len_data_siteArr - 1];
                            // 判断是否没有 devices
                            if(!lastSite || !lastSite.devices || !lastSite.devices.length || lastSite.devices.length < 1) {
                                // 没有 devices ，执行 initSumTreeTable();
                                initSumTreeTable();
                            }*/
                            initSumTreeTable();
                            return ;
                        }
                        var data_site = data_siteArr[index_data_siteArr];
                        var renderData_site = {
                            id: data_site.id
                            , name: data_site.name
                            , pointtime_timeStr: Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(data_site.id, 'pointtime_timeStr')
                            , isBranch: (data_site && data_site.devices && data_site.devices.length && data_site.devices.length > 0)
                            , parentId: null
                            , address: Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(data_site.id, 'address')
                            , vender: Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(data_site.id, 'vender')
                        };
                        // 变化的部分都放在下面数据结构里，上面用 Vue_SumTreeTableDatasManager.genVueLabel4Laytpl 占位
                        Vue_SumTreeTableDatasManager.sumTreeTableDatasObj[data_site.id] = {
                            pointtime_timeStr: laydate.now(data_site.createdate, 'YYYY-MM-DD hh:mm:ss')
                            , address: 'vue_地址_' + data_site.id
                            , vender: 'vue_厂家_' + data_site.id
                        };
                        // vueRenderSumTable.sumTreeTableDatasArr.push(renderData_site);
                        laytpl(tpl_sumTreeTableTr.innerHTML).render(renderData_site, function(html_tpl_sumTreeTableTr) {
                            tbody_sumTable.innerHTML += html_tpl_sumTreeTableTr;
                            // Start: 处理 site 下的 devices
                            function processSumTreeTableDevicesArr(devices_arr, index_devices_arr, callback_processSumTreeTableDevicesArr) {
                                if(!devices_arr || !devices_arr.length || devices_arr.length < 1) {
                                    console.log('[processSumTreeTableDevicesArr]devices_arr 为空，不继续处理，继续处理下一个 site');
                                    if(callback_processSumTreeTableDevicesArr
                                        && callback_processSumTreeTableDevicesArr instanceof Function) {
                                        callback_processSumTreeTableDevicesArr();
                                    } else {
                                        processSumTreeTableSite(data_siteArr, index_data_siteArr + 1);
                                    }
                                    return ;
                                }
                                var len_devices_arr = devices_arr.length;
                                if(index_devices_arr >= len_devices_arr) {
                                    console.log('[processSumTreeTableDevicesArr](index_devices_arr >= len_devices_arr): 为 true ，不继续处理，但要执行 processSumTreeTableSite(data_siteArr, index_data_siteArr + 1)');
                                    //
                                    /*if(initSumTreeTable.isLastSite) {
                                        // last site ，判断是否 initSumTreeTable()
                                        // 看是否是 last device ： 1. 当前 devices 的最后一个(进入此分支此条件已成立)； 2. 而且没有 children
                                        var lastDevice = devices_arr[devices_arr.length - 1];
                                        if(!lastDevice || !lastDevice.children || !lastDevice.children.length || lastDevice.children.length < 1) {
                                            initSumTreeTable();
                                        } else {
                                            // 还有 children devices ，继续处理
                                            processSumTreeTableDevicesArr(lastDevice.children, 0);
                                        }
                                    } else {
                                        // 并非 last site ，继续处理下一个 site
                                        processSumTreeTableSite(data_siteArr, index_data_siteArr + 1);
                                    }*/
                                    if(callback_processSumTreeTableDevicesArr && callback_processSumTreeTableDevicesArr instanceof Function) {
                                        callback_processSumTreeTableDevicesArr();
                                    } else {
                                        processSumTreeTableSite(data_siteArr, index_data_siteArr + 1);
                                    }
                                    return ;
                                }
                                var data_device = devices_arr[index_devices_arr];
                                var deviceId_treeTable = 'd_' + data_device.id;
                                var renderData_device = {
                                    // id 用 d_ 开头，避免与 siteId 重复造成问题
                                    id: deviceId_treeTable
                                    , name: data_device.name
                                    , isBranch: (data_device && data_device.children && data_device.children && data_device.children > 0)
                                    // parentId 这里考虑了第三级的情况，callback_processSumTreeTableDevicesArr 不存在为第一级，
                                    // 第一级 device 的父元素是 site 直接 id 就是 siteId ，第二级开始父元素 device 都是 d_ 开头
                                    , parentId: callback_processSumTreeTableDevicesArr ? 'd_' + data_device.siteId : data_device.siteId
                                    , address: Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'address')
                                    , vender: Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'vender')
                                };
                                // 第一部分（Device）： 变化的部分都放在下面数据结构里，上面用 Vue_SumTreeTableDatasManager.genVueLabel4Laytpl 占位
                                Vue_SumTreeTableDatasManager.sumTreeTableDatasObj[deviceId_treeTable] = {
                                    address: 'vue_地址_' + deviceId_treeTable
                                    , vender: 'vue_厂家_' + deviceId_treeTable
                                };
                                //
                                var latestMonitorData = data_device.latestMonitorData;
                                if(latestMonitorData) {
                                    var latestGasEvent = latestMonitorData.gasEvent;
                                    renderData_device['pointtime_timeStr'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'pointtime_timeStr');
                                    renderData_device['gaoJingClass'] = latestMonitorData.gaojing ? 'color-red' : '';
                                    renderData_device['running'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'running');
                                    renderData_device['standard'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'standard');
                                    renderData_device['ac220'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'ac220');
                                    renderData_device['battery'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'battery');
                                    renderData_device['pressure'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'pressure');
                                    renderData_device['solar'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'solar');
                                    renderData_device['summary'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'summary');
                                    renderData_device['temperature'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'temperature');
                                    renderData_device['surplus'] = Vue_SumTreeTableDatasManager.genVueLabel4Laytpl(deviceId_treeTable, 'surplus');
                                    // 第二部分（Device）： 变化的部分都放在下面数据结构里，上面用 Vue_SumTreeTableDatasManager.genVueLabel4Laytpl 占位
                                    var vue_sumTreeTableDataObj = Vue_SumTreeTableDatasManager.sumTreeTableDatasObj[deviceId_treeTable];
                                    vue_sumTreeTableDataObj.pointtime_timeStr = laydate.now(latestGasEvent.pointtime, 'YYYY-MM-DD hh:mm:ss');
                                    // vue_sumTreeTableDataObj.gaoJingClass = latestMonitorData.gaojing ? 'color-red' : '';
                                    vue_sumTreeTableDataObj.running = latestGasEvent.running;
                                    vue_sumTreeTableDataObj.standard = latestGasEvent.standard;
                                    vue_sumTreeTableDataObj.ac220 = latestGasEvent.ac220;
                                    vue_sumTreeTableDataObj.battery = latestGasEvent.battery;
                                    vue_sumTreeTableDataObj.pressure = latestGasEvent.pressure;
                                    vue_sumTreeTableDataObj.solar = latestGasEvent.solar;
                                    vue_sumTreeTableDataObj.summary = latestGasEvent.summary;
                                    vue_sumTreeTableDataObj.temperature = latestGasEvent.temperature;
                                    vue_sumTreeTableDataObj.surplus = latestGasEvent.surplus;
                                }
                                //
                                // vueRenderSumTable.sumTreeTableDatasArr.push(renderData_device);
                                laytpl(tpl_sumTreeTableTr.innerHTML).render(renderData_device, function(html_tpl_sumTreeTableTr) {
                                    tbody_sumTable.innerHTML += html_tpl_sumTreeTableTr;
                                    if(data_device && data_device.children && data_device.children.length && data_device.children.length > 0) {
                                        // 还有 children devices ，继续处理
                                        processSumTreeTableDevicesArr(data_device.children, 0, function() {
                                            processSumTreeTableDevicesArr(devices_arr, index_devices_arr + 1, callback_processSumTreeTableDevicesArr);
                                        });
                                    } else {
                                        processSumTreeTableDevicesArr(devices_arr, index_devices_arr + 1, callback_processSumTreeTableDevicesArr);
                                    }
                                });
                            }
                            processSumTreeTableDevicesArr(data_site.devices, 0);
                            // End  : 处理 site 下的 devices
                        });
                    }
                    processSumTreeTableSite(data_siteArr, 0);
                }
                processSumTreeTableSiteArr(data_allSitesAndDevices_sumTreeTable.data);
                /*laytpl(tpl_sumTreeTableTrs.innerHTML).render(data_allSitesAndDevices_sumTreeTable.data, function(html_tpl_sumTreeTableTrs) {
                 tbody_sumTable.innerHTML += html_tpl_sumTreeTableTrs;
                 });*/
            }
            sitesAndDevicesTreeCacheManager.loadTreeDataAllSitesAndDevices_sumTreeTable(callback_sumTreeTableDataLoaded);
            // End  : 使用 webStorageCache 请求站点设备树信息

            // Start: treeTable 初始化相关

            function initSumTreeTable() {
                // Start: 初始化其中 vue 的数据
                Vue_SumTreeTableDatasManager.vueRenderSumTableWithLaytpl = new Vue({
                    el: '#tbody_sumTable',
                    data: {
                        sumTreeTableDatasObj: Vue_SumTreeTableDatasManager.sumTreeTableDatasObj
                    }
                });
                // 测试
                /*setTimeout(function() {
                    vueRenderSumTableWithLaytpl.sumTreeTableDatasObj['d_4'].vender = '测试【d_4】：修改厂家 by Vue';
                    vueRenderSumTableWithLaytpl.sumTreeTableDatasObj['d_5'].vender = '测试【d_5】：修改厂家 by Vue';
                }, 5000);*/
                // End  : 初始化其中 vue 的数据

                var ele_treeTable_sum = $("#tree_table-sum");

                // initialize treeTable
                ele_treeTable_sum.treetable({
                    expandable:     true,
                    onNodeExpand:   nodeExpand,
                    onNodeCollapse: nodeCollapse
                });

                // expand node with ID "1" by default
                // ele_treeTable_sum.treetable("reveal", '1');

                function nodeExpand () {
                    // alert("Expanded: " + this.id);
                    // http://jsfiddle.net/djlerman/bbj8k9pe/
                    // getNodeViaAjax(this.id);
                }

                function nodeCollapse () {
                    // alert("Collapsed: " + this.id);
                }

            }
            // End  : treeTable 初始化相关

            // Highlight a row when selected
            $(document).on("mousedown", "#tree_table-sum tbody tr", function() {
                $(".selected").not(this).removeClass("selected");
                $(this).toggleClass("selected");
            });

            // Start: 全部展开 和 全部收拢 按钮
            $(document).on('click', '#btn-expand_all', function () {
                layui.treeTable.jQuery('#tree_table-sum').treetable('expandAll');
            }).on('click', '#btn-collapse_all', function () {
                layui.treeTable.jQuery('#tree_table-sum').treetable('collapseAll');
            });
            // End  : 全部展开 和 全部收拢 按钮

            // Start: 订阅和处理 MointorData.GasEvent 数据更新
            // 订阅 monitorDataCacheManager 的数据更新回调
            var callback_onHandle_processMonitorData_oneSocket_webStorageCache = function(data) {
                console.log('[sumTreeTable] monitorDataCacheManager 数据更新后回调， data： ');
                console.log(data);
                // 1. 解析 data ，取得 hardwareId （现在只刷新了 device 的）
                var json_monitorData = JSON.parse(data);
                console.log('[sumTreeTable] monitorDataCacheManager 数据更新后回调， json_monitorData： ');
                console.log(json_monitorData);
                // 1.5 取得 gasEvent
                var gasEvent = json_monitorData.gasEvent;
                console.log('[sumTreeTable] monitorDataCacheManager 数据更新后回调， gasEvent： ');
                console.log(gasEvent);
                // 1.7  取得 hardwareId
                var hardwareId = gasEvent.hardwareId;
                console.log('[sumTreeTable] monitorDataCacheManager 数据更新后回调， hardwareId： ' + hardwareId);
                // 1.8 取得 deviceId
                sitesAndDevicesTreeCacheManager.parseDeviceIdFromHardwareId(hardwareId, function(deviceId) {
                    if(!deviceId || deviceId < 1) {
                        console.warn('[callback_onHandle_processMonitorData_oneSocket_webStorageCache] deviceId 有問題。 deviceId: ' + deviceId);
                        return ;
                    }
                    console.log('[sumTreeTable] monitorDataCacheManager 数据更新后回调， deviceId： ' + deviceId);
                    // 2. 只需要更新 Vue 绑定的数据
                    // 2.1 获取 latest MonitorData
                    var latestMonitorData = monitorDataCacheManager.loadLatestMonitorDataByHardwareId(hardwareId);
                    if(!latestMonitorData) {
                        return ;
                    }
                    var latestGasEvent = latestMonitorData.gasEvent;
                    if(!latestGasEvent) {
                        return ;
                    }
                    // 2.2 得到设备在 sumTreeTableDatasObj 中的 entry
                    var entry_sumTreeTableDataObj = ['d_', deviceId].join('');
                    var target_sumTreeTableDataObj = Vue_SumTreeTableDatasManager.vueRenderSumTableWithLaytpl.sumTreeTableDatasObj[entry_sumTreeTableDataObj];
                    // 開始同步數據
                    target_sumTreeTableDataObj.pointtime_timeStr = laydate.now(latestGasEvent.pointtime, 'YYYY-MM-DD hh:mm:ss');
                    // target_sumTreeTableDataObj.gaoJingClass = latestMonitorData.gaojing ? 'color-red' : '';
                    if(latestMonitorData.gaojing) {
                        $(['tr[data-tt-id=', entry_sumTreeTableDataObj, ']'].join('')).addClass('color-red');
                    } else {
                        $(['tr[data-tt-id=', entry_sumTreeTableDataObj, ']'].join('')).removeClass('color-red');
                    }
                    target_sumTreeTableDataObj.running = latestGasEvent.running;
                    target_sumTreeTableDataObj.standard = latestGasEvent.standard;
                    target_sumTreeTableDataObj.ac220 = latestGasEvent.ac220;
                    target_sumTreeTableDataObj.battery = latestGasEvent.battery;
                    target_sumTreeTableDataObj.pressure = latestGasEvent.pressure;
                    target_sumTreeTableDataObj.solar = latestGasEvent.solar;
                    target_sumTreeTableDataObj.summary = latestGasEvent.summary;
                    target_sumTreeTableDataObj.temperature = latestGasEvent.temperature;
                    target_sumTreeTableDataObj.surplus = latestGasEvent.surplus;
                });
            };
            oneSocket.setCallback_onHandle_processMonitorData_oneSocket_webStorageCache(callback_onHandle_processMonitorData_oneSocket_webStorageCache);
            // End  : 订阅和处理 MointorData.GasEvent 数据更新
        });
    });
})();