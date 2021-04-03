package com.example.bean.demo;

import org.springframework.stereotype.Repository;

/**
 * @author jinglv
 * @date 2021/01/25
 */
@Repository("userDao")
public class UserDao {

    public void save() {
        System.out.println("Dao保存用户");
    }
}
