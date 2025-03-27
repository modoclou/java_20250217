<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
	<%@ include file="inc/header.jsp" %>
	<div class="container card bg-light my-5">
		<h3 class="card-header">PROJECT (1)</h3>
		<pre>
		1. Project 생성
		2. [inc]-header.jsp/footer.jsp
		3. [inc]-error404.jsp/error500.jsp, [WEB-INF]-web.xml
		4. dbcp
		</pre>
		<h3 class="card-header">Error Test</h3>
		<h3 class="card-header">DBCP Test</h3>
	</div>
	
	<div class="container card bg-light my-5">
		<h3 class="card-header">PROJECT (2) MODEL</h3>
		<pre>
		1. Dto : [com.company.domain] - BoardVO
		2. DBManager : [com.company.dbmanager] - DBManager
		3. Dao : [com.company.dao] - BoardDao
		</pre>
		<%@page import="com.company.domain.BoardVO"%>
		<%@page import="com.company.dao.BoardDao"%>
		<%
		BoardDao dao = new BoardDao();
		//6. delete
		System.out.println(dao.delete(9)); //1
		System.out.println(dao.select(9)); //1		
		//5. update
		/*
		BoardVO vo = new BoardVO();
		vo.setBtitle("제목");
		vo.setBcontent("내용");
		vo.setBno(9);
		*/
		//4. updateHit
		//System.out.println(dao.updateHit(9)); //1 성공, -1 실패
		//3. select
		System.out.println(dao.select(9)); //있는 번호 적기
		//2. insert(BoardVo vo) - btitle, bcontent, bname

		//1. selectAll
		System.out.println(dao.selectAll());
		%>
	</div>
		
	<div class="container card bg-light my-5">
		<h3 class="card-header">PROJECT (2) MODEL</h3>
		<pre>
		[webapp] - [board]
					ㄴlist.jsp
					ㄴwrite.jsp
					ㄴdetail.jsp
					ㄴupdate.jsp
					
		1. markup
		2. validator - 오류검삭
		3. 빈칸검사
		</pre>
	</div>
		<h4 class="card-header">ERROR 404</h4>
		<p><a href="inc/error404.jsp" class="btn btn-danger" style="margin-top: 10px;">NO PAGE</a></p>
		<h4 class="card-header">ERROR 500</h4>
		<%-- <% int i=40/0; %> --%>
	<%@ include file="inc/footer.jsp" %>
<!-- jsp000_jsp -->