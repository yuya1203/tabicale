<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/tabicale.css">
<title>ホーム</title>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>



</head>
<body>
<jsp:include page="header.jsp" />

<div class="abc">

        <div><img src="images/slideshow_01.jpg"></div>
        <div><img src="images/slideshow_02.jpg"></div>
        <div><img src="images/slideshow_03.jpg"></div>
        <div><img src="images/slideshow_04.jpg"></div>
        <div><img src="images/slideshow_05.jpg"></div>
        <div><img src="images/slideshow_06.jpg"></div>

    </div>

<div id="contents">
	<h1>ホーム画面</h1>
</div>
<s:include value="footer.jsp" />
</body>
</html>