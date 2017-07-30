package com.gasmonitor.controller.point;

import com.gasmonitor.entity.GasEvent;
import com.gasmonitor.vo.AjaxResult;
import com.gasmonitor.vo.MonitorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by saplmm on 2017/7/30.
 */

@RestController
@RequestMapping("point")
public class PointController {
    //

    private Logger log = LoggerFactory.getLogger(PointController.class);

    @Autowired
    private RestTemplate restTemplate;

    @Value("${spring.datasource.historypotinurl}")
    private String url;

    @RequestMapping("query/history")
    public AjaxResult<MonitorData> query(@DateTimeFormat(pattern = "yyyy-MM-dd:HH:mm:ss") Date begin, @DateTimeFormat(pattern = "yyyy-MM-dd:HH:mm:ss") Date end, String hardwareId) {
        //请求的路劲
//        String url = "http://localhost:8082/event/query?&hardwareId=t21s2d1&begin=1499239162670&end=1501424624000";
        //请求的参数
        MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
        params.set("hardwareId", hardwareId);
        params.set("begin", begin.getTime() + "");
        params.set("end", end.getTime() + "");
        log.info("请求历史测点的参数:{}", params);
        //请求的结果
//        ResponseEntity<List> responseEntity = restTemplate.postForEntity(url, params, List.class);
//        log.info("req status:{}", responseEntity.getStatusCode());
//        log.info("req body:{}", responseEntity.getBody());
//        log.info("req headers:{}", responseEntity.getHeaders());
//
//        if (responseEntity.getStatusCode() == HttpStatus.OK) {
//            List<GasEvent> json = responseEntity.getBody();
//            List<MonitorData> datas = new ArrayList<MonitorData>();
//            for (GasEvent e : json) {
//                datas.add(MonitorData.NewByGasEvent(e));
//            }
//            return AjaxResult.AjaxResultWithList(datas);
//        } else {
//            return AjaxResult.ErrorAjaxResult();
//        }

        //暂时直接返回
        try {
            List<GasEvent> json = restTemplate.postForEntity(url, params, List.class).getBody();
            List<MonitorData> datas = new ArrayList<MonitorData>();
            for (GasEvent e : json) {
                datas.add(MonitorData.NewByGasEvent(e));
            }
            return AjaxResult.AjaxResultWithList(datas);
        } catch (Exception e) {
            return AjaxResult.ErrorAjaxResult();
        }
    }
}
