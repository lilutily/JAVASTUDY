package com.academy.model2app0831.blood.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.blood.model.BloodManager;
import com.academy.model2app0831.controller.Controller;

public class BloodController implements Controller {
	// 3단계 : 알맞는 로직 객체에 일 시키기
	BloodManager manager = new BloodManager();
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String blood=request.getParameter("blood");
		String msg=manager.getAdvice(blood);
		
		// 4단계 결과저장
		request.setAttribute("data", msg);
	}
	
	public String getViewName() {
		return "/blood/result";
	}
}
