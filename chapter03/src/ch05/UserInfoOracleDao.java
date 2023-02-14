package ch05;

public class UserInfoOracleDao implements IUserInfoDao{

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 저장 기능 호출");
		System.out.println("이름 : "+ userInfo.getUserName());
		System.out.println("PW : "+ userInfo.getPw());
		
	}

	@Override
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("MSSQL : 수정 기능 호출");
		System.out.println("이름 : "+ userInfo.getUserName());
		System.out.println("PW : "+ userInfo.getPw());
		
	}

	@Override
	public void deleteUserInfo(String userName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selecteUserInfo(String userName) {
		// TODO Auto-generated method stub
		
	}

}
