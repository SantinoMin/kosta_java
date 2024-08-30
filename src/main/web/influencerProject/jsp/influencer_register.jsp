<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>


    <link rel="stylesheet" href="<%= request.getContextPath() %> ../css/registerInfluencer_7.1.1.css">
    <link rel="stylesheet" href="<%= request.getContextPath() %> ../css/reset.css">

</head>
<body>

<%@ include file="header.jsp" %>

<h1>인플루언서 등록하기</h1>

<div class="bodyBackground">

    <h2>홍길동 님, 인플루언서 등록하고 모든 서비스를 이용해 보세요! </h2>

    <div id="adChannel">
        <h2>활동 채널</h2>
        <form action="" method="post"
              enctype="multipart/form-data">

            <div id="channel">

                <label class="label" for="youtube">

                    <div><img src="../logo/youtube.png" alt="">
                        <%--                    <div class="blue bord">유튜브</div>--%>
                    </div>
                    <input type="checkbox" name="ad" id="youtube" value="ad">
                </label>

                <label class="label" for="insta">
                    <div><img src="../logo/instagram.png" alt="">
                        <%--                        <div class="blue bord">인스타그램</div>--%>
                    </div>
                    <input type="checkbox" name="ad" id="insta" value="ad">
                </label>

                <label class="label" for="blog">
                    <div><img src="../logo/blog.png" alt="">
                        <%--                        <div class="blue bord">인스타그램</div>--%>
                    </div>
                    <input type="checkbox" name="ad" id="blog" value="ad">
                </label>

            </div>

            <div class="companyInfo">
                <div class="campaignField">
                    <div class="form-group">
                        <label for="channelName">채널명</label>
                        <input type="text" id="channelName" name="채널명">
                    </div>
                    <div class="form-group">
                        <label for="구독자 수">구독자 수</label>
                        <input type="text" id="구독자 수" name="구독자 수">
                    </div>
                    <div class="form-group">
                        <label for="채널 URL">채널 URL</label>
                        <input type="text" id="채널 URL" name="채널 URL">
                    </div>

                </div>
                <img id="uploadImage" src="../logo/imageUpload.png" alt="">
                <!-- 숨겨진 파일 입력 필드 -->
                <input type="file" id="fileInput"/>

            </div>


            <h1 class="categoryH1">주요 활동 카테고리</h1>

            <div class="categoryContainer">
                <%--    <div class="contentHeader">--%>

                <%--    <p>등록하고자 하는 캠페인 주제를 한 가지 선택해주세요.</p>--%>
                <%--    </div>--%>


                <div class="first3">
                    <div class="category">
                        <label for="beauty">
                            <img src="../logo/beauty.png" alt="뷰티" class="radio-image">
                        </label>
                        <input type="radio" id="beauty" name="category" value="beauty">
                    </div>

                    <div class="category">
                        <label for="fashion">
                            <img src="../logo/fashion.png" alt="패션" class="radio-image">
                        </label>
                        <input type="radio" id="fashion" name="category" value="fashion">
                    </div>

                    <div class="category">
                        <label for="sport">
                            <img src="../logo/sport.png" alt="스포츠" class="radio-image">
                        </label>
                        <input type="radio" id="sport" name="category" value="sport">
                    </div>
                </div>

                <div class="second3">
                    <div class="category">
                        <label for="travel">
                            <img src="../logo/travel.png" alt="여행" class="radio-image">
                        </label>
                        <input type="radio" id="travel" name="category" value="travel">
                    </div>

                    <div class="category">
                        <label for="food">
                            <img src="../logo/food.png" alt="식품" class="radio-image">
                        </label>
                        <input type="radio" id="food" name="category" value="food">
                    </div>

                    <div class="category">
                        <label for="life">
                            <img src="../logo/life.png" alt="생활용품" class="radio-image">
                        </label>
                        <input type="radio" id="life" name="category" value="life">
                    </div>
                </div>
            </div>

            <%--</form>--%>


            <div class="requirement">
                <div class="requirement-label">소개글 작성</div>
                <label>
                    <textarea class="requirement-field" placeholder="소개글을 작성 해주세요."></textarea>
                </label>
            </div>

            <div class="bottom-button">
                <button>등록하기</button>
                <button>뒤로가기</button>
            </div>

            <%--    //body background--%>
        </form>


        <%--    </div>--%>

        <%@ include file="footer.jsp" %>
        <!-- 외부 JavaScript 파일 링크 -->
        <script src="../../script.js"></script>


    </div>
</div>
</body>
</html>
