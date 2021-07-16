package com.aw.play.xiecheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class XiechengApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiechengApplication.class, args);
    }

}
