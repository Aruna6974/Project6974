package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/bean/configComponent.xml");
		Person personobj=context.getBean(Person.class,"person");
		System.out.println(personobj);

	}

}
