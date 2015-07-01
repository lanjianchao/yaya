package action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.ActService;
import service.MesService;
import service.NewsService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.ActEntity;
import domain.MessageEntity;
import domain.NewsEntity;

public class upAction  extends ActionSupport implements SessionAware{
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	NewsEntity ne=new NewsEntity();
	NewsService ns=new NewsService();
	ActEntity ae=new ActEntity();
	ActService as=new ActService();
	MessageEntity me=new MessageEntity();
	MesService ms=new MesService();
	String actId;
	String newsId;
	String mesId;
	public String getMesId() {
		return mesId;
	}
	public void setMesId(String mesId) {
		this.mesId = mesId;
	}
	public MessageEntity getMe() {
		return me;
	}
	public MesService getMs() {
		return ms;
	}
	public void setMe(MessageEntity me) {
		this.me = me;
	}
	public void setMs(MesService ms) {
		this.ms = ms;
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
	public void setAe(ActEntity ae) {
		this.ae = ae;
	}
	public void setAs(ActService as) {
		this.as = as;
	}
	public void setActId(String actId) {
		this.actId = actId;
	}

	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public NewsEntity getNe() {
		return ne;
	}
	public NewsService getNs() {
		return ns;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public void setNe(NewsEntity ne) {
		this.ne = ne;
	}
	public void setNs(NewsService ns) {
		this.ns = ns;
	}
	public String upQuery(){
		int neId=Integer.parseInt(newsId);
		NewsEntity ne=ns.queryNewsBycondition(neId);
			session.put("ne", ne);
			return SUCCESS;
	}
	public String upActQuery(){
		int aeId=Integer.parseInt(actId);
		ActEntity ae=as.queryActBycondition(aeId);
			session.put("ae", ae);
			return SUCCESS;
	}
	public String upMesQuery(){
		int meId=Integer.parseInt(mesId);
		MessageEntity me=ms.queryMesBycondition(meId);
		session.put("me", me);
		return SUCCESS;
	}
	public String indexQuery()throws Exception{
		ArrayList<NewsEntity>neList=ns.indexQuery();
		session.put("index", neList);
		ArrayList<ActEntity>aeList=as.indexQuery();
		session.put("actIndex", aeList);
		ArrayList<MessageEntity>meList=ms.goodMessage();
		session.put("mesIndex", meList);
		return SUCCESS;
	}
}
