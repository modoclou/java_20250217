package com.cyj.boot008.util2.naver_book;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NaverBooksController2 {
	@Autowired NaverBooks api;
	
	@GetMapping("/naver/books")
	public String books() {return "books";}	//(처리하고) view 만들기. books.html 필요
	
	@GetMapping(value = "/naver/booksapi/{search}",
				produces = "application/json;charset=UTF-8")
	public String bookdata(@RequestParam("code") String code, Model model) {
		List<String> bookresult = api.getApi(code + "맞는건지봐야함......");	//임시값
		model.addAttribute("title", bookresult.get(0));
		model.addAttribute("image", bookresult.get(2));
		model.addAttribute("username", bookresult.get(2));	//bookdata-member [username]
		
		return "지정할_html어딘가..."; 
		
	}
	
	@ResponseBody
	public String booksJson(@PathVariable String search) throws IOException { //네트워크 통신에서 실패하면 에러가 뜰 수 있음
		return api.getApi(search);
	}
}
