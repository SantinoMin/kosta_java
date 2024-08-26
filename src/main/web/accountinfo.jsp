<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/common.css" rel="stylesheet">
</head>
<body>
	<%@ include file="header.jsp" %>
	<div><h3 class="header">계좌조회</h3></div>
		<div class="wrap">
			<div class="row">  
				<div class="title">계좌번호</div>
				<div class="input"><input type="text" disabled value="${acc.id }"/></div>
			</div>
			<div class="row">  
				<div class="title">이름</div>
				<div class="input"><input type="text" disabled value="${acc.name }"/></div>
			</div>
			<div class="row">  
				<div class="title">잔액</div>
				<div class="input"><input type="text" disabled value="${acc.balance }"/></div>
			</div>
			<div class="row">  
				<div class="title">종류</div>
				<div class="input"><input type="text" disabled value="${acc.type }"/></div>
			</div>
			<c:if test="${acc.type eq 'special' }">
			<div class="row">  
				<div class="title">등급</div>
				<div class="input"><input type="text" disabled value="${acc.grade }"/></div>
			</div>
			</c:if>
		</div>
</body>
</html>