package com.example.bean.demo.spel;

/**
 * @author jinglv
 * @date 2021/01/17
 */
public class Category {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                '}';
    }
}
