<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div class="container card  bg-info  my-5">
		<h3 class="card-header  bg-info text-white"> 내장객체 </h3>
		<pre style="background-color:white">
		1. jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될때
		2. 고정된 이름의 객체 컨테이너로 자동으로 구현
		3. request(요청) , response(응답) , session(정보저장) , out(출력)	
		</pre>
	</div> <!-- 내장객체안내 -->
	
	<div class="container card my-5">
		<h3 class="card-header  bg-info text-white">request(요청)</h3>
		<pre> 
		1. action="처리컴포넌트"
		2. method="처리방식"
		3. name="사용자가입력한값보관이름"
		</pre>
		<!-- http://localhost:8080/jsp_basic_2/jsp015_checkbox.jsp?username=cty%40gmail.com&option1=dog&option1=cat -->
		<form action="jsp015_checkbox.jsp"  method="get"  onsubmit="return checkbox()"  >
		  <div class="mb-3 mt-3">
		    <label for="username" class="form-label">NAME:</label> 
		    <input  type="text" class="form-control" id="username"
					placeholder="Enter email" name="username">
		   </div><!-- user name -->
		   <div class="form-check">
			  <input class="form-check-input" type="checkbox" 
			  		 id="check1" name="option1" value="dog" >
			  <label class="form-check-label" for="check1">DOG</label>
		   </div>
		   <div class="form-check">
			  <input class="form-check-input" type="checkbox" 
			  		 id="check2" name="option1" value="cat" >
			  <label class="form-check-label"  for="check2" >CAT</label>
		   </div>	
		   <div class="form-check">
			  <input class="form-check-input" type="checkbox" 
			  		 id="check3" name="option1" value="pig"   >
			  <label class="form-check-label"  for="check3">PIG</label>
		   </div>
		   <div class="my-3">
		   	  <button  type="submit"  class="btn btn-primary" >전송</button>
		   </div>			   	   
		</form>
		
		<script>
			// username 빈칸검사하기
			function  checkbox(){
				let username = document.getElementById("username");
				let checkboxs= document.querySelectorAll(".form-check-input:checked");  //다중선택
				console.log(checkboxs); 
				console.log(checkboxs.length); 
				
				if(username.value == ""){
					alert("빈칸입니다.");  username.focus();  return false;
				}  
				if(checkboxs.length == 0){
					alert("체크박스를 한개이상은 체크하셔야합니다.");
					return false;
				}
				
			}			
		</script>
		<form action="jsp015_select.jsp"  method="get"  onsubmit="return check3()"  >
			<div class="mb-3 mt-3">
				<label for="username3" class="form-label">NAME:</label> 
					<input  type="text" class="form-control" id="username3"
							placeholder="사용자 이름을 적어주세요." name="username">
			</div><!-- user name -->
			<!-- select -->
			<label for="">COLOR 선택</label>
				<select class="form-select" id="color" name="color">
				<option value="danger">RED</option>
				<option value="success">GREEN</option>
				<option value="primary">BLUE</option>
				<option value="dark">BLACK</option>
				</select>
			<!-- select -->
				<div class="my-3">
					<button  type="submit"  class="btn btn-primary" >전송</button>
			</div>			   	   
		</form>
		<script>
		//jsp015_radio.jsp?username=&optradio=option1
			function check2(){
				// alert('check');	return false; //정상동작체크코드
				// Q1. queryselector 이용해서 #username1 선택
				let username1 = document.quetySelector("#username1");
				// Q2. queryselectorAll 이용해서 .form-check-input1 선택 - name=optradio
				// Q3. :checked 넣어서 갯수 확인
				let radios = document.quetySelectorAll(".from-check-input1:checked");
				//console.log(radios.length);			
				
				// Q4. #username1 빈칸이면 알림창, 커서 가게
				if(username1.value==""){alert("빈칸입니다.");username.focus(); return false;}
				// Q5. radio 체크가 0개라면 알림창
				if(radios.length==0){alert("한 개 이상 선택해야 합니다."); return false;}
			}
		</script>
	</div> <!-- end radio -->
	
	<div class="container card my-5">
		<h3 class="card-header  bg-info text-white"></h3>
	
</body>
</html> 