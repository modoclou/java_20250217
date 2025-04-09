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
	<div class="mt-4 p-5 bg-info text-white">
		<h1>Mlik Order Project</h1>
		<p>PrepareStatement Ex</p>
		<!-- bg-primary(파랑), danger(빨강), warning(노랑), dark(블랙), info(하늘색), secondary(회색) -->
	</div>
	<div class="container card bg-light my-5">
		<h3 class="card-header">Mlik</h3>
		<table class="table table-bordered table-hover table-info my-5">
		<caption>우유 주문 현황</caption>
			<thead>
				<tr>
					<th scope="col">No</th>
					<th scope="col">Name</th>
					<th scope="col">Price</th>
				</tr>
			</thead>
			<tbody>

		
		<%@page import="java.sql.*"%>
		<%
		//project mvc1
		//select * from milk; - PreparedStatement ver
		//변수-입력-처리-출력
		//1. 드라이버연동
		Connection conn = null;	PreparedStatement pstmt = null; ResultSet rset = null;
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//2. DB연동
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic", "root", "1234");
//		String sql="select * from milk";
//		String url="jdbc:mysql://localhost:3306:mbasic";
//		String id="root", pass="1234";
		
		//3. PreparedStatement
		//표-줄-칸
		pstmt = conn.prepareStatement("select * from milk");
		rset = pstmt.executeQuery();
		while(rset.next()){
//			out.println(rset.getInt("mno") + "/" + rset.getString("mname") + "/" + rset.getInt("mprice") + "/" + "</br>");}
		int mno = rset.getInt("mno");
		String mname = rset.getString("mname");
		int mprice = rset.getInt("mprice");
		%>
				<tr>
					<td><%=mno%></td>
					<td><%=mname%></td>
					<td><%=mprice%></td>
				</tr>
		<%
		}
		//4. 결과물 처리
		} catch (Exception e) {
			e.printStackTrace();	
		} finally {
			if(conn!=null){ conn.close(); }
			if(pstmt!=null){ pstmt.close(); }
			if(rset!=null){ rset.close(); }
		}
		%>
			</tbody>
		</table>		
	</div>
</body>
</html>
		
<!-- jsp000_jsp -->