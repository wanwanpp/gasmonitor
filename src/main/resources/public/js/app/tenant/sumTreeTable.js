(function () {
    layui.use(['treeTable', 'webStorageCache', 'laytpl', 'laydate'], function() {
        var $ = layui.jquery
            , treeTable = layui.treeTable
            , webStorageCache = layui.webStorageCache
            , sitesAndDevicesTreeCacheManager = webStorageCache.sitesAndDevicesTreeCacheManager
            , laytpl = layui.laytpl
            , laydate = layui.laydate;

        $(function () {
            // Start: 测试 vue 渲染
            var vueRenderSumTable = new Vue({
                el: '#vue_render-table',
                data: {
                    message: 'Hello Sum Table!'
                    , isHaveSumTableData: false
                    , sumTreeTableDatasArr: []
                }
            });
            setTimeout(function() {
                vueRenderSumTable.message = 'Hello, Pandaroid Word!';
                vueRenderSumTable.isHaveSumTableData = true;
            }, 5000);
            // End  : 测试 vue 渲染
            // Start: 使用 webStorageCache 请求站点设备树信息
            function callback_sumTreeTableDataLoaded(data_allSitesAndDevices_sumTreeTable) {
                console.log('[callback_sumTreeTableDataLoaded]data_allSitesAndDevices_sumTreeTable: ');
                console.log(data_allSitesAndDevices_sumTreeTable);
                // 处理总表信息的第一次初始化
                function processSumTreeTableSiteArr(data_siteArr) {
                    if(!data_siteArr || !data_siteArr.length || data_siteArr.length < 1) {
                        console.log('[processSumTreeTableSiteArr]data_siteArr 为空，不继续处理');
                        return ;
                    }
                    // 先清空 treeTable
                    tbody_sumTable.innerHTML = '';
                    // 处理每一个 site
                    function processSumTreeTableSite(data_siteArr, index_data_siteArr) {
                        if(!data_siteArr || !data_siteArr.length || data_siteArr.length < 1) {
                            console.log('[processSumTreeTableSite]data_siteArr 为空，不继续处理');
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
                            , pointtime_timeStr: laydate.now(data_site.createdate, 'YYYY-MM-DD hh:mm:ss')
                            , isBranch: (data_site && data_site.devices && data_site.devices.length && data_site.devices.length > 0)
                            , parentId: null
                        };
                        vueRenderSumTable.sumTreeTableDatasArr.push(renderData_site);
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
                                var renderData_device = {
                                    // id 用 d_ 开头，避免与 siteId 重复造成问题
                                    id: 'd_' + data_device.id
                                    , name: data_device.name
                                    , isBranch: (data_device && data_device.children && data_device.children && data_device.children > 0)
                                    // parentId 这里考虑了第三级的情况，callback_processSumTreeTableDevicesArr 不存在为第一级，
                                    // 第一级 device 的父元素是 site 直接 id 就是 siteId ，第二级开始父元素 device 都是 d_ 开头
                                    , parentId: callback_processSumTreeTableDevicesArr ? 'd_' + data_device.siteId : data_device.siteId
                                };
                                //
                                var latestMonitorData = data_device.latestMonitorData;
                                if(latestMonitorData) {
                                    var latestGasEvent = latestMonitorData.gasEvent;
                                    renderData_device['pointtime_timeStr'] = laydate.now(latestGasEvent.pointtime, 'YYYY-MM-DD hh:mm:ss');
                                    renderData_device['gaoJingClass'] = latestMonitorData.gaojing ? 'color-red' : '';
                                    renderData_device['running'] = latestGasEvent.running;
                                    renderData_device['standard'] = latestGasEvent.standard;
                                    renderData_device['ac220'] = latestGasEvent.ac220;
                                    renderData_device['battery'] = latestGasEvent.battery;
                                    renderData_device['pressure'] = latestGasEvent.pressure;
                                    renderData_device['solar'] = latestGasEvent.solar;
                                    renderData_device['summary'] = latestGasEvent.summary;
                                    renderData_device['temperature'] = latestGasEvent.temperature;
                                    renderData_device['surplus'] = latestGasEvent.surplus;
                                }
                                //
                                vueRenderSumTable.sumTreeTableDatasArr.push(renderData_device);
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
        });
    });
})();