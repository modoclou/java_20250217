package com.cyj.boot3;

import java.net.InetAddress;
import java.rmi.UnknownHostException;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyj.boot3.board.Board;
import com.cyj.boot3.board.BoardRepository;
import com.cyj.boot3.member.Member;
import com.cyj.boot3.member.MemberRepository;

@SpringBootTest
public class Board_Test2 {
	@Autowired BoardRepository boardRepository;
	@Autowired MemberRepository memberRepository;
	
	
	//@Disabled //@Test
	//@Test
	public void insertMember() {
		Member member = new Member();
		member.setName("second");
		member.setAge(22);
		memberRepository.save(member);	//## insert, update - save
	}
	
	//유저(OneToMany:mappedby="member")는 많은 글(ManyToOne)을 쓸 수 있다.
	@Test
	public void insertBoard() {	
		Member member = new Member();	
		member.setId(1L); //있는 유저번호: 1L, 2L / 없는 번호: 3L
		Board board = new Board();
		board.setBtitle("title-1");
		board.setBcontent("content-1");
		board.setBpass("1111");
		board.setBfile("1.jpg");
		try {
		board.setBip(InetAddress.getLocalHost().getHostAddress());
		} catch (Exception e) {e.printStackTrace();}
		board.setMember(member);
		boardRepository.save(board);
	}
	
	//select * from board;
	@Disabled //@Test
	public void findAllBoard() {
		List<Board> list = boardRepository.findAll();
		System.out.println(list.get(0).getBtitle());
	}
	
	//editview / detail
	//select * from board where id=?;
	@Disabled //@Test
	public void findByIdBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			System.out.println(board.getBtitle());
		}
	}//find - select / save - insert,update / delete-delete
	
	//update board set btitle=?, bcontent=?, bfile=?, where id=?
	@Disabled //@Test
	public void updateBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
			Board board = findBoard.get();
			board.setBtitle("title-new");
			board.setBcontent("content-new");
			boardRepository.save(board);
		}
	}
	
	//delete from board where id=?
	@Disabled //@Test
	public void deleteBoard() {
		Optional<Board> findBoard = boardRepository.findById(2L);
		if(findBoard.isPresent()) {
		Board board = findBoard.get();
		boardRepository.delete(board);
		}
	}
}
