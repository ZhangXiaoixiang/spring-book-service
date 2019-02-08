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
    }

}

