<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="./css/tabicale.css">
<title>管理者用商品一覧</title>
<script>
function alertFunction(){

	// 「OK」時の処理開始 ＋ 確認ダイアログの表示
	if(window.confirm('本当に削除しますか？')){

		return true; // 「OK」時は送信を実行

	}
	// 「OK」時の処理終了

	// 「キャンセル」時の処理開始
	else{

		return false; // 送信を中止

	}
	// 「キャンセル」時の処理終了

}


</script>
</head>

<body>
<div id="page">

<jsp:include page="adminHeader.jsp"/>

<div id="contents">
<h1>管理者用商品一覧</h1>

<s:if test="#session.productInfoDtoList.size()>0">

<table class="horizontal-list-table" border="1">
<thead>
<tr>
<th><s:label value="削除"/></th>
<th><s:label value="商品名"/></th>
<th><s:label value="ふりがな"/></th>
<th><s:label value="商品画像"/></th>
<th><s:label value="商品画像2"/></th>
<th><s:label value="値段"/></th>
<th><s:label value="発売会社名"/></th>
<th><s:label value="発売年月日"/></th>
</tr>
</thead>
<tbody>
<s:iterator value="#session.productInfoDtoList">
<tr>
<td><s:form action="DeleteProductAction">
<s:hidden name="productId" value="%{productId}"/>
<input type ="submit" class="submit_btn" value="削除" onclick="return alertFunction()"  />
</s:form></td>
<td><s:property value="productName"/></td>
<td><s:property value="productNameKana"/></td>
<td><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>'width="80px" height="80px"/></td>
<td><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName2"/>'width="80px" height="80px"/></td>
<td><s:property value="price"/>円</td>
<td><s:property value="releaseCompany"/></td>
<td><s:property value="releaseDate"/></td>
</tr>

</s:iterator>
</tbody>

</table>

</s:if>

<div class="submit_btn_box">
<s:form action="AddProductAction">
<input type="submit" class="submit_btn" value="商品追加"/>
</s:form>
</div>
</div>

<s:else>
<div class="info">
商品情報はありません。
</div>
</s:else>
</div>
<s:include value="footer.jsp"/>
</body>

</html>