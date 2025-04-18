package com.gunr.bookdata;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

public class BookServiceImpl implements BookService{
	@Autowired BookRepository bookRepository;
	
	@Override
	public List<Book> findAll() {
		return bookRepository.findAll();
	}

	@Transactional
	@Override
	public Book findTitle(String title) {
		//HashMap<자료형,자료형> map = new HashMap<>();
		Book book = bookRepository./*whatmap...*/(title);
		return book;
	}

	@Transactional
	@Override
	public Book findAuthor(String author) {
		Book book = new Book();
		return book;
	}

	@Override
	public void insert(Book book) {
		book.getTitle();
		bookRepository.save(book);
	}

	@Override public void delete(Book book) {
		bookRepository.delete(book);
	}
}
/*
**create** 책 데이터 등록
insert into bookdata (title, link, image, author, discount, publisher, pubdate, isbn, description) values (?, ?, ?, ?, ?, ?, ?, ?, ?)

**read** 전체 책 데이터 확인, 상세 데이터 확인
전체 데이터 확인만 할 때 - select * from bookdata

특정 제목의 책들을 조회할 때 - select * from bookdata where title=?
select * from bookdata where title=? and publisher=?

**delete** 책 데이터 삭제
delete from bookdata where title=? and publisher=?

X

**read** 전체 책 데이터 확인, 상세 데이터 확인
특정 제목의 책들을 조회할 때 - select * from bookdata where title=? and publisher=?

X

X
 */