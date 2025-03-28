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
		<h3 class="card-header text-center">UPDATE - 글 수정</h3>
		<div class="container mt-3">
			<div class="mb-3 mt-3">
				<label for="name" class="form-label">작성자명</label>
				<input type="name" class="form-control" id="name" placeholder="Enter nikname" name="name">
			</div>
			<div class="mb-3 mt-3">
				<label for="title" class="form-label">제목</label>
				<input type="title" class="form-control" id="title" placeholder="Enter title" name="title">
			</div>
			<div class="mb-3 mt-3">
				<label for="text" class="form-label">내용</label>
				<textarea type="text" class="form-control" rows="5" id="text" name="text"></textarea>
			</div>
		</div>
 		<p class="btn btn-info btn-block text-white" style="margin: 10px;">글쓰기</p>
 		<p class="btn btn-secondary btn-block text-white" style="margin: 10px;">취소</p>
 		<p class="btn btn-secondary btn-block text-white" style="margin: 10px; margin-bottom: 20px;">목록보기</p>
	</div>
<%@ include file="../inc/footer.jsp" %>
</body>
</html>
<!-- jsp000_jsp -->