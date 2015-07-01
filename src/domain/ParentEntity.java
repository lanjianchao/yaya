package domain;

import java.util.Date;

public class ParentEntity {
	private int parentId;
	private String parentTheme;
	private String parentContent;
	private Date parentDate;
	private String parentName;
	public int getParentId() {
		return parentId;
	}
	public String getParentTheme() {
		return parentTheme;
	}
	public String getParentContent() {
		return parentContent;
	}
	public Date getParentDate() {
		return parentDate;
	}
	public String getParentName() {
		return parentName;
	}
	public void setParentId(int parentId) {
		this.parentId = parentId;
	}
	public void setParentTheme(String parentTheme) {
		this.parentTheme = parentTheme;
	}
	public void setParentContent(String parentContent) {
		this.parentContent = parentContent;
	}
	public void setParentDate(Date parentDate) {
		this.parentDate = parentDate;
	}
	public void setParentName(String parentName) {
		this.parentName = parentName;
	}
}
