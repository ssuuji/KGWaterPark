<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
     <%  
     long currentTime = new Date().getTime();
     int idenid = (int)currentTime;
     %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>본인확인</title>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.7.0.min.js" ></script>
<script type="text/javascript" src="https://cdn.iamport.kr/js/iamport.payment-1.2.0.js"></script>
  <link rel="stylesheet" href="${pageContext.request.contextPath }/resources/css/loading.css" />


<meta charset="UTF-8">
</head>
<body>
<script>
//교차 사이트 요청에서 쿠키를 보내는 경우 (제3자 사용을 허용)
document.cookie = "Secure=Secure; SameSite=None; Secure";

//// 교차 사이트 요청에서 쿠키를 보내지 않는 경우
//document.cookie = "Strict=Strict; SameSite=Strict";
//// 또는
document.cookie = "SameSite=Lax";

$(function(){
 var IMP = window.IMP; // 생략 가능
 IMP.init('imp55773133'); // 'iamport' 대신 부여받은 "가맹점 식별코드"를 사용

 IMP.certification({
     merchant_uid: <%=idenid%>
 }, function(rsp) {
     if (rsp.success) {
         jQuery.ajax({
             url: "che.do",
             method: "POST",
             headers: { "Content-Type": "application/json" },
             data: JSON.stringify({ 'imp_uid': rsp.imp_uid })
          }).done((data) => {
        	  var name_tel = data; // 데이터가 배열 형태가 아니므로 수정
              var name = name_tel[0];
              var tel = name_tel[1];

              if (name_tel[2]===undefined) { // name과 tel 데이터가 정상적으로 존재하는지 확인
                  location.href = "memberInsertForm.do?name=" + name + "&tel=" + tel;
               } else {
                  // 이미 가입된 회원일 때
       window.open("alReady.do?name=" + name + "&tel=" + tel, '_blank', 'width=500,height=400');
              }
          })
     } else {
         msg = '인증에 실패하였습니다.';
         msg += '실패 사유 : ' + rsp.error_msg;
         location.href="login.do";
         alert(msg);
     }
 }); 
});
</script>
<div class="wrapper"> 
  <a href="#" class="btn">
    <span>KG&nbsp;WaterPark</span>
  </a> 
<h1> </h1>
<!-- <div class="loading-container">
    <div class="loading"></div>
    <div id="loading-text">loading</div>
</div> -->

<h2></h2>

</div> 
</body>
</html>