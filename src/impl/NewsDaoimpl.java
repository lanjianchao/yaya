package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import domain.NewsEntity;
import persistence.DBUtil;
import persistence.NewsDao;

public class NewsDaoimpl implements NewsDao{

	@Override
	public boolean addNews(NewsEntity nt) {
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(addSQL);
			pstmt.setString(1, nt.getNewsTheme());
			pstmt.setString(2, nt.getNewsContent());
			java.util.Date date = nt.getNewsDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(3, tDate);
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
	public boolean deleteNews(int newsId) {
		boolean flag =false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(deleteSQL);
			pstmt.setInt(1, newsId);
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
	public ArrayList<NewsEntity> queryAllNews() {
		// TODO Auto-generated method stub
			ArrayList<NewsEntity> list=new ArrayList<NewsEntity>();
			Connection con = DBUtil.con();
			try {
				PreparedStatement pstmt = con.prepareStatement(selectSQL);
				ResultSet rs=pstmt.executeQuery();
				while(rs.next()){
					NewsEntity nt=new NewsEntity();
					nt.setNewsId(rs.getInt(1));
					nt.setNewsTheme(rs.getString(2));
					nt.setNewsContent(rs.getString(3));
					Date newsDate=rs.getDate(4);
					nt.setNewsDate(newsDate);
					list.add(nt);
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
	public boolean updateNews(NewsEntity nt) {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt=con.prepareStatement(updateSQL);
			pstmt.setString(1, nt.getNewsTheme());
			pstmt.setString(2, nt.getNewsContent());
			java.util.Date date = nt.getNewsDate();
			// util包时间转换为sql包时间
			java.sql.Date tDate = new java.sql.Date(date.getTime()); 
			pstmt.setDate(3, tDate);
			pstmt.setInt(4, nt.getNewsId());
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
	public NewsEntity queryNewsBycondition(int newsId) {
		// TODO Auto-generated method stub
		NewsEntity nt=new NewsEntity();
		Connection con=DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(queryNews);
			pstmt.setInt(1, newsId);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				nt.setNewsId(rs.getInt(1));
				nt.setNewsTheme(rs.getString(2));
				nt.setNewsContent(rs.getString(3));
				Date newsDate=rs.getDate(4);
				nt.setNewsDate(newsDate);
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
	public ArrayList<NewsEntity> indexQuery() {
		ArrayList<NewsEntity> list=new ArrayList<NewsEntity>();
		Connection con = DBUtil.con();
		try {
			PreparedStatement pstmt = con.prepareStatement(indexQuery);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				NewsEntity nt=new NewsEntity();
				nt.setNewsId(rs.getInt(1));
				nt.setNewsTheme(rs.getString(2));
				nt.setNewsContent(rs.getString(3));
				Date newsDate=rs.getDate(4);
				nt.setNewsDate(newsDate);
				list.add(nt);
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
