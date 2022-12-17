package com.example.institutemanagementsystem.studentservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.institutemanagementsystem.ResourceNotFoundException.ResourceNotFoundException;
import com.example.institutemanagementsystem.studententity.StudentEntity;
import com.example.institutemanagementsystem.studentrepository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public StudentEntity Create(StudentEntity studentEntity) {
		studentRepository.save(studentEntity);
		return studentRepository.save(studentEntity);

	}

	@Override
	public StudentEntity getById(Long id) {
		Optional<StudentEntity> entity = studentRepository.findById(id);
		return entity.get();
	}

	@Override
	public StudentEntity update(StudentEntity studentEntity, Long id) {

		StudentEntity entities = studentRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("StudentEntity", "id", id));
		entities.setName(studentEntity.getName());
		entities.setLastName(studentEntity.getLastName());
		entities.setCourseName(studentEntity.getCourseName());
		entities.setAge(studentEntity.getAge());
		entities.setEmail(studentEntity.getEmail());
		entities.setCity(studentEntity.getCity());
		entities.setAddress(studentEntity.getAddress());
		studentRepository.save(entities);
		return entities;
	}

	@Override
	public void delete(Long id) {
		studentRepository.findById(id);
		studentRepository.deleteById(id);
	}

}
