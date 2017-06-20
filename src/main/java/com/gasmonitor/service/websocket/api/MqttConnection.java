package com.gasmonitor.service.websocket.api;

/**
 * Created by 王萍 on 2017/6/8 0008.
 */
public interface MqttConnection {


    public final static long RECONNECTION_ATTEMPT_MAX = 6;
    public final static long RECONNECTION_DELAY = 20;

    void connect();

    void listener();

    void disconnect();
}
