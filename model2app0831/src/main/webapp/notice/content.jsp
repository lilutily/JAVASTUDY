<%@page import="com.academy.model2app0831.domain.Notice"%>
<%@ page contentType="text/html; charset=utf-8"%>
<%
	Notice notice=(Notice)request.getAttribute("notice");
	out.print(notice);
%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Bootstrap Example</title>
  <meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.6.0/dist/jquery.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
$(function(){
	// 버튼이 두개 이므로 배열로 존재
	$($("button")[0]).click(function () {
		if(confirm("수정하시겠습니까?")) {
			$("form").attr({
				action:"/notice/edit.do",
				method:"post"
			});
			$("form").submit();
		}
	});
	
	$($("button")[1]).click(function () {
		if(confirm("삭제하시겠습니까?")) {
			$(location).attr({
				href:"/notice/delete.do?notice_id=<%=notice.getNotice_id()%>"
			});
		}
	});
});
</script>
  
</head>
<body>

<div class="container">
  <h2>상세보기</h2>
  <form class="was-validated">
  	<input type="hidden" name="notice_id" value="<%=notice.getNotice_id()%>">
  
    <div class="form-group">
      <input type="text" class="form-control" placeholder="제목입력" name="title" required>
    </div>
    
    <div class="form-group">
      <input type="text" class="form-control" placeholder="작성자" name="writer" required>
    </div>
    
    <div class="form-group">
      <textarea class="form-control" name="content"></textarea>
    </div>
    
    <button type="button" class="btn btn-primary">수정</button>
    <button type="button" class="btn btn-primary">삭제</button>
    <button type="button" class="btn btn-primary" onclick="location.href='/notice/list.do'">목록</button>
  </form>
</div>

</body>
</html>
