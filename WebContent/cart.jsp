<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート画面</title>
</head>
<body>

<!-- テスト用です -->
<s:if test="#session.checkListErrorMessageList != null">
	<s:iterator value='#session.checkListErrorMessageList'>
		<s:property />
	</s:iterator>
</s:if>

<s:if test="#session.cartInfoDtoList.size()>0">
	<s:form id="form" action="SettlementConfirmAction">

	</s:form>
</s:if>

</body>
</html>