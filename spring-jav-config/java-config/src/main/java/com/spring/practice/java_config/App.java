package com.spring.practice.java_config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.practice.java_config.config.AppConfig;
import com.spring.practice.java_config.model.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s=context.getBean(Student.class);
        System.out.println(s.toString());
    }
}
