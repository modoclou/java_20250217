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
		<h3 class="card-header">성적처리사이트</h3>
		<pre>
		처리할 경로: jsp009_grade.jsp
		주소표시창에 노출 X
		보관용기이름: kor / eng / math
		</pre>
		<form action="jsp009_grade.jsp" method="post">
			<div class="my-3">
				<label for="kor" class="form-label">KOR</label>
					<input type="number" class="form-control" id="kor" name="kor"
					min="0" max="100" value="100">
				<label for="eng" class="form-label">ENG</label>
					<input type="number" class="form-control" id="eng" name="eng"
					min="0" max="100" value="100">
				<label for="math" class="form-label">MATH</label>
					<input type="number" class="form-control" id="math" name="math"
					min="0" max="100" value="99">
			</div>
			<div class="my-3" style="text-align:right">
				<button type="submit" class="btn btn-danger">Submit</button>
			</div>
		</form>
	</div>
</body>
</html>
<!-- jsp009_score.jsp -->