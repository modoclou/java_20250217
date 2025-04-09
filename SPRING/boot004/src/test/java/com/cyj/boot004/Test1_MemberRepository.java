package com.cyj.boot004;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyj.boot004.member.Member;
import com.cyj.boot004.member.MemberRepository;

@SpringBootTest
class Test1_MemberRepository {
	@Autowired MemberRepository memberRepository;
	
	//insert, update, findById
	//select, findAll, findById
	//delete - delete
	
	@Disabled //@Test
	void insert() {
		Member member = new Member();
		member.setUsername("first");
		member.setPassword("1111");
		member.setEmail("first@gmail.com");
		memberRepository.save(member);
	}
	
	@Disabled //@Test
	void findAll() {
		List<Member> list = memberRepository.findAll();
		System.out.println(list);
	}
	
	@Disabled //@Test
	void findId() {
		System.out.println(memberRepository.findById(1L).get());
	}
	
	@Disabled //@Test
	void findUsername() {
		System.out.println(memberRepository.findByUsername("first").get());
	}
	
	@Disabled //@Test
	void update() {
		Member member = memberRepository.findById(1L).get();
		member.setUsername("second");
		//member.setPassword("2222");
		//member.setEmail("second@gmail.com");
		memberRepository.save(member);		
	}
	
	@Disabled //@Test
	void updatePassword() {
		memberRepository.updateByIdAndPassword("1234", "1111", 1L);
	}
	
	@Disabled //@Test
	void delete() {
		Member member = memberRepository.findById(1L).get();
		memberRepository.delete(member);
	}
}
