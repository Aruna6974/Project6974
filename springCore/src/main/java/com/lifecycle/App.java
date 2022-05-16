package com.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/lifecycle/configComponent.xml");
		context.registerShutdownHook();
		Student studentobj=context.getBean(Student.class,"student");
		System.out.println(studentobj);

	}

}
