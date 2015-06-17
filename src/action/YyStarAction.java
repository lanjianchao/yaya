package action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import service.YyStarService;
import domain.YyStarEntity;

public class YyStarAction extends ActionSupport implements SessionAware{
	
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	YyStarEntity ye = new YyStarEntity();
	YyStarService ys = new YyStarService();
	String yyId;
	public ActionContext getContext() {
		return context;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public Map getSession() {
		return session;
	}
	
	public YyStarEntity getYe() {
		return ye;
	}
	public void setYe(YyStarEntity ye) {
		this.ye = ye;
	}
	public YyStarService getYs() {
		return ys;
	}
	public void setYs(YyStarService ys) {
		this.ys = ys;
	}
	public String getYyId() {
		return yyId;
	}
	public void setYyId(String yyId) {
		this.yyId = yyId;
	}
	public void setSession(Map<String, Object> arg0) {
		this.session = session;
	}
	
	public String add() throws Exception {
		boolean flag=ys.addYyStar(ye);
		String type=ye.getYyType();
		if(flag){
			if(type=="作文"){
				return "zuowen";
			}else{
				return "math";
			}
			
		}else{
			return "fail";
		}
	}
	
	public String query()throws Exception{
		ArrayList<YyStarEntity> yyList=ys.queryAllYyStar();
		session.put("List", yyList);
		return SUCCESS;
	}
	public String queryBycondition()throws Exception{
		int yId=Integer.parseInt(yyId);
		YyStarEntity ye=ys.queryYystarBycondition(yId);
		session.put("ye", ye);
		return SUCCESS;
	}
	public String update()throws Exception{
		boolean flag=ys.updateYyStar(ye);
		String type=ye.getYyType();
		
		if(flag){
			if(type.equals("作文")){	
				return "zuowen";
			}else{
				System.out.println(type);
				return "math";
			}
			
		}else{
			return "fail";
		}
	}
	public String deleteMes()throws Exception{
		int yId=Integer.parseInt(yyId);
		System.out.println(yId);
		YyStarEntity y=ys.queryYystarBycondition(yId);
		boolean flag=ys.deleteYyStar(yId);
		if(flag){
			if(y.getYyType().equals("作文")){
				return "zuowen";
			}else{
				return "math";
			}			
		}else{
			return "fail";
		}
	}

}
