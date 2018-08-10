<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">
<title>管理者画面</title>
</head>
<body>
<jsp:include page="adminHeader.jsp"/>

<div>
	<a href="<s:url action='AdminProductInfoAction'/>">商品情報一覧</a>
	<a href="<s:url action='AdminUserInfoAction'/>">ユーザー情報一覧</a>
	<a href="<s:url action='AdminDestinationInfoAction'/>">宛先情報一覧</a>
	<a href="<s:url action='AdminPurchaseHistoryInfoAction'/>">購入履歴情報一覧</a>
	<a href="<s:url action='AdminCartInfoAction'/>">カート情報一覧</a>
</div>
<div id="footer">
<s:include value="footer.jsp"/>
</div>
</body>
</html>