<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
      <link rel="stylesheet" href="<%= request.getContextPath() %> /css/registerCampaign_7.0.1.css">
</head>
<body>

<%@ include file="header.jsp" %>

<h1>캠페인 등록하기</h1>

<div class = "bodyBackground">

    <div id="adChannel">
        <h2>희망 광고 채널</h2>
        <form action="" method="post">
            <div id="channel">

                <label class="label" for="youtube">

                    <div><img src="./logo/youtube.png" alt="">
<%--                    <div class="blue bord">유튜브</div>--%>
                    </div>
                    <input type="checkbox" name="ad" id="youtube" value="ad">
                </label>

                <label class="label" for="insta">
                    <div><img src="./logo/instagram.png" alt="">
<%--                        <div class="blue bord">인스타그램</div>--%>
                    </div>
                    <input type="checkbox" name="ad" id="insta" value="ad">
                </label>

                <label class="label" for="blog">
                    <div><img src="./logo/blog.png" alt="">
                        <%--                        <div class="blue bord">인스타그램</div>--%>
                    </div>
                    <input type="checkbox" name="ad" id="blog" value="ad">
                </label>

            </div>

        </form>
    </div>

    <div class = "companyInfo">
    <div class="campaignField">
        <div class="form-group">
            <label for="companyName">업체명</label>
            <input type="text" id="companyName" name="업체명">
        </div>
        <div class="form-group">
            <label for="companyUrl">업체 URL</label>
            <input type="text" id="companyUrl" name="업체URL">
        </div>
        <div class="form-group">
            <label for="campaignName">캠페인 이름</label>
            <input type="text" id="campaignName" name="캠페인 이름">
        </div>
        <div class="form-group">
            <label for="productName">상품명</label>
            <input type="text" id="productName" name="상품명">
        </div>
    </div>
        <img id="uploadImage"  src="./logo/imageUpload.png" alt="">
        <!-- 숨겨진 파일 입력 필드 -->
        <input type="file" id="fileInput" />

    </div>

<%--<div class="form-container">--%>

    <div class="form-group">
        <label for="uploadPeriod">업로드 기간</label>
        <select id="uploadPeriod" name="uploadPeriod">
            <option value="1주일">1주일 500 point</option>
            <option value="2주일">2주일 1000 point</option>
            <option value="3주일">3주일 1500 point</option>
        </select>
    </div>

    <div class="form-group">
        <label for="adPeriod">광고 기간</label>
        <select id="adPeriod" name="adPeriod">
            <option value="select">select Date</option>
            <option value="start_date">start Date</option>
            <option value="end_date">end Date</option>
        </select>
    </div>

<%--    //추가--%>
    <!-- These inputs are hidden initially and will be shown dynamically -->
<%--    <div class="form-group" id="startDateContainer" style="display:none;">--%>
<%--        <label for="startDate">시작 날짜</label>--%>
<%--        <input type="date" id="startDate" name="startDate">--%>
<%--    </div>--%>

<%--    <div class="form-group" id="endDateContainer" style="display:none;">--%>
<%--        <label for="endDate">종료 날짜</label>--%>
<%--        <input type="date" id="endDate" name="endDate">--%>
<%--    </div>--%>
<%--    //여기까지 추가--%>

<%--</div>--%>

<div class="categoryContainer">

    <div class="contentHeader">
    <h1 class="categoryH1">컨텐츠 카테고리 선택</h1>
    <p>등록하고자 하는 캠페인 주제를 한 가지 선택해주세요.</p>
    </div>

    <div class="first3">
    <div class="category">
        <label for="beauty">
            <img src="./logo/beauty.png" alt="뷰티" class="radio-image">
        </label>
        <input type="radio" id="beauty" name="category" value="beauty">
    </div>

    <div class="category">
        <label for="fashion">
            <img src="./logo/fashion.png" alt="패션" class="radio-image">
        </label>
        <input type="radio" id="fashion" name="category" value="fashion">
    </div>

    <div class="category">
        <label for="sport">
            <img src="./logo/sport.png" alt="스포츠" class="radio-image">
        </label>
        <input type="radio" id="sport" name="category" value="sport">
    </div>
    </div>

    <div class="second3">
    <div class="category">
        <label for="travel">
            <img src="./logo/travel.png" alt="여행" class="radio-image">
        </label>
        <input type="radio" id="travel" name="category" value="travel">
    </div>

    <div class="category">
        <label for="food">
            <img src="./logo/food.png" alt="식품" class="radio-image">
        </label>
        <input type="radio" id="food" name="category" value="food">
    </div>

    <div class="category">
        <label for="life">
            <img src="./logo/life.png" alt="생활용품" class="radio-image">
        </label>
        <input type="radio" id="life" name="category" value="life">
    </div>
</div>
</div>

<%--</form>--%>


<div class="requirement">
    <div class="requirement-label">요구 사항</div>
    <label>
        <textarea class="requirement-field" placeholder="여기에 요구 사항을 작성하세요..."></textarea>
    </label>
</div>

<div class="bottom-button">
    <button>등록하기</button>
    <button>뒤로가기</button>
</div>

<%--    //body background--%>
</div>

<%@ include file="footer.jsp" %>


<!-- 외부 JavaScript 파일 링크 -->
<script src="script.js"></script>

</body>
</html>
