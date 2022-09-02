<%@page import="com.academy.model2app0831.blood.model.BloodManager"%>
<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<%
	String msg=(String)request.getAttribute("data");
	out.print(msg);
%>
선택한 혈액형에 대한 결과 판단
<%=msg %>
</body>
</html>
<!-- 현업에서는 jsp는 디자인으로만 사용한다.. -->
