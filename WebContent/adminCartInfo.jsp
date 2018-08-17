<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者カート画面</title>
</head>
<body>
<jsp:include page="adminHeader.jsp" />
<s:if test="#session.cartInfoDtoList.size()>0">
		<table border="1">
			<thead>
				<tr>
					<th><s:label value="ID"/></th>
					<th><s:label value="user_id"/></th>
					<th><s:label value="temp_user_id"/></th>
					<th><s:label value="product_id"/></th>
					<th><s:label value="product_count"/></th>
					<th><s:label value="price"/></th>
					<th><s:label value="regist_date"/></th>
					<th><s:label value="update_date"/></th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="#session.cartInfoDtoList">
					<tr>
						<td><s:property value="id"/></td>
						<td><s:property value="userId"/></td>
						<td><s:property value="tempUserId"/></td>
						<td><s:property value="productId"/></td>
						<td><s:property value="productCount"/></td>
						<td><s:property value="price"/></td>
						<td><s:property value="registDate"/></td>
						<td><s:property value="updateDate"/></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
</s:if>
<s:else>
	<div>
		カート情報はありません
	</div>
</s:else>
<div id="footer">
	<s:include value="footer.jsp"/>
</div>
</body>
</html>