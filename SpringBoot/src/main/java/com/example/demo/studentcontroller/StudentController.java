package com.example.demo.studentcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IStudentService;
import com.example.demo.studentModel.StudentModel;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

	@Autowired
	private IStudentService service;

	@PostMapping("/create")
	public ResponseEntity<StudentModel> create(@RequestBody StudentModel student) {
		service.create(student);
		return new ResponseEntity<StudentModel>(student, HttpStatus.OK);
	}

	@GetMapping("/get/{studentId}")
	public ResponseEntity<StudentModel> getStudent(@PathVariable("studentId") Long studentId) {
		service.get(studentId);
		return new ResponseEntity<>(null, HttpStatus.OK);

	}

}
