package com.cloud4.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ZCloud4NacosServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZCloud4NacosServerApplication.class, args);
    }

}
