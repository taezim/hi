<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.springmvc.domain.Member" %>

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
	<%
		ArrayList<Member> arr = (ArrayList<Member>) session.getAttribute("arry");
		for(int i =0; i<arr.size(); i++){
			Member mb = arr.get(i);
	%>		
	
		<tr>
			<td><%=mb.getId() %></td>
			<td><%=mb.getName() %></td>
			<td><a href="/bookmarket_8/">수정</a>
			<td><a href="/bookmarket_8/del/this1">삭제</a>
		</tr>
	
	
	
	<%		
		}
	%>
	</table>
</body>
</html>