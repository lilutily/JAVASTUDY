package com.academy.model2app0831.notice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.controller.Controller;
import com.academy.model2app0831.domain.Notice;
import com.academy.model2app0831.model.repository.NoticeDAO;

// 3단계 : 알맞는 모델 객체 일시키기
// 4단계 : 저장할 것이 있다면 저장(DML의 경우 클라이언트에게 보여줄 것이 없음. 따라서 4단계 생략)
public class RegistController implements Controller{
	NoticeDAO noticeDAO= new NoticeDAO();
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String title = request.getParameter("title");
		String writer = request.getParameter("writer");
		String content = request.getParameter("content");
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setWriter(writer);
		notice.setContent(content);
		
		int result=noticeDAO.insert(notice); // 일시키기
	}

	public String getViewName() {
		return "/notice/result/write";
	}

	// jsp인 뷰로 가져갈 것이 없으므로 데이터를 유지할 필요도없다. 따라서 request는 죽어도 되므로 응답을 하고
	// 이때 응답을 하는순간 서버의 request, response, Thread는 소멸
	public boolean isfForward() {
		return false;
	}

}
