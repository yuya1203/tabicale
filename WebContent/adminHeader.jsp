<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者画面</title>
</head>
<body>
<div class="header">
	<div id="header-title">
	TABICALE
	</div>
	<div class="Logout">
		<a href="<s:url action='LogoutAction'/>">ログアウト</a>
	</div>
	<div class="GoAdmin">
		<a href="admin.jsp">管理者トップ</a>
	</div>
</div>

</body>
</html>