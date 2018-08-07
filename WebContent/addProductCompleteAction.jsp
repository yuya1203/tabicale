<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>商品追加完了画面</title>
</head>
<body>

	<div class="contents">
		<h1>商品追加完了画面</h1>

		<div class="success">
		商品追加が完了しました。
		</div>
		<s:form action="LoginAction">
			<s:submit value="管理者画面へ戻る"/>
		</s:form>
	</div>

</body>
</html>