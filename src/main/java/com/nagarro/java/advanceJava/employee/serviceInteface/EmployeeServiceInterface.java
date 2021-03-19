package com.nagarro.java.advanceJava.employee.serviceInteface;

import com.nagarro.java.advanceJava.employee.model.Employee;

public interface EmployeeServiceInterface {
	public Employee add(Employee employee);

	public Employee getById(int id);

	public Iterable<Employee> getAll();

	public void delete(int id);

	public Employee update(Employee employee);
}