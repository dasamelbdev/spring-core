package com.spring.practice.java_config.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.practice.java_config.model.School;
import com.spring.practice.java_config.model.Student;

@Configuration
public class AppConfig {

	@Bean(autowire=Autowire.BY_NAME)
	public Student getStudent() {
		Student  s =new Student();
		s.setName("dasun");
		s.setAge(12);
		//s.setSchool(getSchool());
		return s;
	}
	
	
	@Bean
	public School getSchool() {
		School s = new School();
		s.setName("DS College my last one  !!!");
		s.setAddress("addr");
		return s;
	}
	
	@Bean
	public School getSchool_1() {
		School s = new School();
		s.setName("nalanda college at colombo !!!");
		s.setAddress("addr");
		return s;
	}
}
