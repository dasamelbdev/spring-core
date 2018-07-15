package com.spring.practice.java_config.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

public class Student {

	@Autowired
	@Qualifier("getSchool_1")
	// @Resource(name="getSchool_2")
	private School school;


	@Override
	public String toString() {
		return "Student [school=" + school + ", name=" + name + ", age=" + age + ", country=" + country + "]";
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

	private String country;

	public String getCountry() {
		return country;
	}

	@Required
	@Value("Sri Lanka")
	public void setCountry(String country) {
		this.country = country;
	}

}
