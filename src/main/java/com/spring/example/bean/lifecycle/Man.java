package com.spring.example.bean.lifecycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author jingLv
 * @date 2020-04-26 11:12 AM
 */
public class Man implements BeanNameAware, ApplicationContextAware, InitializingBean, DisposableBean {

    private String name;

    public void setName(String name) {
        System.out.println("第二步：设置属性...");
        this.name = name;
    }

    public Man() {
        System.out.println("第一步：MAN被实例化了...");
    }

    public void setUp() {
        System.out.println("第七步：MAN被初始化了...");
    }

    public void tearDown() {
        System.out.println("第十一步：MAN被销毁了...");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("第三步：设置Bean的名称(<bean>的id)...");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("第四步：了解工厂的信息...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("第六步：属性设置后...");
    }

    public void run() {
        System.out.println("第九步：执行业务方法...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("第十步：执行Spring销毁的方法...");
    }
}
