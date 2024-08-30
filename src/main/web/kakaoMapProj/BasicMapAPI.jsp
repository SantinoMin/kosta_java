
<%--// 현재 위치의 위,경도--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
  <script src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6ca55bf17f4d702ba52b38a97df5f394&libraries=services"></script>
</head>
<body>
<button id="currentPos">현재위치 지도 보기</button>
<div id="map" style="width:500px; height: 400px"></div>
<div id="currentAddress"></div>

<script>
var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
var geocoder = new kakao.maps.services.Geocoder();


var options = { //지도를 생성할 때 필요한 기본 옵션
center: new kakao.maps.LatLng(33.450701, 126.570667), //지도의 중심좌표.
level: 3 //지도의 레벨(확대, 축소 정도)
};


var btn = document.getElementById("currentPos");
btn.onclick = function() {
  if(!navigator.geolocation){
    alert("위치 정보가 지원되지 않습니다.")
    return ;
  }
  navigator.geolocation.getCurrentPosition(success);
}

var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴


//현재 위치와 조회 시간을 파라미터로 가지고 호출되는 함수
function success({coords, timestamp}) {
    const latitude = coords.latitude; //위도
    const longitude = coords.longitude; //경도

  console.log(`위도:${latitude}, 경도:${longitude}, 위치반환시간:${timestamp}`);
  var coords = new kakao.maps.LatLng(latitude, longitude);

  //지도 중심을 현재 위치로 이동
  map.setCenter(coords);


  geocoder.coord2Address(coords.getLng(), coords.getLat(), function(result, status) {
    if( status === kakao.maps.services.Status.OK){
      var detailAddr = result[0].address.address_name;
      document.getElementById('currentAddress').innerHTML = '현재 위치: ' + detailAddr;
    }
  })
}





</script>

</body>
</html>
