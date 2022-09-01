package com.academy.web0829.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener{
	String name="buzesil0";
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("서바가동 감지");
		// application 내장객체에 name을 담아놓으면 프로그램이 끝날때까지 저 name을 사용할 수 있다
		ServletContext application= sce.getServletContext();
		application.setAttribute("nick", name);
	}
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("서버종료 감지");
	}

}
