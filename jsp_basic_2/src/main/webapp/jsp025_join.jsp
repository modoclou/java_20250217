<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- jsp025.jsp -->
<!-- jsp025.jsp -->
<%@ include file="jsp025_header.jsp" %>
<!-- user_login 서블릿 만들기 -->
<!-- jsp025_login.jsp -->
   <div class = "contanier card m-5 p-5">
      <div class = "p-5">
         <p style="text-align:center"><img src="img/login.png" alt = "login"></p>
      </div>
      
      <form action="<%=request.getContextPath()%>/user_join" method="post" onsubmit="return form()">
        <div class="my-3">
          <label for="name" class="form-label">Id: </label>
          <input type="text" class="form-control" id="name" name="name">
        </div>
         <div class="my-3">
          <label for="pass" class="form-label">Password: </label>
          <input type="password" class="form-control" id="pass" name="pass">
        </div>
        <div class="my-3">
        <input type="checkbox" name="remember"> remember
        <label for="remember" class="form-label"></label>
        </div>
        <div class="my-3">
        <button type="submit" title ="로그인 하러가기" class="btn btn-danger">로그인</button>
        </div>
      </form>
      <script>
         function form(){
            let name = document.querySelector("#name");
            let pass = document.querySelector("#pass");
            
            if(name.value == ""){
               alert('아이디를 입력해주세요'); name.focus(); return false;
            }
            if(pass.value == ""){
               alert('비밀번호를 입력해주세요'); pass.focus(); return false;
            }
         }
      </script>
   </div>
<!-- jsp025.jsp -->
<!-- jsp025.jsp -->

<!--  footer.jsp -->
<!--  footer.jsp -->
<%@ include file="jsp025_footer.jsp" %>