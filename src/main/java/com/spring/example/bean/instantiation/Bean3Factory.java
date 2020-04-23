package com.spring.example.bean.instantiation;

/**
 * Bean3的实例工厂
 *
 * @author jingLv
 * @date 2020-04-22 12:12 AM
 */
public class Bean3Factory {

    public Bean3 createBean3(){
        System.out.println("Bean3Factory已执行...");
        return new Bean3();
    }
}
