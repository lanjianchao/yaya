package domain;

import java.util.Date;

public class ApplyEntity {
	int applyId;
	String applyName;
	String applyPhone;
	String applyContent;
	String applySex;
	String applySchool;
	String applyGrade;
	String applySub;
	Date applyDate;
	String applyIsPass;
	public String getApplyIsPass() {
		return applyIsPass;
	}
	public void setApplyIsPass(String applyIsPass) {
		this.applyIsPass = applyIsPass;
	}
	public int getApplyId() {
		return applyId;
	}
	public String getApplyName() {
		return applyName;
	}
	public String getApplyPhone() {
		return applyPhone;
	}
	public String getApplyContent() {
		return applyContent;
	}
	public String getApplySex() {
		return applySex;
	}
	public String getApplySchool() {
		return applySchool;
	}
	public String getApplyGrade() {
		return applyGrade;
	}
	public String getApplySub() {
		return applySub;
	}
	public Date getApplyDate() {
		return applyDate;
	}
	public void setApplyId(int applyId) {
		this.applyId = applyId;
	}
	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}
	public void setApplyPhone(String applyPhone) {
		this.applyPhone = applyPhone;
	}
	public void setApplyContent(String applyContent) {
		this.applyContent = applyContent;
	}
	public void setApplySex(String applySex) {
		this.applySex = applySex;
	}
	public void setApplySchool(String applySchool) {
		this.applySchool = applySchool;
	}
	public void setApplyGrade(String applyGrade) {
		this.applyGrade = applyGrade;
	}
	public void setApplySub(String applySub) {
		this.applySub = applySub;
	}
	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}
}
