package service;

import impl.NoteDaoImpl;
import persistence.NoteDao;
import domain.NoteEntity;

public class NoteService {
	NoteEntity nt=new NoteEntity();
	NoteDao nd=new NoteDaoImpl();
	public boolean addNote(NoteEntity nt){
		return nd.addNote(nt);
	}
	public NoteEntity queryNoteBycondition(int noteId){
		return nd.queryNoteBycondition(noteId);
	}
	public boolean updatePass(int noteId){
		return nd.updatePass(noteId);
	}
	public boolean updateUnPass(int noteId){
		return nd.updateUnPass(noteId);
	}
	public boolean deleteNote(int noteId){
		return nd.deleteNote(noteId);
	}
}
