package com.nagarro.java.advanceJava.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.java.advanceJava.employee.dao.EmployeeDao;
import com.nagarro.java.advanceJava.employee.model.Employee;
import com.nagarro.java.advanceJava.employee.serviceInteface.EmployeeServiceInterface;

@Service
public class EmployeeServiceImpl implements EmployeeServiceInterface {

	@Autowired
	private EmployeeDao employeeDao;
	
	public Employee add(Employee employee) {
		return employeeDao.save(employee);
	}
	
	public Employee getById(int id) {
		return employeeDao.findById(id).orElse(null);
	}
	
	public Iterable<Employee> getAll(){
		return employeeDao.findAll();
	}
	
	public void delete(int id) {
		employeeDao.deleteById(id);
	}
	public Employee update(Employee employee) {
		return employeeDao.save(employee);
	}
}
