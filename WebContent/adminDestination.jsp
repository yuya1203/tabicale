<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>宛先情報選択画面</title>
</head>
<body>
<jsp:include page="adminHeader.jsp"/>
<div id="contents">
	<h1>宛先情報削除完了画面</h1>
	<s:form id="form" action="SettlementCompleteAction">
		<table class="horizontal-list-table">
			<thead>
				<tr>
					<th><s:label value="#"/></th>
					<th><s:label value="名前"/></th>
					<th><s:label value="ふりがな"/></th>
					<th><s:label value="住所"/></th>
					<th><s:label value="電話番号"/></th>
					<th><s:label value="メールアドレス"/></th>
				</tr>
			</thead>

			<tbody>
				<s:iterator value="#session.destinationInfoDtoList" status="st">
					<tr>
						<td>
							<s:if test="#st.index == 0">
								<input type="radio" name="id" checked="checked" value="<s:property value='id'/>"/>
							</s:if>
							<s:else><input type="radio" name="id" value="<s:prooerty value='id'/>"/></s:else>
						</td>
						<td>
							<s:property value="familyName"/><span>　</span><s:property value="firstName"/>
						</td>
						<td>
							<s:property value="familyNameKana"/><span>　</span><s:property value="firstNameKana"/>
						</td>
						<td>
							<s:property value="userAddress"/>
						</td>
						<td>
							<s:property value="telNumber"/>
						</td>
						<td>
							<s:property value="email"/>
						</td>
					</tr>
				</s:iterator>
			</tbody>
		</table>

		<div class="submit_btn_box">
			<div id=".contents-btn-set">
			<s:form action="">
				<s:submit value="削除" class="submit_btn"/>
			</s:form>
			</div>
		</div>
	</s:form>

	<div class="info">
	宛先情報はありません。
	</div>
		</div>
</body>
</html>