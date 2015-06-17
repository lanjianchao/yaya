package action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.EmployService;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.EmployEntity;
import domain.NoteEntity;

public class EmployAction extends ActionSupport implements SessionAware{
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	EmployEntity ee=new EmployEntity();
	EmployService  es=new EmployService();
	String employId;
	String []employSub;
	public String[] getEmploySub() {
		return employSub;
	}
	public void setEmploySub(String[] employSub) {
		this.employSub = employSub;
	}
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public EmployEntity getEe() {
		return ee;
	}
	public EmployService getEs() {
		return es;
	}
	public String getEmployId() {
		return employId;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public void setEe(EmployEntity ee) {
		this.ee = ee;
	}
	public void setEs(EmployService es) {
		this.es = es;
	}
	public void setEmployId(String employId) {
		this.employId = employId;
	}
	public String execute()throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date employDate=df.parse(df.format(new Date()));
		ee.setEmployDate(employDate);
		StringBuffer str=new StringBuffer();
		for(int i=0;i<employSub.length;i++){
			str.append(employSub[i]+" ");
		}
		ee.setEmploySub(str.toString());
		System.out.println(str);
		boolean flag=es.addEmploy(ee);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String queryEmploy()throws Exception{
		int neId=Integer.parseInt(employId);
		EmployEntity ee=new EmployEntity();
		ee=es.queryEmployBycondition(neId);
		System.out.println(ee.getEmployId()+" "+ee.getEmployDate());
		session.put("ee", ee);
		return SUCCESS;
	}
	public String updatePass()throws Exception{
		int neId=Integer.parseInt(employId);
		System.out.println(neId);
		boolean flag=es.updatePass(neId);
		if(flag){
			return SUCCESS;
			
		}else{
			return "fail";
		}
	}
	public String deleteEmploy()throws Exception{
		int neId=Integer.parseInt(employId);
		EmployEntity ee=new EmployEntity();
		boolean flag=es.deleteEmploy(neId);
		if(flag){
			if(ee.getEmployIsPass()=="未审核"){
				return "unpass";
			}else{
				return "pass";
			}
		}else{
			return "fail";
		}
	}

}
