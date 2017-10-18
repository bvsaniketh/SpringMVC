package com.bridgeit.aniketh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {

	public static void main(String args[])
	{
	ApplicationContext context=new ClassPathXmlApplicationContext("springconfig.xml");
	Restaurant res=(Restaurant) context.getBean("resta");
	System.out.println(res);
	}
} 
