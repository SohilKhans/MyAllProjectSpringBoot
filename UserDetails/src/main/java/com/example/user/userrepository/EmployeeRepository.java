package com.example.user.userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.users.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

//	List<Employee> findybyEmailAndAge(String email, int age);

}
