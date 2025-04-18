package com.gunr.bookdata;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Book {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;			//아이디
	
	@Column(length = 200)
	private String title;		//제목
	
	@Column(columnDefinition="text")
	private String link;		//링크
	private String image;		//표지 이미지
	private String author;		//저자명
	private double discount;	//가격 X
	private String publisher;	//출판사
	private String pubdate;		//출간일자
	private String isbn;		//ISBN
	
	@Column(columnDefinition="text")
	private String description;	//책 소개
	
	@Transient
	private String search;
}
