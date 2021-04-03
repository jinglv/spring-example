package com.example.bean.demo.lifecycle.dao;

/**
 * @author jingLv
 * @date 2020-04-26 12:59 PM
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void findAll() {
        System.out.println("查询所有用户");
    }

    @Override
    public void save() {
        System.out.println("保存用户...");
    }

    @Override
    public void update() {
        System.out.println("更新用户...");
    }

    @Override
    public void delete() {
        System.out.println("删除用户...");
    }
}
