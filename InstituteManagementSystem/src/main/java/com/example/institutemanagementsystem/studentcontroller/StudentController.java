package com.example.institutemanagementsystem.studentcontroller;

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

import com.example.institutemanagementsystem.studententity.StudentEntity;
import com.example.institutemanagementsystem.studentservice.StudentService;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController {
	@Autowired
	private StudentService studentService;

	@PostMapping("create")
	public ResponseEntity<StudentEntity> create(@RequestBody StudentEntity studentEntity) {
		return new ResponseEntity<StudentEntity>(studentService.Create(studentEntity), HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<StudentEntity> getById(@PathVariable("id") Long id) {
		return new ResponseEntity<StudentEntity>(studentService.getById(id), HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<StudentEntity> update(@PathVariable("id") Long id, @RequestBody StudentEntity studentEntity) {
		return new ResponseEntity<>(studentService.update(studentEntity, id), HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> delete(@PathVariable("id") Long id) {
		studentService.delete(id);
		return new ResponseEntity<String>((" Student id deleted successfully"), HttpStatus.OK);
	}
}
