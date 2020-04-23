package com.spring.example.bean.collection;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author jingLv
 * @date 2020-04-23 10:24 PM
 */
public class CollectionBeanTest extends UnitTestBase {
    public CollectionBeanTest(){
        super("classpath:spring-bean-injection.xml");
    }

    @Test
    public void testCollection(){
        CollectionBean collectionBean = super.getBean("collectionBean");
        System.out.println(collectionBean);
    }

}