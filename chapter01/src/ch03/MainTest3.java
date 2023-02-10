package ch03;

public class MainTest3 {

	// 메인 함수
	public static void main(String[] args) {
		
		// 증감 연산자, 감소 연산자
		// ++, -- ( how, why )
		
		int num1 = 1; //변수의 선언과 동시에 초기화
		
		num1++;
		System.out.println(num1); // 변수에 값을 1 증가 시킬때 사용
		// num1 += 1;
		// num1 = num1 +1;
		
		int num2 =1;
		num2--;
		System.out.println(num2);
		System.out.println("================");
		
		// 1. 증감 연산자가 뒤에 올 경우
		int num3 = 10;
		int num4;
		
		// num3 값이 num4로 들어간다 그리고 세미콜론 이후에 증감 연산자를 수행한다.
		num4 = num3++;
		System.out.println(num4);
		System.out.println(num3); //num 4에 값 10을 대입하고 세미콜론 기준 증가 +1
		
		// 2. 증감 연산자가 앞에 올 경우
		
		int num5=10;
		int num6;
		
		num6 = ++num5; //세미콜론 기준으로 먼저 num5 변수에 접근해서 +1 증가 이후에
		//num6에 값을 대입한다.
		System.out.println(num6);
		
		// 감소 연산자 사용해보기 !! 앞에있는경우와 뒤에 있는 경우
		
		int num7 =  5;
		int num8;
		num8 = num7++;
		System.out.println(num8);
		
		int num9 = 5;
		int num10;
		num10 = ++num9;
		System.out.println(num10);
		
		
		
		
		
		
	} // end of main

} // end of class
