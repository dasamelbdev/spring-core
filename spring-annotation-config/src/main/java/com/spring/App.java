package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
        BeanC beanC = context.getBean("beanC", BeanC.class);
        System.out.println(beanC.getProp());
    }
}
