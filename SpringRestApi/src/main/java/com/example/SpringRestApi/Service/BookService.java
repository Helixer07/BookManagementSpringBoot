package com.example.SpringRestApi.Service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.SpringRestApi.BookRepository.BookRepository;
import com.example.SpringRestApi.Entities.BookDetails;
@Component 
public class BookService {
	 @Autowired
	private BookRepository bookRepository;
//	private static List<BookDetails> list= new ArrayList<>();
//	
//	static {
////		list.add(new BookDetails(01,1001, "Java In Advance", "XYZ","ComputerScience"));
////		list.add(new BookDetails(02,1002, "Think In Java", "YZQ","ComputerScience"));
////		list.add(new BookDetails(03,1003, "ThermoDynamic", "ABC","Mechinical"));
////		list.add(new BookDetails(04,1004, "Robotics", "MNO","Electronics"));
//	}
	
	public List<BookDetails> getAllBooks()
	{
		List<BookDetails>  list= (List<BookDetails>)this.bookRepository.findAll();
		return list;
	}
	
	public BookDetails getBookById(int id)
	{
	BookDetails book =  null;
	 book = this.bookRepository.findById(id);
	 return book;
	//book= list.stream().filter(e->e.getBookId()==id).findFirst().get();
	
	}
	
	
	public BookDetails getBookByCourseId(int id)
	{
	BookDetails book =  null;
	book= this.bookRepository.findByCourseId(id);
	return book;
	//book= list.stream().filter(e->e.getCourseId()==id).findFirst().get();
	
	}
//	
//	
	public List<BookDetails> getBookByCourseName(String courseName)
	{
		
		List<BookDetails> book =(List<BookDetails>)this.bookRepository.findByCourseName(courseName);
		return  book;
	//BookDetails book= list.stream().filter(e->courseName.equals(e.getCourseName())).findFirst().get();
	
	}
	
	public BookDetails addBooks(BookDetails b)
	{
		this.bookRepository.save(b);
		return b;
	}

	public void deleteBook(int bookId)
	{
		bookRepository.deleteById(bookId);
		
	//	list=list.stream().filter(e->e.getBookId()!=bookId).collect(Collectors.toList());
	
//		list.stream().filter(e->{
//			if(e.getBookId()!=bookId)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		}).collect(Collectors.toList());
	}
	
	public void updateBookDetails(BookDetails bookDetails , int bookId)
	{
		
		bookDetails.setBookId(bookId);
		this.bookRepository.save(bookDetails);
		
//		list.stream().map(e->{
//			if(e.getBookId()==bookId)
//			{
//				e.setBookName(bookDetails.getBookName());
//				e.setAuthorName(bookDetails.getAuthorName());
//				e.setCourseId(bookDetails.getCourseId());
//				e.setCourseName(bookDetails.getCourseName());
//			}
//			return e;
//		}).collect(Collectors.toList());
	}
}
