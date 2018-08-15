<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="./css/tabicale.css">
<link rel="stylesheet" href="./css/addProductAction.css">
<title>商品追加</title>

<!--
<script>
showImage(false);

$("#loadFile").onchange = function(evt){
	showImage(false);
	var files = evt.target.files;
	if(files.length == 0)
		return;
	var file = file[0];
	if(!file.type.match(/image/)){
		alert('画像ファイルを選んでください');
		return;
	}
	var reader = new FileReader();
	reader.onload = function(evt){
		$("#thumb").src = reader.result;
		showImage(true);
	}
	reader.readAsDateURL(file);
}

function showImage(b){
	var val = b ? "block" : "none" ;
	$("#up_btn").style.display = val;
	$("#thumb").style.display = val;
}
function $(id){
	return document.querySelector(id);
}

</script>
-->
</head>
<body>
<div id="page">
	<jsp:include page="adminHeader.jsp"/>

	<div class="contents">

			<h1>商品追加画面</h1>

				<s:form method="post" action="AddProductConfirmAction" enctype="multipart/form-data">
					<table class="vertical-list-table">
						<tr>
							<th scope="row" id="input_form"><s:label value="商品名" /></th>
							<td><s:textfield name="productName" class="txt" value="%{#session.productName}" placeholder="商品名"/></td>
						</tr>
						<tr>
							<th colspan="2">
								<s:if test="!session.productNameErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.productNameErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>
						<tr>
							<th colspan="2">
								<s:if test="!session.identicalErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.identicalErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

						<tr>
							<th scope="row" id="input_form"><s:label value="商品名かな" /></th>
							<td><s:textfield name="productNameKana" class="txt" value="%{#session.productNameKana}" placeholder="商品名かな"/></td>
						</tr>

						<tr>
							<th colspan="2">
								<s:if test="!session.productNameKanaErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.productNameKanaErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>
						<tr>
							<th colspan="2">
								<s:if test="!session.identicalErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.identicalErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

						<tr>
							<th scope="row" id="input_form"><s:label value="商品詳細" /></th>
							<td><s:textfield name="productDescription" class="txt" value="%{#session.productDescription}" placeholder="商品詳細"/></td>
						</tr>

						<tr>
							<th colspan="2">
								<s:if test="!session.productDescriptionErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.productDescriptionErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

						<tr>
							<th scope="row" id="input_form"><s:label value="カテゴリID" /></th>
							<td class="categoryId"><s:select name="categoryId" list="#session.mCategoryDtoList" listValue="categoryName"
							listKey="categoryId" class="cs-div" id="categoryId"/></td>
						</tr>

						<tr>
							<th colspan="2">
								<s:if test="!session.categoryIdErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.categoryIdErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

						<tr>
							<th scope="row" id="input_form"><s:label value="価格" /></th>
							<td><s:textfield name="price" class="txt" value='%{#session.price}'/></td>
						</tr>

						<tr>
							<th colspan="2">
								<s:if test="!session.priceErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.priceErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

						<tr>
							<th scope="row" id="input_form"><s:label value="発売年月日" /></th>
							<td><s:textfield name="releaseDate" class="txt" value="%{#session.releaseDate}" placeholder="yyyy-MM-dd"/></td>
						</tr>

						<tr>
							<th colspan="2">
								<s:if test="!session.releaseDateErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.releaseDateErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

						<tr>
							<th scope="row" id="input_form"><s:label value="発売会社" /></th>
							<td><s:textfield name="releaseCompany" class="txt" value="%{#session.releaseCompany}" placeholder="発売会社"/></td>
						</tr>

						<tr>
							<th colspan="2">
								<s:if test="!session.releaseCompanyErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.releaseCompanyErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

						<tr>
							<th scope="row" id="input_form"><s:label value="商品画像" /></th>
							<td class="image"><s:file name="userImage" accept='image/jpg, image/jpeg' /></td>
						</tr>
						<tr>
						<th colspan="2"></th>
						</tr>
						<tr>
							<th scope="row" id="input_form"><s:label value="商品画像２" /></th>
							<td class="image"><s:file name="userImage2" accept='image/jpg, image/jpeg' /></td>
						</tr>

						<tr>
							<th colspan="2">
								<s:if test="!session.imageFilePathErrorMessageList.isEmpty()">
									<div class="error">
									<div class="error-message">
										<s:iterator value="#session.imageFilePathErrorMessageList"><s:property /><br></s:iterator>
									</div>
									</div>
								</s:if>
							</th>
						</tr>

					</table>
					<div class="button">
						<s:submit class="submit-button" value="商品追加"/>
					</div>
				</s:form>
			</div>

		<s:include value="footer.jsp"/>
	</div>



</body>
</html>