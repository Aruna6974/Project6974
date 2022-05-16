package com.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
		ApplicationContext context=new ClassPathXmlApplicationContext("com/autowiring/configautowire.xml");
		Manager managerapp=context.getBean(Manager.class,"manager");
		System.out.println(managerapp);

	}

}
