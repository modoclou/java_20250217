package com.cyj.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyj.boot001.myjpa.Member;
import com.cyj.boot001.myjpa.MemberRepository;
import com.cyj.boot001.myjpa.Team;
import com.cyj.boot001.myjpa.TeamRepository;


@SpringBootTest
class Boot002_Members {

	@Autowired MemberRepository memberRepository;
	// teamRepoditory - save (insert, update) / delete-(delete)
	// teamRepoditory.findAll() select / teamRepoditory.findById select
	
	//Q2. findAll 유저들 출력 select = findAll, findById
	@Disabled //@Test
	public void selectAll() {
		List<Member> list = memberRepository.findAll();
		for(Member m:list) {System.out.println(m);}
		System.out.println(list.get(0).getName());
	}
	//Q3. update 이용해서 유저 번호가 1L인 데이터값 수정
	@Disabled //@Test
	public void update() {
		Optional<Member> member_find = memberRepository.findById(1L);
		if(member_find.isPresent()) { //유저가 있다면
			Member member = member_find.get(); //유저 꺼내오기
			member.setName("one");
			member.setAge(1);
			//member.setTeam(null); team값 설정하지 않으면 기존에 있었던 값이 들어가 있다
			memberRepository.save(member);
		}
	}
	
	//Q4. delete 이용해서 1L 유저 삭제
	@Test
	public void delete() {
		Optional<Member> member_find = memberRepository.findById(1L);
		if(member_find.isPresent()) { //유저가 있다면
			Member member = member_find.get(); //유저 꺼내오기
			memberRepository.delete(member);
		}
	}
	//delete from member where id=?
}
