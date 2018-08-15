<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="./css/tabicale.css">
<link rel="stylesheet" href="./css/home.css">

<title>ホーム</title>



<link rel="stylesheet" href="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.min.js"></script>
  <script>

  jQuery(function($){
	    $(document).ready(function(){
	      $('.slider').bxSlider({
	    	  auto:true,
	    	  mode:'fade',
	    	  speed:1000,
	    	  pause: 3000,
	    	  controls: false,
	    	  pager: false
	      });
	    });
	  });

  </script>

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

    <div id="contents">

	<h1>世界をめくろう。</h1><br>

	<p>僕たちが作りたいのは</p>
	<p>見ているだけで旅に出たくなるモノ。</p><br>

	<p>それは新しい時代の"パスポート"</p>
	<p>僕たちが作るものは、</p>
	<p>そんな、存在でありたい。</p><br>

	<p>そして、人と人が繋がる</p>
	<p>こんな時代だからこそ、</p>
	<p>僕たちは、みんなでひとつのモノを</p>
	<p>作ることを追求したい。</p><br>

	<h1>TABICALE</h1><br>

	<p>それは、自分と世界を繋げる</p>
	<p>旅のカレンダーブランド</p><br>

	</div>

<s:include value="footer.jsp" />
</body>
</html>