package com.cyj.boot001.myjpa;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
	private final UserRepository userRepository;
	private final PostRepository postRepository;
	
	@Autowired
	public LikeService(UserRepository userRepository, PostRepository postRepository) {
		super();
		this.userRepository = userRepository;
		this.postRepository = postRepository;
	}
	
	//좋아요 추가
	@Transactional
	public void likePost(Long userId, Long postId){
		User user = userRepository.findById(userId).orElseThrow( ()-> new RuntimeException("NO USER"));
		Post post = postRepository.findById(userId).orElseThrow( ()-> new RuntimeException("NO POST"));
		
		user.getLikedPosts().add(post);
		post.getLikedUsers().add(user);
		
		userRepository.save(user);	//관계저장
	}
	
	//좋아요 갯수
	public int gerLikeCount(Long postId) {
		Post post = postRepository.findById(postId).orElseThrow();
		return post.getLikedUsers().size();
	}
	
	//좋아요 취소
	@Transactional
	public void unlikePost(Long userId, Long postId) {
		User user = userRepository.findById(userId).orElseThrow();
		Post post = postRepository.findById(postId).orElseThrow();
		
		user.getLikedPosts().remove(post);
		post.getLikedUsers().remove(user);
		
		userRepository.save(user);	//관계저장
	}
}
