package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dto.Book;
import com.bookstore.repository.BookRepository;

@Service
public class BookService {
	@Autowired BookRepository bookrepository;
	public void save(Book book) {
		bookrepository.save(book);
	}
	public List<Book> getAllBook(){
		return bookrepository.findAll();
	}
	public Book getBookById(int id) {
		return bookrepository.findById(id).get();
	}
	public void deleteBookById(int id) {
		bookrepository.deleteById(id);
	}
}
