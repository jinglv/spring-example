package com.spring.example.ioc.interfaces.impl;

import com.spring.example.ioc.interfaces.OneInterface;

public class OneInterfaceImpl implements OneInterface {
    @Override
    public String hello(String world) {
        return "World form interface \"OneInterface\":" + world;
    }
}
