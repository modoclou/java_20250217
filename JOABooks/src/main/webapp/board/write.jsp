<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ include file="../inc/header.jsp" %>
<body>
	<div class="container card my-5">
		<h3 class="card-header text-center">Write - 글쓰기</h3>
		<p>Write(Create)</p>
		<form action="#" method="post" id="writeform" onsubmit="return write()">
		<div class="container my-3">
			<div class="my-3">
				<label for="bname" class="form-label">작성자명</label>
				<input type="text" class="form-control" id="bname" placeholder="Enter nikname" name="bname">
			</div>
			<div class="my-3">
				<label for="btitle" class="form-label">제목</label>
				<input type="text" class="form-control" id="btitle" placeholder="Enter title" name="btitle">
			</div>
			<div class="my-3">
				<label for="bcontent" class="form-label">내용</label>
				<textarea type="bcontent" class="form-control" cols="60" rows="10" id="bcontent" name="bcontent"></textarea>
			</div>
		</div>
 		<div class="btn btn-info btn-block text-white my-3 text-end" style="margin: 10px;">글쓰기</div>
 		<button class="btn btn-outline-secondary btn-block my-3 text-muted" style="margin: 10px; text-decoration: none;"><a href="../board/list.jsp">취소</a></button>
 		<button class="btn btn-outline-secondary btn-block my-3 text-muted" style="margin: 10px; text-decoration: none;"><a href="../board/list.jsp">목록보기</a></button>
	</div>
	</form>
	<script>
	function form(){
		alert('test');
		let bname = document.getElementbyId("bname");
		let btitle = document.getElementbyId("btitle");
		let bcontent = document.getElementbyId("bcontent");
		console.lo(bname + "/" + btitle + "/" + bcontent);
		return false;
		
		if(bname.value==""){alert('빈칸입니다.'); bname.focus(); return false;}
		if(btitle.value==""){alert('빈칸입니다.'); bname.focus(); return false;}
		if(bcontent.value==""){alert('빈칸입니다.'); bcontent.focus(); return false;}
	}
	</script>
<%@ include file="../inc/footer.jsp" %>
</body>
</html>
<!-- jsp000_jsp -->