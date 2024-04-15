package com.springprojects.constructordiexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springprojects.entity.Student;
/**
 * Hello world!
 *
 */
public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Student std=(Student)context.getBean("studentbean");
    	System.out.println(std);
    }
}
