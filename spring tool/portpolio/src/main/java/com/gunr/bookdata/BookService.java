package com.gunr.bookdata;

import java.util.List;

public interface BookService {
	public List<Book> findAll();		//전체책데이터조회
	public Book findTitle(String title);		//제목으로 책 찾기
	public Book findAuthor(String author);		//저자명으로 책 찾기
	
	public void insert(Book book);
	public void delete(Book book);
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
*/