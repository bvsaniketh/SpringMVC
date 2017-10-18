package com.bridgeit.aniketh.mybetisdemo;

import java.util.List;

public interface UserMapper {
	
	public void insertUser(User user);
	public User getUserById(int userid);
	public List<User> getAllUsers();
	public void updateUser(User user);
	public void deleteUser(int userid);
	
}
