package com.soumyadeep.spring.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
        Customer customer = (Customer) cxt.getBean("customer");
        System.out.println(customer);
    }
}