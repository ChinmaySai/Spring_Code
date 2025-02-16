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
public class RestApiMainClass{

	public static void main(String[] args) {
		SpringApplication.run(RestApiMainClass.class, args);
	}

}
