package com;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
	
	public static void main(String args[])
	{
	
//		Resource resource=new ClassPathResource("config.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		User user=(User) context.getBean("userdata");
		System.out.println(user);
	}
}
