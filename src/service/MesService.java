package service;

import java.util.ArrayList;

import domain.MessageEntity;
import impl.MesDaoImpl;
import persistence.MesDao;

public class MesService {
	 MesDao md =new MesDaoImpl();
		public boolean addMes(MessageEntity mt){
			return md.addMes(mt);
		}
		public boolean addBGMes(MessageEntity mt){
			return md.addBGMes(mt);
		}
		public boolean deleteMes(int mesId){
			return md.deleteMes(mesId);
		}
		public ArrayList<MessageEntity> queryAllMes(){
			return md.queryAllMes();
		}
		public boolean updateMes(MessageEntity mt){
			return md.updateMes(mt);
		}
		public MessageEntity queryMesBycondition(int mesId){
			return md.queryMesBycondition(mesId);
		}
		public ArrayList<MessageEntity> goodMessage(){
			return md.goodMessage();
		}
}
