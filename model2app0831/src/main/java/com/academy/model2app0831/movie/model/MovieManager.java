package com.academy.model2app0831.movie.model;

/*
 *  중립적 로직을 작성한 모델파트 -> Model2를 구현한것
 * */
public class MovieManager {
	public String getAdvice(String movie) {
		String msg=null;
		if(movie.equals("우영우")) {
			 msg="넷플릭스 인기 드라마";
		} else if(movie.equals("오징어게임")) {
			msg="넷플릭스 기록 갱신 드라마";
		} else if(movie.equals("탑건")) {
			msg="톰크루즈 주연 블록버스터";
		} else if(movie.equals("헐크")) {
			msg="마블 신작";
		}
		return msg;
	}
}
