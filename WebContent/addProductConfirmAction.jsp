<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="Content-Style-Type" content="text/css"/>
<title>商品追加確認画面</title>
</head>
<body>

	<div class="contents">
		<h1>商品追加確認画面</h1>
		<s:form action="ProductCompleteAction">
			<table class="addList-confirm">
				<tr>
					<th>商品ID</th>
					<td><s:property value="productId"/></td>
				</tr>
				<tr>
					<th>商品名</th>
					<td><s:property value="productName"/></td>
				</tr>
				<tr>
					<th>商品名カナ</th>
					<td><s:property value="productNameKana"/></td>
				</tr>
				<tr>
					<th>商品詳細</th>
					<td><s:property value="productDescription"/></td>
				</tr>
				<tr>
					<th>カテゴリID</th>
					<td><s:property value="categoryId"/></td>
				</tr>
				<tr>
					<th>価格</th>
					<td><s:property value="price"/></td>
				</tr>
				<tr>
					<th>発売年月日</th>
					<td><s:property value="releaseDate"/></td>
				</tr>
				<tr>
					<th>発売会社</th>
					<td><s:property value="releaseCompany"/></td>
				</tr>

			</table>

		</s:form>
	</div>

</body>
</html>