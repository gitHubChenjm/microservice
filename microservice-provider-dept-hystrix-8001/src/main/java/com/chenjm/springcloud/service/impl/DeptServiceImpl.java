package com.chenjm.springcloud.service.impl;

import com.chenjm.springcloud.dao.DeptDao;
import com.chenjm.springcloud.entities.Dept;
import com.chenjm.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author chenjm
 * @version 1.0
 * @Description
 * @since 1.0
 * 2020/12/25
 */
@Transactional
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Override
    public List<Dept> findAll() {
        return deptDao.findAll();
    }

    @Override
    public Dept findById(Long deptno) {
        return deptDao.findById(deptno);
    }

    @Override
    public boolean addDept(Dept dept) {
        return deptDao.addDept(dept);
    }
}
