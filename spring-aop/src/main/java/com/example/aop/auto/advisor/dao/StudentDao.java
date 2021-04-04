package com.example.aop.auto.advisor.dao;

/**
 * @author jinglv
 * @date 2020-05-03 13:32
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
