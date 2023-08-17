package com.tran.bookclub.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.tran.bookclub.models.Book;
import com.tran.bookclub.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;

	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}

	public List<Book> allBooks() {
		return bookRepo.findAll();
	}

	public Book createBook(Book book) {
		return bookRepo.save(book);
	}

	public Book singleBook(Long id) {
		Optional<Book> optBook = bookRepo.findById(id);
		if (optBook.isPresent()) {
			return optBook.get();
		} else {
			return null;
		}
	}

	public Book updateBook(Book book) {
		Optional<Book> optBook = bookRepo.findById(book.getId());
		if (optBook.isPresent()) {
			Book thisBook = optBook.get();

			thisBook.setTitle(book.getTitle());
			thisBook.setAuthor(book.getAuthor());
			thisBook.setThoughts(book.getThoughts());
			thisBook.setId(book.getId());

			return bookRepo.save(thisBook);
		} else {
			return null;
		}
	}
}
