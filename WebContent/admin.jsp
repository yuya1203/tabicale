<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者画面</title>
<script>
function alertFunction(){

	alert("本当に削除しますか？");
}


</script>


</head>
<body>
<jsp:include page="adminHeader.jsp"/>

<div id="footer">
<s:include value="footer.jsp"/>
</div>
</body>
</html>