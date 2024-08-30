<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: santino
  Date: 24. 8. 26.
  Time: 오전 9:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>쿠키를 이용한 화면 설정 예제</title>
</head>
<body>

<c:choose>
<c:when test="${language eq 'korea'}">
  <h3>안녕하세요? 이것은 쿠키...</h3>
</c:when >
  <c:otherwise>
    <h3>Hello. This is Cookie...</h3>
  </c:otherwise>
</c:choose>

<form action="cookieEx" method="post">
  <input type="radio" name="language" value="korea"
  ${language eq 'korea' ? "checked": "" } >한국어 페이지 보기
  <input type="radio" name="language" value="english"
  ${language eq 'english' ? "checked": "" }  >영어 페이지 보기
  <input type="submit" value="설정">
</form>
</body>
</html>
