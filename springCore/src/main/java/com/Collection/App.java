package com.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
       ApplicationContext appcontext=new ClassPathXmlApplicationContext("com/Collection/configCollection.xml");
       Employee employeeobj=appcontext.getBean(Employee.class,"employee");
       System.out.println(employeeobj);
	}

}
