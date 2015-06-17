package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import persistence.DBUtil;
import persistence.YyStarDao;
import domain.NewsEntity;
import domain.YyStarEntity;

public class YyStarDaoImpl implements YyStarDao {

	public boolean addYyStar(YyStarEntity ye) throws Exception{
		boolean flag=false;
	Connection con=DBUtil.con();
	try {
		PreparedStatement pstmt=con.prepareStatement(addSQL);
		pstmt.setString(1, ye.getYyName());
		pstmt.setString(2, ye.getYyContent());
		pstmt.setString(3,  ye.getYyPic());
		pstmt.setString(4, ye.getYyType());
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

	public boolean deleteYyStar(int yyId) throws Exception{
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteSQL);
			pstmt.setInt(1, yyId);
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

	public ArrayList<YyStarEntity> queryAllYyStar() throws Exception{
		ArrayList<YyStarEntity> list=new ArrayList<YyStarEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(selectSQL);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				YyStarEntity yt=new YyStarEntity();
				yt.setYyId(rs.getInt(1));
				yt.setYyName(rs.getString(2));
				yt.setYyContent(rs.getString(3));
				yt.setYyPic(rs.getString(4));
				yt.setYyType(rs.getString(5));
				list.add(yt);
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
	return list;
	}

	public boolean updateYyStar(YyStarEntity yt) throws Exception{
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateSQL);
			pstmt.setString(1, yt.getYyName());
			pstmt.setString(2, yt.getYyContent());
			pstmt.setString(3, yt.getYyPic());
			pstmt.setString(4, yt.getYyType());
			pstmt.setInt(5, yt.getYyId());
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

	public YyStarEntity  queryYystarBycondition(int yyId) {
		YyStarEntity ye=new YyStarEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryStarSQL);
			pstmt.setInt(1, yyId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				ye.setYyId(rs.getInt(1));
				ye.setYyName(rs.getString(2));
				ye.setYyContent(rs.getString(3));
				ye.setYyPic(rs.getString(4));
				ye.setYyType(rs.getString(5));}
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
		return ye;
	}

}
