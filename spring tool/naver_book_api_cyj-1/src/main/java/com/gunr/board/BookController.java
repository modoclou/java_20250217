package com.gunr.board;

import java.io.IOException;
import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.util.UriComponentsBuilder;

import com.gunr.board.NaverBook;

@Controller
public class BookController {
	@Autowired NaverBook api;
	String clientId = "reu63fdeQl8IXmwLVsRM"; 		
	String clientSecret = "AvEnm8FcX2";

	@GetMapping("/book/list")
	public String booklist() { return "/book/list"; }
	
	@GetMapping(value = "/naver/booksapi/{search}",
				produces = "application/json;charset=UTF-8")
	
	@ResponseBody
	public String booksJson(@PathVariable String search) throws IOException { //네트워크 통신에서 실패하면 에러가 뜰 수 있음
		return api.getApi(search);
	}
	
//	@GetMapping("/book/result")
//	public String result(@RequestParam("bookname") String text, Model model) {
//	    log.info("Received text: {}", text);
//	    model.addAttribute("text", text);
//	}
//	
//	@GetMapping("/api/book")
//    public ResultVO getBooks(@RequestParam(name = "query", defaultValue = "스프링부트") String query) {
//        return WebClientConfig.get()
//                .uri(uriBuilder -> uriBuilder
//                        .path("/v1/search/book.json")
//                        .queryParam("query", query)
//                        .queryParam("display", 10)
//                        .queryParam("start", 1)
//                        .queryParam("sort", "sim"));
//	}
}