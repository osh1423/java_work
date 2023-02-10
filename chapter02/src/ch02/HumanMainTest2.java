package ch02;

import java.util.Scanner;

public class HumanMainTest2 {

	public static void main(String[] args) {
		
		Human human = new Human();
		// 스캐너를 활용해서 값을 할당해 주세요.
		// 마지막에는 showinfo 메서드 호출해서 값을 확인해 주세요.
		Scanner scanner = new Scanner(System.in);
		human.name = scanner.nextLine();
		human.showInfo();
		
		
		// 심화 : 0번 입력시에 showInfo호출
		// 스캐너를 통해서 showInfo 메서드 호출 기능 만들어보기
		Human human1= new Human();
		human1.name = scanner.nextLine();
		human1.height = scanner.nextInt();
		human1.weight = scanner.nextInt();
		human1.isMan = scanner.nextBoolean();
		human1.showInfo();
		
	} // end of main

} // end of class
