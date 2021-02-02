package com.example.SpringRestApi.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="BookManagement")
public class BookDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private int courseId;
	private String bookName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	
	private String courseName;

	
	public BookDetails(int bookId, int courseId, String bookName, Author author, String courseName) {
		super();
		this.bookId = bookId;
		this.courseId = courseId;
		this.bookName = bookName;
		this.author = author;
		this.courseName = courseName;
	}

	public BookDetails() {
		super();
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public Author getAuthor() {
		return author;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	

	@Override
	public String toString() {
		return "BookDetails [bookId=" + bookId + ", courseId=" + courseId + ", bookName=" + bookName + ", author="
				+ author + ", courseName=" + courseName + "]";
	}

	
}
