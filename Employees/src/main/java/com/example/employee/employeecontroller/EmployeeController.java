package com.example.employee.employeecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.employees.Employee;

@RestController
//@RequestMapping("/api/v1/employee")
public class EmployeeController {
	@GetMapping("/student")
	public Employee getEmployee() {
		return new Employee("sohil", "khan");
	}
}
