package com.spring.example.bean.injection;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-23 9:47 PM
 */
public class PersonTest extends UnitTestBase {

    public PersonTest(){
        super("classpath:spring-bean-injection.xml");
    }

    @Test
    public void testPerson(){
        Person person = super.getBean("person");
        System.out.println(person);
    }

    @Test
    public void testPersonP(){
        Person person = super.getBean("person-p");
        System.out.println(person);
    }

    @Test
    public void testProduct(){
        Product product = super.getBean("product");
        System.out.println(product);
    }
}