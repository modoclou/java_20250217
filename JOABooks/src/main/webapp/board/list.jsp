<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="../inc/header.jsp" %>
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
	<div class="container card my-5">
		<h3 class="card-header text-center">LIST - 목록</h3>
		<div class="container mt-3">          
			<table class="table table-striped">
			<caption>MULTIBOARD - MVC1</caption>
				<thead>
					<tr>
					<th scope="col">NO</th>
					<th scope="col">TITLE</th>
					<th scope="col">WRITER</th>
					<th scope="col">DATE</th>
					<th scope="col">HIT</th>
					</tr>
				</thead>
				<tbody>
					<tr>
					<td>1</td>
					<td><a href="detail.jsp">첫번째 게시글입니다.</a></td>
					<td>ADMIN</td>
					<td>2020-01-02 13:14:39</td>
					<td>0</td>
					</tr>
				</tbody>
			</table>
		</div>
		<p><a href="../board/write.jsp" class="btn btn-info text-white" style="margin-top: 10px;">글쓰기</a></p>
	</div>
<%@ include file="../inc/footer.jsp" %>
</body>
</html>
<!-- jsp000_jsp -->