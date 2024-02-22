<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 부트트랩링크가 ./(현재경로참조) => http://서버/프로젝트/home 이므로 home앞의 /(webapp)이 현재 속한 경로이다.
현재 속한 경로가 webapp임 -->
<link href="./resources/css/bootstrap.min.css" rel="stylesheet">
<meta charset="utf-8">
<title>Welcome</title>
</head>
<body>
<div class="container">
	<div class="text-center">		
		<h3>${strapline}</h3>
	</div>
</div>
</body>
</html>