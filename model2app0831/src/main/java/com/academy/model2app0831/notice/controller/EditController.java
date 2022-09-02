package com.academy.model2app0831.notice.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.controller.Controller;
import com.academy.model2app0831.domain.Notice;
import com.academy.model2app0831.model.repository.NoticeDAO;

public class EditController implements Controller{
	NoticeDAO noticeDAO = new NoticeDAO();

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String title=request.getParameter("title");
		String writer=request.getParameter("writer");
		String content=request.getParameter("content");
		int notice_id=Integer.parseInt(request.getParameter("notice_id"));
		Notice notice = new Notice();
		notice.setTitle(title);
		notice.setWriter(writer);
		notice.setContent(content);
		notice.setNotice_id(notice_id);
		noticeDAO.update(notice); // 3단계
		request.setAttribute("notice", notice); // 4단계
		
		//redirect("/notice/content.do?notice_id=") 이렇게 하면 xml에서 어케할거임? 지금으로써는 못함.
	}

	@Override
	public String getViewName() {
		// TODO Auto-generated method stub
		return "/notice/result/edit";
	}

	@Override
	public boolean isfForward() {
		// TODO Auto-generated method stub
		return true;
	}

}
