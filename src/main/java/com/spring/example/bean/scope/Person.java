package com.spring.example.bean.scope;

/**
 * Bean的作用范围
 *
 * @author jingLv
 * @date 2020-04-24 12:42 PM
 */
public class Person {

    public void say(){
        System.out.println(hashCode() + "说：今天天气真好！");
    }

}
