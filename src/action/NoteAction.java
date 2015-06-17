package action;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import service.NewsService;
import service.NoteService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.NoteEntity;

public class NoteAction extends ActionSupport implements SessionAware{
	ActionContext context=ActionContext.getContext();
	Map session=context.getSession();
	NoteEntity ne=new NoteEntity();
	NoteService  ns=new NoteService();
	String noteId;
	public ActionContext getContext() {
		return context;
	}
	public Map getSession() {
		return session;
	}
	public NoteEntity getNe() {
		return ne;
	}
	public NoteService getNs() {
		return ns;
	}
	public String getNoteId() {
		return noteId;
	}
	public void setContext(ActionContext context) {
		this.context = context;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public void setNe(NoteEntity ne) {
		this.ne = ne;
	}
	public void setNs(NoteService ns) {
		this.ns = ns;
	}
	public void setNoteId(String noteId) {
		this.noteId = noteId;
	}
	public String execute()throws Exception{
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date noteDate=df.parse(df.format(new Date()));
		ne.setNoteDate(noteDate);
		boolean flag=ns.addNote(ne);
		if(flag){
			return SUCCESS;
		}else{
			return "fail";
		}
	}
	public String queryNote()throws Exception{
		int neId=Integer.parseInt(noteId);
		NoteEntity ne=new NoteEntity();
		ne=ns.queryNoteBycondition(neId);
		session.put("ne", ne);
		return SUCCESS;
	}
	public String updatePass()throws Exception{
		int neId=Integer.parseInt(noteId);
		boolean flag=ns.updatePass(neId);
		if(flag){
			return SUCCESS;
			
		}else{
			return "fail";
		}
	}
	public String updateUnPass()throws Exception{
		int neId=Integer.parseInt(noteId);
		boolean flag=ns.updateUnPass(neId);
		if(flag){
			return SUCCESS;
			
		}else{
			return "fail";
		}
	}
	public String deleteNote()throws Exception{
		int neId=Integer.parseInt(noteId);
		NoteEntity ne=new NoteEntity();
		boolean flag=ns.deleteNote(neId);
		if(flag){
			if(ne.getNoteIsPass()=="未审核"){
				return "unpass";
			}else{
				return "pass";
			}
		}else{
			return "fail";
		}
	}
}
