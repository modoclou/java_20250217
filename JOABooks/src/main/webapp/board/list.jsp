<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
<div class="container my-5">
	<h3>NAVER BOOK</h3>
	<div class="result">
	</div>
	<script>
	//1. window.onload = function(){};	브라우저 로딩 되면 동작
	// /* <!-- 달러 중괄호 열고닫고 el 	$() jquery --> */
	$(function(){
		alert('test');
		$.ajax({
			url:"${pageContext.request.contextPath}/books",
			dataType:"json",
			type:"GET",
			success:function(json){	//Object
				//console.log(json);
				let items = json.items;
				console.log(items[0]);	//객체1개 items[0] = {title:"", image="",,,,}
				for(let i=0; i<items.length; i++){
					let div = $('<div class="card my-3">');	//<div></div> 열고닫고 태그 만들기
					let p1 = $('<div class="card-body">').html('<img src="'+items[i].image+'" />');
					let p2 = $('<div class="card-body">').html(items[i].title);	//html reset 기존의 데이터 지우고 리셋해서 넣기(아예 초기화)
					div.append(p1).append(p2);	//div 태그 안에 p1 추가하고 또 p2 추가
					$(".result").append(div);
				}
				//2. 보여줄 화면에 껴넣기
			}, error:function(xhr, textStatus, errorThorwn){
				$(".result").html(textStatus + "(HTTP-" + xhr.status + "/" + errorThrown);
			}	// #(".result) document.querySelector(".result")
		})
	});	//2. jQuery야 동작해줘(브라우저 로딩되면 동작)
	</script>
</div>
<div class="container my-5">
	<h3 class="card-header mb-3">MULTIBOARD</h3>
	<%-- <%=request.getAttribute("list")%> --%>
	<table  class="table table-striped  table-bordered table-hover text-center">
		<caption>MULTIBOARD-LIST</caption>
		<thead>
			<tr><th scope="col">NO</th><th scope="col">TITLE</th>
			<th scope="col">WRITER</th><th scope="col">DATE</th><th scope="col">HIT</th></tr>
		</thead>
		<tbody>
			<!-- for(BoardDto dto : list) -->
			<c:forEach var="dto" items="${list}" varStatus="status">
				<tr>
					<td>${list.size() - status.index}</td> <!-- 전체 list.size(5)-상태값 status.index(0,1,2,,) -->
					<td><a href="detail.do?bno=${dto.bno}">${dto.btitle}</a></td>
					<td>${dto.bname}</td>
					<td>${dto.bdate}</td>
					<td>${dto.bhit}</td>
			</c:forEach>
		</tbody>
	</table>
	<p  class="text-end"><a href="write_view.do"   class="btn btn-info">글쓰기</a></p>
</div>
<%@ include file="../inc/footer.jsp" %>