package com.chenjm.springcloud.dao;

import com.chenjm.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptDao {
    public List<Dept> findAll();

    public Dept findById(Long deptno);

    public boolean addDept(Dept dept);
}
