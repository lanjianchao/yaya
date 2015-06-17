package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.UserEntity;

public class LoginAction extends ActionSupport implements SessionAware{
	UserEntity ue;
	UserService us;
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	 private String userId;
	 private String userPassword;
	public String getUserId() {
		return userId;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public UserEntity getUe() {
		return ue;
	}
	public UserService getUs() {
		return us;
	}
	public void setUe(UserEntity ue) {
		this.ue = ue;
	}
	public void setUs(UserService us) {
		this.us = us;
	}
	public LoginAction(){
		ue=new UserEntity();
		us=new UserService();
	}
	public String execute() throws Exception{
		ue=us.loginUser(userId, userPassword);
		if(ue == null){
			String loginMsg ="用户名或密码错误";
			this.session.put("loginMsg", loginMsg);
			return LOGIN;
		}else{
			this.session.put("account", ue);
			return SUCCESS;
		}
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = session;
	}
}
