package com.spring.example.bean.injection;

import lombok.Setter;

/**
 * @author jingLv
 * @date 2020-04-23 9:45 PM
 */
@Setter
public class Person {
    private String name;
    private String age;
    private Cat cat;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", cat=" + cat +
                '}';
    }
}
