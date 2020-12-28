package com.chenjm.springcloud.controller;

import com.chenjm.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author chenjm
 * @version 1.0
 * @Description 消费服务提供者提供的接口
 * @since 1.0
 * 2020/12/28
 */
@RestController
@RequestMapping("/consumer")
public class DeptController_Consumer {
    //服务提供者的网址
    //private static final String REST_URL_PERFIX = "http://localhost:8001";

    //加入ribbon后，配置微服务名字，实现根据微服务名字到eureka上面找到对应的微服务ip和端口，并非写死的
    private static final String REST_URL_PERFIX = "http://CLOUD-DEPT";

    @Autowired
    private RestTemplate restTemplate;//使用这个来进行rest服务发出

    @RequestMapping(value = "/dept/add")
    public boolean addDept(Dept dept){
        return restTemplate.postForObject(REST_URL_PERFIX + "/dept/add",dept, Boolean.class);
    }

    @RequestMapping(value = "/dept/get")
    public List<Dept> findAll(Dept dept){
        return restTemplate.getForObject(REST_URL_PERFIX + "/dept/get", List.class);
    }

    @RequestMapping(value = "/dept/get/{deptno}")
    public Dept findById(@PathVariable(value = "deptno") Long deptno){
        return restTemplate.getForObject(REST_URL_PERFIX + "/dept/get/"+deptno,Dept.class);
    }
}
