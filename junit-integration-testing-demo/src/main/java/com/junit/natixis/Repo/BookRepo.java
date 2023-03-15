package com.junit.natixis.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.junit.natixis.model.Book;

public interface BookRepo extends JpaRepository<Book, Integer>{

	List<Book> findByAuthor(String author);
	
}
