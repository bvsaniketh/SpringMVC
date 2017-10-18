package com.bridgeit.aniketh.mybetisdemo;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {

	private static SqlSessionFactory factory;
	
	static
	{
		String url="mybatis-config.xml";
		Reader reader;
		try {
			reader=Resources.getResourceAsReader(url);
			factory=new SqlSessionFactoryBuilder().build(reader);
		} catch (IOException e) {
			e.printStackTrace();
		}
			
		
	}
		
	
	public static SqlSessionFactory getSqlSessionFactory()
	{
		return factory;
	}
	
}
