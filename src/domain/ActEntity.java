package domain;

import java.util.Date;

public class ActEntity {
	private int actId;
	private String actTheme;
	private String actContent;
	private Date actDate;
	private String actPic1;
	public int getActId() {
		return actId;
	}
	public String getActTheme() {
		return actTheme;
	}
	public String getActContent() {
		return actContent;
	}
	public Date getActDate() {
		return actDate;
	}
	public String getActPic1() {
		return actPic1;
	}
	public void setActId(int actId) {
		this.actId = actId;
	}
	public void setActTheme(String actTheme) {
		this.actTheme = actTheme;
	}
	public void setActContent(String actContent) {
		this.actContent = actContent;
	}
	public void setActDate(Date actDate) {
		this.actDate = actDate;
	}
	public void setActPic1(String actPic1) {
		this.actPic1 = actPic1;
	}
	
}
