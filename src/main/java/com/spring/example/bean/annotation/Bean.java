package com.spring.example.bean.annotation;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author jingLv
 * @date 2020-04-27 12:18 PM
 */
@Component
public class Bean {

    @PostConstruct
    public void init() {
        System.out.println("initBean...");
    }

    public void say() {
        System.out.println("hello...");
    }

    @PreDestroy
    public void destory() {
        System.out.println("destoryBean...");
    }
}
