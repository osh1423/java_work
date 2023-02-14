package ch07;

public class MainTest3 {

	public static void main(String[] args) {
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(2, "홍길동");
		Student student3 = new Student(3, "허균");
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

		// 자식 객체에 존재하는 각각에 equals 메서드 호출이다.
		student1.equals(student2);

		Boolean result1 = student1 == student2;
		System.out.println("result1 " + result1);

//		if(student1.equals(student2)) {
//			System.out.println("이름 같아요");
//		} else {
//			System.out.println("이름 달라요");
//		}
	}

}
