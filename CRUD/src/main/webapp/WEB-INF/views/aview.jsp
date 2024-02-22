<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.springmvc.domain.Member" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table>
		<tr>
			<td>아이디</td>
			<td>이름</td>
		</tr>
		<c:forEach items="${members}" var="member"> 
		<tr>
			<td>${member.id}</td>
			<td>${member.name}</td>
			<td><a href="/CRUD/update/up_form2?id=${member.id}">수정</a>
			<td><a href="/CRUD/del/this2">삭제</a>
		</tr>
	  	</c:forEach> 
	</table>
</body>
</html>