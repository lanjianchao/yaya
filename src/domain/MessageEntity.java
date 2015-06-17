package domain;

import java.util.Date;

public class MessageEntity {
	private int mesId;
	private String mesGrade;
	private String mesName;
	private String mesContent;
	private Date mesDate;
	private String mesIsPass;
	private String mesWriter;
	public String getMesGrade() {
		return mesGrade;
	}
	public void setMesGrade(String mesGrade) {
		this.mesGrade = mesGrade;
	}
	public int getMesId() {
		return mesId;
	}
	public String getMesName() {
		return mesName;
	}
	public String getMesContent() {
		return mesContent;
	}
	public Date getMesDate() {
		return mesDate;
	}
	public String getMesIsPass() {
		return mesIsPass;
	}
	public String getMesWriter() {
		return mesWriter;
	}
	public void setMesId(int mesId) {
		this.mesId = mesId;
	}
	public void setMesName(String mesName) {
		this.mesName = mesName;
	}
	public void setMesContent(String mesContent) {
		this.mesContent = mesContent;
	}
	public void setMesDate(Date mesDate) {
		this.mesDate = mesDate;
	}
	public void setMesIsPass(String mesIsPass) {
		this.mesIsPass = mesIsPass;
	}
	public void setMesWriter(String mesWriter) {
		this.mesWriter = mesWriter;
	}
}
