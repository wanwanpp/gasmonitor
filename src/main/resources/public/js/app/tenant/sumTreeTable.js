(function () {
    layui.use(['treeTable', 'webStorageCache', 'laytpl', 'laydate'], function() {
        var $ = layui.jquery
            , treeTable = layui.treeTable
            , webStorageCache = layui.webStorageCache
            , sitesAndDevicesTreeCacheManager = webStorageCache.sitesAndDevicesTreeCacheManager
            , laytpl = layui.laytpl
            , laydate = layui.laydate;

        $(function () {
            // Start: 使用 webStorageCache 请求站点设备树信息
            function callback_sumTreeTableDataLoaded(data_allSitesAndDevices_sumTreeTable) {
                debugger;
                console.log('[callback_sumTreeTableDataLoaded]data_allSitesAndDevices_sumTreeTable: ');
                console.log(data_allSitesAndDevices_sumTreeTable);
                // 处理总表信息的第一次初始化
                function processSumTreeTableSiteArr(data_siteArr) {
                    if(!data_siteArr || !data_siteArr.length || data_siteArr.length < 1) {
                        console.log('[processSumTreeTableSiteArr]data_siteArr 为空，不继续处理');
                        return ;
                    }
                    // 处理每一个 site
                    function processSumTreeTableSite(data_siteArr, index_data_siteArr) {
                        if(!data_siteArr || !data_siteArr.length || data_siteArr.length < 1) {
                            console.log('[processSumTreeTableSite]data_siteArr 为空，不继续处理');
                            return ;
                        }
                        var len_data_siteArr = data_siteArr.length;
                        if(index_data_siteArr >= len_data_siteArr) {
                            console.log('[processSumTreeTableSite](index_data_siteArr >= len_data_siteArr): 为 true ，不继续处理，但要执行 initSumTreeTable()');
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
                        laytpl(tpl_sumTreeTableTr.innerHTML).render(renderData_site, function(html_tpl_sumTreeTableTr) {
                            tbody_sumTable.innerHTML += html_tpl_sumTreeTableTr;
                            processSumTreeTableSite(data_siteArr, index_data_siteArr + 1);
                        });
                    }
                    processSumTreeTableSite(data_siteArr, 0);
                }
                processSumTreeTableSiteArr(data_allSitesAndDevices_sumTreeTable.data);
                /*laytpl(tpl_sumTreeTableTrs.innerHTML).render(data_allSitesAndDevices_sumTreeTable.data, function(html_tpl_sumTreeTableTrs) {
                 tbody_sumTable.innerHTML += html_tpl_sumTreeTableTrs;
                 });*/
            }
            debugger;
            sitesAndDevicesTreeCacheManager.loadTreeDataAllSitesAndDevices_sumTreeTable(callback_sumTreeTableDataLoaded);
            // End  : 使用 webStorageCache 请求站点设备树信息

            // Start: treeTable 初始化相关
            function initSumTreeTable() {
                // initialize treeTable
                $("#tree_table-sum").treetable({
                    expandable:     true,
                    onNodeExpand:   nodeExpand,
                    onNodeCollapse: nodeCollapse
                });


                // expand node with ID "1" by default
                $("#tree_table-sum").treetable("reveal", '1');


                // Highlight a row when selected
                $("#tree_table-sum tbody").on("mousedown", "tr", function() {
                    $(".selected").not(this).removeClass("selected");
                    $(this).toggleClass("selected");
                });

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