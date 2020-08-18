package com.sunday.dianshang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.sunday.dianshang.client")
@EnableAsync
@SpringBootApplication
public class DianshangApplication {

    public static void main(String[] args) {
        SpringApplication.run(DianshangApplication.class, args);
    }

}
