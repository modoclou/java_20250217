package com.cyj.boot001;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyj.boot001.myjpa.Team;
import com.cyj.boot001.myjpa.TeamRepository;


@SpringBootTest
class Boot001ApplicationTests {

	@Autowired TeamRepository teamRepository;
	// teamRepoditory - save (insert, update) / delete-(delete)
	// teamRepoditory.findAll() select / teamRepoditory.findById select
	

	@Disabled //@Test
	public void insert() {
		Team team = new Team();
		team.setName("milk");  // fruit , animal
		teamRepository.save(team);
	}	
	@Disabled //@Test
	public void selectAll() {
		List<Team> list = teamRepository.findAll();
		System.out.println(list.size());
		System.out.println(list.get(0).getName());
	}

	@Disabled //@Test 
	public void update() {
		//1. 수정할 팀찾기
		//Optional<Team> - null 값 안전보장
		Optional<Team> findTeam = teamRepository.findById(1L);
		System.out.println(findTeam.isPresent());
		
		//2. 이름 변경해서 수정
		Team team = findTeam.get();
		team.setName("avenger");
		teamRepository.save(team);	//save: insert, update
	}
	
	@Disabled //@Test 
	public void delete() {
		Optional<Team> findTeam = teamRepository.findById(3L);
		System.out.println(findTeam.isPresent());
		Team team = findTeam.get();
		teamRepository.delete(team);
	}
}
