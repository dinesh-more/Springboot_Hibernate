package com.service;

import java.util.List;

import com.model.Employee;

public interface EmployeeService {

	public List<Employee> get();

	public Employee get(int id);

	public Employee save(Employee employee);

	public void delete(int id);
}
