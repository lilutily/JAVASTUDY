package com.lilutily.Jul25.main;

import java.util.Scanner;

import com.lilutily.Jul25.calculator.Calculator;

// error : java 문법에 맞지 않아서, 기계어로 번역이 불가능한 상태 - 프로그램이 완성되지 못함 -> 개발자 잘못

// warning : 지저분한 소스, 프로그램이 완성됨, 정리는 해주는게 좋음 -> 개발자 잘못

// exception : 프로그램에는 문제가 없음, 실행할 때 외부적인 요인에 의해 정상실행이 안되는 상황
//			  -> 개발자 잘못x

// 개발을 할때 - 한국어로 생각 -> 번역(개발) -> 자바 -> 번역(컴파일) -> 기계어(.class) -> 실행


/*
 * try {
			위험한 구문
		 catch (Exception 이름 변수명) {
			Exception이 발생하면 여기가 실행	
			} 
			finally {
			exception 발생여부와 상관없이 무조건 실행, return 보다 먼저 실행
			}
 * */
// 
public class OMain {
	public static void main(String[] args) {
		try {
			Calculator.divide2(3, 0);	
		} catch(Exception e) {
			System.out.println("0은 안돼연");
		}
		
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("------------");
		System.out.print("x 값 : ");
		int x = scan.nextInt();
		System.out.print("y 값 : ");
		int y = scan.nextInt();
		
		int z = Calculator.divide(x, y);
		System.out.println(z);
		
//		try {
//			int c = x/y;
//			System.out.println(c);
//			int[] arr={123,567};
//			System.out.println(arr[y]);}
//		 catch (Exception e) {
//			// TODO: handle exception8
//			System.out.println("gg");		
//			} finally {
//				System.out.println("오류에 상관없이 실행되는 finally");
//			}
				
		
		scan.close(); // 스캐너 닫기
	}
}
