package com.example.bean.demo.factory;

import com.example.bean.demo.Bean2;

/**
 * Bean2的静态工厂（提供一个静态方法返回Bean2）
 *
 * @author jinglv
 * @date 2020/12/27
 */
public class Bean2Factory {
    public static Bean2 createBean2() {
        System.out.println("Bean2Factory已执行...");
        return new Bean2();
    }
}
