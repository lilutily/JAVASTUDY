package com.academy.model2app0831.listener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

// 서버가 가동될때 무언가 하고 싶을때 (필수아님여)
public class MyListener implements ServletContextListener {
	FileInputStream fis;
	Properties props=new Properties();
	// 웹 컨테이너가 가동될때 호출되는 메서드
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext context= sce.getServletContext(); // jsp에서의 application 내장객체 자료형
		String path=context.getInitParameter("contextConfigLocation");
		context.setAttribute("props", props); // 서버가 꺼질때까지 계속 살아감
		try {
			fis = new FileInputStream(context.getRealPath(path)); // 실제 물리적 경로로 (풀경로로 얻어와야됨)
			props.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	// 웹 컨테이너가 중단될때 호출되는 메서드
	public void contextDestroyed(ServletContextEvent sce) {
		if(fis!=null) {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
