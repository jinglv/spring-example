# Spring的Bean管理
## XML配置
### 三种实例化Bean的方式
- 使用类构造器实例化（默认无参数）
- 使用静态工厂方法实例化（简单工厂模式）
- 使用实例工厂方法实例化（工厂方法模式）

示例：package com.spring.example.bean.instantiation;
- Bean1：无参构造方法
- Bean2Factory：Bean2的静态工厂
- Bean3Factory：Bean3的实例工厂

XML配置文件：spring-bean.xml

## Bean的常用配置
- id和name
    - 一般情况下，装配一个Bean时，通过指定一个id属性作为Bean的名称
    - id属性在IOC容器中必须是唯一的
    - 如果Bean的名称中含有特殊字符，就需要使用name属性
- class
    - class用于设置一个类的完全路径名称，主要作用是IOC容器生成类的实例
- scope
    - 用于设定 Bean 实例的作用域，其属性值有 singleton（单例）、prototype（原型）、request、session 和 global Session。其默认值是 singleton
- constructor-arg
    - <bean>元素的子元素，可以使用此元素传入构造参数进行实例化。该元素的 index 属性指定构造参数的序号（从 0 开始），type 属性指定构造参数的类型
- property
    - <bean>元素的子元素，用于调用 Bean 实例中的 Set 方法完成属性赋值，从而完成依赖注入。该元素的 name 属性指定 Bean 实例中的相应属性名
- ref
    - <property> 和 <constructor-arg> 等元素的子元索，该元素中的 bean 属性用于指定对 Bean 工厂中某个 Bean 实例的引用
- value
    - <property> 和 <constractor-arg> 等元素的子元素，用于直接指定一个常量值
- list
    - 用于封装 List 或数组类型的依赖注入
- set
    - 用于封装 Set 类型属性的依赖注入
- map
    - 用于封装 Map 类型属性的依赖注入
- entry
    - <map> 元素的子元素，用于设置一个键值对。其 key 属性指定字符串类型的键值，ref 或 value 子元素指定其值

### Bean的作用域（Scope）
|类别|说明|
|:---|:---|
|singleton|在SpringIOC容器中仅存在一个Bean实例，Bean以单实例的方式存放|
|prototype|每次调用getBean()时都会返回一个新的实例|
|request|每次HTTP请求都会创建一个新的Bean，该作用域仅适用于WebApplicationContext环境|
|session|同一个HTTP Session共享一个Bean，不同的HTTP Session使用不同的Bean。该作用域仅适用于WebApplicationContext环境|

## Bean的生命周期

## Spring的属性注入
- 对于类成员变量，注入方式有三种
    - 构造函数注入
    - 属性setter方法注入
    - 接口注入（Spring不支持）
### 构造方法注入
- 通过构造方法注入Bean的属性值或依赖的对象，它保证了Bean实例在实例化后就可以使用
- 构造器注入在<constructor-arg>元素里声明的属性
### set方法注入
- 使用set方法注入，在spring配置文件中，通过<property>设置注入的属性
### p名称空间
- 使用p命名空间
- 为了简化XML文件配置，Spring从2.5开始引入一个新的p名称空间
- p:<属性名>="xxx"引入常量
- p:<属性名>-ref="xxx"引用其它Bean对象
### SpEL注入
- SpEL：spring expression language, spring表达式语言，对依赖注入进行简化
- 语法：#{表达式}
- 示例：```<bean id="" value="#{表达式}">```

```
SpEL表达式语言
语法：#{}
#{'hello'}:使用字符串
#{beanId}:使用另一个bean
#{beanId.content.toUpperCase()}:使用指定名属性，并使用方法
#{T(java.lang.Math).PI}:使用静态字段或方法
```
### 复杂类型的属性注入
- 数组类型的属性注入
- List集合类型的属性注入
- Set集合类型的属性注入
- Map集合类型的属性注入
- Properties类型的属性注入

示例：package com.spring.example.bean.injection; AND package com.spring.example.bean.collection;

## 注解