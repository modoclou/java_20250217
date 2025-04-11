package com.cyj.bboard1_board;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Setter;
import lombok.Getter;

@Entity @Getter @Setter
public class Board {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(length=200)
	private String btitle;
	
	@Column(columnDefinition="text")
	private String bcontent;
	
	private String bfile;
	private String bip;
	private String bpass;
	private Long bhit=0L;
}
