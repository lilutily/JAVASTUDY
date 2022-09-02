package com.academy.model2app0831.notice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.controller.Controller;
import com.academy.model2app0831.model.repository.NoticeDAO;

// 3단계 일시키기, 4단계 생략
public class DeleteController implements Controller {
	NoticeDAO noticeDAO = new NoticeDAO();
	
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		int notice_id=Integer.parseInt(request.getParameter("notice_id"));
		noticeDAO.delete(notice_id); // 3단계 일시키기
	}

	@Override
	public String getViewName() {
		// TODO Auto-generated method stub
		return "/notice/result/delete";
	}

	@Override
	public boolean isfForward() {
		// TODO Auto-generated method stub
		return false;
	}
 
}
