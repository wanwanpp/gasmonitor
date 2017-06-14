package com.gasmonitor;

import com.gasmonitor.mqtt.MqttListener;
import com.gasmonitor.websocket.SocketHandler;
import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@SpringBootApplication
//对websocket的支持
@EnableWebSocket
public class Application extends SpringBootServletInitializer implements WebSocketConfigurer {

    @Bean
    @Scope("prototype")//不添加此注解会创建单例
    public InfluxDB getInfluxdb(@Value("${gasmonitor.influxdb.url}") String url,
                                @Value("${gasmonitor.influxdb.username}") String username,
                                @Value("${gasmonitor.influxdb.password}") String password) {
        return InfluxDBFactory.connect(url, username, password);
    }

    @Autowired
    private SocketHandler socketHandler;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(socketHandler, "websocket").withSockJS();
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    public static void main(String[] args) {

        SpringApplication application = new SpringApplication(Application.class);
        //MqttListener为单例
        application.addListeners(MqttListener.getInstance());
        application.run(args);

    }

}
