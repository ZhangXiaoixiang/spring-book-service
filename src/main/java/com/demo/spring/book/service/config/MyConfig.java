package com.demo.spring.book.service.config;

import com.demo.spring.book.service.model.Person;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * MyConfig
 * 刷新bean
 * @author 10905 2019/2/8
 * @version 1.0
 */
@Configuration
public class MyConfig {
    @Bean
    @RefreshScope
    public Person getPerson(Environment environment){
//        读取实例名称
        String name = environment.getProperty("test.user.name");
//        输出名字
        System.out.println("初始化person bean "+name);
//        创建一个person
        Person person=new Person();
        person.setName(name);
        return person;


    }
}
