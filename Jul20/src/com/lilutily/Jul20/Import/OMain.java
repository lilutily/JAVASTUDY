package com.lilutily.Jul20.Import;
// 객체를 생성
// 패키지명.클래스명 변수 = new 패키기명.클레스명();
// 패키지명 생략 가능한 상황
// 1. 같은 패키지일 경우
// 2. java의 기본패키지(java.lang) 소속
// 3. import 하면 생략가능

import java.sql.Date;
import java.util.Scanner;

// OMain scanner-> 내꺼 말고 무조건 자바 scanner만 쓰겠다 -> import
//
public class OMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		com.lilutily.Jul20.Animal.Dog d= new com.lilutily.Jul20.Animal.Dog();
//		Mouse m = new Mouse();
		java.lang.String a= new String("as");
		String b = new String();
//		java.lang.System.out.println(); 생략가능
		System.out.println();
		Scanner scan = new Scanner(System.in);
		
		Date d;
		java.util.Date aa;
	}

}
