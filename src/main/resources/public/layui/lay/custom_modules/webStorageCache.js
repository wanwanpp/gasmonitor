/*!
 * webStorageCache.js v1.0.3
 * (c) 2017 Payne Pandaroid Wang
 * Added `expires` attribute and serialize data with `JSON.parse` for the localStorage and sessionStorage.
 *
 * 原创：
 * https://github.com/WQTeam/web-storage-cache
 * (c) 2013-2016 WQTeam, MIT license
 */
layui.define(['jquery', 'layer', 'tools', 'laydate'], function(exports) {
    var $ = layui.jquery
        , layer = layui.layer
        , tools = layui.tools
        , todayStartEndDateTimeTool = tools.todayStartEndDateTimeTool
        , laydate = layui.laydate;

    console.log('【layui.webStorageCache】加载完毕后执行回调');

    // Start: webStorageCache 源码
    !function(a,b){"function"==typeof define&&define.amd?define(b):"object"==typeof exports?module.exports=b():a.WebStorageCache=b()}(this,function(){"use strict";function a(a,b){for(var c in b)a[c]=b[c];return a}function b(a){var b=!1;if(a&&a.setItem){b=!0;var c="__"+Math.round(1e7*Math.random());try{a.setItem(c,c),a.removeItem(c)}catch(d){b=!1}}return b}function c(a){var b=typeof a;return"string"===b&&window[a]instanceof Storage?window[a]:a}function d(a){return"[object Date]"===Object.prototype.toString.call(a)&&!isNaN(a.getTime())}function e(a,b){if(b=b||new Date,"number"==typeof a?a=a===1/0?l:new Date(b.getTime()+1e3*a):"string"==typeof a&&(a=new Date(a)),a&&!d(a))throw new Error("`expires` parameter cannot be converted to a valid Date instance");return a}function f(a){var b=!1;if(a)if(a.code)switch(a.code){case 22:b=!0;break;case 1014:"NS_ERROR_DOM_QUOTA_REACHED"===a.name&&(b=!0)}else-2147024882===a.number&&(b=!0);return b}function g(a,b){this.c=(new Date).getTime(),b=b||m;var c=e(b);this.e=c.getTime(),this.v=a}function h(a){return"object"!=typeof a?!1:a&&"c"in a&&"e"in a&&"v"in a?!0:!1}function i(a){var b=(new Date).getTime();return b<a.e}function j(a){return"string"!=typeof a&&(console.warn(a+" used as a key, but it is not a string."),a=String(a)),a}function k(e){var f={storage:"localStorage",exp:1/0},g=a(f,e),h=g.exp;if(h&&"number"!=typeof h&&!d(h))throw new Error("Constructor `exp` parameter cannot be converted to a valid Date instance");m=h;var i=c(g.storage),j=b(i);this.isSupported=function(){return j},j?(this.storage=i,this.quotaExceedHandler=function(a,b,c){if(console.warn("Quota exceeded!"),c&&c.force===!0){var d=this.deleteAllExpires();console.warn("delete all expires CacheItem : ["+d+"] and try execute `set` method again!");try{c.force=!1,this.set(a,b,c)}catch(e){console.warn(e)}}}):a(this,o)}var l=new Date("Fri, 31 Dec 9999 23:59:59 UTC"),m=l,n={serialize:function(a){return JSON.stringify(a)},deserialize:function(a){return a&&JSON.parse(a)}},o={set:function(){},get:function(){},"delete":function(){},deleteAllExpires:function(){},clear:function(){},add:function(){},replace:function(){},touch:function(){}},p={set:function(b,c,d){if(b=j(b),d=a({force:!0},d),void 0===c)return this["delete"](b);var e=n.serialize(c),h=new g(e,d.exp);try{this.storage.setItem(b,n.serialize(h))}catch(i){f(i)?this.quotaExceedHandler(b,e,d,i):console.error(i)}return c},get:function(a){a=j(a);var b=null;try{b=n.deserialize(this.storage.getItem(a))}catch(c){return null}if(h(b)){if(i(b)){var d=b.v;return n.deserialize(d)}this["delete"](a)}return null},"delete":function(a){return a=j(a),this.storage.removeItem(a),a},deleteAllExpires:function(){for(var a=this.storage.length,b=[],c=this,d=0;a>d;d++){var e=this.storage.key(d),f=null;try{f=n.deserialize(this.storage.getItem(e))}catch(g){}if(null!==f&&void 0!==f.e){var h=(new Date).getTime();h>=f.e&&b.push(e)}}return b.forEach(function(a){c["delete"](a)}),b},clear:function(){this.storage.clear()},add:function(b,c,d){b=j(b),d=a({force:!0},d);try{var e=n.deserialize(this.storage.getItem(b));if(!h(e)||!i(e))return this.set(b,c,d),!0}catch(f){return this.set(b,c,d),!0}return!1},replace:function(a,b,c){a=j(a);var d=null;try{d=n.deserialize(this.storage.getItem(a))}catch(e){return!1}if(h(d)){if(i(d))return this.set(a,b,c),!0;this["delete"](a)}return!1},touch:function(a,b){a=j(a);var c=null;try{c=n.deserialize(this.storage.getItem(a))}catch(d){return!1}if(h(c)){if(i(c))return this.set(a,this.get(a),{exp:b}),!0;this["delete"](a)}return!1}};return k.prototype=p,k});
    // End  : webStorageCache 源码

    // Start: 使用单例的 wsCache
    var wsCache = new this.WebStorageCache();
    var MAP_ENUM_WS_CACHE_KEYS = {
        MONITOR_DATA_HARDWARE_IDS_MAP: "cache_monitorData_key_hardwareId_map"
        , TREE_DATA_ALL_SITES_AND_DEVICES: 'cache_treeData_allSitesAndDevices'
    };

    // End  : 使用单例的 wsCache

    // Start: 所有的 function - 公用 private 部分
    var _webStorageCache = {
        /**
         * 统一通用的超时时间
         * 注意：访问缓存数据后建议更新超时时间，避免刚访问的数据超时
         * @returns {Date}
         */
        getCommonExpireTime: function() {
            var next2Hours = new Date();
            next2Hours.setHours(next2Hours.getHours() + 2);
            return next2Hours;
        },
        /**
         * 封装带统一超时的缓存方法
         * @param key
         * @param value
         */
        saveCacheWithCommonExpire: function(key, value, exp) {
            wsCache.set(key, value, {exp : exp || _webStorageCache.getCommonExpireTime()});
        }
    };
    // End  : 所有的 function - 公用 private 部分

    // Start: 所有的 function - monitorDataCacheManager
    /**
     * private 部分 for monitorDataCacheManager ，不暴露接口
     * @type {{getCommonExpireTime: getCommonExpireTime, getCachedMonitorDataKeyHardwareIdsArr: getCachedMonitorDataKeyHardwareIdsArr}}
     * @private
     */
    var _monitorDataCacheManager = {
        /**
         * 根据 hardwareId 加载最新的 monitorData
         * @param hardwareId
         */
        loadLatestMonitorDataByHardwareId: function(hardwareId) {
            /*var cache_key_4_a_monitorData_arr = _monitorDataCacheManager.genCacheKeyByHardwareId(hardwareId);
            var cached_monitorData_arr = _monitorDataCacheManager.getCachedMonitorDataArrByKey(cache_key_4_a_monitorData_arr);*/
            var cached_monitorData_arr = monitorDataCacheManager.loadCachedMonitorDataArrByHardwareId(hardwareId);
            //
            if(!cached_monitorData_arr || !cached_monitorData_arr.length || cached_monitorData_arr.length < 1) {
                console.log('[loadLatestMonitorDataByHardwareId]cached_monitorData_arr 为空，故返回最新的 monitorData 也为空');
                return null;
            }
            return cached_monitorData_arr[cached_monitorData_arr.length - 1];
        },
        /**
         * 获取缓存的 monitorData key hardwareId 数组
         * 此数组用于管理已经缓存了的 hardwareId 对应的 monitorData 数组
         */
        getCachedMonitorDataKeyHardwareIdsMap: function() {
            var cache_monitorData_key_hardwareIds_map = wsCache.get(MAP_ENUM_WS_CACHE_KEYS.MONITOR_DATA_HARDWARE_IDS_MAP);
            if(!cache_monitorData_key_hardwareIds_map) {
                cache_monitorData_key_hardwareIds_map = {};
                _webStorageCache.saveCacheWithCommonExpire(MAP_ENUM_WS_CACHE_KEYS.MONITOR_DATA_HARDWARE_IDS_MAP
                    , cache_monitorData_key_hardwareIds_map);
            }
            return cache_monitorData_key_hardwareIds_map;
        },
        /**
         * 检查 hardwareId 是否在 cache_monitorData_key_hardwareIds_map 的 key 中
         * @param hardwareId
         * @param cache_monitorData_key_hardwareIds_map
         * @returns {boolean}
         */
        checkIsMonitorDataInCacheMap: function (hardwareId, cache_monitorData_key_hardwareIds_map) {
            /*var isMonitorDataInCacheMap = false;
            for(var cache_monitorData_key_hardwareId in cache_monitorData_key_hardwareIds_map) {
                console.log('cache_monitorData_key_hardwareId: ' + cache_monitorData_key_hardwareId);
                if(hardwareId == cache_monitorData_key_hardwareId) {
                    isMonitorDataInCacheMap = cache_monitorData_key_hardwareIds_map[hardwareId];
                    break;
                }
            }*/
            return (cache_monitorData_key_hardwareIds_map && cache_monitorData_key_hardwareIds_map[hardwareId]);
        },
        /**
         * 根据 hardwareId 生成 cacheKey
         * @param hardwareId
         * @returns {string}
         */
        genCacheKeyByHardwareId: function (hardwareId) {
            return ['cacheKey_monitorData_', hardwareId].join('');
        },
        /**
         * 保存 {hardwareId: cache_key_4_a_monitorData_arr} 到 cache_monitorData_key_hardwareIds_map 中
         * @param hardwareId
         * @param cache_key_4_a_monitorData_arr
         */
        saveCacheKeyInKeyHardwareIdsMap: function(hardwareId, cache_key_4_a_monitorData_arr) {
            var cache_monitorData_key_hardwareIds_map = _monitorDataCacheManager.getCachedMonitorDataKeyHardwareIdsMap();
            cache_monitorData_key_hardwareIds_map[hardwareId] = cache_key_4_a_monitorData_arr;
            _webStorageCache.saveCacheWithCommonExpire(MAP_ENUM_WS_CACHE_KEYS.MONITOR_DATA_HARDWARE_IDS_MAP
                , cache_monitorData_key_hardwareIds_map);
        },
        getCachedMonitorDataArrByKey: function (cache_key_4_a_monitorData_arr) {
            var cached_monitorData_Arr = wsCache.get(cache_key_4_a_monitorData_arr);
            if(!cached_monitorData_Arr) {
                cached_monitorData_Arr = [];
            }
            return cached_monitorData_Arr;
        },
        /**
         * push 到缓存的 monitorData 数组
         * @param cache_key_4_a_monitorData_arr     数组缓存 cache key
         * @param jsonObj_monitorData   要 push 进缓存 cache 的数组的 value
         */
        pushMonitorData2CachedArrByMonitorDataCachekey: function(cache_key_4_a_monitorData_arr, jsonObj_monitorData) {
            var cached_monitorData_Arr = _monitorDataCacheManager.getCachedMonitorDataArrByKey(cache_key_4_a_monitorData_arr);
            cached_monitorData_Arr.push(jsonObj_monitorData);
            // 1. 对 cached_monitorData_Arr 通过 pointtime 进行升序排序
            cached_monitorData_Arr.sort(function(monitorData1, monitorData2) {
                if(!(monitorData1 && monitorData1.gasEvent && monitorData1.gasEvent.pointtime
                    && monitorData2 && monitorData2.gasEvent && monitorData2.gasEvent.pointtime)) {
                    return -1;
                }
                return (monitorData1.gasEvent.pointtime - monitorData2.gasEvent.pointtime);
            });
            // 2. 对有序的 cached_monitorData_Arr 通过 pointtime 进行排重
            var tmp_cached_monitorData_arr = [], len_cached_monitorData_arr = cached_monitorData_Arr.length;
            if(len_cached_monitorData_arr > 1) {
                tmp_cached_monitorData_arr.push(cached_monitorData_Arr[0]);
                for(var i_cached_monitorData_arr = 1; i_cached_monitorData_arr < len_cached_monitorData_arr; ++i_cached_monitorData_arr) {
                    var cur_cached_monitorData = cached_monitorData_Arr[i_cached_monitorData_arr];
                    if(tmp_cached_monitorData_arr[tmp_cached_monitorData_arr.length - 1].gasEvent.pointtime != cur_cached_monitorData.gasEvent.pointtime) {
                        tmp_cached_monitorData_arr.push(cur_cached_monitorData);
                    }
                }
                cached_monitorData_Arr = tmp_cached_monitorData_arr;
            }
            // 3. 保存到缓存
            _webStorageCache.saveCacheWithCommonExpire(cache_key_4_a_monitorData_arr, cached_monitorData_Arr);
        }
    };
    /**
     * public 部分 for monitorDataCacheManager ，对外暴露接口
     * monitorDataCache 的结构：
     * 1. 统一管理部分 cache_monitorData_key_hardwareIds_map ： hardwareId 到 MonitorDataCache key 的映射
     * 2. 离散部分 MonitorDataCache ： MonitorDataCache key 到 value 的映射
     * 避免一个结构太大难以管理，同时又有缓存分散快速的特点
     * @type {{addJsonMonitorData2Cache: addJsonMonitorData2Cache}}
     */
    var monitorDataCacheManager = {
        loadCachedMonitorDataArrByHardwareId: function (hardwareId) {
            var cache_key_4_a_monitorData_arr = _monitorDataCacheManager.genCacheKeyByHardwareId(hardwareId);
            var cached_monitorData_arr = _monitorDataCacheManager.getCachedMonitorDataArrByKey(cache_key_4_a_monitorData_arr);
            if(!cached_monitorData_arr || !cached_monitorData_arr.length || cached_monitorData_arr.length < 1) {
                cached_monitorData_arr = [];
            }
            return cached_monitorData_arr;
        },
        loadHistoryMonitorData2Cache: function() {
            layer.load();
            // Start: 请求历史数据，并加入缓存，最后再关闭 loading layer
            // 1. 调用 sitesAndDevicesTreeCacheManager.loadTreeDataAllSitesAndDevices ，在回调 callback_allSitesAndDevices 中，
            //    处理 data_allSitesAndDevices
            sitesAndDevicesTreeCacheManager.loadTreeDataAllSitesAndDevices(callback_processDevicesHardwareIds);
            // 2. 回调处理 data_allSitesAndDevices ，其实是得到 devices 列表，从而得到 hardwareIds 列表
            function callback_processDevicesHardwareIds(data_sitesAndDevices) {
                var data_sitesArr = data_sitesAndDevices.data;
                processSitesArr(data_sitesArr, 0);
            }
            function processSitesArr(data_sitesArr, index_sitesArr) {
                if(!data_sitesArr || !data_sitesArr.length || data_sitesArr.length < 1) {
                    layer.closeAll('loading');
                    return ;
                }
                if(index_sitesArr >= data_sitesArr.length) {
                    layer.closeAll('loading');
                    return ;
                }
                var item_site = data_sitesArr[index_sitesArr];
                processSite_loadHistoryMonitorData(item_site, function() {
                    processSitesArr(data_sitesArr, index_sitesArr + 1);
                });
            }
            //
            // 处理每一个 site ，设备列表 site.devices
            function processSite_loadHistoryMonitorData(site, callback_processSitesArr) {
                var devicesArr = site.devices;
                processDevice(devicesArr, 0, callback_processSitesArr);
            }
            function processDevice(devicesArr, index_devicesArr, callback_processSitesArr) {
                var processCallback = function() {
                    if(callback_processSitesArr && callback_processSitesArr instanceof Function) {
                        callback_processSitesArr();
                    }
                };
                //
                if(!devicesArr || !devicesArr.length || devicesArr.length < 1) {
                    processCallback();
                    return ;
                }
                if(index_devicesArr >= devicesArr.length) {
                    processCallback();
                    return ;
                }
                var item_device = devicesArr[index_devicesArr];
                queryHistoryMonitorDataByHardwareId(item_device.hardwareId, function() {
                    processDevice(devicesArr, index_devicesArr + 1, callback_processSitesArr);
                });
            }
            //
            // 3. 根据每个 hardwareId 去请求 /point/query/history 今天的数据
            function queryHistoryMonitorDataByHardwareId(hardwareId, callback_processDevice) {
                var params_history = {hardwareId: hardwareId, begin: laydate.now(todayStartEndDateTimeTool.checkIsTimestampBetweenStartEnd.getStartTimestamp(), 'YYYY-MM-DD:hh:mm:ss')
                    , end: laydate.now(todayStartEndDateTimeTool.checkIsTimestampBetweenStartEnd.getEndTimestamp(), 'YYYY-MM-DD:hh:mm:ss')};
                var url_get_history = '/point/query/history' + tools.serializeParams(params_history);
                var callback_history = function(data_history) {
                    console.log('[webStorageCache.js queryHistoryMonitorDataByHardwareId callback_history] data_history: ');
                    console.log(data_history);
                    //
                    var code = data_history.code, msg = data_history.msg, page = data_history.page
                        , total = data_history.total, totalPage = data_history.totalPage, arr_monitorData = data_history.data;
                    console.log('[webStorageCache.js queryHistoryMonitorDataByHardwareId callback_history] code: ' + code);
                    console.log('[webStorageCache.js queryHistoryMonitorDataByHardwareId callback_history] msg: ' + msg);
                    console.log('[webStorageCache.js queryHistoryMonitorDataByHardwareId callback_history] page: ' + page);
                    console.log('[webStorageCache.js queryHistoryMonitorDataByHardwareId callback_history] total: ' + total);
                    console.log('[webStorageCache.js queryHistoryMonitorDataByHardwareId callback_history] totalPage: ' + totalPage);
                    console.log('[webStorageCache.js queryHistoryMonitorDataByHardwareId callback_history] arr_monitorData: ');
                    console.log(arr_monitorData);
                    // 处理 arr_monitorData
                    processMonitorDataArr(arr_monitorData, 0, callback_processDevice);
                };
                // 2. 发 get 请求
                $.get(url_get_history, {}, callback_history, 'json');
            }
            // 4. 调用接口，将请求下来的数据全部 add 到 cache ，并 close loading layer
            function processMonitorDataArr(arr_monitorData, index_arr_monitorData, callback_processDevice) {
                var processCallback = function() {
                    if(callback_processDevice && callback_processDevice instanceof Function) {
                        callback_processDevice();
                    }
                };
                //
                if(!arr_monitorData || !arr_monitorData.length || arr_monitorData.length < 1) {
                    processCallback();
                    return ;
                }
                if(index_arr_monitorData >= arr_monitorData.length) {
                    processCallback();
                    return ;
                }
                var item_monitorData = arr_monitorData[index_arr_monitorData];
                monitorDataCacheManager.addJsonMonitorData2Cache(item_monitorData);
                processMonitorDataArr(arr_monitorData, index_arr_monitorData + 1, callback_processDevice);
            }
            // End  : 请求历史数据，并加入缓存，最后再关闭 loading layer
        },
        addJsonMonitorData2Cache: function(jsonObj_monitorData) {
            var cache_monitorData_key_hardwareIds_map = _monitorDataCacheManager.getCachedMonitorDataKeyHardwareIdsMap();
            var jsonObj_gasEvent = jsonObj_monitorData.gasEvent
                , hardwareId = jsonObj_gasEvent.hardwareId;
            // 2. jsonObj_gasEvent: {"hardwareId":"t21s1d1","temperature":1212.0,"pressure":781.0,"standard":9061.0
            // ,"running":758.0,"summary":1929391.0,"surplus":2.1421421E7,"analog1":2.1421421E7,"analog2":2.1421421E7
            // ,"analog3":2.1421421E7,"analog4":2.1421421E7,"switch1":21421421,"switch2":21421421,"switch3":21421421
            // ,"switch4":21421421,"ac220":21421421,"battery":21421421,"solar":21421421,"pointtime":1501833236607}
            // ,"gaojing":true,"msg":"温度太高"}
            // 1. 检查 jsonObj_monitorData 中的 gasEvent 的 hardwareId 是否在 cache_monitorData_key_hardwareIds_map 中
            var isMonitorDataInCacheMap = _monitorDataCacheManager.checkIsMonitorDataInCacheMap(hardwareId, cache_monitorData_key_hardwareIds_map);
            // 2 直接从 cache_monitorData_key_hardwareIds_map 中取出 key
            var cache_key_4_a_monitorData_arr = cache_monitorData_key_hardwareIds_map[hardwareId];
            // 2.5 如果不在，则新建一个，并且返回这个 key
            if(!isMonitorDataInCacheMap) {
                cache_key_4_a_monitorData_arr = _monitorDataCacheManager.genCacheKeyByHardwareId(hardwareId);
                _monitorDataCacheManager.saveCacheKeyInKeyHardwareIdsMap(hardwareId, cache_key_4_a_monitorData_arr);
            }
            // 3. 根据 key 向缓存中追加 jsonObj_monitorData
            _monitorDataCacheManager.pushMonitorData2CachedArrByMonitorDataCachekey(cache_key_4_a_monitorData_arr, jsonObj_monitorData);
        }
    };
    // End  : 所有的 function - monitorDataCacheManager

    // Start: 所有的 function - sitesAndDevicesTreeCacheManager
    var _sitesAndDevicesTreeCacheManager = {
        /**
         * 给 devices 附加最新的 monitorData
         * @param treeData_allSitesAndDevices
         * @returns {*}
         */
        attachLatestMonitorData2Devices: function(treeData_allSitesAndDevices) {
            // 1. 遍历 treeData_allSitesAndDevices ，区分出其中的 device
            if(!treeData_allSitesAndDevices) {
                console.log('[attachLatestMonitorData2Devices]treeData_allSitesAndDevices 为空');
                return ;
            }
            var data_treeData_allSitesAndDevices = treeData_allSitesAndDevices.data;
            if(!data_treeData_allSitesAndDevices || !data_treeData_allSitesAndDevices.length || data_treeData_allSitesAndDevices.length < 1) {
                console.log('[attachLatestMonitorData2Devices]data_treeData_allSitesAndDevices 数组为空');
                return ;
            }
            // 开始遍历
            data_treeData_allSitesAndDevices.forEach(function(item_site) {
                var devices_arr = item_site.devices;
                // 处理 devices_arr ， attach 最新数据
                processDevicesArr(devices_arr);
            });
            // 遍历处理当前 devices_arr
            function processDevicesArr(devices_arr) {
                if(!devices_arr || !devices_arr.length || devices_arr.length < 1) {
                    console.log('[processDevicesArr]devices_arr 数组为空');
                    return ;
                }
                devices_arr.forEach(function (item_device) {
                    attachLatestData2Device(item_device);
                    // 处理 item_device 的 children
                    var children_item_device = item_device.children;
                    processDevicesArr(children_item_device);
                });
            }
            // 2. 用 device 去调用另一个 function 附加 latest 最新数据
            function attachLatestData2Device(device) {
                // 2.1 从 cache 中读取 device.hardwareId 对应的最新数据
                var latestMonitorData = _monitorDataCacheManager.loadLatestMonitorDataByHardwareId(device.hardwareId);
                device.latestMonitorData = latestMonitorData;
            }
            // 3. return treeData_allSitesAndDevices_sumTreeTable
            return treeData_allSitesAndDevices;
        }
    };
    var sitesAndDevicesTreeCacheManager = {
        loadTreeDataAllSitesAndDevices_sumTreeTable: function(callback_sumTreeTableDataLoaded) {
            // 1. loadTreeDataAllSitesAndDevices 获取到最新的 treeData_allSitesAndDevices 数据结构
            sitesAndDevicesTreeCacheManager.loadTreeDataAllSitesAndDevices(callback_processTreeData_allSitesAndDevices);
            // 2. 遍历 treeData_allSitesAndDevices ，将 cache 中的 device 数据最新一条付给它们
            function callback_processTreeData_allSitesAndDevices(treeData_allSitesAndDevices) {
                console.log('[callback_processTreeData_allSitesAndDevices]treeData_allSitesAndDevices: ');
                console.log(treeData_allSitesAndDevices);
                // 暂时将带最新数据的 treeData_allSitesAndDevices_sumTreeTable 赋值为 treeData_allSitesAndDevices ，
                // debug 分析数据后再进一步完善逻辑
                // var treeData_allSitesAndDevices_sumTreeTable = treeData_allSitesAndDevices;
                var treeData_allSitesAndDevices_sumTreeTable = _sitesAndDevicesTreeCacheManager.attachLatestMonitorData2Devices(treeData_allSitesAndDevices);
                // 3. 将带最新数据的 treeData_allSitesAndDevices_sumTreeTable 作为参数回调 callback_sumTreeTableDataLoaded
                if(callback_sumTreeTableDataLoaded && callback_sumTreeTableDataLoaded instanceof Function) {
                    callback_sumTreeTableDataLoaded(treeData_allSitesAndDevices_sumTreeTable);
                }
            }

        },
        /**
         * load treeData of allSitesAndDevices , 因为是 all 类型的数据，唯一，所以用一个定义好的 key 缓存即可
         * @param callback_allSitesAndDevices
         */
        loadTreeDataAllSitesAndDevices: function(callback_allSitesAndDevices) {
            function processCallback(data_allSitesAndDevices) {
                if(callback_allSitesAndDevices && callback_allSitesAndDevices instanceof Function) {
                    callback_allSitesAndDevices(data_allSitesAndDevices);
                }
            }

            var cached_data_allSitesAndDevices = wsCache.get(MAP_ENUM_WS_CACHE_KEYS.TREE_DATA_ALL_SITES_AND_DEVICES);
            if(cached_data_allSitesAndDevices) {
                processCallback(cached_data_allSitesAndDevices);
                return cached_data_allSitesAndDevices;
            }

            // 缓存没有，则重新请求
            var url_allSitesAndDevices = '/site/ajax/allSitesAndDevices';
            var params_allSitesAndDevices = {};
            // Start: cache callback 的定义，先缓存 data_allSitesAndDevices 数据，再进行 callback_allSitesAndDevices 回调
            function callback_cacheTreeData_allSitesAndDevices(data_allSitesAndDevices) {
                // 1. 缓存 data_allSitesAndDevices 数据
                _webStorageCache.saveCacheWithCommonExpire(MAP_ENUM_WS_CACHE_KEYS.TREE_DATA_ALL_SITES_AND_DEVICES, data_allSitesAndDevices, 5);
                // 2. 进行 callback_allSitesAndDevices 回调
                processCallback(data_allSitesAndDevices);
            }
            // End  : cache callback 的定义，先缓存 data_allSitesAndDevices 数据，再进行 callback_allSitesAndDevices 回调
            $.get(url_allSitesAndDevices, params_allSitesAndDevices, callback_cacheTreeData_allSitesAndDevices, "json");
        }
    };
    // End  : 所有的 function - sitesAndDevicesTreeCacheManager

    // Start: 依赖的 css

    // End  : 依赖的 css

    // 导出的模块名和接口函数
    exports('webStorageCache', {
        wsCache: wsCache
        , monitorDataCacheManager: monitorDataCacheManager
        , sitesAndDevicesTreeCacheManager: sitesAndDevicesTreeCacheManager
    });
});