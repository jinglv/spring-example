package com.spring.example.base;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.util.StringUtils;

/**
 * 完成对Spring配置文件的加载，销毁
 * 所有的单元测试类都要继承自UnitTestBase，通过它的getBean方法获取想要得到的对象
 */
@ExtendWith(SpringExtension.class)
public class UnitTestBase {

    private static ClassPathXmlApplicationContext context;

    private static String springXpath;

    public UnitTestBase() {
    }

    public UnitTestBase(String springXpath) {
        UnitTestBase.springXpath = springXpath;
    }

    @BeforeAll
    public static void before() {
        if (StringUtils.isEmpty(springXpath)) {
            springXpath = "classpath*:spring-*.xml";
        }
        try {
            context = new ClassPathXmlApplicationContext(springXpath.split("[,\\s]+"));
            context.start();
        } catch (BeansException e) {
            e.printStackTrace();
        }
    }

    /**
     * Bean的关闭销毁
     */
    @AfterAll
    public static void after() {
        context.close();
    }


    protected <T extends Object> T getBean(String beanId) {
        try {
            return (T) context.getBean(beanId);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }

    protected <T extends Object> T getBean(Class<T> clazz) {
        try {
            return context.getBean(clazz);
        } catch (BeansException e) {
            e.printStackTrace();
            return null;
        }
    }
}
