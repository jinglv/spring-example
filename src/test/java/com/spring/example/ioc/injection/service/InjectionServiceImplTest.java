package com.spring.example.ioc.injection.service;

import com.spring.example.base.UnitTestBase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(BlockJUnit4ClassRunner.class)
public class InjectionServiceImplTest extends UnitTestBase {

    public InjectionServiceImplTest(){
        super("classpath:spring-injection.xml");
    }

    @Test
    public void save() {
        InjectionService service = super.getBean("injectionService");
        service.save("这是要保存的数据！");
    }
}