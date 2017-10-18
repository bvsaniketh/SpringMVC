package com.bridgeit.aniketh;

public class Restaurant {

	private String name;
	private int id;
	
	
	Restaurant(int id)
	{
		this.id=id;
		System.out.println("Only Integer constuctor is executed");
	}
	
	Restaurant(String name)
	{
		this.name=name;
		System.out.println("Only String constructor is executed");
	}
	
	Restaurant(String name,int id)
	{
		this.name=name;
		this.id=id;
		System.out.println("Two parameters constructor is executed");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Restaurant [name=" + name + ", id=" + id + "]";
	}
	
	
	
	
	
}
