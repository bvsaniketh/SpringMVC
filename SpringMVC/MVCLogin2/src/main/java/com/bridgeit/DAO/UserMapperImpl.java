package com.bridgeit.DAO;

import org.apache.ibatis.session.SqlSession;

import com.bridgeit.Model.Login;
import com.bridgeit.Model.Register;
import com.bridgeit.MyBatisUtility.MyBatisUtil;

public class UserMapperImpl  {

	public void insertUser(Register user)
	{
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		System.out.println(session);
		try
		{
		UserMapper usermapper=session.getMapper(UserMapper.class);
		System.out.println(usermapper);
		usermapper.insertUser(user);
		session.commit();
		}
		finally {
		session.close();
	}
	}

	public Register getUser(Login user)
	{
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		System.out.println(session);
		try
		{
		UserMapper usermapper=session.getMapper(UserMapper.class);
		Register reg=usermapper.getUser(user);
		System.out.println(reg);
		session.commit();
		return reg;
		}
		finally {
			session.close();
		}
		
	}
	 public Register checkUser(String uname)
	 {
		 SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		 System.out.println(session);
		 try
		 {
		 UserMapper usermapper=session.getMapper(UserMapper.class);
		 Register reg=usermapper.checkUser(uname);
		 System.out.println(reg);
		 session.commit();
		 return reg;
		 }
		 finally{
		 session.close();
		 }
	 }
	 
	 public void updateUser(String password,String usernameupdation)
	 {
		 SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		 System.out.println(session);
		 try
		 {
		 UserMapper usermapper=session.getMapper(UserMapper.class);
		 usermapper.updateUser(password,usernameupdation);
		 session.commit();
		 
		// return reg;
		 }
		 finally {
		 session.close();
		 }
	 }
	 
	 public Register checkUserByEmail(String email)
	 {
		 SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		 System.out.println(session);
		 try
		 {
		 UserMapper usermapper=session.getMapper(UserMapper.class);
		 Register reg=usermapper.checkUserByEmail(email);
		 System.out.println(reg);
		 session.commit();
		 return reg;
		 }
		 finally{
		 session.close();
		 }
	 }
		 
	 	
}
