<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="./css/campaignNew.css">
</head>
<body>
	<%@ include file="header.jsp"%>
	<div id="categoryBar">
		<!-- javascript -->
		<h2>인플루언서</h2>
		<div class="categoryWrap">
			<input type="radio" id="all" name="category" value="all"><label for="all">전체</label>
			<input type="radio" id="fasion" name="category" value="fasion"><label for="fasion">패션</label>
			 <input type="radio" id="beauty" name="category" value="beauty"><label for="beauty">뷰티</label>
		 	 <input type="radio" id="daily" name="category" value="daily"><label for="daily">생활용품</label>
			 <input type="radio" id="sport" name="category" value="sport"><label for="sport">스포츠</label>
			 <input type="radio" id="travel" name="category" value="travel"><label for="travel">여행/숙박</label>
			 <input type="radio" id="goodTaste" name="category" value="goodTaste"><label for="goodTaste">맛집</label>
		</div>
	</div>
	<hr style="background-color: #a3a3a3; width: 1000px">
	<div class="channelBar">
		<h2>채널</h2>
		<div class="channelButton">
			<label> <input type="checkbox" name="instagram"
				value="instagram"> <span>인스타그램</span>
			</label> <label> <input type="checkbox" name="blog" value="blog">
				<span>블로그</span>
			</label> <label> <input type="checkbox" name="youtube"
				value="youtube"> <span>유튜브</span>
			</label>
		</div>
	</div>
	<div class="allBar">
		<h2>전체</h2>
		<div class="search">
			<input type="text" placeholder="검색">
			<button id="searchButton"></button>
		</div>
		<button id="registerButton" onclick="location.href='register.jsp'">캠페인 등록하기</button>
	</div>
	<div class="campaignWrap">
		<div class="campaign_pick" id="pickNum1"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
		<div class="campaign_pick" id="pickNum2"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
		<div class="campaign_pick" id="pickNum3"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
		<div class="campaign_pick" id="pickNum4"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
		<div class="campaign_pick" id="pickNum5"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
		<div class="campaign_pick" id="pickNum6"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
		<div class="campaign_pick" id="pickNum7"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
		<div class="campaign_pick" id="pickNum8"
			onclick="location.href='campaign_detail.jsp'">
			<img src="image/campaign.png"
				style="width: 230px; height: 250px; border-radius: 20px; margin-bottom: 15px">
			<div>인스타그램 | 패션</div>
			<div id="channelName">히든클리프</div>
			<div id="title">[24-8]제주 히든클리프 호텔</div>
			<div>2024-07-29 ~ 2024-08-05</div>
		</div>
	</div>
	<%@include file="footer.jsp" %>
</body>
</html>