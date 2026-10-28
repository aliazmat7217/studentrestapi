package com.student.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.entity.Student;
import com.student.service.StudentService;

@RestController
@RequestMapping("/student")
public class MyController {
	@Autowired
	StudentService studentService;
	@PostMapping("/details")
	public Student getStudent(@RequestBody Student std ) {
		return studentService.createUser(std);
		
	}
	@GetMapping("/search/{id}")
	public Student getStudentId(@PathVariable int id) {
		return studentService.getStudent(id);
	}
	@GetMapping("/find")
	public List<Student> getDetails() {
		return  studentService.getStud();
	}
	
	@GetMapping("/dept/{depart}")
	public List<Student> getDept(@PathVariable String depart) {
		return  studentService.get(depart);
	}
	@GetMapping("/city/{city}")
	public List<Student> get(@PathVariable String city) {
		return   studentService.getCity(city);
	}
	
	
		
	
}
