<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	session.removeAttribute("userage");

	response.sendRedirect("jsp021_Session1.jsp");
	out.println("<script> location.href='jsp-21_Sesssion1.jsp'; <script>");
%>