package com.chinmay.restservices;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.chinmay.restservices.model.Student;
import com.chinmay.restservices.service.StudentService;


@SpringBootApplication
public class SpringJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcApplication.class, args);
//		Random r=new Random();
//		
//		Student s=context.getBean(Student.class);
//	       s.setRolNum(r.nextInt());
//	       s.setName("Charan");
//	       s.setMarks(85);
//	       StudentService ss=context.getBean(StudentService.class);
//	       ss.addStudent(s);
//	       List<Student> stdata=ss.getStudents();
//	       System.out.println("Student data "+stdata);
//	
		
	}

}
