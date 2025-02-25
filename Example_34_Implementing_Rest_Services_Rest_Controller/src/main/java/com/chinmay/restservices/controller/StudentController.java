package com.chinmay.restservices.controller;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.chinmay.restservices.model.Response;
import com.chinmay.restservices.model.Student;
import com.chinmay.restservices.repo.StudentRepo;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping(path="api/student")
public class StudentController {
	
	@Autowired
	StudentRepo studrepo;
	private Logger log=LoggerFactory.getLogger(StudentController.class);
	
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

@PostMapping(value="/saveStudentDetails")
public ResponseEntity<Response> saveStudentData(@RequestHeader("invocationFrom") String invocationFrom,  @RequestBody Student stu)
{
	log.info("Api is Invoked from "+invocationFrom);
	studrepo.save(stu);
	Response resp=new Response();
	resp.setStatusCode("200");
	resp.setStatusMsg("Data Saved Successfully");
	
	return ResponseEntity.status(HttpStatus.CREATED).header("isMsgSaved", "true").body(resp);
	
}

@DeleteMapping(value="/deleteStudent")
public ResponseEntity<Response> deleteStudent(RequestEntity<Student> request)
{
	HttpHeaders headers=request.getHeaders();
	//headers.entrySet();
	Set<String> st=headers.keySet();
	Iterator<String> it=st.iterator();
	while(it.hasNext())
	{
		System.out.println("Key :"+it.next()+" Value :"+headers.get(it.next()));
	}
	
	Student student=request.getBody();
	studrepo.delete(student.getRolNum());
	Response response=new Response();
	response.setStatusCode("200");
	response.setStatusMsg("Deleted Successfully");
	return ResponseEntity.status(HttpStatus.OK).body(response);
	
}
	
}
