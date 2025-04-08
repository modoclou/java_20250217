package com.cyj.boot3.member;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.cyj.boot3.board.Board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity	@Getter @Setter @ToString(exclude = "board")
public class Member {
	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private int age;
	
	@Column(updatable=false)
	private LocalDateTime createDate = LocalDateTime.now();
	
	//유저(Member:One)는 많은 글(Many:board)을 쓸 수 있다.
	//@OneToMany(mappedBy="member", fetch = FetchType.EAGER)
	@OneToMany(mappedBy="member" )
	List<Board> board = new ArrayList<>();
}