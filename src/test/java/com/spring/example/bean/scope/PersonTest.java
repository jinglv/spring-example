package com.spring.example.bean.scope;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-24 12:44 PM
 */
public class PersonTest extends UnitTestBase {

    public PersonTest(){
        super("classpath:spring-scope.xml");
    }

    @Test
    public void say() {
        Person person1 = super.getBean("person");
        person1.say();

        Person person2 = super.getBean("person");
        person2.say();
    }
}