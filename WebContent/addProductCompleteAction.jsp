<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>

<meta http-equiv="refresh" content="3;URL='admin.jsp'"/>

<title>商品追加完了画面</title>
</head>
<body>
	<jsp:include page="adminHeader.jsp"/>
	<div class="contents">
		<div class="top">
			<h1>商品追加完了画面</h1>
		</div>

		<div class="success">
		商品追加が完了しました。
		</div>
		<div>
			<p>3秒後に管理者画面に戻ります</p>
		</div>
	</div>
	<div class="footer">
		<s:include value="footer.jsp"/>
	</div>

</body>
</html>