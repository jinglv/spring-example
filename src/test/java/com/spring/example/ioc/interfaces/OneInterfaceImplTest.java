package com.spring.example.ioc.interfaces;

import com.spring.example.base.UnitTestBase;
import com.spring.example.ioc.interfaces.impl.OneInterfaceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class OneInterfaceImplTest extends UnitTestBase {

    public OneInterfaceImplTest() {
        super("classpath*:spring-ioc.xml");
    }

    @Test
    public void hello() {
        OneInterface oneInterface = new OneInterfaceImpl();
        System.out.println(oneInterface.hello("Word"));
    }

    @Test
    public void testHello() {
        OneInterface oneInterface = super.getBean("oneInterface");
        System.out.println(oneInterface.hello("这是输入的参数"));
    }
}