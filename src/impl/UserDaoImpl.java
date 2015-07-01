package impl;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import domain.UserEntity;
import persistence.DBUtil;
import persistence.UserDao;
import sun.applet.Main;

public class UserDaoImpl implements UserDao{

	@Override
	public UserEntity loginUser(String userId, String password) {
		UserEntity se = null;
		Connection con =DBUtil.con();
		PreparedStatement pstmt;
		try {
			pstmt = con.prepareStatement(loginUserSQL);
			pstmt.setString(1, userId);
			pstmt.setString(2,password);
			ResultSet rs =pstmt.executeQuery();
			if(rs.next()){
				se = new UserEntity();
				se.setUserId(rs.getString(1));
				se.setUserPassword(rs.getString(2));
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
		return se;
	}
}
