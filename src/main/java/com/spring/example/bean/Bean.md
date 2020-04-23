# Spring的Bean管理
## XML配置
### 三种实例化Bean的方式
- 使用类构造器实例化（默认无参数）
- 使用静态工厂方法实例化（简单工厂模式）
- 使用实例工厂方法实例化（工厂方法模式）

### Spring的属性注入
- 对于类成员变量，注入方式有三种
    - 构造函数注入
    - 属性setter方法注入
    - 接口注入（Spring不支持）
#### 构造方法注入
- 通过构造方法注入Bean的属性值或依赖的对象，它保证了Bean实例在实例化后就可以使用
- 构造器注入在<constructor-arg>元素里声明的属性
#### set方法注入
- 使用set方法注入，在spring配置文件中，通过<property>设置注入的属性
#### p名称空间
- 使用p命名空间
- 为了简化XML文件配置，Spring从2.5开始引入一个新的p名称空间
- p:<属性名>="xxx"引入常量
- p:<属性名>-ref="xxx"引用其它Bean对象
#### SpEL注入
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
#### 复杂类型的属性注入
- 数组类型的属性注入
- List集合类型的属性注入
- Set集合类型的属性注入
- Map集合类型的属性注入
- Properties类型的属性注入
## 注解