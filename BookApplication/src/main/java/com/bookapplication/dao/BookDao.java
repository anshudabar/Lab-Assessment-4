package com.bookapplication.dao;

public interface BookDao {
	public void addBook(Book book);
	public Book getBook(String isbn);
}
