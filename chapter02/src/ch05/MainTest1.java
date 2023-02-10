package ch05;

public class MainTest1 {
	//메인함수
	public static void main(String[] args) {
		Student studentKim = new Student("홍길동", 10_000);
		Bus bus100 = new Bus(100);
		Bus bus200 = new Bus(200);
		Subway subwayLine1 = new Subway(1);
		Subway subwayLine2 = new Subway(2);
		// 객체와 객체간 메세지 전달하기
		
		studentKim.takeBus(bus200);
		System.out.println("-------------");
		//학생 정보확인
		studentKim.showInfo();
		//버스 정보확인
		bus100.showInfo();
		// 이해 포인트 - 객체 간에 메세지 전달법
		
		//지하철 태워보기
		studentKim.takeSubway(subwayLine2);
		// 학생정보
		studentKim.showInfo();
		//지하철 2호선 정보
		subwayLine2.showInfo();
		System.out.println("-------------");
		subwayLine1.showInfo();
	}
} // end of class
