package com.example.aop.auto.advisor.dao;

/**
 * Student Dao实现类
 *
 * @author jinglv
 * @date 2020-05-03 13:33
 */
public class StudentDaoImpl implements StudentDao {
    @Override
    public void find() {
        System.out.println("学生查询...");
    }

    @Override
    public void save() {
        System.out.println("学生保存...");
    }

    @Override
    public void update() {
        System.out.println("学生更新...");
    }

    @Override
    public void delete() {
        System.out.println("学生删除...");
    }
}
