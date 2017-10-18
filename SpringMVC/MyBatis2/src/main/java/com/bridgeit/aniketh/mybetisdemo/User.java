package com.bridgeit.aniketh.mybetisdemo;

public class User {

	private int userid;
	private String 	emailid;
	private String password;
	private String firstname;
	private String lastname;
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
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
	
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", emailid=" + emailid + ", password=" + password + ", firstname=" + firstname
				+ ", lastname=" + lastname + "]";
	}
}
