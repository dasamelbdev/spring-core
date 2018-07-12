package com.spring.practice.java_config.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {

	@Autowired
	private School getSchool;

//	public School getSchool() {
//		return school;
//	}
//
//	@Autowired
//	public void setgetSchool_1(School school) {
//		this.getSchool = school;
//	}

	@Override
	public String toString() {
		return "Student [school=" + getSchool + ", name=" + name + ", age=" + age + "]";
	}

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

}
