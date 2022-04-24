package com.soumyadeep.spring.springcore.dependencycheck;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
        Prescription prescription = (Prescription) cxt.getBean("prescription");
        System.out.println(prescription);

    }
}