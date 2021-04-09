package com.example.jdbc.dao;

import com.example.jdbc.entity.Student;

import java.util.List;

/**
 * @author jinglv
 * @date 2021/04/08
 */
public interface StudentDao {
    /**
     * 插入数据
     *
     * @param stu 数据
     */
    void insert(Student stu);

    /**
     * 跟新数据
     *
     * @param stu 数据
     */
    void update(Student stu);

    /**
     * 根据id删除数据
     *
     * @param id 主键id
     */
    void delete(int id);

    /**
     * 根据id查询数据
     *
     * @param id 主键id
     * @return Student
     */
    Student select(int id);

    /**
     * 查询所有信息
     *
     * @return List
     */
    List<Student> selectAll();
}
