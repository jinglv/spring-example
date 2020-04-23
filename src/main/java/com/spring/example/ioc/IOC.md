# IOC
## 接口及面向接口编程
### 接口
- 用于沟通的中介物的抽象化
- 实体把自己提供给外界的一种抽象化说明，用以由内部操作分离出外部沟通方法，使其能被修改内部而不影响外界其他实体与其交互的方式
- 对应Java接口即声明，声明了哪些方法是对外公开提供的
- 在Java8中，接口可以拥有方法体

## 面向接口编程
- 结构设计中，分清层次及调用关系，每层只向外层（上层）提供一组功能接口，各层间仅依赖接口而非实现类
- 接口实现的变动不影响各层间的调用，这一点在公共服务中尤为重要
- "面向接口编程"中的"接口"是用于隐藏具体实现和实现多态性的组件

## 简单的面向接口的例子
![image](http://m.qpic.cn/psc?/V12A7VgS03zLND/QNsgOSLzUrTyB8UN2gSlSBG7G4kO*dxicjsLpW0YWlC6LNruD3A6XzwgHeY7IYNlXDCt5DxAlWcmQG0IFk8YeA!!/b&bo=vgY4BAAAAAADB6Y!&rf=viewer_4)
传统方式与IOC比较

Package:ioc.interfaces

## 什么是IOC
- Spring 容器是 Spring 框架的**核心**。
- 容器将创建对象，把它们连接在一起，配置它们，并管理他们的整个生命周期从创建到销毁。
- Spring 容器使用依赖注入（DI）来管理组成一个应用程序的组件。这些对象被称为 Spring Beans。

**IOC容器**具有依赖注入功能的容器，它可以创建对象，IOC 容器负责实例化、定位、配置应用程序中的对象及建立这些对象间的依赖。通常new一个实例，控制权由程序员控制，而"控制反转"是指new实例工作不由程序员来做而是交给Spring容器来做。在Spring中BeanFactory是IOC容器的实际代表者

**IOC:控制反转**，控制权的转移，应用程序本身不负责依赖对象的创建和维护，而是由外部容器负责创建和维护

**DI(依赖注入)**是其一种实现方式

**目的**：创建对象并且组装对象之间的关系

## 一个例子说明
- IOC Inverse of Control反转控制的概念，就是将原本在程序中手动创建UserService对象的控制权，交由Spring框架管理
- 简单说，就是创建UserService对象控制权被反转到了Spring框架
- DI Dependency Injection依赖注入的概念，就是在Spring创建这个对象的过程中，将这个对象所依赖的属性注入进去

The Spring IoC container
![image](http://m.qpic.cn/psc?/V12A7VgS03zLND/6RAq0V9V8Td2AB7JS6C71IZF8xE6uHUdDcRjDJ1qajThuAgKOtutyNidkQBaXccDxwSRB9uEOGDJUyonkbex9rEF2sZIDKpUXKv.hVpTn8w!/b&bo=pAMgAwAAAAADB6Y!&rf=viewer_4)

IOC房屋中介
![image](http://m.qpic.cn/psc?/V12A7VgS03zLND/6RAq0V9V8Td2AB7JS6C71MImTQZc5ZDU9MurwmmjFXPCpQSsR3mfkh94pM5.TRf2ABoqcidHpEeD5IbfPIfgw2h8O*MVCmGLDd59xMxWPbA!/b&bo=KgauAgAAAAADB6I!&rf=viewer_4)

## Spring工厂类
![image](http://m.qpic.cn/psc?/V12A7VgS03zLND/QNsgOSLzUrTyB8UN2gSlSHvqfv7zFNPOfUUfNSER8Qq1ZBFsLKDapmVhkqUdpdzAe2tVccYvO4L0neVyPrN0rQ!!/b&bo=LAU4BAAAAAADBzc!&rf=viewer_4)


## Spring IOC需要的依赖
pom.xml
```
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-core</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-expression</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-context</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
<dependency>
    <groupId>org.springframework</groupId>
    <artifactId>spring-beans</artifactId>
    <version>5.0.0.RELEASE</version>
</dependency>
```

## Spring的Bean配置
- Spring中的配置方式
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd">

    <bean id="oneInterface" class="com.spring.example.ioc.interfaces.impl.OneInterfaceImpl"></bean>

</beans>
```
- 例子
    - test下的Package：ioc.interfaces
    
## Bean容器初始化
- 基础：两个包
    - org.springframework.beans
    - org.springframework.context
    - BeanFactory提供配置结构和基础功能，加载并初始化Bean
    - ApplicationContext保存了Bean对象并在Spring中被广泛使用
- 方式，ApplicationContext
    - 本地文件
    ```
    ApplicationContext context = new FileSystemXmlApplicationContext("/Users/apple/WorkProject/SpringExample/src/main/resources/beans.xml");
    ```
    - Classpath
    ```
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:beans.xml");
    ```
    - Web应用中依赖servlet或Listener
    ```
    <listener>
        <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
    <servlet>
        <servlet-name>context</servlet-name>
        <servlet-class>org.springframework.web.context.ContextLoaderServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    ```
    
## Spring注入
- Spring注入是指在启动Spring容器加载bean配置的时候，完成对变量的赋值行为
- 常用的两种注入方式（injection注入）
    - 设值注入
    ```
    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd">
    
        <!--设置注入-->
        <bean id="injectionService" class="com.spring.example.ioc.injection.service.InjectionServiceImpl">
            <property name="injectionDAO" ref="injectionDAO" />
              <!--name的值必须要与setter方法中参数的值一致-->
        </bean>
    
        <bean id="injectionDAO" class="com.spring.example.ioc.injection.dao.InjectionDAOImpl"></bean>
    
    </beans>
    ```
    - 构造注入
    ```
    <?xml version="1.0" encoding="UTF-8"?>
    <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans
            http://www.springframework.org/schema/beans/spring-beans.xsd">
    
        <bean id="injectionService" class="com.spring.example.ioc.injection.service.InjectionServiceImpl">
            <constructor-arg name="injectionDAO" ref="injectionDAO" ></constructor-arg>
            <!--name的值必须要与构造器参数的值一致-->
        </bean>
    
        <bean id="injectionDAO" class="com.spring.example.ioc.injection.dao.InjectionDAOImpl"></bean>
    
    </beans>
    ```
- 例子
    - Package:ioc.injection