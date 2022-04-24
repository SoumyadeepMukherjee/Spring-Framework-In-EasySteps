package com.soumyadeep.spring.springjdbc.employee.dao;

import java.util.List;

import com.soumyadeep.spring.springjdbc.employee.dto.Employee;

public interface EmployeeDAO {

    int create(Employee employee);

    int update(Employee employee);

    Employee read(int id);

    List<Employee> read();
}