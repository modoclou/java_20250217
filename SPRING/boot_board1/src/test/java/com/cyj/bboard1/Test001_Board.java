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

@SpringBootTest
public class Test001_Board {
	@Autowired BoardRepository boardRepository;
//	@Autowired MemberRepository memberRepository;
	
	@Test
	public void insertBoard() {
		Board board = new Board();
		board.setBtitle("title-2");
		board.setBcontent("content-2");
		board.setBpass("1111");
		board.setBfile("2.jpg");
		try {
			board.setBip(InetAddress.getLocalHost().getHostAddress());
		} catch (Exception e) { e.printStackTrace(); }
		
		boardRepository.save(board);
	}
	
	@Disabled @Test
	public void findAllBoard() {
		List<Board> list = boardRepository.findAll();
		System.out.println(list.get(0).getBtitle());
	}
}
