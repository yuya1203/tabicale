<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="header">
	<div id="heder-title">
	TABICALE
	</div>
	<div class="Logout">
		<a href="<s:url action='LogoutAction'/>">ログアウト</a>
	</div>
	<div class="">
		<a href ="<s:url action=''/>">管理者画面</a>
	</div>
</div>

</body>
</html>