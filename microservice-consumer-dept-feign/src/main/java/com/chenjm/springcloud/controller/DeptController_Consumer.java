package com.chenjm.springcloud.controller;

import com.chenjm.springcloud.entities.Dept;
import com.chenjm.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author chenjm
 * @version 1.0
 * @Description
 * @since 1.0
 * 2020/12/28
 */

@RestController
public class DeptController_Consumer {

    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean addDept(Dept dept){
        return deptClientService.addDept(dept);
    }

    @RequestMapping(value = "/consumer/dept/get")
    public List<Dept> findAll(Dept dept){
        return deptClientService.findAll();
    }

    @RequestMapping(value = "/consumer/dept/get/{deptno}")
    public Dept findById(@PathVariable("deptno") Long deptno){
        return deptClientService.findById(deptno);
    }
}
