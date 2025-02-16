package com.chinmay.restservices.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinmay.restservices.model.Student;
import com.chinmay.restservices.repo.StudentRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path="api/student")
public class StudentController {
	
	@Autowired
	StudentRepo studrepo;
	
@GetMapping("/getStudentById")	
//@ResponseBody
public List<Student> getStudentDataById(@RequestParam String sid)
{
	return studrepo.findById(sid);
}

@GetMapping(value="/getStudentByName")
//@ResponseBody
public List<Student> getStudentDataByName(@RequestBody Student stu)
{
	if(stu!=null&&stu.getName()!=null)
	{
		return studrepo.findByName(stu.getName());
		//return studrepo.findAll();
	}
	else
	{
		return List.of();
	}
		
}
	
}
