package service;

import java.util.ArrayList;

import domain.ParentEntity;
import impl.ParentDaoImpl;
import persistence.ParentDao;

public class ParentService {
	ParentDao pd =new ParentDaoImpl();
	public boolean addParent(ParentEntity pe){
		return pd.addParent(pe);
	}
	public boolean deleteParent(int parentId){
		return pd.deleteParent(parentId);
	}
	public ArrayList<ParentEntity> queryAllParent(){
		return pd.queryAllParent();
	}
	public boolean updateParent(ParentEntity pe){
		return pd.updateParent(pe);
	}
	public ParentEntity queryParentBycondition(int parentId){
		return pd.queryParentBycondition(parentId);
	}
	public ArrayList<ParentEntity>indexQuery(){
		return pd.indexQuery();
	}
}
