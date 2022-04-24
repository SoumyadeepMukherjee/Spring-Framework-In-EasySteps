package com.soumyadeep.spring.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("config.xml");
        CountriesAndLanguages countriesAndLanguages = (CountriesAndLanguages) cxt.getBean("countryAndLangs");
        System.out.println(countriesAndLanguages);
    }
}