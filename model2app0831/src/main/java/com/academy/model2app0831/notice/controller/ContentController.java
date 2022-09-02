package com.academy.model2app0831.notice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.controller.Controller;
import com.academy.model2app0831.domain.Notice;
import com.academy.model2app0831.model.repository.NoticeDAO;

// 3단계 일시키기 , 4단계 결과 저장
public class ContentController implements Controller {
	NoticeDAO noticeDAO=new NoticeDAO();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int notice_id=Integer.parseInt(request.getParameter("notice_id"));
		Notice notice=noticeDAO.select(notice_id); // 3단계 일시키기
		request.setAttribute("notice", notice); // 4단계 저장
		
	}

	@Override
	public String getViewName() {
		// TODO Auto-generated method stub
		return "/notice/result/content";
	}

	@Override
	public boolean isfForward() {
		// TODO Auto-generated method stub
		return true;
	}

}
