<%@page import="com.aca.web0810.model.BoardDAO"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%! BoardDAO boardDAO= new BoardDAO();%>
<%
	String board_id=request.getParameter("board_id");
	out.print(" board_id : "+board_id);
	
	int result = boardDAO.delete(Integer.parseInt(board_id)); // 삭제 수행
	
		out.print("<script>");
		if(result == 0) {
			out.print("alert('삭제실패');");
			out.print("history.back();"); // 상세페이지로 다시 보여줌 (브라우저의 뒤로가기 버튼을 js로 처리)
		} else {
			out.print("alert('삭제성공');");
			out.print("location.href='/notice/list.jsp'");
		}
		out.print("</script>");
	
%>