package persistence;

import domain.ApplyEntity;

public interface ApplyDao {
	String addSQL="insert into Apply(applyName,applyPhone,applyContent,applySex,applySchool,applyGrade,applySub,applyDate,applyIsPass) values(?,?,?,?,?,?,?,?,'未审核')";
	String queryApply="select * from Apply where applyId=?";
	String updateIsPass="update Apply set applyIsPass='审核'";
	String updateUnPass="update Apply set applyIsPass='未审核'";
	String deleteApply="delete from Apply where applyId=?";
	boolean addApply(ApplyEntity at);
	ApplyEntity  queryApplyBycondition(int applyId);
	boolean updatePass(int applyId);
	boolean updateUnPass(int applyId);
	boolean deleteNote(int applyId);
}
