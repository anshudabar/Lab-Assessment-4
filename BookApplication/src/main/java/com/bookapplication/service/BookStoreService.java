package com.bookapplication.service;

import com.bookapplication.dao.Book;
import com.bookapplication.dao.BookDao;
import com.bookapplication.dao.BookDaoImpl;

public class BookStoreService {
	
	private BookDao bookDao;

	public BookStoreService() {
		this.bookDao = new BookDaoImpl();
	}

	public void persistObjectGraph(Book book) {
		
		bookDao.addBook(book);
	}

	public Book retrieveObjectGraph(String isbn) {

		return bookDao.getBook(isbn);
	}

}
