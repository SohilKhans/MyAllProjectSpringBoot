package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.StudentRepository;
import com.example.demo.studentModel.StudentModel;
import com.example.demo.studententity.StudentEntity;

@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	private StudentRepository repository;

	@Override
	public StudentModel create(StudentModel student) {
		StudentEntity studentEntity = new StudentEntity();
		studentEntity.setName(student.getName());
		studentEntity.setAge(student.getAge());
		studentEntity.setMyAddress(student.getMyAddress());
		studentEntity.setPhone(student.getPhone());
		studentEntity.setCity(student.getCity());
		studentEntity.setPincode(student.getPincode());
		System.out.println(student);
		repository.save(studentEntity);
		return student;
	}

	@Override
	public StudentModel get(Long studentId) {
		StudentEntity entity = repository.getById(studentId);
		System.out.println(entity);
		return null;
	}

}
