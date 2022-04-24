package com.soumyadeep.spring.springjdbc.employee.dao.impl;

import java.util.List;

import com.soumyadeep.spring.springjdbc.employee.dao.EmployeeDAO;
import com.soumyadeep.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.soumyadeep.spring.springjdbc.employee.dto.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int create(Employee employee) {
        String sql = "insert into employee values(?,?,?)";
        int result = jdbcTemplate.update(sql, employee.getId(), employee.getFirstName(), employee.getLastName());
        return result;
    }

    @Override
    public int update(Employee employee) {
        String sql = "update employee set firstName=?,lastName=? where id=?";
        int result = jdbcTemplate.update(sql, employee.getFirstName(), employee.getLastName(), employee.getId());
        return result;
    }

    @Override
    public Employee read(int id) {
        String sql = "select * from employee where id=?";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, id);
        return employee;
    }

    @Override
    public List<Employee> read() {
        String sql = "select * from employee";
        EmployeeRowMapper rowMapper = new EmployeeRowMapper();
        List<Employee> employee = jdbcTemplate.query(sql, rowMapper);
        return employee;
    }

}