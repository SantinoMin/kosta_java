<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
<script src="https://code.jquery.com/jquery-3.7.1.js" integrity="sha256-eKhayi8LEQwp4NKxN+CfCh+3qOVUtJn3QNZ0TciWLP4=" crossorigin="anonymous"></script>
<style>

#container {
    display: flex;
    margin:30px auto;
	padding:0;
    width:1200px;
}
#sidebar {
    flex-basis:25%;
    display:flex;
    flex-direction:column;
    align-items:center;
}
.sideitem {
    background-color:white;
    width:100%;
    text-align:left;
    border-radius:20px;
    margin:10px auto;    
}
#profileimg {
    width: 100px;
    height: 100px;
    background-color:#4849e8;
    border-radius:50%; 
    margin:0 auto;
}
.profilebtn {
    display: inline-block;
    background-color:#e5e5e5;
    border-radius:10px;
    width:40px;
    height:auto;
    padding:4px 12px;
    margin:10px 10px;
}
.sideitem ul {
    list-style:none;
	margin:1em 0;
    padding-left: 20px;
}
.sideitem ul li {
    margin:10px 0;
}
.sideitem a {
    font-weight:bold;
    text-decoration:none;
	color:black;
}
.icons {
    align-items:center;
    vertical-align:middle;
    width: 30px;
    height:30px;
    margin-right:10px;
}
#main {
    flex-basis:75%;
    padding-left:40px;
}
#mainwrap {
    text-align:left;
    border-radius:20px;
    background-color:white;
    padding:10px 20px;
}
#filter {
    display:flex;
    margin:20px auto;
    padding:0px 0px 0px 25px;
}
.filterbtn {
    border:2px solid #939393;
    border-radius:20px;
    text-align:center;
    width:140px;
    height: 40px;
    line-height:25px;
    margin-right:10px;
    padding:4px 6px;
}
#campaignwrap {
    display:flex;
    flex-flow:wrap;
    justify-content:space-between;
    border:1px solid #e5e5e5;
    border-radius:10px;
    
}
.campaign {
    display:flex;
    flex-direction:column;
    margin:20px 10px; 
    padding:10px;
    align-items:left;
}
.campaign >.name {
	padding:5px 0px 0px 0px; ;
    font-weight:bold;
    font-size: 18px;
}
.campaign >.channel{
	font-color: gray;
	padding:5px 0px 0px 0px; 
}
.campaign >.compuny_name{
	padding:5px 0px 0px 0px; 
}

.campaign >.date{
	padding:5px 0px; 
}
.btn {
    border:2px solid black;
    border-radius:10px;
    width: 100px;
    height:auto;
    text-align:center;
    padding:4px 12px;
    margin:8px auto;
}
.campaign .btn:hover {
    cursor: pointer;
}

#showlist {
    width:100%;
    align-items:center;
    vertical-align:middle;
    margin:0 auto;
}
#showlist table {
    text-align:center;
    font-size:20px;
    margin:10px auto;
    width:100%;
    line-height:50px;
    border-collapse: separate;
    border-spacing: 0;
    border:1px solid #e5e5e5;
}
#showlist table th{
    font-weight:bold;
    background-color:#4849E8;
    color:white;
    border-collapse: collapse;
}
#showlist tr:nth-child(even) td {
  background: #eaeaed;
}
.result_total{
	display : flex;
}


.result {
	width : 60px;
	hight :20px;
	font-size : 20px;
	border:1px solid black;
	border-radius:20px;
	pading : 20px 0px 0px 20px;
    text-align:center;
}




</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div id="container">
	<%@ include file="sidebar.jsp" %>
    <div id="main">
        <h1 style="font-weight:bold;text-align:left; padding:0px 0px 0px 25px;">나의 요청 현황</h1>
        <div id="filter">
            <div class="filterbtn">신청한 캠페인</div>
            <div class="filterbtn">요청받은 캠페인</div>
        </div>
        <div id="mainwrap">
	        <h2 style="font-weight:bold">신청한 캠페인</h2>
	        <div id="campaignwrap">
	            <div class="campaign" id="campaignNum1">
	                <div class="img">
	                <a href="inpluenser_detail.jsp"><img src="image/campaign.png" style="width:200px;height:200px"></a></div>
	                <div class="channel">블로그</div>
	                <div class="compuny_name"><b>히든클리프</b></div>
	                <div class="name"><b>[24-8]제주히든 클리프호텔</b></div>
	                <div class="date">2024-01-01 ~ 2024-01-15</div>
	                <div class="result_total">
	                	<div class="result">수락</div>&nbsp;<div class="result">대기</div>&nbsp;<div class="result">거절</div>
	                </div>
	
	            </div>
	            <div class="campaign" id="campaignNum1">
	                <div class="img">
	                <a href="inpluenser_detail.jsp"><img src="image/campaign.png" style="width:200px;height:200px"></a></div>
	                <div class="channel">블로그</div>
	                <div class="compuny_name"><b>히든클리프</b></div>
	                <div class="name"><b>[24-8]제주히든 클리프호텔</b></div>
	                <div class="date">2024-01-01 ~ 2024-01-15</div>
	                <div class="result_total">
	                	<div class="result">수락</div>&nbsp;<div class="result">대기</div>&nbsp;<div class="result">거절</div>
	                </div>
	
	            </div>
	            <div class="campaign" id="campaignNum1">
	                <div class="img">
	                <a href="inpluenser_detail.jsp"><img src="image/campaign.png" style="width:200px;height:200px"></a></div>
	                <div class="channel">블로그</div>
	                <div class="compuny_name"><b>히든클리프</b></div>
	                <div class="name"><b>[24-8]제주히든 클리프호텔</b></div>
	                <div class="date">2024-01-01 ~ 2024-01-15</div>
	                <div class="result_total">
	                	<div class="result">수락</div>&nbsp;<div class="result">대기</div>&nbsp;<div class="result">거절</div>
	                </div>
	
	            </div>
	      
	            <div class="campaign" id="campaignNum1">
	                <div class="img">
	                <a href="inpluenser_detail.jsp"><img src="image/campaign.png" style="width:200px;height:200px"></a></div>
	                <div class="channel">블로그</div>
	                <div class="compuny_name"><b>히든클리프</b></div>
	                <div class="name"><b>[24-8]제주히든 클리프호텔</b></div>
	                <div class="date">2024-01-01 ~ 2024-01-15</div>
	                <div class="result_total">
	                	<div class="result">수락</div>&nbsp;<div class="result">대기</div>&nbsp;<div class="result">거절</div>
	                </div>
	
	            </div>
			</div>
        <div id="showlist">
        </div>
        </div>
    </div>
    
</div>    
</body>
<%@ include file="footer.jsp" %>
<script>
    function showlist(e) {
        var campaignNum = $(e.target).parent().attr('id');
        console.log(campaignNum);
        var list = $('#'+campaignNum).children('.applylist').clone().children('table');
       
        $('#showlist').html(list);
    }
</script>
</html>