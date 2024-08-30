<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>

    <link rel="stylesheet" href="<%= request.getContextPath() %> ../css/reset.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %> ../css/mypage_influencer_6.10.1.css">

</head>
<body>

<%@ include file="header.jsp" %>


<div id="container">

    <%@ include file="sidebar.jsp" %>


    <div id="main">
        <h1>SNS 관리</h1>

        <div id="mainwrap">

            <div class="blog">
                <div class="blog-first">
                    <img src="../logo/blog_icon.png" alt="">
                    <div class="blogText">블로그</div>
                </div>


                <div class="blog-link">
                    <a href="">https:blog.naver.com/</a>
                    <input type="text" value="kosta123">
                </div>

                <div class="blog_bottom">
                    <input type="button" value="연동하기" id="connect_to_blog">
                </div>
            </div>


            <div class="instagram">
                <div class="instagram-first">
                    <img src="../logo/instagram_icon.png" alt="">
                    <div class="instaText">인스타그램</div>
                </div>


                <div class="insta-link">
                    <a href="">https:instagram.naver.com/</a>
                    <input type="text" value="kosta123">
                </div>

                <div class="insta_bottom">
                    <input type="button" value="연동하기" id="connect_to_insta">
                </div>
            </div>


            <div class="youtube">
                <div class="youtube-first">
                    <img src="../logo/youtube_icon.png" alt="">
                    <div class="youtubeText">유튜브</div>
                </div>


                <div class="youtube-link">
                    <a href="">https:blog.youtube.com/</a>
                    <input type="text" value="kosta123">
                </div>

                <div class="youtube_bottom">
                    <input type="button" value="연동하기" id="connect_to_youtube">
                </div>
            </div>

        </div>
        <div id="showlist">
        </div>


    </div>
</div>

</div>


<%@ include file="footer.jsp" %>


<!-- 외부 JavaScript 파일 링크 -->
<script src="../../script.js"></script>

</body>
</html>
