package com.graphql.graphql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.graphql.entity.Book;
import com.graphql.graphql.service.BookService;

@SpringBootApplication
public class GraphqlApplication implements CommandLineRunner {
	
	@Autowired
	private BookService bookService;
	
	public static void main(String[] args) {
		SpringApplication.run(GraphqlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1= new Book();
		b1.setTitle("java");
		b1.setDesc("this is first book");
		b1.setPrice(1000);
		b1.setPages(100);
		b1.setAuthor("xyz");
		
		Book b2= new Book();
		b2.setTitle("javaScript");
		b2.setDesc("this is javaScript book");
		b2.setPrice(2000);
		b2.setPages(200);
		b2.setAuthor("abc");
		
		Book b3= new Book();
		b3.setTitle("php");
		b3.setDesc("this is php book");
		b3.setPrice(3000);
		b3.setPages(300);
		b3.setAuthor("pqrs");
		this.bookService.create(b1);
		this.bookService.create(b2);
		this.bookService.create(b3);
	}
	

}
