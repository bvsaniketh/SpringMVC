package userpackage;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtility {
	
	private static SqlSessionFactory sqlSessionFactory;
	
	static
	{
		String resource="config.xml";
		InputStream inputstream;
		try 
		{
			inputstream=Resources.getResourceAsStream(resource);
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputstream);
		} catch (IOException e)
		
		{
				e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory()
	{
		return sqlSessionFactory;
	}

}
