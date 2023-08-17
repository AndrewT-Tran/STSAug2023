package com.tran.bookclub.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tran.bookclub.models.Book;

@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
	@Override
	List<Book> findAll();
}
