package com.spring.example.bean.injection;

import lombok.Data;

/**
 * @author jingLv
 * @date 2020-04-23 10:08 PM
 */
@Data
public class Product {
    private String name;
    private Double price;
    private Category category;
}
