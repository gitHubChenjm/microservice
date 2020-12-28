package com.chenjm.springcloud.service;

import com.chenjm.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    public List<Dept> findAll();

    public Dept findById(Long deptno);

    public boolean addDept(Dept dept);
}
