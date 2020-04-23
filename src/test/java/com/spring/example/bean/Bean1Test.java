package com.spring.example.bean;

import com.spring.example.base.UnitTestBase;
import com.spring.example.bean.instantiation.Bean1;
import com.spring.example.bean.instantiation.Bean2;
import com.spring.example.bean.instantiation.Bean3;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

/**
 * Bean的实例化的三种方式：
 * - 采用无参数的构造方法的方式
 *
 * @author jingLv
 * @date 2020-04-22 12:04 AM
 */
@RunWith(BlockJUnit4ClassRunner.class)
public class Bean1Test extends UnitTestBase {

    public Bean1Test() {
        super("classpath:spring-bean.xml");
    }

    /**
     * 类构造器实例化
     */
    @Test
    public void testBean1() {
        Bean1 bean1 = super.getBean("bean1");
    }

    /**
     * 静态工厂方法实例化
     */
    @Test
    public void testBean2() {
        Bean2 bean2 = super.getBean("bean2");
    }

    /**
     * 实例工厂方法实例化
     */
    @Test
    public void testBean3() {
        Bean3 bean3 = super.getBean("bean3");
    }

}