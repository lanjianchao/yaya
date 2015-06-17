package domain;

import java.util.Date;

public class NoteEntity {
	private int noteId;
	private String noteName;
	private String noteContent;
	private String noteMail;
	private String noteIsPass;
	private Date noteDate;
	public String getNoteIsPass() {
		return noteIsPass;
	}
	public void setNoteIsPass(String noteIsPass) {
		this.noteIsPass = noteIsPass;
	}
	public Date getNoteDate() {
		return noteDate;
	}
	public void setNoteDate(Date noteDate) {
		this.noteDate = noteDate;
	}
	public int getNoteId() {
		return noteId;
	}
	public String getNoteName() {
		return noteName;
	}
	public String getNoteContent() {
		return noteContent;
	}
	public String getNoteMail() {
		return noteMail;
	}
	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}
	public void setNoteMail(String noteMail) {
		this.noteMail = noteMail;
	}
}
