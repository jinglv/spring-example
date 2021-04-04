package com.example.aop.advisor.dao;

/**
 * Student Dao
 *
 * @author jinglv
 * @date 2021/04/04
 */
public interface StudentDao {
    /**
     * 学生查询
     */
    void find();

    /**
     * 学生保存
     */
    void save();

    /**
     * 学生更新
     */
    void update();

    /**
     * 学生删除
     */
    void delete();
}
