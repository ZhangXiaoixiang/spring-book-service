package com.demo.spring.book.service.api;

import com.demo.spring.book.service.model.Person;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * BookApi
 *
 * @author 10905 2019/2/7
 * @version 1.0
 */
@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class BookApi {
    @Autowired
    private Environment environment;
    @Autowired
    private Person person;
    @RequestMapping(value = "/home")
    public String home(){

        System.out.println("读取到的值是: " +environment.getProperty("test.user.name"));
        return "读取到的值是: " +environment.getProperty("test.user.name");
    }

   @RequestMapping(value = "/getPerson")
    public String getPerson(){
       System.out.println("输出的Person实例:  "+person+"   ,名字:   "+person.getName());
       return person.toString();

   }




}

