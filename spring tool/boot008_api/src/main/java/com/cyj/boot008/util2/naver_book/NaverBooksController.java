package com.cyj.boot008.util2.naver_book;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NaverBooksController {
	@Autowired NaverBooks api;
	
	@GetMapping("/naver/books")
	public String books() {return "books";}	//(처리하고) view 만들기. books.html 필요
	
	@GetMapping(value = "/naver/booksapi/{search}",
				produces = "application/json;charset=UTF-8")
	
	@ResponseBody
	public String booksJson(@PathVariable String search) throws IOException { //네트워크 통신에서 실패하면 에러가 뜰 수 있음
		return api.getApi(search);
	}
}
