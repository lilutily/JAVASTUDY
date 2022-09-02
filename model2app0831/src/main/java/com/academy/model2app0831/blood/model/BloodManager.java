package com.academy.model2app0831.blood.model;

// 플랫폼에 중립적인 로직 클래스를 정의한다
// MVC 패턴을 기준으로 판단하자면 Model이다 (데이터 또는 로직)
public class BloodManager {
	public String getAdvice(String blood) {
		String msg=null;
		if(blood.equals("A")) {
			msg="A형은 ";
		} else if(blood.equals("B")) {
			msg="B형은 ";
		} else if(blood.equals("O")) {
			msg="O형은 ";
		} else if(blood.equals("AB")) {
			msg="AB형은 ";
		}
		return msg;
	}
}
