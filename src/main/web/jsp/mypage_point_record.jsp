<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>


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
    text-align:center;
    border-radius:20px;
    background-color:white;
    padding:10px 20px;
    box-shadow: rgba(0, 0, 0, 0.08) 0px 4px 6px 0px;
}

table {
    margin:0 auto;
    width: 90%;
    border-collapse:collapse;
    border-top:2px solid #e5e5e5;
    border-spacing: 0 10px;
}

tr {
    font-weight:bold;
    border-top:2px solid #e5e5e5;
    line-height:35px;
}
.td1{
    width: 20%;
}
.td2{
    width: 60%;
    text-align:left
}
.td3{
    width: 20%;
}
.td3 div:nth-child(1){
    color:#4849e8;
    font-weight:bold;
} 
.page {
    margin:10px auto;
    text-align:center;
    width:50%;
}
.pagination {
    list-style:none;
    display:inline-block;
    padding:0;
    margin:10px auto;

}
.pagination li {
   	float:left;
   	
    text-align:center;
    padding:0 12px;
}
.pagination a {
    float: left;
    text-align:center;
    display:inline- block;
    font-size:16px;
    text-decoration:none;
    
}
.pagination a.active {
    cursor:default; 
    font-weight:bold;
    color:#4849e8;
    text-decoration:underline;
}
.pagination a:active {
    outline:none;
}
.num {
	heigth:100%
}
.num:hover,.arrow:hover {
    background-color:lightgray;
}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div id="container">
    <%@ include file="sidebar_advertiser.jsp" %>
    <div id="main">
        <h2 style="font-weight:bold;text-align:left">포인트 관리</h2>
        <h3 style="font-weight:bold">사용가능포인트&nbsp;&nbsp;&nbsp;&nbsp;<span style="color:#4849E8; font-weight:bold">45,000</span></h3>
        <table>
            <tr>
                <td class="td1">충전</td>
                <td class="td2">포인트 충전</td>
                <td class="td3"><div>+5,000P</div><div>2024-07-25</div></td>
            </tr>
            <tr>
                <td class="td1">충전</td>
                <td class="td2">포인트 충전</td>
                <td class="td3"><div>+5,000P</div><div>2024-07-25</div></td>
            </tr>
            <tr>
                <td class="td1">충전</td>
                <td class="td2">포인트 충전</td>
                <td class="td3"><div>+5,000P</div><div>2024-07-25</div></td>
            </tr>
            <tr>
                <td class="td1">사용</td>
                <td class="td2">인플루언서 등록</td>
                <td class="td3"><div>-1,000P</div><div>2024-07-25</div></td>
            </tr>
        </table>
		    <div class="page">
		        <ul class="pagination">
		            <li> <a href="#" class="arrow left"><img src="https://img.icons8.com/?size=100&id=x3s0mSWBMJTc&format=png&color=939393" style="weight:20px;height:20px"></a></li>
		            <li> <a href="#" class="active num">1</a></li>
		            <li> <a href="#" class="num">2</a></li>
		            <li> <a href="#" class="num">3</a></li>
		            <li> <a href="#" class="num">4</a></li>
		            <li> <a href="#" class="arrow right"><img src="https://img.icons8.com/?size=100&id=IGZk6vp3nxFm&format=png&color=939393" style="weight:20px;height:20px"></a></li>
	        	</ul>
	    	</div>
    	</div>
	
</div>
    <%@ include file="footer.jsp" %>
</body>
</html>
