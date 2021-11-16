package com.dbs.employeemngt.service;

import java.util.List;
import java.util.Optional;

import com.dbs.employeemngt.dto.Employee;

public interface EmployeeService {
	public Employee CreateEmployee(Employee employee);
	public Employee UpdateEmployee(String empId,Employee employee);
	public Employee DeleteEmployee(String empId);
	public Optional<Employee> getEmployeeById(String empId);
	public Optional<List<Employee>> getEmployees();
}
