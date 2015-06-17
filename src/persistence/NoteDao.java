package persistence;

import domain.NewsEntity;
import domain.NoteEntity;

public interface NoteDao {
	String addSQL="insert into Note(noteName,noteContent,noteMail,noteIsPass,noteDate) values(?,?,?,'未审核',?)";
	String queryNote="select * from Note where noteId=?";
	String updateIsPass="update Note set noteIsPass='审核' where noteyId=?";
	String updateUnPass="update Note set noteIsPass='未审核' where noteId=?";
	String deleteNote="delete from Note where noteId=?";
	boolean addNote(NoteEntity nt);
	NoteEntity  queryNoteBycondition(int noteId);
	boolean updatePass(int noteId);
	boolean updateUnPass(int noteId);
	boolean deleteNote(int noteId);
}
