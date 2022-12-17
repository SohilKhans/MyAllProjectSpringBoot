package com.example.institutemanagementsystem.studentservice;

import com.example.institutemanagementsystem.studententity.StudentEntity;

public interface StudentService {

	StudentEntity Create(StudentEntity studentEntity);

	StudentEntity getById(Long id);

	StudentEntity update(StudentEntity studentEntity, Long id);

	void delete(Long id);

}
