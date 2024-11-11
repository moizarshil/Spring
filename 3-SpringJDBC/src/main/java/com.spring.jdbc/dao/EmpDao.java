package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Employee;

public interface EmpDao {
    //Method to insert data
    public int insert(Employee employee);

    //Method to edit data
    public int edit(Employee employee);

}
