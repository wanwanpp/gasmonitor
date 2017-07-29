package com.gasmonitor.controller.websocket;

import com.gasmonitor.service.websocket.WsClientPool;
import com.gasmonitor.vo.RequestMessage;
import com.gasmonitor.vo.ResponseMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.simp.annotation.SendToUser;
import org.springframework.stereotype.Controller;

import java.security.Principal;

/**
 * Created by saplmm on 2017/6/2.
 */
@Controller
public class WsController {

    private static Logger log = LoggerFactory.getLogger(WsController.class);

    @Autowired
    public WsClientPool wsClientPool;
    @Autowired
    public SimpMessagingTemplate template;


    @MessageMapping("/welcome")
    @SendTo("/topic/getResponse")
    public ResponseMessage say(RequestMessage message) throws Exception {
        log.info("获取到的message:{}", message.getName());
        Thread.sleep(3000);
        return new ResponseMessage("welcome," + message.getName() + " !");
    }

    @MessageMapping("/message")
    @SendToUser("/message")
    public ResponseMessage userMessage(RequestMessage message) throws Exception {
        log.info("获取到的single-message:{}", message.getName());
        return new ResponseMessage("single---welcome," + message.getName() + " !");
    }

    //聊天的协议
    @MessageMapping("/chat")
    public void handleChat(Principal principal, String msg) {
        log.info("接收到的用户:{}，消息:{}", principal.getName(), msg);
        if (principal.getName().equals("wyf")) {
            template.convertAndSendToUser("wisely", "/queue/notifications", principal.getName() + "-send:" + msg);
        } else {
            template.convertAndSendToUser("wyf", "/queue/notifications", principal.getName() + "-send:" + msg);
        }
    }

    @MessageMapping("/setStations")
    public void setStations(Principal principal, String stations) {
        log.info("接收到的用户:{}，设置的站点信息:{}", principal.getName(), stations);
        wsClientPool.addMonitorStations(principal.getName(), stations);
    }
}