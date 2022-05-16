package com.springCore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springCore/config.xml");
        
        context.registerShutdownHook();
        
        
        Student student=context.getBean(Student.class,"student");
        System.out.println(student);
    }
}
