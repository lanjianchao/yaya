package service;

import impl.YyStarDaoImpl;

import java.util.ArrayList;

import persistence.YyStarDao;
import domain.YyStarEntity;

public class YyStarService {
	
	YyStarDao yd=new YyStarDaoImpl();
	
	public boolean addYyStar(YyStarEntity ye) throws Exception{
		return yd.addYyStar(ye);
	}
	public boolean deleteYyStar(int yyId) throws Exception{
		return yd.deleteYyStar(yyId);
	}
	public ArrayList<YyStarEntity> queryAllYyStar() throws Exception{
		return yd.queryAllYyStar();
	}
	public boolean updateYyStar(YyStarEntity yt) throws Exception{
		return yd.updateYyStar(yt);
	}
	public YyStarEntity queryYystarBycondition(int yyId){
		return yd.queryYystarBycondition(yyId);
	}

}
