package com.springmvc.exception;

@SuppressWarnings("serial")
public class BookIdException extends RuntimeException{
	
	private String bookId;

	public String getBookId() {
		return bookId;
	}

	public BookIdException(String bookId) {
		this.bookId = bookId;
	}
	
	
	
}
