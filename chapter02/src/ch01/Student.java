package ch01;

public class Student {

	// 상태 (속성) (멤버 변수)
	int studentId;
	String studentName;
	String address;
	double height;
	boolean isMarried;

	// 기능

	// 공부한다.
	public void study() {
		System.out.println(studentName + "학생이 공부를 합니다.");
	}

	// 휴식한다.
	public void breakTime() {
		System.out.println(studentName + "학생이 휴식을 합니다.");
	}

	public void showInfo() {
		// 지역변수
		System.out.println("========상태창========");
		System.out.println("학생에 ID값은 : " + studentId);
		System.out.println("학생에 이름은 : " + studentName);
		System.out.println("학생에 주소는 : " + address);
		System.out.println("========상태창========");
	}
	
	// 함수와 메서드의 차이점
	// 메서드란
	// 자바에서 메서드란 객체의 기능을 구현하기 위해서 클래스 내부에 구현되는 메서드
	// 멤버 함수(member function)
	// 결론 : 메서드는 자신에 변수를 활용해서 객체의 기능을 구현 하는 것
	
	// 학생의 기능(메서드) 3가지 정의해주세요.
	public void test() {
		System.out.println(studentName + "학생이 시험을 칩니다.");
	}
	public void eat() {
		System.out.println(studentName + "학생이 급식을 먹는다.");
	}
	public void clean() {
		System.out.println(studentName + "학생이 청소를 합니다.");
	}
	
} // end of class
