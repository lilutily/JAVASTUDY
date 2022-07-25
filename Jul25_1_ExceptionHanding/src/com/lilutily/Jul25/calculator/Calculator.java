package com.lilutily.Jul25.calculator;

// 문제가 발생 안했을때 7->8->14->15->9
// 문제가 발생했을때 7->10->12->14-15->13
public class Calculator {
	public static int divide(int x, int y) {
		try {
			int a = x/y; 
			return a;
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("입력 오류");
			return -999;
		} finally {
			System.out.println("gg");
		}
	}
	
	public static int divide2(int x, int y) throws ArithmeticException {	
			int a = x/y; 
			return a;
	// 문구들을 커버하는것은 ArithmeticException 이 용이함
	// 왜 why? jar파일을 받았을때 어떻게 구성이되었는지 모르니까
	}
}
