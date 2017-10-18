package com.bridgeit.aniketh.mybetisdemo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class UserService {

	public void insertUser(User user) {
		SqlSession session = MyBatisUtil.getSqlSessionFactory().openSession();

		try {
			UserMapper usermapper = session.getMapper(UserMapper.class);
			usermapper.insertUser(user);
			session.commit();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			session.close();
		}
	}
	
	public User getUserById(int userid)
	{
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		User user=null;
		try
		{
			System.out.println("hi" + userid);
		UserMapper usermapper=session.getMapper(UserMapper.class);
		user = usermapper.getUserById(userid);
		session.commit();
		

		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally
		{
			
		session.close();
		
		}
		return user;
	}
	
	public List<User> getAllUsers()
	{
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		UserMapper usermapper=null;
		List<User> user=null;
		try
		{
		usermapper=session.getMapper(UserMapper.class);
		session.commit();
		user=usermapper.getAllUsers();		
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally
		{
		session.close();
		}
		return user;
	}
	
	public void updateUser(User user)
	{
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			UserMapper usermapper=session.getMapper(UserMapper.class);
			usermapper.updateUser(user);
			session.commit();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
	public void deleteUser(int id)
	{
		SqlSession session=MyBatisUtil.getSqlSessionFactory().openSession();
		try
		{
			UserMapper usermapper=session.getMapper(UserMapper.class);
			usermapper.deleteUser(id);
			session.commit();
		}
		catch(NullPointerException e) {
			e.printStackTrace();
		}
		finally
		{
			session.close();
		}
	}
}
