package com.cyj.boot4.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	//ver-1 @Autowired	BoardService service;
	private final BoardService service;
	
	@GetMapping("/board/list")
	public String list(Model model){
		model.addAttribute("list", service.findAll());	//전체 리스트 뽑고 ##할일
		return "board/list";	//board 폴더 안에 / list 파일
	} //http://localhost:8080/board/list
	
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model){
		//조회수 올리고 / 상세 보기 기능 ##할일
		return "board/detail";	//board 폴더 안에 / detail 파일
	} //http://localhost:8080/board/detail/1

	@GetMapping("/board/insert")
	public String insert_get(){ return "board/write"; }
	//http://localhost:8080/board/insert	(글쓰기 폼)
	
	@PostMapping("/board/insert")
	public String insert_post(Board board, @RequestParam Long member_id){
		System.out.println("............................................." + board);
		System.out.println("............................................." + member_id);
		//service.insert(board, member_id);
		service.insert(board);
		return "redirect:/board/list";
		} //from 테스트	(글쓰기 기능 - 갱신된 리스트)
	
	@GetMapping("/board/update/{id}")
	public String update_get(@PathVariable Long id, Model model) {
		model.addAttribute("dto", service.update_view(id));
		return "board/edit";
	}
	//http://localhost:8080/board/update/1	(글 수정 폼)
	
	@PostMapping("/board/update")
	public String update_post(Board board){
		service.update(board);	//글삭제 기능 ##
		//글쓰기 기능 ##할일
		return "redirect:/board/list";
	} //폼 태그에서 테스트	(글 수정 기능 - 갱신된 리스트)

	@GetMapping("/board/delete")
	public String delete_get(){ return "board/delete"; }
	//http://localhost:8080/board/delete	(글 수정 폼)
	
	@PostMapping("/board/delete")
	public String delete(Board board){
		service.delete(board);	//글삭제 기능 ##
		return "redirect:/board/list";
	} //http://localhost:8080/board/update	(글 수정 기능 - 갱신된 리스트)
}
/** Restful Api
	기존게시판	:	localhost:8080/board/detail?bno=10	쿼리스트링
	Restful Api	:	localhost:8080/board/detail/bno/10	쿼리스트링
		1) resultful - http url을 기반으로 자원에 접근해서 서비스를 제공하는 애플리케이션
		2) api
		3) method (GET: 검색 / POST: 생성, insert / PATCH(부분 업데이트), PUT(전체 업데이트) / DELETE: 삭제)
		4) DATA 주고 받는 형식 - json, xml
 **/