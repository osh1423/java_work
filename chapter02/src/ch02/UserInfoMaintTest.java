package ch02;

public class UserInfoMaintTest {

	public static void main(String[] args) {
		// 기본 생성자는 사용자 정의 생성자가 있으면 만들어 주지 않는다.
		UserInfo user1 = new UserInfo("osh","오세훈","5350");
		System.out.println(user1.userId);
		System.out.println(user1.userName);
		System.out.println(user1.phone);
		
		UserInfo user2 = new UserInfo("hong","홍길동");
		System.out.println(user2.userId);
		System.out.println(user2.userName);
		System.out.println(user2.phone);
		
		UserInfo user3 = new UserInfo("pak");
		System.out.println(user3.userId);
		
		UserInfo user4 = new UserInfo();
		user4.userId = "kim";
		user4.userName = "김나라";
		user4.phone = "1234";
		System.out.println(user4.userId);
		System.out.println(user4.userName);
		System.out.println(user4.phone);
				
	}

}
