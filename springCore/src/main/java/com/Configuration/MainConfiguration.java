package com.Configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainConfiguration {

	public static void main(String[] args)
	{

		ApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationExample.class);
		Pepsi pepsi=(Pepsi) context.getBean("getPepsi");
		System.out.println(pepsi);
		
		Laptop laptop=(Laptop) context.getBean("getLaptop");
		System.out.println(laptop);
				
	}

}
