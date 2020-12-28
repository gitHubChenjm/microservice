package com.chenjm.springcloud.service;

import com.chenjm.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


//@FeignClient(value = "CLOUD-DEPT") 没有熔断的  fallbackFactory
@FeignClient(value = "CLOUD-DEPT" , fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {

    @RequestMapping(value = "/dept/get")
    public List<Dept> findAll();

    @RequestMapping(value = "/dept/get/{deptno}")
    public Dept findById(@PathVariable("deptno") Long deptno);

    @RequestMapping(value = "/dept/add")
    public boolean addDept(Dept dept);

}
