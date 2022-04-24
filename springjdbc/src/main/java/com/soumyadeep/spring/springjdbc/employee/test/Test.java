package com.soumyadeep.spring.springjdbc.employee.test;

import java.util.List;

import com.soumyadeep.spring.springjdbc.employee.dao.EmployeeDAO;
import com.soumyadeep.spring.springjdbc.employee.dto.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/soumyadeep/spring/springjdbc/employee/test/config.xml");
        EmployeeDAO dao = (EmployeeDAO) context.getBean("employeeDAO");

        Employee employee = new Employee();
        employee.setId(2);
        employee.setFirstName("Mohit");
        employee.setLastName("Sharma");
        // int result = dao.create(employee);
        // int result = dao.update(employee);
        // System.out.println("Number of records updated:" + result);
        // Employee emp = dao.read(2);
        List<Employee> emp = dao.read();
        System.out.println("Employee records:" + emp);

    }
}