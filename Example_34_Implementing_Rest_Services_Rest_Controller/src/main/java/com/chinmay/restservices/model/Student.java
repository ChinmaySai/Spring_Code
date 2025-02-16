package com.chinmay.restservices.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") ///Every we try to get the Bean new bean needs to be returned otherwise Student details will be Overridden if we have Singleton
public class Student {
	
	private int rolNum;
	private String name;
	private int marks;
	public int getRolNum() {
		return rolNum;
	}
	public void setRolNum(int rolNum) {
		this.rolNum = rolNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [rolNum=" + rolNum + ", name=" + name + ", marks=" + marks + "]";
	}
	
	

}
