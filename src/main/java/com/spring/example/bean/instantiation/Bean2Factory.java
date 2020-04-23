package com.spring.example.bean.instantiation;

/**
 * Bean2的静态工厂
 *
 * @author jingLv
 * @date 2020-04-22 12:08 AM
 */
public class Bean2Factory {

    public static Bean2 createBean2() {
        System.out.println("Bean2Factory已执行...");
        return new Bean2();
    }
}
