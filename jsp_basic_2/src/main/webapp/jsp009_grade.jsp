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
		<h3 class="card-header">MY Account</h3>
		<!-- 국어: 100
			 영어: 100
			 수학: 99
			 총점: 299
			 평균: 99.666664 -->
		<%
			int kor = Integer.parseInt(request.getParameter("kor"));
			int eng = Integer.parseInt(request.getParameter("eng"));
			int math = Integer.parseInt(request.getParameter("math"));
			int total = kor + eng + math;
//			int total = Integer.parseInt(request.getParameter("kor" + "eng" + "math"));
			String avg = String.format("%.2f", total/3.0);
		%>
		<div class="container mt-3">           
		<table class="table table-dark table-striped">
			<thead>
				<tr>
					<th>KOR</th>
					<th>ENG</th>
					<th>MATH</th>
					<th>TOTAL</th>
					<th>AVG</th>
					</tr>
			</thead>
			<tbody>
				<tr>
					<td><%=kor%></td>
					<td><%=eng%></td>
					<td><%=math%></td>
					<td><%=total%></td>
					<td><%=avg%></td>
				</tr>
			</tbody>
			</table>
		</div>
<%-- 		<p>국어: <%=kor%></p>
		<p>영어: <%=eng%></p>
		<p>수학: <%=math%></p>
		<p>총점: <%=total%></p>
		<p>평균: <%=avg%></p> --%>
		<p><a href="javascript:history.go(-1)" class="btn btn-danger">뒤로 가기</a></p>
	</div>
</body>
</html>
<!-- jsp009_grade.jsp -->