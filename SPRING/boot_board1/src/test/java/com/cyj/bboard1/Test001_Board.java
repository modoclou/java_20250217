package com.cyj.bboard1;

import java.net.InetAddress;
import java.rmi.*;
import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyj.bboard1_board.Board;
import com.cyj.bboard1_board.BoardRepository;
import com.cyj.boot3.member.Member;

@SpringBootTest
public class Test001_Board {
	@Autowired BoardRepository boardRepository;
//	@Autowired MemberRepository memberRepository;
	
	@Test
	public void insertBoard() {
		for(i=0; i<=130; i++) {
		Member member = new Member();
		member.setUsername("test");
		Board board = new Board();
		board.setBtitle("title-paging");
		board.setBcontent("content-paging");
		board.setBpass("1111");
		board.setBfile("2.jpg");
		try {
			board.setBip(InetAddress.getLocalHost().getHostAddress());
		} catch (Exception e) { e.printStackTrace(); }
		board.setMember(member);
		boardRepository.save(board);
		}
	}
	
	@Disabled @Test
	public void findAllBoard() {
		List<Board> list = boardRepository.findAll();
		System.out.println(list.get(0).getBtitle());
	}
}
