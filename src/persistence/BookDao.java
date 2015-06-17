package persistence;

import java.util.ArrayList;

import domain.ActEntity;
import domain.BookEntity;

public interface BookDao {
	
	
	String selectSQL="select * from book";
	String  updateSQL="update book set bookName=?,bookContent=?,bookPic=?,bookWriter=? where bookId=?";
	String queryAct="select * from book where bookId=?";
	
	public ArrayList<BookEntity> queryAllBook() throws Exception;
	
	public boolean updateBook(BookEntity bt)  throws Exception;
	 BookEntity queryBookBycondition(int bookId);

}
