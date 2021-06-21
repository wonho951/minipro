package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonApp {
	public static void main(String[] args) throws Exception {

		//스캐너값 받아옴.
		Scanner sc = new Scanner(System.in);
		
		//메모장 읽어.
		Reader fr = new FileReader("C:\\javaStudy\\workspace\\minipro\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
				
		//리스트 만들어서 관리할꺼임
		List<Person> pList = new ArrayList<Person>();
		String line = "";

		//읽는거 반복 돌리고
		while (true) {
			line = br.readLine();

			if (line == null) {
				break;
			}
			
			//방마다 뭐 집어 쳐넣을지 만들고
			String[] pInfo = line.split(",");
			String name = pInfo[0];
			String hp = pInfo[1];
			String company = pInfo[2];

			Person person = new Person(name, hp, company);
			pList.add(person);

		}

		//시작
		System.out.println("*********************************");
		System.out.println("*	전화번호 관리 프로그램		*");
		System.out.println("*********************************");

		
		while (true) {

			System.out.println("");
			System.out.println("1.리스트" + "	" + "2.등록" + "	" + "3.삭제" + "	" + "4.검색" + "	" + "5.종료");
			System.out.println("-----------------------------");
			System.out.print(">메뉴선택: ");
			int select = sc.nextInt();

			if (select == 5) {
				System.out.println("*********************************");
				System.out.println("*	ㄳㄳㄳㄳㄳㄳㄳㄳ		*");
				System.out.println("*********************************");
				break;
			}

			switch (select) {
			
			//리스트만 뽑아와봐
			case 1:
				System.out.println("<1.리스트>");
				for (int i = 0; i < pList.size(); i++) {
					System.out.println(i + 1 + ".	" + pList.get(i).getName() + "	" + pList.get(i).getHp() + "	"
							+ pList.get(i).getCompany());
				}
				break;
				
			//등록해야되니까 새로 메모리에 올려주고 추가해.
			case 2:
				System.out.println("<2.등록>");
				System.out.print(">이름: ");
				String name = sc.next();
				System.out.print(">휴대전화: ");
				String hp = sc.next();
				System.out.print(">회사전화: ");
				String company = sc.next();
				System.out.println("[등록되었습니다.]");

				Person p = new Person(name, hp, company);
				pList.add(p);
				break;
				
			//지우는데 그냥 숫자쓰면 0부터 시작이니까 1지울거면 -1붙여라. 그냥 하면 0번방은 남는다.	
			case 3:
				System.out.println("<3.삭제>");
				System.out.print(">번호: ");
				int re = sc.nextInt();
				System.out.println("[삭제되었습니다.]");
				pList.remove(re - 1);

				break;
				
			//contains는 문자열 안에 조건에 맞는거 찾아준다.
			//검색한 후에 검색한거 출력해야 하니까 어떤걸 검색할건지 고민하고 여기선 이름 검색이니까 name해줘라.
			case 4:
				System.out.println("<4.검색>");
				System.out.print(">이름: ");
				String del = sc.next();

				for (int i = 0; i < pList.size(); i++) {

					if (pList.get(i).getName().contains(del)) {
						System.out.println(i + 1 + ".	" + pList.get(i).getName() + "	" + pList.get(i).getHp()
								+ "	" + pList.get(i).getCompany());
					}
				}

				break;
				
				
			default:
				System.out.println("[다시 입력해 주세요]");
			}
			
		}
		
		//이제 써야지. 이클립스에서만 출력말고 실질적으로 메모장에 남겨라.
		Writer fw = new FileWriter(".\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		for(int i = 0; i < pList.size(); i++) {
			bw.write(pList.get(i).draw());
			bw.newLine();
			bw.flush();
		}

		bw.close();
		br.close();
		sc.close();
	}
}