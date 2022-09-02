<%@ page contentType="text/html; charset=utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>영화</title>
<script>
function getResult() {
	var form=document.querySelector("form");
	form.action="/movie.do";
	form.method="post";
	form.submit();
}
</script>
</head>
<body>
	<form>
		<select name="movie">
			<option>영화 선택</option>
			<option value="우영우">우영우</option>
			<option value="오징어게임">오징어게임</option>
			<option value="탑건">탑건</option>
			<option value="헐크">헐크</option>
		</select>
	</form>
	<button onclick="getResult()">결과보기</button>
</body>
</html>