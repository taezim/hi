package com.springmvc.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvc.domain.Book;
import com.springmvc.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	//autoinjection하는 것임 자동 객체 생성함
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAllBookList() {
		// TODO Auto-generated method stub
		return bookRepository.getAllBookList();
	}

	@Override
	public List<Book> getBookListByCategory(String category) {
		List<Book> booksByCategory = bookRepository.getBookListByCategory(category);
		return booksByCategory;
	}

	@Override
	public Set<Book> getBookListByFilter(Map<String, List<String>> filter) {
		Set<Book> booksByFilter = bookRepository.getBookListByFilter(filter);
		return booksByFilter;
	}

	@Override
	public Book getBookById(String bookId) {
		Book bookById = bookRepository.getBookById(bookId);
		return bookById;
	}

	@Override
	public void setNewBook(Book book) {
		bookRepository.setNewBook(book);
		
	}

	@Override
	public void setUpdateBook(Book book) {
		bookRepository.setUpdateBook(book);
		
	}

	@Override
	public void setDeleteBook(String bookId) {
		bookRepository.setDeleteBook(bookId);
		
	}

}
