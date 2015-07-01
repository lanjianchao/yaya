package action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.ApplyService;
import service.NoteService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.ApplyEntity;
import domain.NoteEntity;

public class ApplyAction extends ActionSupport implements SessionAware{
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	ApplyEntity ae=new ApplyEntity();
	ApplyService  as=new ApplyService();
	String applyId;
	String applySub[];
	public ApplyEntity getAe() {
		return ae;
	}
	public ApplyService getAs() {
		return as;
	}
	public String[] getApplySub() {
		return applySub;
	}
	public void setAe(ApplyEntity ae) {
		this.ae = ae;
	}
	public void setAs(ApplyService as) {
		this.as = as;
	}
	public void setApplySub(String[] applySub) {
		this.applySub = applySub;
	}
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public String getApplyId() {
		return applyId;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public void setNe(ApplyEntity ae) {
		this.ae = ae;
	}
	public void setNs(ApplyService as) {
		this.as = as;
	}
	public void setApplyId(String applyId) {
		this.applyId = applyId;
	}
	
	public String execute()throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date applyDate=df.parse(df.format(new Date()));
		ae.setApplyDate(applyDate);
		StringBuffer str=new StringBuffer();
		for(int i=0;i<applySub.length;i++){
			str.append(applySub[i]+" ");
		}
		ae.setApplySub(str.toString());
		boolean flag=as.addApply(ae);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	
	public String queryApply()throws Exception{
		int neId=Integer.parseInt(applyId);
		ApplyEntity ne=new ApplyEntity();
		ae=as.queryApplyBycondition(neId);
		session.put("ae", ae);
		return SUCCESS;
	}
	public String updatePass()throws Exception{
		int neId=Integer.parseInt(applyId);
		boolean flag=as.updatePass(neId);
		if(flag){
			return SUCCESS;
			
		}else{
			return "fail";
		}
	}
	public String updateUnPass()throws Exception{
		int neId=Integer.parseInt(applyId);
		boolean flag=as.updateUnPass(neId);
		if(flag){
			return SUCCESS;
			
		}else{
			return "fail";
		}
	}
	public String deleteApply()throws Exception{
		int neId=Integer.parseInt(applyId);
		ApplyEntity ae=new ApplyEntity();
		boolean flag=as.updateUnPass(neId);
		if(flag){
			if(ae.getApplyIsPass()=="未审核"){
				return "unpass";
			}else{
				return "pass";
			}
		}else{
			return "fail";
		}
	}
}
