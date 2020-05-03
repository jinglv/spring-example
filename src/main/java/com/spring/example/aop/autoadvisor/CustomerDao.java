package com.spring.example.aop.autoadvisor;

/**
 * @author jinglv
 * @date 2020-05-03 14:03
 */
public class CustomerDao {

    public void find() {
        System.out.println("查询客户...");
    }

    public void save() {
        System.out.println("保存客户...");
    }

    public void update() {
        System.out.println("更新客户...");
    }

    public void delete() {
        System.out.println("删除客户...");
    }
}
