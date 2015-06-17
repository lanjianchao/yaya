package persistence;

import java.util.ArrayList;

import domain.NewsEntity;


public interface NewsDao {
	String addSQL="insert into News(newsTheme,newsContent,newsDate) values(?,?,?)";
	String deleteSQL="delete from News where newsId=?";
	String selectSQL="select * from News order by newsId desc";
	String  updateSQL="update News set newsTheme=?,newsContent=?,newsDate=?  where newsId=?";
	String queryNews="select * from News where newsId=?";
	String indexQuery="select * from News order by newsId desc limit 5";
	boolean addNews(NewsEntity nt);
	boolean deleteNews(int newsId);
	ArrayList<NewsEntity> queryAllNews();
	boolean updateNews(NewsEntity nt);
	NewsEntity queryNewsBycondition(int newsId);
	ArrayList<NewsEntity>indexQuery();
}
