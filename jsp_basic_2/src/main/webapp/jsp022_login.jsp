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
	<nav class="navbar navbar-expand-sm bg-primary navbar-dark text-white" style="padding: 20px; margin-left: auto;">
		<h3 class="card-header"> LOGIN </h3> 
			<ul class="navbar-nav">
				<li class="nav-item">
				<a class="nav-link" href="#">JOIN</a>
				</li>
				<li class="nav-item">
				<a class="nav-link" href="#">LOGIN</a>
				</li>
			</ul>
	</nav>
	<div class="container card  my-5">
		<div class="my-5"><%=session.getAttribute("username")%></div>
		<p style="text-align:center"><img src="img/login.png" alt="login" style="margin-top:40px;"/></p>  
		<form action="jsp022_login_action.jsp"  method="get"  class="">
			<div class="my-3">
				<label for="name"   class="form-label">Id : </label>
				<input type="text"  class="form-control"  id="name"  name="name" />      
			</div>
			<div class="my-3">
				<label for="pass"       class="form-label">Password : </label>
				<input type="password"  class="form-control"  id="pass"  name="pass" />      
			</div>		
			<div class="my-3">
				<label for="check"       class="form-label">Remember me : </label>
				<input type="checkbox"   id="check"  name="remember" />      
			</div>	
			<div class="my-3"> 
				<input type="submit"    title="login 하러가기"
				       class="btn btn-danger"  id="check" value="LOGIN" />      
			</div>								
		</form>
		<script>
			function login(){
				let name = document.getElementbyId("name");
				let pass = document.querySelector("#pass");
				console.log(name.value+"/"+pass.value);
				if(name.value==""){alert("빈칸입니다.\n확인해주세요."); name.focus(); return false;}					
				if(pass.value==""){alert("빈칸입니다.\n확인해주세요."); pass.focus(); return false;}					
			}
		</script>
	</div>
</body>
</html> 
<!-- 
다음과 같이 설정 -
 처리할 경로 : jsp008_result.jsp
 주소표시창줄에 노출
 보관용기이름 :  email   / pass / remember
-->



