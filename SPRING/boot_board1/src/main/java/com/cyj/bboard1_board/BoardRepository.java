package com.cyj.bboard1_board;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
	//JpaRepository<Member, Long>	테이블 pk의 자료형
}
