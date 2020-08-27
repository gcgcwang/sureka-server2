package com.cpic.surekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(SurekaServer2Application.class, args);
    }

}
