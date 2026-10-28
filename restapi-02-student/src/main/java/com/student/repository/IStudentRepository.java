package com.student.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.student.entity.Student;


public interface IStudentRepository extends JpaRepository<Student, Integer> {
  public List<Student> findByDepartment(String department);
  public List<Student> findByCity(String city);
}
