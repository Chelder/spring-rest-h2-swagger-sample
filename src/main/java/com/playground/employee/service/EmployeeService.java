package com.playground.employee.service;

import java.util.List;

import com.playground.employee.entity.Employee;

public interface EmployeeService {
	public List<Employee> retrieveEmployees();

	public Employee getEmployee(Long EmployeeId);

	public void saveEmployee(Employee employee);

	public void deleteEmployee(Long EmployeeId);

	public void updateEmployee(Employee employee);
}
