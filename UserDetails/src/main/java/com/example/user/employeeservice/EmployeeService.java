package com.example.user.employeeservice;

import java.util.List;

import com.example.user.users.Employee;

public interface EmployeeService {
	Employee create(Employee employee);

	List<Employee> getAllEmployee();

	Employee getEmployeeById(Long id);

	Employee updateEmployee(Employee employee, Long id);

	void deleteEmployeeById(Long id);

	Long countbyId();

}
