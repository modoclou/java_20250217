package com.cyj.boot4.board;

import java.util.List;

public interface BoardService {
	public List<Board> findAll();			//전체 리스트 뽑기
	public Board find(Long id);				//bhit 1 up / show detail
	
	public void insert(Board board);		//글쓰기 기능
	public Board update_view(Long id);		//수정하기 폼
	public void update(Board board);		//글 수정 기능
	
	public void delete(Board board);		//글삭제 기능
}
