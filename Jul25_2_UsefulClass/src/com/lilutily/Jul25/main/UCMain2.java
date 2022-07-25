package com.lilutily.Jul25.main;


// Wrapper class
// 기본형:(int,double,boolean, ㆍㆍㆍ) 의 객체형
// Integer, Double, Boolean
public class UCMain2 {
	public static void main(String[] args) {
		int a= 10;
		
		Integer aa= new Integer(100);
		// 번지수 100이 들어가있는상황 + integer 안에 있는 메소드를 사용하고 싶어
		
		// 기본형 -> Wrapper형
		double b = 1.5; // 1.5 저장
		Double bb = new Double(b); // 번지수를 받고 그 안에 1.5가 저장됨
		// Wrapper형 -> 기본형  :  변수명.xxxValue();
		double b2 = bb.doubleValue();
		
		boolean c = true;
		Boolean cc =new Boolean(c); // 줄이 그어져있는이유? : 
//		Boolean c3=c; // 기본형 -> Wrapper를 자동으로 (autoboxing)
		boolean c2 =cc.booleanValue();
		
//		boolean c4=cc; // Wrapper형 -> 기본형으로 자동으로 (autounboxing)
		
		int d =20;
		// 기본형 - > String
		String d2 = d+"";
		String d3 = String.format("d", d);
		
		// 문자열 -> 숫자로 변경
		String f = "123";
//		Integer f2 = Integer.parseInt(f);
//		int f3= f2.intValue();
		int f3=Integer.parseInt(f);
		System.out.println(f3);
	}
}
