package com.nagarro.java.advanceJava.employee.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.java.advanceJava.employee.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

}
