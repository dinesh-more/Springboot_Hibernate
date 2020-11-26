package com.controller;

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

import com.model.Employee;
import com.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/employee2")
	public List<Employee> get()
	{
		return employeeService.get();
	}
	
	@PostMapping("/employee2")
	public Employee save(@RequestBody Employee employee)
	{
		return employeeService.save(employee);
	}
	
	@GetMapping("/employee2/{id}")
	public Employee get(@PathVariable int id)
	{
		return employeeService.get(id);
	}
	
	@DeleteMapping("/employee2/{id}")
	public void delete(@PathVariable int id)
	{
		employeeService.delete(id);
	}
	
	@PutMapping("/employee2")
	public Employee update(@RequestBody Employee employee)
	{
		return employeeService.save(employee);
	}
}
