<%@page import="com.aca.web0810.model.BoardDAO"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<!-- jsp에서는 태그이지만, 오직 서버에서만 실행될수있는 빈즈태그를 지원해준다  -->
<%request.setCharacterEncoding("utf-8"); %>
<jsp:useBean id="board" class="com.aca.web0810.domain.Board"/>
<jsp:setProperty property="*" name="board"/> 
<%! BoardDAO boardDAO = new BoardDAO();%>
<%
	//넘겨받은 파라미터들을 이용하여 DB에 update(boardDAO로)
	// update board set title=?, writer=?, content=? where board_id=?
	int result = boardDAO.update(board);
	
	out.print("<script>");
		if(result == 0) {
			out.print("alert('수정실패');");
			out.print("history.back();"); // 상세페이지로 다시 보여줌 (브라우저의 뒤로가기 버튼을 js로 처리)
		} else {
			out.print("alert('수정성공');");
			out.print("location.href='/notice/content.jsp?board_id="+board.getBoard_id()+"';");

		}
		out.print("</script>");

%>