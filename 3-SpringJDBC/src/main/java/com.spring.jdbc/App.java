package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.dao.EmpDao;
import com.spring.jdbc.entities.Employee;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.spring.jdbc/config.xml");
        EmpDao cd = context.getBean("EmpDao", EmpDao.class);

        // To insert data
        Employee c1 = new Employee();
        c1.setEid(780);
        c1.setEname("Parita");
        c1.setDname("CMO");
        int r1 = cd.insert(c1);
        System.out.println("Record inserted: " + r1);
    }
}