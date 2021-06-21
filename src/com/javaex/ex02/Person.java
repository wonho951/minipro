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
	
	
	//프로그램 시작 문구 출력
	public static void mainView() {
		System.out.println("*********************************");
		System.out.println("*	전화번호 관리 프로그램		*");
		System.out.println("*********************************");
	}
	
	
	public static void Menu() {
		System.out.println("");
		System.out.println("1.리스트" + "	" + "2.등록" + "	" + "3.삭제" + "	" + "4.검색" + "	" + "5.종료");
		System.out.println("-----------------------------");
		System.out.print(">메뉴선택: ");
	}
	
	
}
