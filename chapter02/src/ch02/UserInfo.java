package ch02;

public class UserInfo {

	String userId;
	String userName;
	String phone;

	// 1. 사용자 정의 생성자를 만들어 주세요 매개변수 3개 한번에 사용
	public UserInfo(String userId, String userName, String phone){
		this.userId = userId;
		this.userName = userName;
		this.phone = phone;
	}

	// 2.사용자 정의 생성자 만들기 userId; userName;
	public UserInfo(String userId, String userName) {
		this.userId = userId;
		this.userName = userName;
		//필요하다면 외부에서 받지않고 바로 초기화가능
		this.phone = "010-1234";
	}
	
	// 3. 사용자 정의 생성자 만들기 userId;
	public UserInfo(String userId) {
		this.userId = userId;
	}
	
	// 4. 기본 생성자를 만들어 주세요.
	public UserInfo(){}
}
