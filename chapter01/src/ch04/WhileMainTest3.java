package ch04;

import java.util.Scanner;

public class WhileMainTest3 {

	// 메인 작업자(메인 쓰레드)
	public static void main(String[] args) {

		int num = 1;
		int sum = 0;
		final int USER_INPUT;
		Scanner scanner = new Scanner(System.in);
		System.out.println("덧셈 정수값을 입력해주세요");
		USER_INPUT = scanner.nextInt();
		while(num <= USER_INPUT) {
			sum += num;
		};
		System.out.println("결과값 : " + sum);



	} // end of main

} // end of class
