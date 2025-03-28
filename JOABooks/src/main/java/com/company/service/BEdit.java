package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDao;
import com.company.domain.BoardVO;

public class BEdit implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. utf-8
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		//2. PARAMETER
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		int bno = Integer.parseInt(request.getParameter("bno"));
		//3. SQL
		BoardDao dao = new BoardDao();
		BoardVO vo = new BoardVO();
		vo.setBtitle(btitle);
		vo.setBcontent(bcontent);
		vo.setBno(bno);
		//4. 결과 return	
		request.setAttribute("result", String.valueOf(dao.update(vo)));
//		http://localhost:8080/JOABooks/edit.do?bno=1&btitle=a&bcontent=a
	}
}