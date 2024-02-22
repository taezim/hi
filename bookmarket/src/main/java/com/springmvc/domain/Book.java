package com.springmvc.domain;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.springmvc.validator.BookId;

public class Book implements Serializable
{
	@BookId
	
	private static final long serialVersionUID = -7715651009026349175L;
	
	@Pattern(regexp="ISBN[1-9]+", message="{Pattern.NewBook.bookId}")
	private String bookId;
	
	@Size(min=4, max=50, message="{Size.NewBook.name}")
	private String name;
	
	@Min(value=0, message="{Min.NewBook.unitPrice}")
	@Digits(integer=8, fraction=2, message="{Digits.NewBook.unitPrice}")
	@NotNull(message="{NotNull.NewBook.unitPrice}")
	private int unitPrice;
	private String author;
	private String description;
	private String publisher;
	private String category;
	private long unitsInStock;
	private String releaseDate;
	private String condition;
	private MultipartFile bookImage;
	//17장 도서 이미지 파일 이름 속성 추가
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	// 기본 생성자 생성
	public Book() {
		super();
	}
	
	// 일반 생성자
	public Book(String bookId, String name, int unitPrice) {
		super();
		this.bookId = bookId;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	//getter setter
	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public MultipartFile getBookImage() {
		return bookImage;
	}

	public void setBookImage(MultipartFile bookImage) {
		this.bookImage = bookImage;
	}
	
}

