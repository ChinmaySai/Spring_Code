package com.chinmay.restservices.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chinmay.restservices.model.Student;
import com.chinmay.restservices.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo sr;
	public void addStudent(Student s) {

		sr.save(s);
	}
	public List<Student> getStudents() {
		return sr.findAll();
	}

}
