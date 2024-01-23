package com.xupengboo;

import com.xupengboo.bean.UserService;
import org.junit.Test;

/**
 * @author: xupengboo
 * @date: 2024/1/23 13:41
 * @description: 测试类
 */
public class AppTest {

    @Test
    public void appTest(){
        // 1. 初始化容器
        BeanFactory beanFactory = new BeanFactory();
        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService",beanDefinition);
        // 3. 从容器中，获取bean对象
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }

}
