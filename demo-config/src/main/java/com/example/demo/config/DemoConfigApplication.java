package com.example.demo.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoConfigApplication.class, args);
    }

}
