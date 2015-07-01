package impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


import domain.NewsEntity;
import domain.ParentEntity;
import persistence.DBUtil;
import persistence.ParentDao;

public class ParentDaoImpl implements ParentDao{

	@Override
	public boolean addParent(ParentEntity pe) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(addSQL);
			pstmt.setString(1, pe.getParentTheme());
			pstmt.setString(2, pe.getParentContent());
			java.util.Date date = pe.getParentDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime());
			pstmt.setDate(3, tDate);
			pstmt.setString(4, pe.getParentName());
			int i=pstmt.executeUpdate();
			if(i>0){
				return true;
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
		return false;
		
	}

	@Override
	public boolean deleteParent(int parentId) {
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteSQL);
			pstmt.setInt(1, parentId);
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
	public ArrayList<ParentEntity> queryAllParent() {
		ArrayList<ParentEntity> list=new ArrayList<ParentEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(selectSQL);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				ParentEntity pe=new ParentEntity();
				pe.setParentId(rs.getInt(1));
				pe.setParentTheme(rs.getString(2));
				pe.setParentContent(rs.getString(3));
				Date parentDate=rs.getDate(4);
				pe.setParentDate(parentDate);
				pe.setParentName(rs.getString(5));
				list.add(pe);
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
	public boolean updateParent(ParentEntity pe) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateSQL);
			pstmt.setString(1, pe.getParentTheme());
			pstmt.setString(2, pe.getParentContent());
			java.util.Date date = pe.getParentDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(3, tDate);
			pstmt.setString(4, pe.getParentName());
			pstmt.setInt(5, pe.getParentId());
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
	public ParentEntity queryParentBycondition(int parentId) {
		ParentEntity pe=new ParentEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryParent);
			pstmt.setInt(1, parentId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				pe.setParentId(rs.getInt(1));
				pe.setParentTheme(rs.getString(2));
				pe.setParentContent(rs.getString(3));
				Date parentDate=rs.getDate(4);
				pe.setParentName(rs.getString(5));
				pe.setParentDate(parentDate);
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
		return pe;
	}

	@Override
	public ArrayList<ParentEntity> indexQuery() {
		ArrayList<ParentEntity> list=new ArrayList<ParentEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(indexQuery);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				ParentEntity pe=new ParentEntity();
				pe.setParentId(rs.getInt(1));
				pe.setParentTheme(rs.getString(2));
				pe.setParentContent(rs.getString(3));
				Date parentDate=rs.getDate(4);
				pe.setParentDate(parentDate);
				pe.setParentName(rs.getString(5));
				list.add(pe);
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
	return list;
	}

}
