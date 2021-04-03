package com.example.bean.demo.factory;

import com.example.bean.demo.Bean3;

/**
 * Bean3的实例工厂（提供一个非静态方法返回Bean3）
 *
 * @author jinglv
 * @date 2020/12/27
 */
public class Bean3Factory {
    public Bean3 createBean3() {
        System.out.println("Bean3Factory已执行...");
        return new Bean3();
    }
}
