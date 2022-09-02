<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>혈액형</title>
<script>
function getResult() {
	var form=document.querySelector("form");
	form.action="/blood.do";
	form.method="post";
	form.submit();
}
</script>
</head>
<body>
	<form>
		<select name="blood">
			<option>혈액형 선택</option>
			<option value="A">A형</option>
			<option value="B">B형</option>
			<option value="O">O형</option>
			<option value="AB">AB형</option>
		</select>
	</form>
	<button onclick="getResult()">결과보기</button>
</body>
</html>