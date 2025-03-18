<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>MY SEARCH</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card bg-light my-5">
		<h3 class="card-header">Sing in</h3>
		<pre>
		1.	action:
		2.	method:
		3.	입력보관이름:
		<!-- action="처리", method="데이터 전달 방법", name="데이터 보관명" -->
		</pre>
	<form action="jsp007_result.jsp" method="get"> <!-- 처리방식 get -->
		<div class="my-3">
			<label for="q" class="form-label">검색어</label>
			<input type="text" class="form-control" id="q" name="para">
		</div>
	<button type="submit" class="btn btn-danger">Submit</button>
</form>
	</div>
</body>
</html>
<!-- jsp004_request -->