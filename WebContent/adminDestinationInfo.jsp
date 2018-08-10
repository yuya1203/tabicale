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
		<table>
			<thead>
				<tr>
					<th><s:label value="id"/></th>
					<th><s:label value="family_name"/></th>
					<th><s:label value="first_name"/></th>
					<th><s:label value="family_name_kana"/></th>
					<th><s:label value="first_name_kana"/></th>
					<th><s:label value="user_address"/></th>
					<th><s:label value="email"/></th>
					<th><s:label value="tel_number"/></th>
				</tr>
			</thead>
			<tbody>
				<s:iterator value="#session.destinationInfoDtoList">
					<tr>
						<td><s:property value="id"/></td>
						<td><s:property value="family_name"/></td>
						<td><s:property value="first_name"/></td>
						<td><s:property value="family_name_kana"/></td>
						<td><s:property value="first_name_kana"/></td>
						<td><s:property value="user_address"/></td>
						<td><s:property value="email"/></td>
						<td><s:property value="tel_number"/></td>
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