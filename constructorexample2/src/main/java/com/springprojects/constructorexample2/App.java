package com.springprojects.constructorexample2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.springprojects.entities.*;

public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	/*----- Loading xml based configuration-------*/
    	context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	/*----- loading beans -----*/
    	Student std=(Student)context.getBean("studentbean");
    	System.out.println(std);
    }
}
