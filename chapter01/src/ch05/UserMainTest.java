package ch05;

public class UserMainTest {

	// 메인 함수
	public static void main(String[] args) {
		// 메모리 올리고
		// 값을 할당
		// 화면에 값을 출력
		User user1 = new User();
		user1.id = "osh";
		user1.name = "오세훈";
		user1.age = 31;
		user1.height = 181;
		user1.adress = "부산시";
		user1.adress2 = "동래구";
		
		System.out.println(user1.id);
		System.out.println(user1.name);
		System.out.println(user1.age);
		System.out.println(user1.height);
		System.out.println(user1.adress);
		System.out.println(user1.adress2);

	} // end of main

} // end of class
