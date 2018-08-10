<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<meta http-equiv="Content-Style-Type" content="text/css" />
<meta http-equiv="Content-Script-Type" content="text/javascript" />
<meta http-equiv="imagetoolbar" content="no" />
<meta name="description" content="" />
<meta name="keywords" content="" />


<title>ユーザー情報登録画面</title>
</head>
<body>
<jsp:include page="header.jsp" />
<div id="contents">
			<p>ユーザー情報登録画面</p>
		</div>
		<div>
		<!-- エラーメッセージ  -->
			<s:if test="errorMessage !=''">
				<s:property value="errorMessage" escape="false"/>

				<s:if test="!#session.familyNameErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
		<s:iterator value="#session.familyNameErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!#session.firstNameErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.firstNameErrorMessageList"><s:property /><br></s:iterator>
</div>
</div>
</s:if>
<s:if test="!#session.familyNameKanaErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.familyNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!#session.firstNameKanaErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.firstNameKanaErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!#session.emailErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.emailErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!session.loginIdErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.loginIdErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
<s:if test="!#session.passwordErrorMessageList.isEmpty()">
	<div class="error">
	<div class="error-message">
	<s:iterator value="#session.passwordErrorMessageList"><s:property /><br></s:iterator>
	</div>
	</div>
</s:if>
</s:if>
			<!-- ユーザー登録欄 -->

			<s:form action="CreateUserConfirmAction">
<table class="vertical-list-table">

<tr>
	<th scope="row">姓:</th>
	<td><s:textfield name="familyName" value="%{#session.familyName}" label="姓" placeholder="姓" class="txt" /></td>
</tr>
<tr>
	<th scope="row">名:</th>
	<td><s:textfield name="firstName" value="%{#session.firstName}" label="名" placeholder="名" class="txt" /></td>
</tr>
<tr>
	<th scope="row">姓ふりがな:</th>
	<td><s:textfield name="familyNameKana" value="%{#session.familyNameKana}" label="姓ふりがな" placeholder="姓ふりがな" class="txt" /></td>
</tr>
<tr>
	<th scope="row">名ふりがな:</th>
	<td><s:textfield name="firstNameKana" value="%{#session.firstNameKana}" label="名ふりがな" placeholder="名ふりがな" class="txt" /></td>
</tr>
<tr>
	<th scope="row">性別:</th>
	<td><s:radio name="sex" list="#{0:'男性',1:'女性' }" value="%{#session.sex}" label="性別" placeholder="性別"/>
	<s:if test="%{sex != '1'}"></s:if>


	<!-- <input type="radio" name="sex" value="0" checked="checked">a
	<input type="radio" name="sex" value="1">b</td> -->
</tr>
<tr>
	<th scope="row">メールアドレス:</th>
	<td><s:textfield name="email" value="%{#session.email}" label="メールアドレス" placeholder="メールアドレス" class="txt" /></td>
</tr>
<tr>
	<th scope="row">ログインID:</th>
	<td><s:textfield name="loginId" value="%{#session.loginId}" label="ログインID" placeholder="ログインID" class="txt" /></td>
</tr>
<tr>
	<th scope="row">パスワード:</th>
	<td><s:password name="password" value="" label="パスワード" placeholder="パスワード" class="txt" /></td>
</tr>
</table>

<div class="submit_btn_box">
<div id=".contents-btn-set">
<s:submit value="登録" class="submit_btn" />
</div>
</div>
</s:form>
</div>

<s:include value="footer.jsp"/>

</body>
</html>