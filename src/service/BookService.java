package service;

import java.util.ArrayList;

import domain.BookEntity;
import impl.BookDaoImpl;
import persistence.BookDao;

public class BookService {
	BookDao bd=new BookDaoImpl();
	public ArrayList<BookEntity> queryAllBook() throws Exception{
		return bd.queryAllBook();
	}
	
	public boolean updateBook(BookEntity bt)  throws Exception{
		return bd.updateBook(bt);
	}
	public BookEntity queryBookBycondition(int bookId) {
		return bd.queryBookBycondition(bookId);
	}
}
