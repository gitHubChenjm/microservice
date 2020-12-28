package com.chenjm.springcloud.controller;

import com.chenjm.springcloud.entities.Dept;
import com.chenjm.springcloud.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author chenjm
 * @version 1.0
 * @Description
 * @since 1.0
 * 2020/12/25
 */
@RestController
@RequestMapping(value = "/dept")
public class DeptController {

    @Autowired
    private DeptService deptService;

    @RequestMapping(value = "/add" , method = RequestMethod.POST)
    public boolean addDept(@RequestBody Dept dept){
        return deptService.addDept(dept);
    }

    @RequestMapping(value = "/get" , method = RequestMethod.GET)
    public List<Dept> findAll(){
        return deptService.findAll();
    }

    @RequestMapping(value = "/get/{deptno}" , method = RequestMethod.GET)
    @HystrixCommand(fallbackMethod = "processHystrix_findById")
    public Dept findById(@PathVariable("deptno") Long deptno){
        Dept dept = deptService.findById(deptno);
        if(dept == null)
            throw new RuntimeException();
        return dept;
    }

    public Dept processHystrix_findById(@PathVariable("deptno") Long deptno){
        return new Dept().setDname("熔断机制返回错误信息，没有改用户信息");
    }

}
