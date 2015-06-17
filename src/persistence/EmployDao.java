package persistence;

import domain.EmployEntity;

public interface EmployDao {
	String addSQL="insert into employ(employName,employPhone,employContent,employSex,employGrade,employSub,employIsPass,employDate) values(?,?,?,?,?,?,'未审核',?)";
	String queryEmploy="select * from employ where employId=?";
	String updateIsPass="update employ set employIsPass='审核' where employId=?";
	String updateUnPass="update employ set employIsPass='未审核' where employId=?";
	String deleteEmploy="delete from employ where employId=?";
	boolean addEmploy(EmployEntity  et);
	EmployEntity  queryEmployBycondition(int employId);
	boolean updatePass(int employId);
	boolean updateUnPass(int employId);
	boolean deleteEmploy(int employId);
}
