package com.chenjm.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author chenjm
 * @version 1.0
 * @Description
 * @since 1.0
 * 2020/12/30
 */
@RestController("/view/config")
public class ViewXmlController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @GetMapping
    public String getXmlMessage(){
        return "applicationName: " + applicationName + "\r\neurekaServer: " + eurekaServer + "\r\nport: " + port;
    }
}
