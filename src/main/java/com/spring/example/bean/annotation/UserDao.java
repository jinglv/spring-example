package com.spring.example.bean.annotation;

import org.springframework.stereotype.Repository;

/**
 * @author jingLv
 * @date 2020-04-27 11:48 AM
 */
@Repository("userDao")
public class UserDao {
    public void save(){
        System.out.println("保存用户...");
    }
}
