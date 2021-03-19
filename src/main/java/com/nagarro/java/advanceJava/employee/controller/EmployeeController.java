package com.nagarro.java.advanceJava.employee.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.java.advanceJava.employee.model.Employee;
import com.nagarro.java.advanceJava.employee.service.EmployeeServiceImpl;

@RestController
@RequestMapping(value = "api/employee")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl esi;

	@PostMapping(value = "/add")
	public Employee addEmployees(@RequestBody Employee employee) {
		return esi.add(employee);
	}

	@GetMapping(value = "/get/{id}")
	public Employee getEmployeeById(@PathVariable("id") Integer id) {
		return esi.getById(id);
	}
	
	@GetMapping(value = "/all")
	public Iterable<Employee> getAllEmployee(){
		Iterable<Employee> iterable = esi.getAll();
		List<Employee> list = new ArrayList<>();
		for (Employee t : iterable) 
            list.add(t);
		for(Employee e : list)
			System.out.println(e);
		return iterable;
	}
	
	@DeleteMapping(value = "/delete/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) {
		esi.delete(id);
	}
	
	@PutMapping(value = "/update")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return esi.update(employee);
	}

}
