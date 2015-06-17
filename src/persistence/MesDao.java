package persistence;

import java.util.ArrayList;

import domain.MessageEntity;

public interface MesDao {
	String goodMesSQL="select * from Message where mesIsPass='优秀' order by mesId desc limit 5";
	String addSQL="insert into Message(mesGrade,mesName,mesContent,mesDate,mesIsPass,mesWriter) values(?,?,?,?,?,'未审核',?)";
	String addBGSQL="insert into Message(mesGrade,mesName,mesContent,mesDate,mesIsPass,mesWriter) values(?,?,?,?,?,?)";
	String deleteSQL="delete from Message where mesId=?";
	String selectSQL="select * from Message order by mesId desc";
	String  updateSQL="update Message set mesGrade=?,mesName=?,mesContent=?,mesDate=?,mesIsPass=?,mesWriter=? where mesId=?";
	String queryMesSQL="select * from Message where mesId=?";
	boolean addMes(MessageEntity me);
	boolean addBGMes(MessageEntity me);
	boolean deleteMes(int mesId);
	ArrayList<MessageEntity> queryAllMes();
	boolean updateMes(MessageEntity mt);
	MessageEntity queryMesBycondition(int mesId);
	ArrayList<MessageEntity>  goodMessage();

}
