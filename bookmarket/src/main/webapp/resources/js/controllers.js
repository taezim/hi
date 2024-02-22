function addToCart(action){
	console.log("연결");
	document.addForm.action = action;
	document.addForm.submit();
	alert("도서가 장바구니에 추가되었습니다!");
	
}

function removeFromCart(action){
	console.log("removeFromCart 연결");
	document.removeForm.action = action;
	document.removeForm.submit();
	setTimeout(function () {window.location.reload();}, 500);
}

function clearCart(){
	document.clearForm.submit();
	setTimeout(function () {window.location.reload();}, 500);
}

function deleteConfirm(id){
	if(confirm("삭제합니다!!") == true) location.href="./delete?id="+id;
	else return;
}