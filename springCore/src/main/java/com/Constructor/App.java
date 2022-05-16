package com.Constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args)
	{
          ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/Constructor/configConstructor.xml");
          Player playerobj=applicationContext.getBean(Player.class,"player");
          System.out.println(playerobj);
          
	}

}
