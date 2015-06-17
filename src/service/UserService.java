package service;

import domain.UserEntity;
import persistence.UserDao;
import impl.UserDaoImpl;

public class UserService {
	UserDao ue=new UserDaoImpl();
	public UserEntity loginUser(String userId,String password){
		return ue.loginUser(userId, password);
	}
}
