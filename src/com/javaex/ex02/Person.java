package com.javaex.ex02;

public class Person {
	//field
	
	private String name;
	private String hp;
	private String company;
	
	//constructor
	
	public Person(String name, String hp, String company) {

		this.name = name;
		this.hp = hp;
		this.company = company;
	}

	public Person() {
		
	}

	//method g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	public void setNumber(int number) {
	
	}
	
	//method
	
	public String draw() {
		return name + "," + hp + ","+ company;		
	}
	
	@Override
	public String toString() {
		return name + "   " + hp + "     "+ company;
	}
	
	
	public void read() {
		
	}
	
	
	
	
}
