package com.cyj.boot002;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cyj.boot001.myjpa.TeamRepository;

@SpringBootTest
class Boot002ApplicationTests {
	@Autowired TeamRepository teamRepository;
	// teamRepoditory - save (insert, update) / delete-(delete)
	// teamRepoditory.findAll() select / teamRepoditory.findById select
	
	@Test void insert() {
		Team team = new Team();	
		team.setName('milks'); //fruits, animal)
		teamRepository.seav(team);
	}
	void contextLoads() {
	}

}

//crud1. insert into team (name) values ('milk')
//crud2. select * from team / select * from team where = id=1?
//crud3. update team set name=? where id=?
//crud4. delete from team where no=?