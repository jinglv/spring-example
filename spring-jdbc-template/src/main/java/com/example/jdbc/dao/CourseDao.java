package com.example.jdbc.dao;

import com.example.jdbc.entity.Course;

import java.util.List;

/**
 * @author jinglv
 * @date 2021/04/08
 */
public interface CourseDao {
    /**
     * 插入数据
     *
     * @param course 数据
     */
    void insert(Course course);

    /**
     * 跟新数据
     *
     * @param course 数据
     */
    void update(Course course);

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
    Course select(int id);

    /**
     * 查询所有信息
     *
     * @return List
     */
    List<Course> selectAll();
}
