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
		주소표시점에 노출
		보관용기이름:action
		1.	action:
		2.	method:
		3.	입력보관이름:
		<!-- action="처리", method="데이터 전달 방법", name="데이터 보관명" -->
		</pre>
	<form action="jsp008_result2.jsp" method="get"> <!-- 처리방식 get -->
		<div class="my-3">
			<label for="q" class="form-label">Email</label>
			<input type="text" class="form-control" id="q" name="para">
			<label for="q2" class="form-label">Pass</label>
			<input type="text" class="form-control" id="q2" name="pass">
			<div class="form-check mb-3">
				<label class="form-check-label">
				<input class="form-check-input" type="checkbox" name="remember"> Remember me
				</label>
			</div>
	<button type="submit" class="btn btn-danger">Submit</button>
		</div>
</form>
	</div>
</body>
</html>
<!-- jsp008_result2.jsp -->