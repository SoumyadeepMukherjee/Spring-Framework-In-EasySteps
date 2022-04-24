package com.soumyadeep.spring.springcoreadvanced.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext(
                "com/soumyadeep/spring/springcoreadvanced/standalone/collections/config.xml");

        ProductsList productsList = (ProductsList) cxt.getBean("productList");
        System.out.println(productsList);
    }
}