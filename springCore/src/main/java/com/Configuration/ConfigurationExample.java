package com.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Configuration")

public class ConfigurationExample
{
	@Bean
	public Pepsi getPepsi()
	{
		Pepsi obj=new Pepsi(24,7);
		return obj;
	}
	@Bean
	public Laptop getLaptop()
	{
		Laptop obj1=new Laptop("Lenovo",50000.0,4);
		return obj1;
	}

}
