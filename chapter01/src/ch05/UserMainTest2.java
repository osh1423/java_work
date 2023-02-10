package ch05;

import java.util.Scanner;

public class UserMainTest2 {

	// 메인 함수
	public static void main(String[] args) {
		// 테스트 코드
		Scanner scanner = new Scanner(System.in);
		int userInput1 = scanner.nextInt();
		//nextInt() 개행문자 제거 하지 않았기 때문에
		//바로 아래 코드가 동작하고 완료되어진다.
		System.out.println(userInput1);
		//scanner.nextInt();
		// 입력 장치 (키보드값을 받아주는 객체)
		// 정수 값을 입력 받을 때
		
//		int a = scanner.nextInt();
//		// 100 + 엔터(개행문자 \ n)
//		scanner.nextLine();
//		
		String name = scanner.nextLine();
		System.out.println("이름을 입력해주세요");
		System.out.println("name : " + name);
		
		// 스캐너를 활용해서 값을 입력 받고 화면에 뿌려주세요
		
		// 여러분들이정의한 클래스를 가지고 갑 할당 코드 작성
		
		//정보를 출력해주세요
		User user = new User();

		System.out.println("========상태창=========");
		
		System.out.println("ID를 입력해주세요.");
		user.id = scanner.nextLine();
		System.out.println("ID: " + user.id);
		
		System.out.println("이름을 입력해주세요.");
		user.name = scanner.nextLine();
		System.out.println("이름: " + user.name);
		
		System.out.println("키를 입력해주세요.");
		user.name = scanner.nextLine();
		System.out.println("키: " + user.name);
		
		System.out.println("주소를 입력해주세요.");
		user.adress = scanner.nextLine();
		System.out.println("주소: " + user.adress);
		
		
		//코드작성
		System.out.println("======================");
		
		

	} // end of main

} // end of class
