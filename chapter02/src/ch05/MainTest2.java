package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// 객체 생성
		Student studentLee = new Student("이박사", 6000);
		Bus bus86 = new Bus(86);
		Bus bus87 = new Bus(87);
		Subway subwayLine5 = new Subway(5);
		Subway subwayLine4 = new Subway(4);
		
				

		// 1단계 - 사용해보기
		studentLee.takeBus(bus86);
		System.out.println("---------------");
		studentLee.showInfo();
		bus86.showInfo();
		studentLee.takeSubway(subwayLine4);
		studentLee.showInfo();
		subwayLine4.showInfo();
		
		
		// 2단계 - 실행에 흐름 만들어보기
		Scanner scanner = new Scanner(System.in);
		System.out.println("버스 86번과 87번중 탈것을 정하시오.");
		int result = scanner.nextInt();
		if(result == 86) {
			studentLee.takeBus(bus86);
			studentLee.showInfo();
			bus86.showInfo();			
		} else {
			studentLee.takeBus(bus87);
			studentLee.showInfo();
			bus87.showInfo();
		}
		System.out.println("--------------------");
		System.out.println("지하철 4호선과 5호선중 탈것을 정하시오.");
		int result2 = scanner.nextInt();
		if(result2 == 4) {
			studentLee.takeSubway(subwayLine4);
			studentLee.showInfo();
			subwayLine4.showInfo();			
		} else {
			studentLee.takeSubway(subwayLine5);
			studentLee.showInfo();
			subwayLine5.showInfo();
		}
		
	} // end of main

} // end of class
