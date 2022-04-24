package com.soumyadeep.spring.springcoreadvanced.injectinginterfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext(
                "com/soumyadeep/spring/springcoreadvanced/injectinginterfaces/config.xml");

        OrderBO bo = (OrderBO) cxt.getBean("bo");
        bo.placeOrder();
    }
}