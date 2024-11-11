package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;
import org.springframework.jdbc.core.JdbcTemplate;

public class EmpDaoImpl implements EmpDao {

    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public int insert(Employee employee) {
        // Method for inserting a new employee record
        String q = "INSERT INTO emp_data(eid, ename, dname) VALUES(?, ?, ?)";
        return this.jdbcTemplate.update(q, employee.getEid(), employee.getEname(), employee.getDname());
    }

    public int edit(Employee employee) {
        // Method for editing an existing employee record
        String q = "UPDATE emp_data SET ename = ?, dname = ? WHERE eid = ?";
        return this.jdbcTemplate.update(q, employee.getEname(), employee.getDname(), employee.getEid());
    }
}
