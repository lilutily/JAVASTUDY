package Import.Pakage;

import java.util.Scanner;

// 클래스 명 중복? -> 남이 작업해준것(라이브러리)를 적극적으로 활용하자
// package->class
// package : 클래스명이 중복될때 구분할 수 있는 최후의 수단
// 그래서 패키지를 만들때 package 명까지 중복되면 구분할 수단이 없다.
// -> package명이 전세계적으로 유일해야한다.

// 회사명 거꾸로 -> com.회사명.프로젝트명.카테고리 : com.회사명.프로젝트명.main || bitcoin
// ex) naver.com
// com.naver	
public class OMain2 {
	public static void main(String[] args) {
		// 객체를 생성할때
		// 클래스명 변수명 = new 클래스;
		// package명.클래스명 변수명 = new package명.클래스명();
		// -> 제대로 된 클래스를 만드는 방법
		
		String a="asd";
		java.lang.String b = new java.lang.String("df");
		
		java.util.Scanner s = new java.util.Scanner(java.lang.System.in);
	}
}
