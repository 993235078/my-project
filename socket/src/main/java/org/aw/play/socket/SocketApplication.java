package org.aw.play.socket;

import org.aw.play.socket.config.ServerSocketConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(SocketApplication.class, args);

        ServerSocketConfig socketConfig = new ServerSocketConfig();
        socketConfig.init();
    }

}
