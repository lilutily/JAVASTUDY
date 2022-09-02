package com.academy.model2app0831.notice.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.controller.Controller;
import com.academy.model2app0831.model.repository.NoticeDAO;

public class ListController implements Controller {
	// 3단계 : 일시킨다
	NoticeDAO noticeDAO = new NoticeDAO();
	public void execute(HttpServletRequest request, HttpServletResponse response) {
	List noticeList=noticeDAO.selectAll();
	
	// 4단계 : 결과페이지로 기져갈 것이 있을때는 , 결과를 저장해놓는다(DispatcherServlet에게 전달하기 위해)
	request.setAttribute("noticeList", noticeList);
	}

	public String getViewName() {
		return "/notice/result/list";
	}
	
	// jsp인 뷰로 가져갈 것 이 있으므로 request는 죽으면 안된다.. 따라서 응답하지 말고 서버의 jsp자원으로 포워딩을 시도하여 request를 살려두자
	public boolean isfForward() {
		return true;
	}

}
