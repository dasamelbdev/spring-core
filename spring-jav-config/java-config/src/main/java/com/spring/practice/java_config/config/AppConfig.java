package com.spring.practice.java_config.config;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.practice.java_config.model.School;
import com.spring.practice.java_config.model.Student;

@Configuration
//@ComponentScan("com.spring.practice.java_config.model")
public class AppConfig {

	@Bean(autowire=Autowire.BY_TYPE)
	public Student getStudent() {
		Student  s =new Student();
		s.setName("dasun");
		s.setAge(12);
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
	
	
	@Bean
	public School getSchool_2() {
		School s = new School();
		s.setName("royal college at colombo !!!");
		s.setAddress("addr");
		return s;
	}
	
	
	
}
