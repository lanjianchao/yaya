package action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import service.MesService;


import domain.MessageEntity;
import domain.NewsEntity;


public class MesAction extends ActionSupport implements SessionAware{
	private static final String SUCCESS = null;
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	MessageEntity me=new MessageEntity();
	MesService ms=new MesService();
	String mesId;
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public MessageEntity getMe() {
		return me;
	}
	public MesService getms() {
		return ms;
	}
	public String getMesId() {
		return mesId;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public void setMe(MessageEntity me) {
		this.me = me;
	}
	public void setms(MesService ms) {
		this.ms = ms;
	}
	public void setMesId(String mesId) {
		this.mesId = mesId;
	}
	
	public String addBGMes() throws Exception {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date mesDate=df.parse(df.format(new Date()));
		me.setMesDate(mesDate);
		System.out.println(me.getMesName()+"----"+me.getMesIsPass()+"------"+me.getMesGrade());
		boolean flag=ms.addBGMes(me);
		if(flag){
			if(me.getMesIsPass().equals("普通")){
				return "putong";
			}else if(me.getMesIsPass().equals("优秀")){
				return "youxiu";
			}else if(me.getMesIsPass().equals("获奖")){
				return "huojiang";
			}else{
				return"fabiao";
			}
			
		}else{
			return "fail";
		}
	}
	public String addMes()throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date mesDate=df.parse(df.format(new Date()));
		me.setMesDate(mesDate);
		boolean flag=ms.addMes(me);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String deleteMes()throws Exception{
		int meId=Integer.parseInt(mesId);
		MessageEntity m=ms.queryMesBycondition(meId);
		boolean flag=ms.deleteMes(meId);
		if(flag){
			if(m.getMesIsPass().equals("普通")){
				return "putong";
			}else if(m.getMesIsPass().equals("优秀")){
				return "youxiu";
			}else if(m.getMesIsPass().equals("获奖")){
				return "huojiang";
			}else if(m.getMesIsPass().equals("已发表")){
				return"fabiao";
			}else{
				return "weitongguo";
			}
		}else{
				return "fail";
		}
	}

	public String updateMes()throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date mesDate=df.parse(df.format(new Date()));
		me.setMesDate(mesDate);
		System.out.println(me.getMesId()+"  "+me.getMesGrade()+" "+me.getMesIsPass()+" "+me.getMesName());
		boolean flag=ms.updateMes(me);
		if(flag){
			if(me.getMesIsPass().equals("普通")){
				return "putong";
			}else if(me.getMesIsPass().equals("优秀")){
				return "youxiu";
			}else if(me.getMesIsPass().equals("获奖")){
				return "huojiang";
			}else if(me.getMesIsPass().equals("已发表")){
				return"fabiao";
			}else{
				return "weitongguo";
			}
		}else{
			return "fail";
		}
	}
	public String queryMes()throws Exception{
		int meId=Integer.parseInt(mesId);
		MessageEntity me=ms.queryMesBycondition(meId);
//			System.out.println(neId+"---------------"+ne.getNewsId()+"------"+ne.getNewsTheme()+"------"+ne.getNewsDate());
			session.put("me", me);
			return "bianji";
	}
	public String listMes()throws Exception{
		int meId=Integer.parseInt(mesId);
		MessageEntity me=ms.queryMesBycondition(meId);
		System.out.println(me.getMesIsPass());
			session.put("me", me);
			return "list";
	}
	
}
