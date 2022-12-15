package com.example.user.usercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.employeeservice.EmployeeService;
import com.example.user.users.Employee;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;

	@PostMapping()
	public ResponseEntity<Employee> create(@Valid @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.create(employee), HttpStatus.CREATED);

	}

	@GetMapping()
	public ResponseEntity<List<Employee>> getAllEmployee() {
		return new ResponseEntity<List<Employee>>(employeeService.getAllEmployee(), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployees(@PathVariable("id") Long id, @RequestBody Employee employee) {
		return new ResponseEntity<Employee>(employeeService.updateEmployee(employee, id), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Long id) {
		employeeService.deleteEmployeeById(id);
		return new ResponseEntity<String>(("Employee id deleted successfully"), HttpStatus.OK);

	}

	@GetMapping("/count")
	public Long count() {
		Long couLong = employeeService.countbyId();
		return couLong;

	}

}
