package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import persistence.BookDao;
import persistence.DBUtil;

import domain.ActEntity;
import domain.BookEntity;

public class BookDaoImpl implements BookDao{

	

	public boolean updateBook(BookEntity bt)  throws Exception{
		
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateSQL);
			pstmt.setString(1, bt.getBookName());
			pstmt.setString(2, bt.getBookContent());
			pstmt.setString(3, bt.getBookPic());
			pstmt.setString(4, bt.getBookWriter());
			pstmt.setInt(5, bt.getBookId());
			int i=pstmt.executeUpdate();
			if(i>0){
				flag=true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return flag;
	}

	public ArrayList<BookEntity> queryAllBook()  throws Exception{
		
		ArrayList<BookEntity> list=new ArrayList<BookEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(selectSQL);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				BookEntity bt=new BookEntity();
				bt.setBookId(rs.getInt(1));
				bt.setBookName(rs.getString(2));
				bt.setBookContent(rs.getString(3));
				bt.setBookPic(rs.getString(4));
				bt.setBookWriter(rs.getString(5));
				list.add(bt);
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
		return list;
	}

	@Override
	public BookEntity queryBookBycondition(int bookId) {
		
		BookEntity be=new BookEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryAct);
			pstmt.setInt(1, bookId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				be.setBookId(rs.getInt(1));
				be.setBookName(rs.getString(2));
				be.setBookContent(rs.getString(3));	
				be.setBookPic(rs.getString(4));
				be.setBookWriter(rs.getString(5));
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
		return be;
	}

	
}
