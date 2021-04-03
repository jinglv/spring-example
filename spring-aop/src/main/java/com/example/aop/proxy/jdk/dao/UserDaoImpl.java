package com.example.aop.proxy.jdk.dao;

/**
 * User Dao实现类
 *
 * @author jinglv
 * @date 2021/04/03
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("保存用户...");
    }

    @Override
    public void update() {
        System.out.println("修改用户...");
    }

    @Override
    public void delete() {
        System.out.println("删除用户...");
    }

    @Override
    public void find() {
        System.out.println("查询用户...");
    }
}
