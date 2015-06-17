package service;

import java.util.ArrayList;

import domain.NewsEntity;
import persistence.NewsDao;
import impl.NewsDaoimpl;

public class NewsService {
	NewsDao ne=new NewsDaoimpl();
	public boolean addNews(NewsEntity nt){
		return ne.addNews(nt);
	}
	public boolean deleteNews(int newsId){
		return ne.deleteNews(newsId);
	}
	public ArrayList<NewsEntity> queryAllNews(){
		return ne.queryAllNews();
	}
	public boolean updateNews(NewsEntity nt){
		return ne.updateNews(nt);
	}
	public NewsEntity queryNewsBycondition(int newsId){
		return ne.queryNewsBycondition(newsId);
	}
	public ArrayList<NewsEntity> indexQuery(){
		return ne.indexQuery();
	}
}
