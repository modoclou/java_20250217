package com.cyj.bboard1_board;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {
	@Autowired	BoardRepository	boardRepository;	//##

	@Override public List<Board> findAll() { return boardRepository.findAll(); }
	
//	public List<Board> findAll();			//전체 리스트 뽑기
//	public Board find(Long id);				//bhit 1 up / show detail
//	
//	public void insert(Board board);		//글쓰기 기능
//	public void update_view(Long id);		//수정하기 폼
//	public void update(Board board);		//글 수정 기능
//	
//	public void delete(Board board);		//글삭제 기능

	@Transactional	//commit(반영하기) / rollback(되돌리기)
	@Override public Board find(Long id) {	//조회수 올리고 / 상세 보기 기능
		Board board = boardRepository.findById(id).get();
		board.setBhit(board.getBhit()+1);	//기존조회수 + 1
		boardRepository.save(board);
		return board;
		}

	@Override public void insert(Board board) {
		try { board.setBip(InetAddress.getLocalHost().getHostAddress()); }
		catch (UnknownHostException e) { e.printStackTrace(); }
		boardRepository.save(board);
	}

	@Override public Board update_view(Long id) {
		return boardRepository.findById(id).get();
	}

	@Override public void update(Board board) {
		boardRepository.save(board);
	}

	@Override public void delete(Board board) {
		boardRepository.delete(board);
	}
}
