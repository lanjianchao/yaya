package action;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.ActService;
import service.NewsService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.ActEntity;
import domain.NewsEntity;

import java.io.File;
import java.io.IOException;
 
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;



public class ActAction  extends ActionSupport implements SessionAware{
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	ActEntity ae=new ActEntity();
	ActService as=new ActService();
	String actId;
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public ActEntity getAe() {
		return ae;
	}
	public ActService getAs() {
		return as;
	}
	public String getActId() {
		return actId;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public void setAe(ActEntity ae) {
		this.ae = ae;
	}
	public void setAs(ActService as) {
		this.as = as;
	}
	public void setActId(String actId) {
		this.actId = actId;
	}
	
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		
		
	   	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	 	Date actDate=df.parse(df.format(new Date()));
	 	ae.setActDate(actDate);
		boolean flag=as.addAct(ae);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String queryBycondition()throws Exception{
		int aeId=Integer.parseInt(actId);
		ActEntity ae=as.queryActBycondition(aeId);
		session.put("ae", ae);
		return SUCCESS;
	}
	public String delete()throws Exception{
		int aeId=Integer.parseInt(actId);
		boolean flag=as.deleteAct(aeId);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String update()throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date actDate=df.parse(df.format(new Date()));
		ae.setActDate(actDate);
		boolean flag=as.updateAct(ae);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String listAct()throws Exception{
		int aeId=Integer.parseInt(actId);
		ActEntity ae=as.queryActBycondition(aeId);
		session.put("ae", ae);
		return "list";
	}
}
