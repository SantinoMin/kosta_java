<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.campaign_first_header{
	  display: grid;
	  grid-template-columns: 1fr 2fr;
	  grid-gap: 10px;
	  border: 1px solid white;
	  margin: auto;
	  padding: 30px;
	  width: 1200px;
	  height: 350px;
	  border-radius:10px;
	  background-color : white;
	  box-shadow: rgba(0, 0, 0, 0.08) 0px 4px 64px 0px;

	}
	.campaignaddress{
		width: 1200px;
		height: 50px;
		border :0px;
		margin: auto;
		padding: 28px 28px; 0px; 28px;	
		font-size : 15px;	
	}
	.middletext {
		width: 1200px;
		height: 50px;
		border :0px;
		margin: auto;
		font-size : 25px;
		line-height: center;
		padding: 10px;
		
	}
	.middle_text_img{
		width:25px;
		height:25px;
		border-radius:1px;
	}
	.date_information {
		width: 1200px;
		height: 70px;
		margin: auto;	
		border: 1px solid white;
		border-radius:10px;
		background-color : white;
		line-height: 35px;
		padding : 0px 0px 0px 40px;
		box-shadow: rgba(0, 0, 0, 0.08) 0px 4px 64px 0px;
		font-size : 15px;
		
	}
	.basic_info{
		width: 1200px;
		height: 1050px;
		margin: auto;	
		border: 1px solid white;
		border-radius:10px;
		background-color : white;
		box-shadow: rgba(0, 0, 0, 0.08) 0px 4px 64px 0px;
	}
	.prodname{
		width: 1120px;
		height: 40px;
		margin: auto;	
		border: 1px solid gray;
		border-radius:10px;
		background-color : white;
		line-height: 40px;
		padding : 0px 0px 0px 40px;
		font-size : 15px;
		
	}
	.prodbut{
		font-size:15px; 
		width: 80px;
		height: 32px;
		color : black;
		background-color : white; 
		border: 1px solid gray;
		border-radius: 10px; 
		
	}

	.campaign_request{
		width: 1120px;
		height: 400px;
		background-color : #FAFAFA; 
		border: 0px solid gray;
		border-radius:20px; 
		padding : 10px 10px 0px 10px;
		text-align : left;
		word-break: normal;
	}
	.content{
		width: 1120px;
		height: 60px;
		margin: auto;	
		background-color : #FAFAFA; 
		border: 0px solid gray;
		border-radius:10px;
		line-height: 30px;
		padding : 0px 0px 0px 20px; 
		font-size : 15px;
		
	}
	.con_middle{
		padding : 0px 0px 0px 40px; 
		word-break: normal;
		font-size : 15px;
	}
	.chanimg{
	
		width: 1150px;
		height:  50px;
		padding : 0px 0px 0px 40px;
		display: inline-block;
		

	
	}
	.channel{
	
		width : 23px;
		height : 23px;
		position:relative;
		top: 5px;

	}
	.channel_font{
		font-size : 15px;
		line-height: 30px;
		text-align: center;
	}
	.channel_outline{
	 	
		border: 1px solid gray;
		border-radius:10px;
		display : inline-block;
		width : 120px;
		height:35px;
		text-align: center;

	}
	.container{
	  width: 800px;
	  height: 800px;
	  overflow: hidden;
	  position: relative;
	}
	.bookmark{
		padding : 15px 10px 0px 10px; 
		width:80px;
		height:70px;
		float: left;  
		margin-left: 100px; 
		top: 100%;
	    left: 50%;
	    transform: translate(-20%, -20%)
	}
	.basic_login{
		width:320px; 
		height:50px; 
		font-size:25px; 
		color : white; 
		background-color : blue; 
		border-radius:10px; 
		text-align: center;
		

	}
	
	.basic_btn{
	
		width:320px; 
		height:50px; 
		font-size:25px; 
		color : white; 
		background-color : blue; 
		border-radius:10px; 
		text-align: center;
		position: absolute;
	    top : 2px;
	    left: 220px;
	}
		/* 	---- 스위치 ----*/
	.wrapper { position: relative; }
	#switch {
	  position: absolute;
	  /* hidden */
	  appearance: none;
	  -webkit-appearance: none;
	  -moz-appearance: none;
	}
	.switch_label {
	  position: relative;
	  cursor: pointer;
	  display: inline-block;
	  width: 58px;
	  height: 28px;
	  background: #fff;
	  border: 2px solid blue;
	  border-radius: 20px;
	  transition: 0.2s;
	}
	.switch_label:hover {
	  background: #efefef;
	}
	.onf_btn {
	  position: absolute;
	  top: 3px;
	  left: 5px;
	  display: inline-block;
	  width: 19px;
	  height: 19px;
	  border-radius: 20px;
	  background: blue;
	  transition: 0.2s;
	}
	#switch:checked+.switch_label {
	  background: blue;
	  border: 2px solid blue;
	}

	#switch:checked+.switch_label:hover {
	  background: bule;
	}
	
	/* move */
	#switch:checked+.switch_label .onf_btn {
	  left: 33px;
	  background: #fff;
	  box-shadow: 1px 2px 3px #00000020;
	}
	
	
</style>
</head>
<body>
<%@ include file="header.jsp" %>
	<br>
	<div class="campaignaddress">
		<div>홈 >캠페인>비거너리어쩌구저쩌구 주소</div>

	</div>
	<br>
	<div class="campaign_first_header"  >
		<div class="img"><img src="img/campaign.png" style="width:380px;height:280px; border-radius:10px;"></div>
		<div class="imgtext">
			<div style="font-size:30px; color : white;  padding :10px;" >
				<span style="background-color : #000000; border-radius:10px; margin-left: 95px;">&nbsp;<b>모집완료</b>&nbsp;</span>
				<span class="wrapper">
					  <input type="checkbox" id="switch" >
					  <label for="switch" class="switch_label" >
					    <span class="onf_btn" ></span>
					  </label>
				</span>
			</div>
			<br>
			<div>
				<span style="font-size:25px; text-align: left; padding :10px; 	margin-left: 90px;"><b>블로그</b></span>&nbsp;|&nbsp;<a style="font-size:25px; padding :10px;"><b>제품</b></a>
			</div>
			<br>
			<div style="font-size:25px; text-align: left; padding :10px; margin-left: 90px;"><b>[24-7]비거너리 멀티 비타민 앤뷰티리뷰</b></div>
			<div style="font-size:20px; text-align: left; padding :20px; margin-left: 80px;">2024-07-30~2024-05-14</div>
			<br>
			<div >
<!-- 				<div style=" text-align: center;">
					<a href="signIn.jsp" type="button" class="basic_login" >로그인후 신청해주세요</a>
				</div> -->
				<div  class= "container">
					<img src="img/북마크.png" class="bookmark">
					<input type="button"  class="basic_btn" value = "제안하기">
				</div>
			</div>
		</div>	
	
	</div>
		<div>
			<br>
			<br>
			<div class="middletext"><img src="img/watch.png" class="middle_text_img"><b>일정정보</b></div>
			<div class="date_information">인플루언서모집기간 2024-07-10~2024-08-14<br>
								 광고기간 2024-08-27 ~ 2024-10-10</div>
		</div>
		<br>
		<br>
		<div class="middletext"><img src="img/information.png" class="middle_text_img"><b>기본정보</b></div>
	
		<div class="basic_info">
		<br>
			<div style="font-size:25px; padding : 10px 40px ;"><b>상품명</b></div>
			<div class="prodname">비거너리 멀티 비타민</div>
			<br>
			<div style="font-size:25px;padding : 10px 40px;"><b>카테고리</b></div>
			<div class="chanimg">
				<input type="button" class ="prodbut"  value = "식품">
			</div>
			<br>
			<br>
			<div style="font-size:25px; padding : 0px 40px 10px 40px;"><b>희망 캠페인 채널</b></div>
			<div class="chanimg" >
				<span class="channel_outline">
					&nbsp;<img src="img/유튜브로고.png" class="channel" ><a class="channel_font">유튜브</a> &nbsp;
				</span>
				<span class="channel_outline">
					&nbsp;<img src="img/인스타그램로고.png" class="channel" ><a class="channel_font">인스타그램</a>&nbsp;
				</span>
			</div>	
			<br>
			<br>
			<div style="font-size:25px; padding : 0px 40px 10px 40px;"><b>광고 요구 사항</b></div>
			<div class="con_middle"> 
				<div class="campaign_request" style="word-break: normal;"><br>내가 느낀 그를 향한 이끌림
									사랑이 아니기를 나는
									기도했었지
									나를 보는 안타까운 그 눈빛
									제발 나의 착각이길 바랬지
									지금이라도 피하고싶어
									오랫동안 친구의
									사랑이었던 그를
									하지만 이젠 너무나
									간절히 원하는
									서로의 마음 속일순 없어
									그 사람 때문에
									많은걸 잃게 되겠지
									힘들때마다 기대온 우정까지
									하지만 어렵게 시작된
									우리 사랑은
									하늘만은 허락할거야
									그 마음을 받아들인 후부터
									나는 친구 얼굴을 바로 볼 수 없었지
									변해가는 사랑속에 얼마나
									아파하는지 알고 있었기에
									정말 미안해 날 용서해줘
									이런 얘긴 이제는 아무 소용 없지만
									그래도 나를 조금만
									이해해주겠니
									그 없인 나도 견딜수 없어
									이 사람 때문에
									많은걸 잃게 되겠지
									힘들때마다 기대온 우정까지
									하지만 어렵게 시작된
									우리 사랑은
									하늘만은 허락할거야
									우리를 위해서 흘려진
									눈물 기억해
									그만큼 소중히 아낄게
				</div>
				</div>
				<br>
				<div style="font-size:25px; padding : 10px 40px;"><b>업체 URL</b></div>
				<div class="prodname">www.naver.com</div>
				<br>
				<div style="font-size:25px; padding : 10px 40px;"><b>콘텐츠 활용 안내</b></div>
				<br>
				<div class="content">캠페인에 선정되어 작성한 인플루언서 콘텐츠는 회사와 광고주가 활용할 수 있습니다. <br>
				이를 원하지 않는 경우 캠패인을 취소하서나 이미 진행중인 경우 고객센터를 통해 문의해주세요.</div>
		</div>
		<br>
		
		

</body>
<%@ include file="footer.jsp" %>
</html>