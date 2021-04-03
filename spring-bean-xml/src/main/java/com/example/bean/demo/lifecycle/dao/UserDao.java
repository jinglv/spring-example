package com.example.bean.demo.lifecycle.dao;

/**
 * @author jingLv
 * @date 2020-04-26 12:57 PM
 */
public interface UserDao {

    /**
     * 查询所有用户
     */
    void findAll();

    /**
     * 保存用户
     */
    void save();

    /**
     * 更新用户
     */
    void update();

    /**
     * 删除用户
     */
    void delete();

}
