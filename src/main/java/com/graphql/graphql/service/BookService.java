package com.graphql.graphql.service;

import java.util.List;

import com.graphql.graphql.entity.Book;

public interface BookService {

	// create 
	Book create(Book book);
	
	//getAll
	List<Book> getAll();
	
	// get single book 
	Book get(int bookId);
	
}
