package impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import domain.ActEntity;
import domain.MessageEntity;
import domain.NewsEntity;
import persistence.DBUtil;
import persistence.MesDao;

public class MesDaoImpl implements MesDao {

	@Override
	public boolean addMes(MessageEntity me) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con =DBUtil.con();
		try {
			PreparedStatement pstme=con.prepareStatement(addSQL);
			pstme.setString(1, me.getMesGrade());
			pstme.setString(2, me.getMesName());
			pstme.setString(3, me.getMesContent());
			java.util.Date date = me.getMesDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstme.setDate(4, tDate);
			pstme.setString(5, me.getMesWriter());
			int i =pstme.executeUpdate();
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
	public boolean deleteMes(int mesId) {
		// TODO Auto-generated method stub
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstme=con.prepareStatement(deleteSQL);
			pstme.setInt(1, mesId);
			int i=pstme.executeUpdate();
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
	public ArrayList<MessageEntity> queryAllMes() {
		// TODO Auto-generated method stub
		ArrayList<MessageEntity> list=new ArrayList<MessageEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstme = con.prepareStatement(selectSQL);
			ResultSet rs=pstme.executeQuery();
			while(rs.next()){
				MessageEntity me=new MessageEntity();
				me.setMesId(rs.getInt(1));
				me.setMesGrade(rs.getString(2));
				me.setMesName(rs.getString(3));
				me.setMesContent(rs.getString(4));
				java.util.Date MesDate=rs.getDate(5);
				me.setMesDate(MesDate);
				me.setMesIsPass(rs.getString(6));
				me.setMesWriter(rs.getString(7));
				list.add(me);
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
	public boolean updateMes(MessageEntity me) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstme=con.prepareStatement(updateSQL);
			pstme.setString(1, me.getMesGrade());
			pstme.setString(2, me.getMesName());
			pstme.setString(3, me.getMesContent());
			java.util.Date date = me.getMesDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstme.setDate(4, tDate);
			pstme.setString(5, me.getMesIsPass());
			pstme.setString(6, me.getMesWriter());
			pstme.setInt(7, me.getMesId());
			int i=pstme.executeUpdate();
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
	public boolean addBGMes(MessageEntity me) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con =DBUtil.con();
		try {
			PreparedStatement pstme=con.prepareStatement(addBGSQL);
			pstme.setString(1, me.getMesGrade());
			pstme.setString(2, me.getMesName());
			pstme.setString(3, me.getMesContent());
			java.util.Date date = me.getMesDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstme.setDate(4, tDate);
			pstme.setString(5, me.getMesIsPass());
			pstme.setString(6, me.getMesWriter());
			int i =pstme.executeUpdate();
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
	public MessageEntity queryMesBycondition(int mesId) {
		// TODO Auto-generated method stub
		MessageEntity me=new MessageEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryMesSQL);
			pstmt.setInt(1, mesId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				me.setMesId(rs.getInt(1));
				me.setMesGrade(rs.getString(2));
				me.setMesName(rs.getString(3));
				me.setMesContent(rs.getString(4));
				java.util.Date mesDate=rs.getDate(5);
				me.setMesDate(mesDate);
				me.setMesIsPass(rs.getString(6));
				me.setMesWriter(rs.getString(7));
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
		return me;
	}

	@Override
	public ArrayList<MessageEntity> goodMessage() {
		// TODO Auto-generated method stub
		ArrayList<MessageEntity> list=new ArrayList<MessageEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(goodMesSQL);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				MessageEntity mt=new MessageEntity();
				mt.setMesId(rs.getInt(1));
				mt.setMesGrade(rs.getString(2));
				mt.setMesName(rs.getString(3));
				mt.setMesContent(rs.getString(4));
				Date mesDate=rs.getDate(5);
				mt.setMesDate(mesDate);
				mt.setMesIsPass(rs.getString(6));
				mt.setMesWriter(rs.getString(7));
				list.add(mt);
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
}


