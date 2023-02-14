package ch04;

public interface IUserInfoDao {
	void insertUserInfo(UserInfo userinfo);
	void updateUserInfo(UserInfo userinfo);
	void deleteUserInfo(String userName);
	void selecteUserInfo(String userName);
}
