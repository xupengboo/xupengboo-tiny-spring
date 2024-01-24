# spring framework
> 参考：[https://github.com/fuzhengwei/small-spring](https://github.com/fuzhengwei/small-spring)

构建mvn项目：
```shell
mvn archetype:generate -DgroupId=com.xupengboo -DartifactId=spring-01 -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
```

## spring-01 写一个简易的Bean容器

Bean容器 核心原理：就是一个map，存储了多对(name,Object)的值，value中的Object又封装了一层`BeanDefinition`类对象来进行修饰。

## spring-02 设计模式

··· 先暂停，学习设计模式去，感觉设计模式学的不行！···

