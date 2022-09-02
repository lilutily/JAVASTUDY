package com.academy.model2app0831.controller;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 모든 요청마다 1:1 대응하는 컨트롤러를 전면에 내세우면 오히러 유지보수성이 떨어진다...
public class DispatcherServlet extends HttpServlet {
	Properties props;
	/*
	 *  jsp 내장 객체는 몇개 되지않음
	 *  request -> HttpServletRequest
	 *  response -> HttpServletResponse
	 *  session -> HttpSession
	 *  application -> ServletContext : 어플리케이션의 전역적 정보를 가진 객체
	 *  											 ex) getRealPath() 이 어플리케이션내의 자원의 풀경로..
	 * */
	// 생성자 또는 init()
	public void init(ServletConfig config) throws ServletException {
		props=(Properties)config.getServletContext().getAttribute("props");
	}
	
	
	// 모든 요청을 이 서블릿이 일단 받아야 한다
	/*
	 * 1. 요청을 받는다
	 * 2. 요청을 분석(영화?,혈액형?, 글쓰기?...)
	 * */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request,response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doRequest(request,response);
	}
	// 클라이언트의 요청이 어떤 방식이던 상관없이 요청을 받기위해 공통메서드에서 컨트롤러의 요청처리를 진행
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		System.out.println("요청을 받았음");
		
		// 영화에 대한 요청인지
		
		String uri=request.getRequestURI();
		System.out.println("요청시 uri : "+uri);
		
		// 2단계 : 요청을 분석
		Controller controller=null;
		// 주의! 검색결과는 컨트롤러 클래스 자체가 아닌, 단지 그 클래스의 경로일 뿐이다..(String)
		String controllerClassName=props.getProperty(uri);
		// 결국 String 경로를 이용하여 실제 클래스의 인스턴스를 생성하는법
		try {
			Class controllerClass=Class.forName(controllerClassName); // 아직 인스턴스가 올라온건 아니다.. 즉 new 하지않았음
			try {
				controller=(Controller) controllerClass.newInstance(); // 인스턴스 올리기
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block 
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*
		if(uri.equals("/movie.do")) { //영화에 대한 요청인지
			// 영화전담자인 MovieController에게 업무를 맡긴다
			controller=new MovieController();
		} else if(uri.equals("/blood.do")) { // 혈액형에 대한 요청인지
			controller = new BloodController();
		}
		*/
		controller.execute(request, response);
		// 5단계 : 알맞는 뷰페이지 보여주기
		// 포워딩하기 전에 , 매핑 파일에서 검색을 해야한다(실제 jsp파일 경로를 얻기위해)
		String viewName= controller.getViewName();
		String viewPage=props.getProperty(viewName);
		
		// 무조건 포워딩하면 문제가 발생할 수 있다..
		if(controller.isfForward()) {
			RequestDispatcher dis = request.getRequestDispatcher(viewPage);
			dis.forward(request, response);
		} else {
			// 리다이렉트 (요청을 일단 끊고, 브라우저로 하여금 지정한 url로 다시 들어오게 한다)
			response.sendRedirect(viewPage);
			
		}
		
		// 글쓰기 인지.. 등
	}
	// 서블릿이 일을 다하고 소멸될때,(서버죽을때 등등) 호출되는 생명주기 메서드
	@Override
	public void destroy() {
	}
}
