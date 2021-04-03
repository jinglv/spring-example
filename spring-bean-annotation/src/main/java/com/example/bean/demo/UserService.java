package com.example.bean.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Spring的Bean管理的注解方式：
 * - 传统方式需要去XML配置<bean id="" class=""><bean/>
 *
 * @author jinglv
 * @date 2021/01/22
 */
@Service("userService")
public class UserService {
    /**
     * 简单属性的注入
     */
    @Value("米饭")
    private String something;

    /**
     * 默认按照类型，进行自动注入
     */
    @Autowired
    private UserDao userDao;

    public String sayHello(String name) {
        return "Hello:" + name;
    }

    public void eat() {
        System.out.println("eat:" + something);
    }

    public void save() {
        System.out.println("Service中保存方法");
        userDao.save();
    }
}
