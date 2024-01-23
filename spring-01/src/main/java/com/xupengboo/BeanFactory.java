package com.xupengboo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author: xupengboo
 * @date: 2024/1/23 11:48
 * @description: Bean工厂，存储Bean的实例容器类
 */
public class BeanFactory {

    private Map<String,BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<String,BeanDefinition>();

    // 获取容器内部对象
    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    // 实例对象注册到容器
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name,beanDefinition);
    }

}
