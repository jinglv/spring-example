package com.spring.example.aop.aspectJ.xml;

/**
 * @author jinglv
 * @date 2020/10/06
 */
public class CustomerDAOImpl implements CustomerDAO{
    @Override
    public void save() {
        System.out.println("保存客户信息！！！");
    }

    @Override
    public String update() {
        System.out.println("修改客户信息！！！");
        return "Jack";
    }

    @Override
    public void delete() {
        System.out.println("删除客户信息！！！");
    }

    @Override
    public void findOne() {
        System.out.println("查询一个客户信息！！！");
        int i = 1/0;
    }

    @Override
    public void findAll() {
        System.out.println("查询所有客户信息！！！");
    }
}
