<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>カート画面</title>
<script type="text/javascript">
	function goDeleteCartAction() {
		document.getElementById("form").action='DeleteCartAction';
	}
</script>
</head>
<body>
<jsp:include page="header.jsp" />
<!-- テスト用です -->
<s:if test="#session.checkListErrorMessageList != null">
	<s:iterator value='#session.checkListErrorMessageList'>
		<s:property />
	</s:iterator>
</s:if>

<s:if test="#session.cartInfoDtoList.size()>0">
	<s:form id="form" action="SettlementConfirmAction">
		<table>
			<thead>
				<tr>
					<th><s:label value="#"/></th>
					<th><s:label value="商品名"/></th>
					<th><s:label value="ふりがな"/></th>
					<th><s:label value="商品画像"/></th>
					<th><s:label value="値段"/></th>
					<th><s:label value="発売会社名"/></th>
					<th><s:label value="発売年月日"/></th>
					<th><s:label value="購入個数"/></th>
					<th><s:label value="合計金額"/></th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="#session.cartInfoDtoList">
					<tr>
						<td><s:checkbox name="checkList" value="checked" fieldValue="%{id}"/></td>
						<s:hidden name="productId" value="%{productId}"/>
						<td><s:property value="productName"/></td>
						<td><s:property value="productNameKana"/></td>
						<td><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' width="50px" height="50px" /></td>
						<td><s:property value="price"/>円</td>
						<td><s:property value="releaseCompany"/></td>
						<td><s:property value="releaseDate"/></td>
						<td><s:property value="productCount"/></td>
						<td><s:property value="subtotal"/>円</td>
					</tr>
					<s:hidden name="productName" value="%{productName}"/>
					<s:hidden name="productNameKana" value="%{productNameKana}"/>
					<s:hidden name="imageFilePath" value="%{imageFilePath}"/>
					<s:hidden name="imageFileName" value="%{imageFileName}"/>
					<s:hidden name="price" value="%{price}"/>
					<s:hidden name="releaseCompany" value="%{releaseCompany}"/>
					<s:hidden name="releaseDate" value="%{releaseDate}"/>
					<s:hidden name="productCount" value="%{productCount}"/>
					<s:hidden name="subtotal" value="%{subtotal}"/>
				</s:iterator>
			</tbody>
		</table>
		<h2><s:label value="カート合計金額"/><s:property value="#session.totalPrice"/>円</h2>
		<div>
			<div>
				<s:submit value="決済"/>
			</div>
		</div>
		<div>
			<div>
				<s:submit value="削除" onclick="this.form.action='DeleteCartAction'"/>
			</div>
		</div>
	</s:form>
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