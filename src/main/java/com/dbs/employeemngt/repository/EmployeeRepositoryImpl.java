package com.dbs.employeemngt.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.dbs.employeemngt.dto.Employee;

@Repository

public class EmployeeRepositoryImpl implements EmployeeRepository {

	@Override
	public Employee CreateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee UpdateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee DeleteEmployee(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

}
