package com.soumyadeep.spring.springcoreadvanced.stereotype.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext(
                "com/soumyadeep/spring/springcoreadvanced/stereotype/annotations/config.xml");

        Instructor instructor = (Instructor) cxt.getBean("instructor");
        System.out.println(instructor);

        Instructor instructor2 = (Instructor) cxt.getBean("instructor");
        System.out.println(instructor2);
    }
}