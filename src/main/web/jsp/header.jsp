<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet" href="../css/header.css">
    <link rel="stylesheet" href="../css/reset.css">
</head>
<body>
<header>
    <a href="main.jsp">
        <img src="../logo/logo.svg" alt="logo이미지"/>
    </a>
    <ul class="menu_wrap">
        <li>
            <a href="campaign.jsp">캠페인</a>
        </li>
        <li>
            <a href="influencer.jsp">인플루언서</a>
        </li>
        <li>
            <a href="register_campaign.jsp">등록하기</a>
        </li>
        <li>
            <a href="payment.jsp">결제하기</a>
        </li>
    </ul>
    <a href="login.jsp" class="menu_button">
        로그인/회원가입
    </a>
</header>
</body>
</html>