package com.academy.model2app0831.movie.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.academy.model2app0831.controller.Controller;
import com.academy.model2app0831.movie.model.MovieManager;

/*
 *  영화에 대한 전문적인 지식을 가진 전담 컨트롤러
 *  요청을 직접 받지 않으므로, 서블릿일 필요가 없다
 * */
public class MovieController implements Controller {
	// who?
	MovieManager manager = new MovieManager();
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// 컨트롤러의 5대 업무 중 3단계를 수행 - 알맞는 비즈니스 로직 객체에게 일 시키기
		String movie=request.getParameter("movie");
		String msg=manager.getAdvice(movie); //영화에 대한 판단결과 반환받기
		
		// 4단계 : 뷰페이지로 가져갈 것이 있을 경우 결과를 저장한다
		request.setAttribute("data", msg);
		
		// 5단계 : 결과 보여주
	}
	
	// 형님 컨트롤러가 어떤 뷰 페이지를 보여줘야 할지를 여기서 결정해보자
	public String getViewName() {
		return  "/movie/result";
	}
}
