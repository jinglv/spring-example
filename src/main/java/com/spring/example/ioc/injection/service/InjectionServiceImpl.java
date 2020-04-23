package com.spring.example.ioc.injection.service;

import com.spring.example.ioc.injection.dao.InjectionDAO;

public class InjectionServiceImpl implements InjectionService {

    private InjectionDAO injectionDAO;

    //构造器注入
    public InjectionServiceImpl(InjectionDAO injectionDAO) {
        this.injectionDAO = injectionDAO;
    }

    //    //设值注入
//    public void setInjectionDAO(InjectionDAO injectionDAO) {
//        this.injectionDAO = injectionDAO;
//    }

    @Override
    public void save(String args) {
        //模拟业务操作
        System.out.println("Service接收参数：" + args);
        args = args + ":" + this.hashCode();
        injectionDAO.save(args);
    }
}
