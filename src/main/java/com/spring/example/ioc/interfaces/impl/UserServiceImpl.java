package com.spring.example.ioc.interfaces.impl;

import com.spring.example.ioc.interfaces.UserService;
import lombok.Setter;

/**
 * @author jingLv
 * @date 2020-04-21 11:20 PM
 */
@Setter
public class UserServiceImpl implements UserService {

    /**
     * 添加属性
     */
    private String name;

    @Override
    public void say(String word) {
        System.out.println(word + ":" + name);
    }
}
