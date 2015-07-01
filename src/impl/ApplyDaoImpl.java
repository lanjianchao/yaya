package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import domain.ApplyEntity;
import domain.NoteEntity;
import persistence.ApplyDao;
import persistence.DBUtil;

public class ApplyDaoImpl implements ApplyDao {

	@Override
	public boolean addApply(ApplyEntity at) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(addSQL);
			pstmt.setString(1,at.getApplyName());
			pstmt.setString(2, at.getApplyPhone());
			pstmt.setString(3, at.getApplyContent());
			pstmt.setString(4,at.getApplySex());
			pstmt.setString(5,at.getApplySchool());
			pstmt.setString(6,at.getApplyGrade());
			pstmt.setString(7,at.getApplySub());
			java.util.Date date = at.getApplyDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(8, tDate);
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
	public ApplyEntity queryApplyBycondition(int applyId) {
		ApplyEntity at=new ApplyEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryApply);
			pstmt.setInt(1, applyId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				at.setApplyId(rs.getInt(1));
				at.setApplyName(rs.getString(2));
				at.setApplyPhone(rs.getString(3));
				at.setApplyContent(rs.getString(4));
				at.setApplySex(rs.getString(5));
				at.setApplySchool(rs.getString(6));
				at.setApplyGrade(rs.getString(7));
				at.setApplySub(rs.getString(8));
				Date applyDate=rs.getDate(9);
				at.setApplyDate(applyDate);
				at.setApplyIsPass(rs.getString(10));
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
		return at;
	}

	@Override
	public boolean updatePass(int applyId) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateIsPass);
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
	public boolean updateUnPass(int applyId) {
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
	public boolean deleteNote(int applyId) {
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteApply);
			pstmt.setInt(1, applyId);
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
