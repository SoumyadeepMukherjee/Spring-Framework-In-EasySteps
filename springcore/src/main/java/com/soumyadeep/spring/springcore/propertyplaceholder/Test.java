package com.soumyadeep.spring.springcore.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext();
        MyDAO mydao = (MyDAO) cxt.getBean("myDAO");
        System.out.println(mydao);
    }
}