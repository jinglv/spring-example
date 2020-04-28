package com.spring.example.bean.annotation;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-27 12:25 PM
 */
public class ScopeBeanTest extends UnitTestBase {

    public ScopeBeanTest(){
        super("spring-annotation.xml");
    }

    @Test
    public void test(){
        ScopeBean scopeBean1 = super.getBean("scopeBean");
        System.out.println(scopeBean1.hashCode());

        ScopeBean scopeBean2 = super.getBean("scopeBean");
        System.out.println(scopeBean2.hashCode());
    }
}