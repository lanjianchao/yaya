package action;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.BookService;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.BookEntity;
import domain.NewsEntity;

public class BookAction extends ActionSupport implements SessionAware{
	
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	BookEntity be=new BookEntity();
	BookService bs=new BookService();
	String bookId;
	ArrayList <BookEntity> beList=new ArrayList<BookEntity>();
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public String getBookId() {
		return bookId;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public BookEntity getBe() {
		return be;
	}
	public BookService getBs() {
		return bs;
	}
	public void setBe(BookEntity be) {
		this.be = be;
	}
	public void setBs(BookService bs) {
		this.bs = bs;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String execute() throws Exception {
		beList=bs.queryAllBook();
		if(beList != null){
			session.put("beList", beList);
			return SUCCESS;
		}else{
			return "fail";
		}
	}
		
		public String queryBycondition()throws Exception{
			int beId=Integer.parseInt(bookId);
			BookEntity be=bs.queryBookBycondition(beId);
			session.put("be", be);
			return SUCCESS;
		}
		public String listBook()throws Exception{
			int beId=Integer.parseInt(bookId);
			BookEntity be=bs.queryBookBycondition(beId);
			session.put("be", be);
			return "list";
		}
		public String update()throws Exception{
			boolean flag=bs.updateBook(be);
			if(flag){
				return SUCCESS;
			}else{
				return "fail";
			}
		}
	public ArrayList<BookEntity> getBeList() {
		return beList;
	}
	public void setBeList(ArrayList<BookEntity> beList) {
		this.beList = beList;
	}
	
	

}
