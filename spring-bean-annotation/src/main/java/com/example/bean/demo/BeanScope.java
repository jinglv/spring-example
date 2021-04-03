package com.example.bean.demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean的作用范围
 *
 * @author jinglv
 * @date 2021/01/25
 */
@Component("beanScope")
@Scope("prototype")
public class BeanScope {
}
