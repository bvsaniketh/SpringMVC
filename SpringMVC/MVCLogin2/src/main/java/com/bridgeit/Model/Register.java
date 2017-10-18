package com.bridgeit.Model;

public class Register {
	
	//@Size(min=2,max=30)
	private String name;
	/*private String id;*/
	private String email;
	private int age;
	private int mobile;
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	/*public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}*/
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
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
	@Override
	public String toString() {
		return "Register [name=" + name + ", email=" + email + ", age=" + age + ", mobile=" + mobile
				+ ", username=" + username + ", password=" + password + "]";
	}
	
	
	

}
