package persistence;

import java.util.ArrayList;

import domain.ActEntity;
import domain.NewsEntity;
public interface ActDao {
	String addSQL="insert into ActTable(actTheme,actContent,actDate,actPic1) values(?,?,?,?)";
	String deleteSQL="delete from ActTable where actId=?";
	String selectSQL="select * from ActTable order by actId desc";
	String  updateSQL="update ActTable set actTheme=?,actContent=?,actDate=?,actPic1=? where actId=?";
	String queryAct="select * from ActTable where actId=?";
	String indexQuery="select * from ActTable order by actId desc limit 5";
	boolean addAct(ActEntity at);
	boolean deleteAct(int actId);
	ArrayList<ActEntity> queryAllAct();
	boolean updateAct(ActEntity  at);
	ActEntity queryActBycondition(int actId);
	ArrayList<ActEntity>indexQuery();
}
