package service;

import impl.EmployDaoImpl;
import persistence.EmployDao;
import domain.EmployEntity;

public class EmployService {
	EmployDao ed=new EmployDaoImpl();
	public boolean addEmploy(EmployEntity  et){
		return ed.addEmploy(et);
	}
	public EmployEntity  queryEmployBycondition(int employId){
		return ed.queryEmployBycondition(employId);
	}
	public boolean updatePass(int employId){
		return ed.updatePass(employId);
	}
	public boolean updateUnPass(int employId){
		return ed.updateUnPass(employId);
	}
	public boolean deleteEmploy(int employId){
		return ed.deleteEmploy(employId);
	}
}
