package ch07;

public class Student {

	// 학번과 이름을 정의
	// 생성자
	private int studentNumber;
	private String name;

	public Student(int studentNumber, String name) {
		this.studentNumber = studentNumber;
		this.name = name;
	}

	// toString -> 학번과 이름이 화면에 출력할수 있게.
	@Override
	public String toString() {

		return this.name + ", " + this.studentNumber;
	}

	// equals 메서드를 재 정의해 주세요.
	// 이름이 같다면 동명이인입니다. 라고 출력해주세요.
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student targetStudent = (Student) obj;
			if (this.name == targetStudent.name) {
				System.out.println("이름이 같아요");
				return true;
			}
		}
		return false;
	}

}
