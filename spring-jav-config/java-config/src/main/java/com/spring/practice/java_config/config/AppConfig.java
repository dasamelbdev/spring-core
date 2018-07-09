package com.spring.practice.java_config.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.practice.java_config.model.School;
import com.spring.practice.java_config.model.Student;

@Configuration
public class AppConfig {

	@Bean
	public Student getStudent() {
		Student  s =new Student();
		s.setName("dasun");
		s.setAge(12);
		s.setSchool(getSchool());
		return s;
	}
	
	
	@Bean
	public School getSchool() {
		School s = new School();
		s.setName("DS");
		s.setAddress("addr");
		return s;
	}
	
	
}
