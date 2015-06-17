package service;

import impl.ApplyDaoImpl;
import persistence.ApplyDao;
import domain.ApplyEntity;

public class ApplyService {
	ApplyDao ad=new ApplyDaoImpl();
	public boolean addApply(ApplyEntity at){
		return ad.addApply(at);
	}
	public ApplyEntity  queryApplyBycondition(int applyId){
		return ad.queryApplyBycondition(applyId);
	}
	public boolean updatePass(int applyId){
		return ad.updatePass(applyId);
	}
	public boolean updateUnPass(int applyId){
		return ad.updateUnPass(applyId);
	}
	boolean deleteNote(int applyId){
		return ad.deleteNote(applyId);
	}
}
