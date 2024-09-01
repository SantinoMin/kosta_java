<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	#container {
		margin:20px auto;
		padding:20px 0px;
		width:1200px;
		border-radius:20px;
		text-align:center;
	}
	#items {
		padding:20px;
		display:flex;
		justify-content:space-between;
		margin:0 auto;
		width:800px;
		align-items:center;
		text-align:center;
		border-top:1px solid #e5e5e5;
		border-bottom:1px solid #e5e5e5;
	}
	.labl{
		display:flex;
		width:150px;
		height:300px;
		border-radius:10px;
		border:2px solid #e5e5e5;
	}
	.labl > input {
		display:none;
	}
	.labl > div {
		width:100%;
		height:100%;
		display:flex;
		flex-direction:column;
		align-items: center;
  		justify-content: center;
	}
	.labl>div>* {
		padding:10px 0 10px 0;
	}
	
	.labl > input + div {
		cursor:pointer;
	}
	.labl > input:checked + div{ /* (RADIO CHECKED) DIV STYLES */
    	background-color:#4849E8;
    	border-radius:10px;
    	border: 2px solid #4849E8;
	}
	.blue {
		color: #4849E8;
	}
	.bold {
		font-weight:800;
	}
	.labl > input:checked + div > div{ 
       	color:white;
   	}
   	form {
   		padding-top:30px;
   		padding-bottom:30px;
   	}
   	#submit >input + div{
   		cursor:pointer;
   	}
   	#submitbtn {
   		font-size:16px;
   		display:block;
  		vertical-align:middle;
   		width:100px;
   		height:auto;
   		margin:20px auto;
   		background-color:#4849E8;
   		color:white;
   		border:solid 1px #4849E8;
    	border-radius:10px;
    	text-align:center;
    	padding: 9px 12px 7px;
    	cursor:pointer;
   	}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div id="container">
	<h1 style="font-weight:bold;">포인트 결제하기</h1>
	
		<div id="items">
			<label class="labl" for="1000p">
				<input type="radio" name="point" id="1000p" value="1,000포인트">
				<div><img src="https://img.icons8.com/?size=100&id=iRgwumOATYL6&format=png&color=000000">
					<div class="blue bold">1,000포인트</div><div>10,000원</div>
				</div>
			</label>
			<label class="labl" for="3100p">
				<input type="radio" name="point" id="3100p" value="3,100포인트">
				<div><img src="https://img.icons8.com/?size=100&id=EAJO2Tj4XI6Z&format=png&color=000000">
					<div class="blue bold">3,100포인트</div><div>30,000원</div>
				</div>
			</label>
			<label class="labl" for="5300p">
				<input type="radio" name="point" id="5300p" value="5,300포인트">
				<div><img src="https://img.icons8.com/?size=100&id=3Qj1WJsYS8T4&format=png&color=000000">
					<div class="blue bold">5,300포인트</div><div>50,000원</div>
				</div>
			</label>
			<label class="labl" for="11000p">
				<input type="radio" name="point" id="11000p" value="11,000포인트">
				<div><img src="https://img.icons8.com/?size=100&id=h3USDbkfsNWM&format=png&color=000000">
					<div class="blue bold">11,000포인트</div><div>100,000원</div>
				</div>
			</label>
		</div>
		<div>
			<button id="submitbtn">결제하기</button>
		</div>
	</div>
<%@ include file="footer.jsp" %>  
</body>
<script src="http://code.jquery.com//jquery-latest.min.js"></script>
<script src="https://cdn.iamport.kr/v1/iamport.js"></script>
    <script>
    
    	document.getElementById("submitbtn").onclick = function(e){
    		requestPay();
    	}
    
        function requestPay() {
            IMP.init("imp18223576"); // 예: 'imp00000000'
            const checkPoint = document.querySelector('input[name="point"]:checked');
            const pointAmount = checkPoint==null ? null: checkPoint.value;
            IMP.request_pay(
                    {
                        pg: "html5_inicis.INIpayTest",
                        pay_method: "card",
                        merchant_uid: `order_no_0001`+new Date().getTime(), // 주문 고유 번호
                        name: pointAmount,
                        amount: 100,
                        buyer_email: "kmj0376@naver.com",
                        buyer_name: "김민준",
                        buyer_tel: "010-9954-0377",
                        buyer_addr: "서울특별시 강남구 신사동",
                        buyer_postcode: "01181",
                    },
                    function (response) {
                        if (response.success) {
                            alert('결제가 완료되었습니다.');
                            $.ajax({
                            	
                            })
                            location.replace("http://localhost:8080/semi/mypage_point_record.jsp")
                        } else {
                            alert('결제 실패');
                            console.log(response);
                        }
                    },
                );
        }
    </script>
</html>