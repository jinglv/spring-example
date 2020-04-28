package com.spring.example.bean.annotation;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-27 12:21 PM
 */
public class BeanTest extends UnitTestBase {

    public BeanTest(){
        super("spring-annotation.xml");
    }

    @Test
    public void testSay() {
        Bean bean = super.getBean("bean");
        bean.say();
    }
}