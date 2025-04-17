package com.cyj.boot001.myjpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity	@Getter	@Setter	@NoArgsConstructor
public class Post {
	@Id	@GeneratedValue
	private Long id;
	private String content;
	
	@ManyToMany(mappedBy="likedPosts")	//포스트 주인이다
	private List<User> likedUsers = new ArrayList<>();
}
