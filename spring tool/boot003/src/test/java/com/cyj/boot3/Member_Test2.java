package com.cyj.boot3;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Hibernate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyj.boot3.member.Member;
import com.cyj.boot3.member.MemberRepository;

@SpringBootTest
public class Member_Test2 {
	@Autowired MemberRepository memberRepository;
		
	@Transactional
	@Test
	public void selectAll() {
		List<Member> list = memberRepository.findAll();
		for(Member m:list) { 
			System.out.println(m);
		Hibernate.initialize(m.getBoard());	
		}
		System.out.println(list.get(0).getName());
	}
}
