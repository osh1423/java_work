package ch05;

import java.util.Scanner;

public class UserInfoClient {
	
//	static String dbName = "MYSQL";
	static String dbName = "ORACLE";
	
	//main --> 실행하는코드 작성 (사용 쪽 코드)
	public static void main(String[] args) {
		
		//UserInfoOracleDao를 만들어주세요.
		//스캐너를 통해서 사용자 이름, 사용자 비번을 입력받으세요
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("사용자 이름과 사용자 비번을 입력하세요");
		String inputUserName = scanner.nextLine();
		String inputUserPw = scanner.nextLine();
		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
		IUserInfoDao dao = null;
		if(UserInfoClient.dbName.equals("ORACLE")) {
			dao = new UserInfoOracleDao();
		}else if(UserInfoClient.dbName.equals("MSSQL")){
			dao = new UserInfoMsSqlDao();
		}
		//dao.insertUserInfo(userInfo);
		dao.updateUserInfo(userInfo);
		//흐름만들기
		// 1저장기능 2수정기능
		//dbName변경해 가면서 코드동작확인해주세요
		
//     --------------------------------------
//		// 사용자 한테 정보를 입력 받는다 
//		// String userName, String pw
//		// 스캐너 활용 -- > 이름 한글자 이상 , pw 특수 포함
//		String inputUserName = "홍길동";
//		String inputUserPw = "1234";
//		// 위에 받은 데이터를 Object 타입 변화 --> DTO
//		UserInfo userInfo = new UserInfo(inputUserName, inputUserPw);
//		IUserInfoDao dao;
//		if(UserInfoClient.dbName.equals("MYSQL")) {
//			dao = new UserInfoMysqlDao();
//		}else {
//			dao = new UserInfoMsSqlDao();
//		}
		
		
	}
	
}
