package ch01;

public class DataType1 {

	//코드 시작점 main 함수
	public void main(String[] args) {
		
		// 데이터 타입에 종료 (크게2가지)
		// 1. 기본 데이터 타입(primitive data type)
		// 2. 참조 타입(Reference Type)
		
		// 정수형(1, 10, 300) 데이터 타입
		// 크기가 다를 수 있다
		byte b; //1바이트 크기(8bit)
		short s; //2바이트 크기(16bit)
		int i; // 4바이트 크기(32bit)
		long l; //8바이트 크기(64bit)
		
		b = 127;
		b = -128;
		// 데이터 타입 byte는 127부터 -128까지 담을 수 있다. 
		
		s = 128;
		 // s = 200000000;
		
		// int 는 약 +- 21억 까지의 정수를 담을 수 있다.
		i = 2100000000;
		// i = 2200000000;
		
		// L value = R value
		// 컴퓨터 정수 값에 기본 단위는 int 이다.
		l = 2200000000L; // <-접미사를 붙여 주어야 한다.(대소문자 가능)
		
		// 출력해주세요
		//문제 : short 데이터 타입에 범위는??
		//–32,768 ~ 32,767
		
	} //end of main
	
} //end of class
