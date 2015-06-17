package action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.NewsService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

import domain.ActEntity;
import domain.NewsEntity;

public class NewsAction  extends ActionSupport implements SessionAware{
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	NewsEntity ne=new NewsEntity();
	NewsService ns=new NewsService();
	String newsId;
	public String getNewsId() {
		return newsId;
	}
	public void setNewsId(String newsId) {
		this.newsId = newsId;
	}
	@Override
	public void setSession(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		this.session = session;
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
	public void setNe(NewsEntity ne) {
		this.ne = ne;
	}
	public void setNs(NewsService ns) {
		this.ns = ns;
	}
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date newsDate=df.parse(df.format(new Date()));
		ne.setNewsDate(newsDate);
		boolean flag=ns.addNews(ne);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String query()throws Exception{
		ArrayList<NewsEntity>neList=ns.queryAllNews();
		System.out.println(neList.get(0).getNewsDate()+"------------------------");
		session.put("List", neList);
		return SUCCESS;
	}
	public String queryBycondition()throws Exception{
		int neId=Integer.parseInt(newsId);
	NewsEntity ne=ns.queryNewsBycondition(neId);
//		System.out.println(neId+"---------------"+ne.getNewsId()+"------"+ne.getNewsTheme()+"------"+ne.getNewsDate());
		session.put("ne", ne);
		return SUCCESS;
	}
	public String update()throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date newsDate=df.parse(df.format(new Date()));
		ne.setNewsDate(newsDate);
		//System.out.println(ne.getNewsId()+"                "+ne.getNewsTheme()+"             "+ne.getNewsContent()+"                    "+ne.getNewsDate());
		boolean flag=ns.updateNews(ne);
		System.out.println(flag);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String delete()throws Exception{
		int neId=Integer.parseInt(newsId);
		boolean flag=ns.deleteNews(neId);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String list()throws Exception{
		int neId=Integer.parseInt(newsId);
	NewsEntity ne=ns.queryNewsBycondition(neId);
		System.out.println(neId+"---------------"+ne.getNewsId()+"------"+ne.getNewsTheme()+"------"+ne.getNewsDate());
		session.put("ne", ne);
		return "list";
	}


}
