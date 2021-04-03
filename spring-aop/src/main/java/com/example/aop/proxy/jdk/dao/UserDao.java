package com.example.aop.proxy.jdk.dao;

/**
 * User Dao层
 *
 * @author jinglv
 * @date 2021/04/03
 */
public interface UserDao {
    /**
     * 用户保存方法
     */
    void save();

    /**
     * 用户更新方法
     */
    void update();

    /**
     * 用户删除方法
     */
    void delete();

    /**
     * 用户查找方法
     */
    void find();
}
