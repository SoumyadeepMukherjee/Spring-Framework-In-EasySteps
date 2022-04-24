package com.soumyadeep.spring.springjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext(SpringConfig.class);
        // Dao dao = cxt.getBean(Dao.class);
        // dao.create();
        Service service = cxt.getBean(Service.class);
        service.save();
        cxt.close();
    }
}