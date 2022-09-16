package com.graphql.graphql.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.graphql.entity.Book;
import com.graphql.graphql.service.BookService;

import lombok.Getter;
import lombok.Setter;


@Controller
public class BookController {
	
	@Autowired
	private BookService bookservice;
	// create
	
	@MutationMapping("createBook")
	public Book created(@Argument BookInput book) {
		Book b1=new Book();
		b1.setTitle(book.getTitle());
		b1.setAuthor(book.getAuthor());
		b1.setDesc(book.getAuthor());
		b1.setPages(book.getPages());
		b1.setPrice(book.getPrice());
		return bookservice.create(b1);
	}
	// get all
	@QueryMapping("allBooks")
	public List<Book> getAll(){
		return bookservice.getAll();
	}
	// get single book
	@QueryMapping("getBook")
	public Book geSingleData(@Argument int  bookId) {
		return bookservice.get(bookId);
	}
	
}
@Setter
@Getter
class BookInput{
	private String title;
	private String desc;
	private String author;
	private double price;
	private int pages;
}
