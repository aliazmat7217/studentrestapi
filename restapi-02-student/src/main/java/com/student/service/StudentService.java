package com.student.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.entity.Student;
import com.student.repository.IStudentRepository;
@Service
public class StudentService {
	@Autowired
	IStudentRepository stdRepo;
public Student createUser(Student std) {
	return stdRepo.save(std);
}

public Student getStudent(int id) {
	return stdRepo.findById(id).orElseThrow(()-> new RuntimeException("Student not found"));
}

public List<Student> getStud(){
	return  stdRepo.findAll();
}

public List<Student> get(String dept){
	return  stdRepo.findByDepartment(dept);
}


public List<Student> getCity(String cty) {
	String city = null;
	return  stdRepo.findByDepartment(city);
}




}
