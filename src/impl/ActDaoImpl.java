package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import domain.ActEntity;
import domain.NewsEntity;
import persistence.ActDao;
import persistence.DBUtil;

public class ActDaoImpl implements ActDao{

	@Override
	public boolean addAct(ActEntity at) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(addSQL);
			pstmt.setString(1, at.getActTheme());
			pstmt.setString(2, at.getActContent());
			java.util.Date date = at.getActDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(3, tDate);
			pstmt.setString(4, at.getActPic1());
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
	public boolean deleteAct(int actId) {
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteSQL);
			pstmt.setInt(1, actId);
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
	public ArrayList<ActEntity> queryAllAct() {
		ArrayList<ActEntity> list=new ArrayList<ActEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(selectSQL);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				ActEntity at=new ActEntity();
				at.setActId(rs.getInt(1));
				at.setActTheme(rs.getString(2));
				at.setActContent(rs.getString(3));
				Date ActDate=rs.getDate(4);
				at.setActDate(ActDate);
				at.setActPic1(rs.getString(5));
				list.add(at);
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

	@Override
	public boolean updateAct(ActEntity at) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateSQL);
			pstmt.setString(1, at.getActTheme());
			pstmt.setString(2, at.getActContent());
			java.util.Date date = at.getActDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(3, tDate);
			pstmt.setString(4, at.getActPic1());
			pstmt.setInt(5, at.getActId());
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
	public ActEntity queryActBycondition(int actId) {
		ActEntity ae=new ActEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryAct);
			pstmt.setInt(1, actId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				ae.setActId(rs.getInt(1));
				ae.setActTheme(rs.getString(2));
				ae.setActContent(rs.getString(3));
				Date actDate=rs.getDate(4);
				ae.setActDate(actDate);
				ae.setActPic1(rs.getString(5));
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
		return ae;
	}

	@Override
	public ArrayList<ActEntity> indexQuery() {
		ArrayList<ActEntity> list=new ArrayList<ActEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(selectSQL);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				ActEntity at=new ActEntity();
				at.setActId(rs.getInt(1));
				at.setActTheme(rs.getString(2));
				at.setActContent(rs.getString(3));
				Date ActDate=rs.getDate(4);
				at.setActDate(ActDate);
				at.setActPic1(rs.getString(5));
				list.add(at);
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
