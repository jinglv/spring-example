package com.spring.example.bean.collection;

import lombok.Data;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author jingLv
 * @date 2020-04-23 10:18 PM
 */
@Data
public class CollectionBean {
    /**
     * 数组类型
     */
    private String[] arrs;
    /**
     * list集合类型
     */
    private List<String> list;
    /**
     * set集合类型
     */
    private Set<String> set;
    /**
     * map集合类型
     */
    private Map<String, Integer> map;
    /**
     * 属性类型
     */
    private Properties properties;
}
