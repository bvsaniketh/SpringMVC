package com.LoginSession;

import java.io.Serializable;

public class JavaBean implements Serializable {

	private String username;
	private String password;
	private String firstname;
	private String lastname;
	private int age;
	public boolean valid;
	
	
	public JavaBean() {
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}	
	
	public boolean isValid()
	{
		return valid;
	}
	
	public void setValid(boolean valid)
	{
		this.valid=valid;
	}
	
	public int getage()
	{
		return age;
	}
	public void setage(int age)
	{
		this.age=age;
	}


	@Override
	public String toString() {
		return "JavaBean [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", age=" + age + ", valid=" + valid + "]";
	}
	
}
