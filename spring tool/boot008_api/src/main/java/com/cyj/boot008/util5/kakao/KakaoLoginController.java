package com.cyj.boot008.util5.kakao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class KakaoLoginController {
	@Autowired KakaoLogin api;
	
	@GetMapping("/kakaologin")
	public String login(Model model) {
		model.addAttribute("url", api.step1());
		return "login";
	}
	
	//localhost:8080/kakao	Token 도착 시 이 주소로 배송
	@GetMapping("/kakao")
	public String loginuser(@RequestParam("code") String code, Model model) {
		List<String> infos = api.step2(code);
		model.addAttribute("nickname", infos.get(0));
		model.addAttribute("profile_image", infos.get(1));
		return "login_result";	//view
	}
	
	//@PostMapping("/login_result")
}
