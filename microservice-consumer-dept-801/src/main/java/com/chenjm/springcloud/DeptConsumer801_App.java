package com.chenjm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author chenjm
 * @version 1.0
 * @Description
 * @since 1.0
 * 2020/12/28
 */
@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer801_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer801_App.class);
    }
}
