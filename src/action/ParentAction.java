package action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.ParentService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.ParentEntity;

public class ParentAction extends ActionSupport implements SessionAware{
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	ParentEntity pe =new ParentEntity();
	ParentService ps= new ParentService();
	String parentId;
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public ParentEntity getPe() {
		return pe;
	}
	public ParentService getPs() {
		return ps;
	}
	public String getParentId() {
		return parentId;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public void setPe(ParentEntity pe) {
		this.pe = pe;
	}
	public void setPs(ParentService ps) {
		this.ps = ps;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public String execute() throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date parentDate=df.parse(df.format(new Date()));
		pe.setParentDate(parentDate);
		boolean flag=ps.addParent(pe);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	
}
