package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import domain.EmployEntity;
import domain.NoteEntity;
import persistence.DBUtil;
import persistence.EmployDao;

public class EmployDaoImpl implements EmployDao {

	@Override
	public boolean addEmploy(EmployEntity et) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(addSQL);
			pstmt.setString(1,et.getEmployName());
			pstmt.setString(2, et.getEmployPhone());
			pstmt.setString(3, et.getEmployContent());
			pstmt.setString(4, et.getEmploySex());
			pstmt.setString(5, et.getEmployGrade());
			pstmt.setString(6, et.getEmploySub());
			java.util.Date date = et.getEmployDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(7, tDate);
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
	public EmployEntity queryEmployBycondition(int employId) {
		EmployEntity et=new EmployEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryEmploy);
			pstmt.setInt(1,employId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				et.setEmployId(rs.getInt(1));
				et.setEmployName(rs.getString(2));
				et.setEmployPhone(rs.getString(3));
				et.setEmployContent(rs.getString(4));
				et.setEmploySex(rs.getString(5));
				et.setEmployGrade(rs.getString(6));
				et.setEmploySub(rs.getString(7));
				et.setEmployIsPass(rs.getString(8));
				Date employDate=rs.getDate(9);
				et.setEmployDate(employDate);
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
		return et;
	}

	@Override
	public boolean updatePass(int employId) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateIsPass);
			pstmt.setInt(1, employId);
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
	public boolean updateUnPass(int employId) {
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
	public boolean deleteEmploy(int employId) {
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteEmploy);
			pstmt.setInt(1, employId);
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
