package com.bookstore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore.dto.MyBookList;
import com.bookstore.repository.MyBookRepository;
@Service
public class MyBookListService {
@Autowired
MyBookRepository mybookrepository;

	public void saveMyBooks(MyBookList book) {
		mybookrepository.save(book);
	}
	public List<MyBookList> getAllMyBooks(){
		return mybookrepository.findAll();
	}
}
