package com.spring.example.ioc.injection.dao;

public class InjectionDAOImpl implements InjectionDAO {
    @Override
    public void save(String args) {
        // 模拟数据库保存操作
        System.out.println("保存数据：" + args);
    }
}
