package domain;

import java.util.Date;

public class EmployEntity {
	int employId;
	String employName;
	String employPhone;
	String employContent;
	String employSex;
	String employGrade;
	String employSub;
	String employIsPass;
	Date employDate;
	public int getEmployId() {
		return employId;
	}
	public String getEmployName() {
		return employName;
	}
	public String getEmployPhone() {
		return employPhone;
	}
	public String getEmployContent() {
		return employContent;
	}
	public String getEmploySex() {
		return employSex;
	}
	public String getEmployGrade() {
		return employGrade;
	}
	public String getEmploySub() {
		return employSub;
	}
	public String getEmployIsPass() {
		return employIsPass;
	}
	public Date getEmployDate() {
		return employDate;
	}
	public void setEmployId(int employId) {
		this.employId = employId;
	}
	public void setEmployName(String employName) {
		this.employName = employName;
	}
	public void setEmployPhone(String employPhone) {
		this.employPhone = employPhone;
	}
	public void setEmployContent(String employContent) {
		this.employContent = employContent;
	}
	public void setEmploySex(String employSex) {
		this.employSex = employSex;
	}
	public void setEmployGrade(String employGrade) {
		this.employGrade = employGrade;
	}
	public void setEmploySub(String employSub) {
		this.employSub = employSub;
	}
	public void setEmployIsPass(String employIsPass) {
		this.employIsPass = employIsPass;
	}
	public void setEmployDate(Date employDate) {
		this.employDate = employDate;
	}
}
