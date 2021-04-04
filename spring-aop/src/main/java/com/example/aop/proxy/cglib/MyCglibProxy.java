package com.example.aop.proxy.cglib;

import com.example.aop.proxy.cglib.dao.ProductDao;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 自定义cglib代理类
 *
 * @author jinglv
 * @date 2021/04/04
 */
public class MyCglibProxy implements MethodInterceptor {

    /**
     * 注入对象
     */
    private final ProductDao productDao;

    /**
     * 构造方法，传入指定的productDao
     *
     * @param productDao productDao
     */
    public MyCglibProxy(ProductDao productDao) {
        this.productDao = productDao;
    }

    /**
     * 创建代理
     *
     * @return object
     */
    public Object createProxy() {
        // 1.创建核心类
        Enhancer enhancer = new Enhancer();
        // 2.设置父类，对于目标类
        enhancer.setSuperclass(productDao.getClass());
        // 3.设置回调
        enhancer.setCallback(this);
        // 4.生成代理
        return enhancer.create();
    }

    /**
     * 拦截方法，进行增强
     *
     * @param proxy       代理类
     * @param method      方法
     * @param args        方法参数
     * @param methodProxy 方法代理对象
     * @return object
     * @throws Throwable 异常
     */
    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        if ("save".equals(method.getName())) {
            System.out.println("权限校验（保存方法前）...");
            return methodProxy.invokeSuper(proxy, args);
        }
        return methodProxy.invokeSuper(proxy, args);
    }
}
