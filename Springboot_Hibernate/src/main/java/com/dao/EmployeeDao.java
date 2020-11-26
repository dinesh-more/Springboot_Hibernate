package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	public List<Employee> get();
	
	public Employee get(int id);
	
	public Employee save(Employee employee);
	
	public void delete(int id);
}
