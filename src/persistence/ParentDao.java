package persistence;

import java.util.ArrayList;

import domain.ParentEntity;


public interface ParentDao {
	String addSQL="insert into parent(parentTheme,parentContent,parentDate,parentName) values(?,?,?,?)";
	String deleteSQL="delete from parent where parentId=?";
	String selectSQL="select * from parent order by parentId desc";
	String  updateSQL="update parent set parentTheme=?,parentContent=?,parentDate=?,parentName=?  where parentId=?";
	String queryParent="select * from parent where parentId=?";
	String indexQuery="select * from parent order by parentId desc limit 5";
	boolean addParent(ParentEntity pe);
	boolean deleteParent(int parentId);
	ArrayList<ParentEntity> queryAllParent();
	boolean updateParent(ParentEntity pe);
	ParentEntity queryParentBycondition(int parentId);
	ArrayList<ParentEntity>indexQuery();
}
