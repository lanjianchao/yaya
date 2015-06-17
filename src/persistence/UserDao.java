package persistence;

import domain.UserEntity;
public interface UserDao {
	String loginUserSQL="select * from UserTable where userId=? and userPassword =? ";
	UserEntity loginUser(String userId , String password);
}
