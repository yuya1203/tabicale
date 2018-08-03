<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta charset="UTF-8">
<link rel="stylesheet" href="./css/style.css">

<title>商品詳細</title>
</head>
<body>
<div id= "contents">
<h1>商品詳細画面</h1>
     <s:form action= "AddCartAction">
     <div class="box">
         <div class= "2column-container">
            <div class = "right">
                <img src='<s:property value="%{#session.imageFilePath}"/><s:property value="%{#session.imageFileName}"/>' class= "item-imag-box-320"/><br>
            </div>
            <div class="left">
                <table class="vertical-list-table-mini">
                     <tr>
                           <th scope= "row"><s:label value="商品名"/></th>
                                 <td><s:property value="%{#session.productName}"/></td>
                     </tr>
                     <tr>
                          <th scope="row"><s:label value="商品目かな"/></th>
                          <td><s:property value="%{#session.productNameKana}"/></td>
                     </tr>
                     <tr>
                          <th scope="row"><s:label value= "値段"/></th>
                          <td><s:property value= "%{#session.price}"/>円</td>
                     </tr>
                     <tr>
                          <th scope="row"><s:label value= "購入個数"/></th>
                          <td><s:select name="productCount" list= "%{#session.productCountList}"/>個</td>
                     </tr>
                     <tr>
                          <th scope= "row"><s:label value= "発売会社名"/></th>
                          <td><s:property value= "%{#session.releaseCompany}"/></td>
                     </tr>
                     <tr>
                          <th scope="row"><s:label value="発売年月日"/></th>
                          <td><s:property value="%{#session.productDescription}"/></td>
                     </tr>
                 </table>
            </div>
     </div>
     <s:hiden name="productId" value="%{#session.productId}"/>
     <s:hiden name="productName" value="%{#session.productName}"/>
     <s:hiden name="productNameKana" value="%{#session.productNameKana}"/>
     <s:hiden name="imageFilePath" value="%{#session.imageFIlePath}"/>
     <s:hiden name="imageFileName" value="%{#session.imageFileName}"/>
     <s:hiden name="price" value="%{#session.price}"/>
     <s:hiden name="releaseCompany" value="%{#session.releaseCompany}"/>
     <s:hiden name="releaseDate" value="%{#session.releaseDate}"/>
     <s:hiden name="productDescription" vslue="%{#session.productDescription}"/>
     </div>
     <div class="submit_btn_box"/>
     <s:submit value="カートに追加" class="submit_btn"/>
     </s:form>
     <div class="box">
     <div class="product-details-recomment-box">
     <s:iterator value="#session.productInfoDtoList">
     <!--  <div class="product-list">
           <div class="product-list-box"> -->>
           <div class="recommend-box">
           <a href='<s:url action="ProductDetailsAction">
           <s:parm name="productId" value="%{productId}"/>
           </s:url>'><img src='<s:property value="imageFilePath"/>/<s:property value="imageFileName"/>' class="item-image-box-100"></a>
           <s:property value="productName"/><br>
           </div>
<!-- 		</div>
	</div>
-->
     </s:iterator>

     </div>
     </div>

</div>
<s:include value="footer.jsp"/>
</body>
</html>