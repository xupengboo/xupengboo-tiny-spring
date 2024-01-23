package com.xupengboo;

/**
 * @author: xupengboo
 * @date: 2024/1/23 11:48
 * @description:
 *     BeanDefinition 维护Bean实例对象，就是再套一层。
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean){
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }

}
