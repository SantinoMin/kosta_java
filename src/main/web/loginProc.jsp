<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	String id=request.getParameter("id");
	String password=request.getParameter("password");
	String type=request.getParameter("type");
	
	if(id.equals("java") && password.equals("1234")) {
		session.setAttribute("id", id);
		pageContext.forward("loginSuccess.jsp");
	} else {
		pageContext.forward("loginFail.jsp");
	}
	
	
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
</body>
</html>