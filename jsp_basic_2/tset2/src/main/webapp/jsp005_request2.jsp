<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>REQUEST-요청</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card bg-light my-5">
		<h3 class="card-header">Sing in</h3>
		<!-- action="처리", method="데이터 전달 방법", name="데이터 보관명" -->
		<p  class="alert alert-warning">
         https://www.google.com/search?q=APPLE  <br/>
         1. 처리컨테이너 :  https://www.google.com/search  <br/>
         2. 처리방식    :  get
         3. 보관용기    :  query 
		</p>
		<form action="https://www.google.com/search" method="get">
	<div class="mb-3 mt-3">
		<label for="query" class="form-label">Email:</label>
		<input type="text" class="form-control" id="query" placeholder="googling" name="query">
	</div>
	<button type="submit" class="btn btn-danger">Submit</button>
</form>
	</div>
</body>
</html>
<!-- jsp004_request -->