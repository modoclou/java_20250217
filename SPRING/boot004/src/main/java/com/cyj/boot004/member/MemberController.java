package com.cyj.boot004.member;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {
	@Autowired MemberService service;
	
	@GetMapping("/")
	public String main() { return "member/login"; }
	
	@GetMapping("/member/member")
	public String member() { return "member/member"; }
	
	@GetMapping("/member/login")
	public String login() { return "member/login"; }
	
	@GetMapping("/member/join")
	public String join(MemberForm memberForm) { return "member/join"; }
	
	@PostMapping("/member/join")
	public String join(@Valid MemberForm memberForm, BindingResult bindingResult) {
		if(bindingResult.hasErrors()) { return "member/join"; }
		if(!memberForm.getPassword().equals(memberForm.getPassword2())) {
			//bindingResult.rejectValue(필드명, 오류코드, 에러메시지)
			bindingResult.rejectValue("password2", "passwordInCorrect", "check the Password");
			return "member/join";
		}
		try {
			Member member = new Member();
			member.setUsername(memberForm.getUsername());
			member.setEmail(memberForm.getEmail());
			member.setPassword(memberForm.getPassword());
			service.insertMember(member);
		} catch(DataIntegrityViolationException e) { //무결성 - 중복키, 외래키 제약, 데이터 형식 불일치
			e.printStackTrace();
			bindingResult.reject("failed", "this user already join us!");
			return "member/join";	
		} catch(Exception e) {
			e.printStackTrace();
			bindingResult.reject("failed", e.getMessage());
			return "member/join";
		}		
		return "member/login";
	}
}