<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/tabicale.css">

<style type="text/css">

body {
	margin: 0 auto;
}

.bx-wrapper {
  margin: 0 !important;
  -moz-box-shadow: none !important;
  -webkit-box-shadow: none !important;
  box-shadow: none !important;
  border: none !important;
  background: none !important;
}

.slider img{
  width: 100%;
  height: auto;
  position: relative;
  top: -600px;
  left: 0;
  margin-bottom: -600px;
  z-index: 1;
}

#home_menu {
	width: 100%;
	position: absolute;
	top: 0;
	left: 0;
	z-index: 2;
}

</style>

<title>ホーム</title>


<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>



</head>
<body>

<div id="home_menu">
<jsp:include page="header.jsp" />
</div>

<div class="slider">

        <div><img src="images/slideshow_01.jpg"></div>
        <div><img src="images/slideshow_02.jpg"></div>
        <div><img src="images/slideshow_03.jpg"></div>
        <div><img src="images/slideshow_04.jpg"></div>
        <div><img src="images/slideshow_05.jpg"></div>
        <div><img src="images/slideshow_06.jpg"></div>

    </div>

<s:include value="footer.jsp" />
</body>
</html>