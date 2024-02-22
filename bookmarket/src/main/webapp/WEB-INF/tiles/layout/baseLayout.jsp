<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>    
<!DOCTYPE html>
<html>
<head>
<link href="<c:url value='/resources/css/bootstrap.min.css'/>"rel='stylesheet' />
<meta charset="utf-8">
<title><tiles:insertAttribute name="title"/></title>
</head>
<body>
<tiles:insertAttribute name="menu" />
<div class="jumbotron" align="center">
	<div class="container">
		<h1 class="display-3"><tiles:insertAttribute name="heading"/></h1>
		<p><tiles:insertAttribute name="subheading" /></p>
	</div>
</div>
<div class="container">
	<div class="row">
		<tiles:insertAttribute name="content" />
	</div>
	<div class="footer">
		<tiles:insertAttribute name="footer" />
	</div>
</div>
</body>
</html>