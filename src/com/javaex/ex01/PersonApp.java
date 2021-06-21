package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PersonApp {
	public static void main(String[] args) throws Exception {

		
		Reader fr = new FileReader(".\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		List<Person> pList = new ArrayList<Person>();
		String line = "";
		while (true) {
			System.out.println("1.리스트" + "	" + "2.등록" + "	" + "3.삭제" + "	" + "4.검색" + "	" + "5.종료");
			System.out.println("-----------------------------");
			System.out.println(">메뉴선택: ");
			line = br.readLine();
			
			if (line == null) {
				break;
			}
			
			String[] pInfo = line.split(",");
			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];
			
			Person person = new Person(name, hp, company);
			pList.add(person);
		}
		

		
		System.out.println("*********************************");
		System.out.println("*	전화번호 관리 프로그램		*");
		System.out.println("*********************************");
		
		Scanner sc = new Scanner(System.in);
		int select = sc.nextInt();
		while (true) {
			System.out.println("1.리스트" + "	" + "2.등록" + "	" + "3.삭제" + "	" + "4.검색" + "	" + "5.종료");
			
			if (select == 5) {
				System.out.println("*********************************");
				System.out.println("*	ㄳㄳㄳㄳㄳㄳㄳㄳ		*");
				System.out.println("*********************************");
				break;
			}
			
			switch(select) {
			case 1:
				for(int i = 0; i < pList.size(); i++) {
					System.out.println(i+1 + ".	" + pList.get(i).getName()+ "	" + pList.get(i).getHp()+ "	" + pList.get(i).getCompany());
				}
				break;
			}
			
			sc.close();	
		}
		
		
		
		
	
		/*
		for(int i = 0; i < pList.size(); i++) {
			System.out.println(i+1 + ".	" + pList.get(i).getName()+ "	" + pList.get(i).getHp()+ "	" + pList.get(i).getCompany());
		}
		*/
	}
}