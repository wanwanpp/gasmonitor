package com.gasmonitor.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.WebSocketMessage;
import org.springframework.web.socket.WebSocketSession;

import java.util.LinkedList;
import java.util.List;

@Component
public class SocketHandler implements WebSocketHandler {

    private static final Logger logger;
    public static List<WebSocketSession> sessions;

//	@Autowired
//    private InfluxDB influxDB;

    static {
        sessions = new LinkedList<WebSocketSession>();
        logger = LoggerFactory.getLogger(SocketHandler.class);
    }

    @Override
    public void afterConnectionEstablished(WebSocketSession session)
            throws Exception {
        logger.info("成功建立socket连接");
//		logger.info(influxDB.toString());
        sessions.add(session);

    }

    @Override
    public void handleMessage(WebSocketSession arg0, WebSocketMessage<?> arg1)
            throws Exception {
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable error)
            throws Exception {
        if (session.isOpen()) {
            session.close();
        }
        logger.error("连接出现错误:" + error.toString());
        sessions.remove(session);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus arg1)
            throws Exception {
        logger.debug("连接已关闭");
        sessions.remove(session);
    }

    @Override
    public boolean supportsPartialMessages() {
        return false;
    }

}
