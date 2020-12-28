package com.chenjm.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author chenjm
 * @version 1.0
 * @Description 实体类
 * @since 1.0
 * 2020/12/25
 */
@SuppressWarnings("serial")
@NoArgsConstructor//空参
@Data
@Accessors(chain=true) //链式风格
public class Dept implements Serializable {//Entity 实体类
    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个库

    public Dept(String dname) {
        this.dname = dname;
    }
}