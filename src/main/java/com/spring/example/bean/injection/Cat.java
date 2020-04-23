package com.spring.example.bean.injection;

import lombok.Setter;

/**
 * @author jingLv
 * @date 2020-04-23 9:50 PM
 */
@Setter
public class Cat {
    private String name;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
