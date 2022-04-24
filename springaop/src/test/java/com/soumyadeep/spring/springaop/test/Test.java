package com.soumyadeep.spring.springaop.test;

import com.soumyadeep.spring.springaop.ProductService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("com/soumyadeep/spring/springaop/test/config.xml");

        ProductService productService = (ProductService) cxt.getBean("productService");

        System.out.println(productService.multiply(4, 5));
    }
}