package service;

import java.util.ArrayList;

import persistence.ActDao;

import domain.ActEntity;
import impl.ActDaoImpl;

public class ActService {
	ActDao ad=new ActDaoImpl();
	public boolean addAct(ActEntity at){
		return ad.addAct(at);
	}
	public boolean deleteAct(int actId){
		return ad.deleteAct(actId);
	}
	public ArrayList<ActEntity> queryAllAct(){
		return ad.queryAllAct();
	}
	public boolean updateAct(ActEntity  at){
		return ad.updateAct(at);
	}
	public ActEntity queryActBycondition(int actId){
		return ad.queryActBycondition(actId);
	}
	public ArrayList<ActEntity> indexQuery(){
		return ad.indexQuery();
	}
}
