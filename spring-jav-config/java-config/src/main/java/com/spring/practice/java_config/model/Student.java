package com.spring.practice.java_config.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import javax.annotation.Resource;

public class Student {

//	@Autowired
//	@Qualifier("getSchool_1")
	@Resource(name="getSchool_2")
	private School school;

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
		return "Student [school=" + school + ", name=" + name + ", age=" + age + "]";
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
