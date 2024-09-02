<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../css/bookmark.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<div class="container">
		<h1>북마크 관리</h1>
		<div class=bookmark_wrap>
			<h2>북마크한 인플루언서</h2>
			<div class="bookmark_list">
				<div class="bookmark_pick" id="pickNum1"
					onclick="location.href='influencer_detail.jsp'">
					<img src="image/inf.png"
						style="width: 200px; height: 270px; border-radius: 20px">
					<div>뷰티|패션</div>
					<div id="channel_name">채널명</div>
					<div id="introduce">직장인의 데일리룩 올리는 블로거</div>
					<div>구독자 수 8,000명</div>
				</div>
				<div class="bookmark_pick" id="pickNum2"
					onclick="location.href='influencer_detail.jsp'">
					<img src="image/inf.png"
						style="width: 200px; height: 270px; border-radius: 20px">
					<div>뷰티|패션</div>
					<div id="channel_name">채널명</div>
					<div id="introduce">직장인의 데일리룩 올리는 블로거</div>
					<div>구독자 수 8,000명</div>
				</div>
				<div class="bookmark_pick" id="pickNum3">
					<img src="image/inf.png"
						style="width: 200px; height: 270px; border-radius: 20px">
					<div>뷰티|패션</div>
					<div id="channel_name">채널명</div>
					<div id="introduce">직장인의 데일리룩 올리는 블로거</div>
					<div>구독자 수 8,000명</div>
				</div>
				<div class="bookmark_pick" id="pickNum4">
					<img src="image/inf.png"
						style="width: 200px; height: 270px; border-radius: 20px">
					<div>뷰티|패션</div>
					<div id="channel_name">채널명</div>
					<div id="introduce">직장인의 데일리룩 올리는 블로거</div>
					<div>구독자 수 8,000명</div>
				</div>
				<div class="bookmark_pick" id="pickNum5">
					<img src="image/inf.png"
						style="width: 200px; height: 270px; border-radius: 20px">
					<div>뷰티|패션</div>
					<div id="channel_name">채널명</div>
					<div id="introduce">직장인의 데일리룩 올리는 블로거</div>
					<div>구독자 수 8,000명</div>
				</div>
				<div class="bookmark_pick" id="pickNum6">
					<img src="image/inf.png"
						style="width: 200px; height: 270px; border-radius: 20px">
					<div>뷰티|패션</div>
					<div id="channel_name">채널명</div>
					<div id="introduce">직장인의 데일리룩 올리는 블로거</div>
					<div>구독자 수 8,000명</div>
				</div>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp" %>
</body>
</html>