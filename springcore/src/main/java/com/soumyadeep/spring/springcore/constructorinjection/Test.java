package com.soumyadeep.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");

        Employee employee = (Employee) cxt.getBean("employee1");
        System.out.println(employee);
    }
}