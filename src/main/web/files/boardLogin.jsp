<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link href="../css/common.css" rel="stylesheet">
</head>

<body>
<%@ include file="header.jsp" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    if (username != null && password != null) {
        // 로그인 처리 로직
        out.println("Username: " + username);
        out.println("Password: " + password);
    }
%>

<form action="boardLogin.jsp" method="post">
    <input type="text" name="name" placeholder="userName" id="name">

    <input type="text" name="password" placeholder="userName" id="password">

    <input type="submit" value="BoardLogin">
</form>
</body>
</html>