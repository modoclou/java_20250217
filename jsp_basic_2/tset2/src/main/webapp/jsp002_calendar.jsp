<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
		<h3 class="card-header">WS : 정적페이지</h3>
		<p>16:33 PM
		<%@page import="java.util.Calendar"%>
		<% 	Calendar today = Calendar.getInstance();
			String now = today.get(Calendar.HOUR_OF_DAY) + ":" +
						 today.get(Calendar.MINUTE) + ":" +
						 today.get(Calendar.SECOND);
			out.println(now);
		%>
		</p>
	</div>
</body>
</html>
<!-- jsp002_calendar -->