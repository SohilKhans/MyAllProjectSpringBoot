package com.example.user.employeeservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.usercustomexception.ResourceNotFoundException;
import com.example.user.userrepository.EmployeeRepository;
import com.example.user.users.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee create(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		Optional<Employee> employee = employeeRepository.findById(id);
		return employee.get();
	}

	@Override
	public Employee updateEmployee(Employee employee, Long id) {
		Employee updateEmployee = employeeRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee", "id", id));
		updateEmployee.setFirstName(employee.getFirstName());
		updateEmployee.setLastName(employee.getLastName());
		updateEmployee.setAge(employee.getAge());
		updateEmployee.setEmail(employee.getEmail());

		employeeRepository.save(updateEmployee);
		return updateEmployee;
	}

	@Override
	public void deleteEmployeeById(Long id) {
		employeeRepository.findById(id);
		employeeRepository.deleteById(id);
	}

	@Override
	public Long countbyId() {
		Long count = employeeRepository.count();

		return count;
	}

}