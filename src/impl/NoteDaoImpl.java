package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import domain.NewsEntity;
import domain.NoteEntity;
import persistence.DBUtil;
import persistence.NewsDao;
import persistence.NoteDao;

public class NoteDaoImpl implements NoteDao{

	@Override
	public boolean addNote(NoteEntity nt) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(addSQL);
			pstmt.setString(1,nt.getNoteName());
			pstmt.setString(2, nt.getNoteContent());
			pstmt.setString(3, nt.getNoteMail());
			java.util.Date date = nt.getNoteDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(4, tDate);
			int i=pstmt.executeUpdate();
			if(i>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public NoteEntity queryNoteBycondition(int noteId) {
		// TODO Auto-generated method stub
		NoteEntity nt=new NoteEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryNote);
			pstmt.setInt(1, noteId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				nt.setNoteId(rs.getInt(1));
				nt.setNoteName(rs.getString(2));
				nt.setNoteContent(rs.getString(3));
				nt.setNoteMail(rs.getString(4));
				nt.setNoteIsPass(rs.getString(5));
				Date newsDate=rs.getDate(6);
				nt.setNoteDate(newsDate);
			}
			rs.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return nt;
	}

	@Override
	public boolean updatePass(int noteId) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateIsPass);
			pstmt.setInt(1, noteId);
			int i=pstmt.executeUpdate();
			if(i>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean updateUnPass(int noteId) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateUnPass);
			int i=pstmt.executeUpdate();
			if(i>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return flag;
	}

	@Override
	public boolean deleteNote(int noteId) {
		// TODO Auto-generated method stub
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteNote);
			pstmt.setInt(1, noteId);
			int i=pstmt.executeUpdate();
			if(i>0){
				flag=true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return flag;
	}

}
