package com.example.SpringRestApi.BookRepository;

import java.util.List;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Component;

import com.example.SpringRestApi.Entities.BookDetails;
@ComponentScan
public interface BookRepository extends CrudRepository<BookDetails, Integer>{
	
	public BookDetails findById(int id);
	
	public BookDetails findByCourseId(int id);

	@Query(value="select * from book_management a where a.course_name= :n " , nativeQuery=true )
	public List<BookDetails> findByCourseName(@Param("n") String courseName);

}
