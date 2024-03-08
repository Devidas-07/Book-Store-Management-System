package com.bookstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bookstore.repository.MyBookRepository;

@Controller
public class MyBookListController {
	@Autowired
	MyBookRepository repo;
	@RequestMapping("/delete-my-booklist/{id}")
	public String deleteMyBook(@PathVariable("id")int id) {
		repo.deleteById(id);
		return "redirect:/my_books";
	}
}
