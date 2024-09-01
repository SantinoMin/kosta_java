<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

<script src="https://code.jquery.com/jquery-3.7.1.js"></script>
<style>

#container {
    display: flex;
    margin:30px auto;
	padding:0;
    width:1200px;
}
#main {
    width:75%;
    margin-left:40px;
    text-align:left;
    border-radius:20px;
    background-color:white;
    padding:10px 20px;
    box-shadow: rgba(0, 0, 0, 0.08) 0px 4px 6px 0px;
}

#filter {
    display:flex;
    margin:20px auto;
}
.filterbtn {
    border:2px solid #939393;
    border-radius:10px;
    text-align:center;
    width:80px;
    margin-right:10px;
    padding:4px 6px;
}
#campaignwrap {
    display:flex;
    flex-flow:wrap;
    justify-content:space-between;
    border:1px solid #e5e5e5;
    border-radius:10px;
    margin:10px auto;
}
.campaign {
    display:flex;
    flex-direction:column;
    margin:20px 10px; 
    padding:10px;
    align-items:center;
}
.campaign > div {
	margin:4px auto;
}
.campaign >.name {
    font-weight:bold;
    font-size:large;
}
.btn {
    border:2px solid #4849E8;
    border-radius:10px;
    width: 130px;
    height:auto;
    text-align:center;
    padding:4px 12px;
    margin:8px auto;
    background-color:white;
}

.btn:hover {
    cursor: pointer;
}
.modal {
	display:flex;
	position:fixed;
	top:0;
	left:0;
	item-aligns:center;
	justify-content: center;
	width:100%;
	height:100%;
	background-color: rgba(0,0,0,0.4);
	visibility:hidden;
	opacity:0;
}
.show-modal {
	visibility:visible;
	opacity:1;   
}
.modal_body{
	position:absolute;
 	top:50%;  
	width:1000px; 
	height:auto;  
	padding:10px 20px 20px 20px;  
	text-align: center;
 	background-color: rgb(255,255,255); 
 	border-radius:10px; 
 	box-shadow:0 2px 3px 0 rgba(34,36,38,0.15); 
	transform:translateY(-50%); 
	
}
.closebtn {
	float:right;
    width: auto;
    height:auto;
    text-align:center;
    padding:4px 12px;
    margin:0 auto;
    background-color:white;
    cursor: pointer;
}
.modal table {
    text-align:center;
    font-size:20px;
    margin-top:10px;
    width:100%;
    line-height:50px;
    border-collapse: separate;
    border-spacing: 0;
    border:1px solid #e5e5e5;
}

.modal table th{
    font-weight:bold;
    background-color:#4849E8;
    color:white;
    border-collapse: collapse;
}
.modal table img {
	vertical-align:middle;
}

.modal tr:nth-child(even) td {
  background: #eaeaed;
}
.applylist input {
	border:2px solid #4849E8;
    border-radius:10px;
    width: 50px;
    height:auto;
    text-align:center;
    padding:4px 12px;
    margin:8px auto;
    background-color:white;
}
.sendemail .modal_body {
	width:600px;
	text-align:center;
}
</style>

</head>
<body>
<%@ include file="header.jsp" %>
<div id="container">
	<%@ include file="sidebar_advertiser.jsp" %>
    <div id="main">       
    	<h1 style="font-weight:bold;text-align:left">나의 캠페인 현황</h1>
        <div id="filter">
            <div class="filterbtn"><a href="#">전체</a></div>
            <div class="filterbtn"><a href="#">모집중</a></div>
            <div class="filterbtn"><a href="#">모집종료</a></div>
        </div>
        <h2 style="font-weight:bold">전체 캠페인</h2>
        <div id="campaignwrap">
        <form action="#" method="get">
            <div class="campaign" id="campaignNum1">
                <div class="img"><img src="https://dummyimage.com/200x200/000000/fff" style="width:200px;height:200px"></div>
                <div class="name">캠페인 제목</div>
                <div class="date">2024-01-01 ~ 2024-01-15</div>
                <button class="email btn">이메일발송</button>
                <button class="apply btn">신청 목록</button>
            </div>
		</form>                
            <div class="campaign" id="campaignNum2">
                <div class="img"><img src="https://dummyimage.com/200x200/000000/fff" style="width:200px;height:200px"></div>
                <div class="name">캠페인 제목</div>
                <div class="date">2024-01-01 ~ 2024-01-15</div>
                <button class="email btn">이메일발송</button>
                <button class="apply btn">신청 목록</button>
                
            </div>
            <div class="campaign" id="campaignNum3">
                <div class="img"><img src="https://dummyimage.com/200x200/000000/fff" style="width:200px;height:200px"></div>
                <div class="name">캠페인 제목</div>
                <div class="date">2024-01-01 ~ 2024-01-15</div>
                <button class="email btn">이메일발송</button>
                <button class="apply btn">신청 목록</button>
                
            </div>
            
            <div class="campaign" id="campaignNum4">
                <div class="img"><img src="https://dummyimage.com/200x200/000000/fff" style="width:200px;height:200px"></div>
                <div class="name">캠페인 제목</div>
                <div class="date">2024-01-01 ~ 2024-01-15</div>
                <button class="email btn">이메일발송</button>
                <button class="apply btn">신청 목록</button>
            </div>
            
        </div>
    </div>
<div class="modal applylist">
	<div class="modal_body">
	<button class="closebtn"><img src="https://img.icons8.com/?size=100&id=J3PhU48KWI9A&format=png&color=000000" style="width:20px;height:20px"></button><br>
	<form action="#" method="post">
	<table>
		<h2>신청한 인플루언서</h2>
	    <thead>
	        <th>닉네임</th><th>카테고리</th><th>채널</th><th>수락</th>
	    </thead>
	    <tr>
	        <td><img src="https://img.icons8.com/?size=30&id=NjOjDSZRU0Ma&format=png&color=4849e8">&nbsp;홍길동</td><td>식품</td><td>유튜브,인스타그램</td><td><input type="submit" name="status" value="수락" class="btn"></td>
	    </tr>
	    <tr>
	        <td><img src="https://img.icons8.com/?size=30&id=NjOjDSZRU0Ma&format=png&color=4849e8">&nbsp;홍길동</td><td>식품</td><td>유튜브</td><td><input type="submit" name="status" value="수락" class="btn"></td>
	    </tr>
	    <tr>
	        <td><img src="https://img.icons8.com/?size=30&id=NjOjDSZRU0Ma&format=png&color=4849e8">&nbsp;홍길동</td><td>식품</td><td>유튜브</td><td><input type="submit" name="status" value="수락" class="btn"></td>
	    </tr>
	    
      </table>
      </form>
     </div>
</div>
<div class="modal sendemail">
	<div class="modal_body">
	<button class="closebtn"><img src="https://img.icons8.com/?size=100&id=J3PhU48KWI9A&format=png&color=000000" style="width:20px;height:20px"></button><br>
	<form action="#" method="post">
		<h2 style="color:#4849e8;">이메일 발송기능이란?</h2>
		<p>상품 카테고리와 희망광고채널이 일치하는 인플루언서에게 캠페인을 알리는 이메일을 보내줍니다.<br> 더 많은 인플루언서에게 자사 제품을 홍보 요청해보세요.</p>
		<p> &#8251;해당되는 모든 인플루언서들에게 이메일을 발송합니다.</p>
		<input type="submit" name="status" value="이메일 발송" class="btn" >
	</form>
	</div>
</div>
</div>
<%@ include file="footer.jsp" %>    
</body>
<script>
	$(".apply").on('click',function(){
		$(".applylist").addClass('show-modal');
	})
	$(".email").on('click',function(){
		$(".sendemail").addClass('show-modal');
	})
	$(".closebtn").on('click',function(){
		$(".applylist").removeClass('show-modal');
		$(".sendemail").removeClass('show-modal');
	})
		

</script>

</html>