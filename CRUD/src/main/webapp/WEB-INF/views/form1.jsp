<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">회원 가입</h1>
		</div>
	</div>
	<form name="newMember" class="form-horizontal"  action="before" method="post">
		<div class="form-group  row">
			<label class="col-sm-2 ">아이디</label>
			<div class="col-sm-3">
				<input name="id" type="text" class="form-control" placeholder="아이디" >
			</div>
		</div>
		<div class="form-group  row">
			<label class="col-sm-2">이름</label>
			<div class="col-sm-3">
				<input name="name" type="text" class="form-control" placeholder="이름" >
			</div>
		</div>
		<div class="form-group  row">
			<div class="col-sm-offset-2 col-sm-10 ">
				<input type="submit" class="btn btn-primary " value="등록 " > 
				<input type="reset" class="btn btn-primary " value="취소 " >
			</div>
		</div>
	</form>
</body>
</html>