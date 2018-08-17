<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者宛先情報画面</title>
</head>
<body>
<jsp:include page="adminHeader.jsp"/>
<s:if test="#session.destinationInfoDtoList.size()>0">
		<table border="1">
			<thead>
				<tr>
					<th><s:label value="id"/></th>
					<th><s:label value="familyName"/></th>
					<th><s:label value="firstName"/></th>
					<th><s:label value="familyNameKana"/></th>
					<th><s:label value="firstNameKana"/></th>
					<th><s:label value="userAddress"/></th>
					<th><s:label value="email"/></th>
					<th><s:label value="telNumber"/></th>
				</tr>
			</thead>

			<tbody>
				<s:iterator value="#session.destinationInfoDtoList">
					<tr>
						<td><s:property value="id"/></td>
						<td><s:property value="familyName"/></td>
						<td><s:property value="firstName"/></td>
						<td><s:property value="familyNameKana"/></td>
						<td><s:property value="firstNameKana"/></td>
						<td><s:property value="userAddress"/></td>
						<td><s:property value="email"/></td>
						<td><s:property value="telNumber"/></td>
					</tr>
				</s:iterator>
			</tbody>
		</table>
</s:if>
<s:else>
	<div>
		宛先情報はありません
	</div>
</s:else>
<div id ="footer">
	<s:include value="footer.jsp"/>
</div>
</body>
</html>