# AOP概述
## 什么是AOP
- AOP：Aspect Oriented Programming
- AOP采用横向抽取机制，取代了传统纵向继承体系重复性代码（性能监视、事务管理、安全检查、缓存）
- Spring AOP使用纯Java实现，不需要专门的编译过程和类加载器，在运行期通过代理方式向目标类织入增强代码
![image](http://m.qpic.cn/psc?/V12A7VgS03zLND/QNsgOSLzUrTyB8UN2gSlSMBOyDJ5cyQARl8cLk8w04Ee4UKBv9fvmZYXT0YbMDehGn8HWZRfvhQp45HcLdyd2A!!/b&bo=CQU4BAAAAAADBxI!&rf=viewer_4)
## AOP相关术语
- Joinpoint（连接点）：所谓连接点是指那些被拦截到的点。在Spring中，这些点指的是方法，因为spring只支持方法类型的连接点
- Pointcut（切入点）：所谓切入点是指我们要对那些Joinpoint进行拦截的定义
- Advice（通知/增强）：所谓通知是指拦截到Joinpoint之后所要的事情就是通知
    - **通知分为**前置通知，后置通知，异常通知，最终通知，环绕通知（切面要完成的功能） 
- Introduction（引介）：引介Hi一种特殊的通知在不修改类代码的前提下
    - Introduction可以在运行期为类动态地添加一些方法或Field
- Target（目标对象）：代理的目标对象
- Weaving（织入）：是指吧增强应用到目标对象来创建新的代理对象的过程。
    - spring采用动态代理织入，而AspectJ采用编译期织入和类装载期织入
- Proxy（代理）：一个类被AOP织入增强后，就产生一个结果代理类
- Aspect（切面）：是切入点和通知（引介）的结合
![image](http://m.qpic.cn/psc?/V12A7VgS03zLND/6RAq0V9V8Td2AB7JS6C71K0IJ4KIBn9nLbiCxvxJSV4uSMSUvuTWf6KSOrhuctq6DeO2f3Q9puV64uyjrVLEcP8PSmIxwMpH1s*NJITAUQM!/b&bo=Qgc4BAAAAAADN2s!&rf=viewer_4)
# AOP的底层实现
## JDK动态代理
jdk动态代理实现，见实例：package com.spring.example.aop.proxy.jdk;

只能对已实现接口的类进行代理
## 使用CGLIB生成代理
- 对于不使用接口的业务类，无法使用JDK动态代理
- CGlib采用非常底层字节码技术，可以为一个类创建子类，解决无接口代理问题

cglib动态代理实现，见实例：package com.spring.example.aop.proxy.cglib;

## 代理知识总结
- Spring在运行期间，生成动态代理对象，不需要特殊的编译器
- Spring AOP的底层就是通过JDK动态代理或CGLib动态代理技术为目标Bean执行横向织入
    - 若目标对象实现了若干接口，spring使用JDK的java.lang.reflect.Proxy类代理
    - 若目标对象没有实现任何接口，spring使用CGLib库生成目标对象的子类
- 程序中优先对接口创建代理，便于程序解耦维护
- 标记为final的方法，不能被代理， 因为无法进行覆盖
    - JDK动态代理，是针对接口生成子类，接口中方法不能使用final修饰
    - CGLib是针对目标类生产子类，因此类或方法不能使用final
- Spring只支持方法连接点，不提供属性连接点

# Spring AOP增强类型
- AOP联盟为通知Advice定义了org.aopalliance.aop.Interface.Advice
- Spring安装通知Advice在目标类方法的连接点位置，可以分为5类
    - 前置通知：org.spring.framework.aop.MethodBeforeAdvice
        - 在目标方法执行前实施增强
    - 后置通知：org.springframework.aop.AfterReturningAdvice
        - 在目标方法执行后实施增强
    - 环绕通知：org.aopalliance.intercept.MethodInterceptor
        - 在目标方法执行前后实施增强
    - 异常抛出通知：org.springframework.aop.ThrowsAdvice
        - 在方法抛出异常后实施增强
    - 引介通知：org.springframework.aop.IntroductionInterceptor
        - 在目标类中添加一些新的方法和属性

# Spring的传统AOP
## 不带切入点的切面
## 带有切入点的切面
# Spring的传统AOP的自动代理
## 基于Bean名称的自动代理
## 基于切面信息的自动代理