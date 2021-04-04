package com.example.aop.advisor.dao;

/**
 * Student Dao实现类
 *
 * @author jinglv
 * @date 2021/04/04
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
