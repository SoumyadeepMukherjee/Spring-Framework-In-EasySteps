package com.soumyadeep.spring.springcore.reftypes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
        Student student = (Student) cxt.getBean("student");
        System.out.println(student);
    }
}