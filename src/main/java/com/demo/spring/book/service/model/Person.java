package com.demo.spring.book.service.model;

/**
 * Person
 *
 * @author 10905 2019/2/8
 * @version 1.0
 */
public class Person {
    private  String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public Person() {
    }
}
