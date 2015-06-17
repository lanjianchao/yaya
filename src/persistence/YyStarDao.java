package persistence;

import java.util.ArrayList;

import domain.NewsEntity;
import domain.YyStarEntity;

public interface YyStarDao {
	
	String addSQL="insert into yyStar(yyName,yyContent,yyPic,yyType) values(?,?,?,?)";
	String deleteSQL="delete from yyStar where yyId=?";
	String selectSQL="select * from yyStar order by yyId dessc";
	String  updateSQL="update yyStar set yyName=?,yyContent=?,yyPic=?,yyType=? where yyId=?";
	String queryStarSQL="select * from yyStar where yyId=?";
	
	boolean addYyStar(YyStarEntity ye) throws Exception;
	boolean deleteYyStar(int yyId) throws Exception;
	ArrayList<YyStarEntity> queryAllYyStar() throws Exception;
	boolean updateYyStar(YyStarEntity yt) throws Exception;
	YyStarEntity queryYystarBycondition(int yyId);

}
