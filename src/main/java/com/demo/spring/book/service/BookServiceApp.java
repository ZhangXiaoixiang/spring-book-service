package com.demo.spring.book.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(BookServiceApp.class,args);
        System.out.println("先启动配置和模块,vn配置文件修改后需要先使用httpclient请求,然后再次请求下面地址,看是否刷新");
        System.out.println("客户端读取文本属性:  http://localhost:8080/home");
        System.out.println("客户端读取对象(属性):  http://localhost:8080/getPerson");
        System.out.println("解读明文password: '{cipher}b6b02d48a30e85ce0b6537416780bf96248bc5771dd5ef164383c48c0bdfdf04':  \nhttp://localhost:8888/spring-book-service-dev.yml");
    }

}

