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
		<%@page import="java.util.Arrays"%>
		<h3 class="card-header">CHECKBOX - 다중선택</h3>
		<%
		// 주소?username=cty%40gmail.com&option1=dog&option1=cat
		//1. 넘겨주는 데이터 넘겨받기(확인)
		String username = request.getParameter("username");
		String [] option1 = request.getParameterValues("option1");
		%>
		<table class="table table-striped">
			<caption>checkbox 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">USER</th><td><%=username%></td></tr>
				<tr><th scope="row">OPTION CHECK</th><td><%=Arrays.toString(option1)%></td></tr>
			</tbody>										<!-- ctrl + space -->
		</table>
	</div>
</body>
</html>
<!-- jsp000_jsp -->