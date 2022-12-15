package com.example.demo.service;

import com.example.demo.studentModel.StudentModel;

public interface IStudentService {
	public StudentModel create(StudentModel student);

	public StudentModel get(Long studentId);
}
