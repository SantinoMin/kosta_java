<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../web/css/common.css" rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp" %>
	<h3 class="header"><%=request.getAttribute("err") %></h3>
</body>
</html>