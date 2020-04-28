package com.spring.example.bean.annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author jingLv
 * @date 2020-04-27 12:25 PM
 */
@Component
@Scope("prototype")
public class ScopeBean {
}
