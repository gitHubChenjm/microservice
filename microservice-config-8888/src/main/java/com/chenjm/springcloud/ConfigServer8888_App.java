package com.chenjm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author chenjm
 * @version 1.0
 * @Description
 * @since 1.0
 * 2020/12/30
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServer8888_App {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServer8888_App.class);
    }
}
