package com.chenjm.springcloud.Cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author chenjm
 * @version 1.0
 * @Description 往spring容器中，注入RestTemplate的bean
 * @since 1.0
 * 2020/12/28
 */
@Configuration
public class ConfigBean {
    // boot版本里面的配置文件
    // boot - > spring  apllactionContext.xml ---@Configuration Configbean = applicationContext.xml

    @Bean
    @LoadBalanced //Spring cloud Ribbon是基于Netflix Ribbon实现的一套客户端 负载均衡工具
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
