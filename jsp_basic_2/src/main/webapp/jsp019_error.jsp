<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card bg-light my-5">
		<h3 class="card-header">ERROR 설정</h3>
		<pre>
			error
		1. 4xx : 클라이언트 오류
		   404 not found 페이지 없음 / 400 bad request
		2. 5xx : 서버 오류
		   500 내부 서버 오류 / 502 서버 과부하
		   
		* 해결방안
		1. Error 안내 페이지 만들기
		2. [src]-[main]-[webapp]-[WEB-INF]-web.xml 에러처리 설정
		</pre>
		<h4 class="card-header">ERROR 404</h4>
		<p><a href="jsp019_error404.jsp" class="btn btn-danger" style="margin-top: 10px;">NO PAGE</a></p>
		<h4 class="card-header">ERROR 500</h4>
		<% int i=40/0; %>
	</div>
</body>
</html>
<!-- jsp019_error.jsp -->