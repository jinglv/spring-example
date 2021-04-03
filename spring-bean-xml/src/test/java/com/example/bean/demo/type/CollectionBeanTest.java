package com.example.bean.demo.type;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jinglv
 * @date 2021/01/17
 */
class CollectionBeanTest {

    @Test
    void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-type.xml");
        CollectionBean collectionBean = (CollectionBean) context.getBean("collectionBean");
        System.out.println(collectionBean);
    }
}