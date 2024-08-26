<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %> /css/mypage_influencer_6.10.1.css">


</head>
<body>

<%@ include file="header.jsp" %>


<div id="container">
    <div id="sidebar">

        <div class="sideitem1">
            <h2>홍길동 님, 환영합니다.</h2>

        </div>

        <div class="sideitem2" style="text-align:left;">
            <h2 style="font-weight:bold ;padding-left:20px;">내 포인트 > </h2>
            <h2 style="color:#4948e8;font-weight:bold;padding-left:20px;">45,000P</h2>
        </div>

        <div class="sideitem3">
            <h2>마이 파인</h2>
            <ul>
                <li><a href="#"><img class="icons"
                                     src="https://img.icons8.com/?size=100&id=6YVjhQYEKHAS&format=png&color=000000">캠페인
                    관리</a></li>
                <li><a href="#"><img class="icons"
                                     src="https://img.icons8.com/?size=100&id=zxB19VPoVLjK&format=png&color=000000">프로필
                    관리</a></li>

                <li><a href="#"><img class="icons"
                                     src="logo/SNS.png">SNS
                    관리</a></li>
                <li><a href="mypage_point.jsp"><img class="icons"
                                                    src="https://img.icons8.com/?size=100&id=xDnuaxgjAmJP&format=png&color=000000">포인트
                    관리</a></li>
                <li><a href="#"><img class="icons"
                                     src="https://img.icons8.com/?size=100&id=RvKp6z6EcIsB&format=png&color=000000">
                    북마크 관리</a></li>
            </ul>
        </div>
    </div>


    <div id="main">
        <h1>SNS 관리</h1>

        <div id="mainwrap">

            <div class="blog">
                <div class="blog-first">
                    <img src="logo/blog_icon.png" alt="">
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
                    <img src="logo/instagram_icon.png" alt="">
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
                    <img src="logo/youtube_icon.png" alt="">
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
<script src="script.js"></script>

</body>
</html>
