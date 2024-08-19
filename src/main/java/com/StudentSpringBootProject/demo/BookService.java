package com.StudentSpringBootProject.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	public BooksRepo repo;
	
	public List<Books> getAllBooks()
	{
		return repo.findAll();
	}

	public Books getBookById(int bookId) 
	{
		return repo.findById(bookId).orElse(new Books());
	}

	public void addBook(Books book)
	{
		repo.save(book);
	}

	public void updateBook(Books book) 
	{
		repo.save(book);
	}

	public void deleteBook(int bookId)
	{
		repo.deleteById(bookId);
	}

	
}
