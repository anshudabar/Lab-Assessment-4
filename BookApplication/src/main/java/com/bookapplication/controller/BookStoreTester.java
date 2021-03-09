package com.bookapplication.controller;

import java.util.ArrayList;
import java.util.List;

import com.bookapplication.dao.Book;
import com.bookapplication.dao.Chapter;
import com.bookapplication.dao.Publisher;
import com.bookapplication.service.BookStoreService;

public class BookStoreTester {
	public static void main(String[] args) {
		BookStoreService bookStoreService = new BookStoreService();

		Publisher publisher = new Publisher("MANN", "Manning Publications Co.");

		Book book = new Book("9781617290459", "Java Persistence with Hibernate, Second Edition", publisher);

		List<Chapter> chapters = new ArrayList<Chapter>();
		Chapter chapter1 = new Chapter("Introducing JPA and Hibernate", 1);
		chapters.add(chapter1);
		Chapter chapter2 = new Chapter("Domain Models and Metadata", 2);
		chapters.add(chapter2);

		book.setChapters(chapters);

		bookStoreService.persistObjectGraph(book);


	}
}




