package com.cyj.bboard1_board;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;

public interface BoardService {
	@Autowired BoardRepository boardRepository;
	
	public List<Board> findAll();			//전체 리스트 뽑기
	public Board find(Long id);				//bhit 1 up / show detail
	
	public void insert(Board board);		//글쓰기 기능
	public Board update_view(Long id);		//수정하기 폼
	public void update(Board board);		//글 수정 기능
	
	public void delete(Board board);		//글삭제 기능
	
	/* BOARD */
	/* BOARD */
	//1: 최신글 10 			order by bno desc limit 0, 10	0번째부터 10개
	//2: 그 다음 최신글 10 	order by cno desc limit 10, 10	10번째부터 10개
	public Page<Board> getPaging(int page){
		List<Sort.Order> sorts = new ArrayList()<>();
		sorts.add(Sort.Order.desc("id"));
		
		return boardRepository.findAll(Pageable);
	}
	
	/* BOARD */
	/* BOARD */
	//public List<Board> findAll(){//전체리스트뽑고
		//return boardRepository.findAll();
		
//	}
}
