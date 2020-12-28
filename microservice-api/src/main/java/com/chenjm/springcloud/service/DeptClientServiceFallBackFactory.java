package com.chenjm.springcloud.service;

import com.chenjm.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public List<Dept> findAll() {
                return null;
            }

            @Override
            public Dept findById(Long deptno) {
                return new Dept().setDname("熔断机制，统一处理");
            }

            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

        };
    }
}
