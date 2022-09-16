package com.graphql.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.graphql.graphql.entity.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> {

}
