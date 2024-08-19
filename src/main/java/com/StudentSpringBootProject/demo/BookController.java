package com.StudentSpringBootProject.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController {
	
	@Autowired
	public BookService service;
	
	@GetMapping("/availablebooks")
	public List<Books> getAllBooks()
	{
		return service.getAllBooks();
	}
	
	@GetMapping("/books/{bookId}")
	public Books getBooksById(@PathVariable int bookId)
	{
		return service.getBookById(bookId);
	}
	
	@PostMapping("/addbook")
	public void addBooks(@RequestBody Books book)
	{
		System.out.println(book.toString());
		service.addBook(book);
	}
	
	@PutMapping("/updatebook")
	public void updateBooks(@RequestBody Books book)
	{
		service.updateBook(book);
	}
	
	@DeleteMapping("/deletebook/{bookId}")
	public void deleteBooks(@PathVariable int bookId)
	{
		service.deleteBook(bookId);
	}
	
}
