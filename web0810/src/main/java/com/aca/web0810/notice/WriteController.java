package com.aca.web0810.notice;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aca.web0810.domain.Board;
import com.aca.web0810.model.BoardDAO;

public class WriteController extends HttpServlet {
	BoardDAO boardManager;
	public void init() throws ServletException {
		boardManager = new BoardDAO();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8"); // jsp 에서의 page contentType="" 과 동일
		PrintWriter out = response.getWriter();
		// 클라이언트가 전송해 온 파라미터 받기
		request.setCharacterEncoding("utf-8");
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		
		// 넘어온 파라미터를 이용하여 DB에 insert에 하되 , 직접이 아닌 중립적 객체를 이용할 것임
		// insert() 메서드에서 사용되고 있는 각각의 매개변수는 사실 하나의 게시물을 구성하는 데이터다.
		// 따라서 객체지향 관점으로 본다면 하나의 게수물은 하나의 레코드에 해당하므로, 게시물을
		// 담을 수 있는 클래스를 정의하여 인스턴스 생성후 변수들을 보관해놓는 기법을 이용.. 
		// 이때 정의되는 클래스는 로직을 작성하기 위함이 아니라, 오직 데이터만을 담고 가지고 다니는 용도라 하여
		// Data Transfer Object(DTO), Value Object(VO)
		Board board = new Board(); // 인스턴스 하나를 만든다 레코드 1건
		board.setTitle(title);
		board.setWriter(writer);
		board.setContent(content);
		
		int result = boardManager.insert(board);
		out.print("<script>");
		 if(result ==0) {
			 out.print("alert('등록실패');");
			 out.print("history.back();");
		 } else {
			 out.print("alert('등록성공');");
			 out.print("location.href='/notice/list.jsp';");
		 }
		 out.print("</script>");
	
	}
}
