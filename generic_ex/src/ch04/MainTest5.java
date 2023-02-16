package ch04;

import java.util.Scanner;

public class MainTest5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();

		if ((a % 4 == 0 && a % 100 != 0) || a % 400 == 0) {
			System.out.println("윤년");
		} else {
			System.out.println("평년");
		}
	}

	// 윤년계산하기
	// 4 의배수의 해는 윤년
	// 4의 배수이면서 100의 배수인 해는 윤년이 아님
	// 100의 배수이면서 400의 배수인 해는 윤년

}
