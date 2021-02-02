package com.example.SpringRestApi.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.SpringRestApi.Entities.BookDetails;
import com.example.SpringRestApi.Service.BookService;

@RestController
public class RestApiController {
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public ResponseEntity<List<BookDetails>> getAllBooks(){
	List<BookDetails> list=this.bookService.getAllBooks();
	if(list.isEmpty())
	{
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
	return ResponseEntity.of(Optional.of(list));
	}
	@GetMapping("/book/{id}")
	public BookDetails getBookById(@PathVariable("id") int id)
	{
		return bookService.getBookById(id);
	}
	
	@GetMapping("/course/{courseId}")
	public BookDetails getBookByCourseId(@PathVariable("courseId") int id)
	{
		return bookService.getBookByCourseId(id);
	}
//	
	@GetMapping("/courses/{courseName}")
	public List<BookDetails> getBookByCourseName(@PathVariable("courseName") String courseName)
	{
		return bookService.getBookByCourseName(courseName);
	} 
	@PostMapping("/book")
	public BookDetails addBooks(@RequestBody BookDetails book)
	{
		BookDetails b = this.bookService.addBooks(book);
		return b;
	}
	@DeleteMapping("/delete/{bookId}")
	public void deleteBook(@PathVariable("bookId") int id)
	{
		this.bookService.deleteBook(id);
	}
	
	@PutMapping("/update/{bookId}")
	public BookDetails updateBook(@RequestBody BookDetails bookDetails , @PathVariable("bookId") int bookId)
	{
		this.bookService.updateBookDetails(bookDetails, bookId);
		return bookDetails;
	}
}
 