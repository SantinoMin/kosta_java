<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Main Page</title>
    <link rel="stylesheet" href="<%= request.getContextPath() %>/css/mypage_advertiser_6.4.1.css">


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
            <h2 style="color:#4948e8;font-weight:bold;padding-left:20px;">마이 파인</h2>
            <ul>
                <li><a href="#"><img class="icons"
                                     src="https://img.icons8.com/?size=100&id=6YVjhQYEKHAS&format=png&color=000000">캠페인
                    관리</a></li>
                <li><a href="#"><img class="icons"
                                     src="https://img.icons8.com/?size=100&id=zxB19VPoVLjK&format=png&color=000000">프로필
                    관리</a></li>
                <li><a href="mypage_point.jsp"><img class="icons"
                                                    src="https://img.icons8.com/?size=100&id=xDnuaxgjAmJP&format=png&color=000000">포인트
                    관리</a></li>

                <li><a href="#"><img class="icons1"
                                     src="logo/requestedInfluencer.png">
                    요청한 인플루언서 관리</a></li>


                <li><a href="#"><img class="icons"
                                     src="https://img.icons8.com/?size=100&id=RvKp6z6EcIsB&format=png&color=000000">
                    북마크 관리</a></li>
            </ul>
        </div>
    </div>


    <div id="main">
        <h2 style="font-weight:bold;text-align:left">요청한 인플루언서 목록</h2>

        <div id="mainwrap">
            <div id="campaignwrap">

                <div class="campaign" id="campaignNum1">
                    <div class="img"><img src="logo/influencer_image.png"
                                          style="width:200px;height:200px"></div>
                    <div class="category">뷰티  |  패션</div>
                    <div class="channel">채널명</div>

                    <div class="subject">직장인 데일리룩 올리는 블로거</div>
                    <div class="subscriberConut">구독자 수 8,000명</div>
                    <div class="status">대기 중</div>

                    <div class="applylist">
                        <table>
                            <thead>
                            <th>이름</th>
                            <th>구독자 수</th>
                            <th>채널</th>
                            <th>수락/거절</th>
                            </thead>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                        </table>
                    </div>
                </div>

                <div class="campaign" id="campaignNum2">
                    <div class="img"><img src="logo/influencer_image.png"
                                          style="width:200px;height:200px"></div>
                    <div class="category">뷰티  |  패션</div>
                    <div class="channel">채널명</div>

                    <div class="subject">직장인 데일리룩 올리는 블로거</div>
                    <div class="subscriberConut">구독자 수 8,000명</div>
                    <div class="status">수락</div>


                    <div class="applylist">
                        <table>
                            <thead>
                            <th>이름</th>
                            <th>구독자 수</th>
                            <th>채널</th>
                            <th>수락/거절</th>
                            </thead>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                        </table>
                    </div>
                </div>

                <div class="campaign" id="campaignNum3">
                    <div class="img"><img src="logo/influencer_image.png"
                                          style="width:200px;height:200px"></div>
                    <div class="category">뷰티  |  패션</div>
                    <div class="channel">채널명</div>

                    <div class="subject">직장인 데일리룩 올리는 블로거</div>
                    <div class="subscriberConut">구독자 수 8,000명</div>
                    <div class="statusReject">거절</div>

                    <div class="applylist">
                        <table>
                            <thead>
                            <th>이름</th>
                            <th>구독자 수</th>
                            <th>채널</th>
                            <th>수락/거절</th>
                            </thead>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                        </table>
                    </div>
                </div>

<%--                <div class="campaign" id="campaignNum4">--%>
<%--                    <div class="img"><img src="logo/influencer_image.png"--%>
<%--                                          style="width:200px;height:200px"></div>--%>
<%--                    <div class="name">캠페인 제목</div>--%>
<%--                    <div class="date">2024-01-01 ~ 2024-01-15</div>--%>
<%--                    <div class="email btn">이메일발송</div>--%>
<%--                    <div class="btn" onclick="showlist(event)">신청 목록</div>--%>

                    <div class="applylist">
                        <table>
                            <thead>
                            <th>이름</th>
                            <th>구독자 수</th>
                            <th>채널</th>
                            <th>수락/거절</th>
                            </thead>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                            <tr>
                                <td>홍길동</td>
                                <td>10,000</td>
                                <td>유튜브</td>
                                <td><span class="btn">수락</span><span class="btn">거절</span></td>
                            </tr>
                        </table>
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
