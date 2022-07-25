package com.lilutily.Jul25.main;

import java.util.Scanner;
import java.util.StringTokenizer;

public class UCMain3 {
	public static void main(String[] args) {
		// 숫자 입력
		// 총합 구하기
		Scanner scan = new Scanner(System.in);
		System.out.println("a/b/c/d/....z : ");
		String s= scan.next();
		String[] s2 = s.split("/"); // /의 기준에 맞게 분리
		int sum = 0;
		try {
			for(int i=0; i<s.length(); i++) {
				int a = Integer.parseInt(s2[i]);
				sum +=a;
			}
		} catch (Exception e) {
		}
		System.out.println(sum); 

/*		StringTokenizer으로 만들기
 * 		Scanner scan = new Scanner(System.in);
		System.out.println("a/b/c/d/....z : ");
		String s= scan.next();
		StringTokenizer st=new StringTokenizer(s, "/");
		int sum=0;
		while(st.hasMoreElements()) {
			try {
				sum+=Integer.parseInt(st.nextToken());
			} catch (Exception e) {
				// exception이 발생해도 그냥 아무것도 실행하지말라고 비워둠
			}
		} */
		
	}
}

/*		String s= "r/10/20/50/s";
String[] s2 = s.split("/"); // /의 기준에 맞게 분리
int sum = 0;
try {
	for(int i=0; i<s.length(); i++) {
		int a = Integer.parseInt(s2[i]);
		sum +=a;
	}
} catch (Exception e) {
}
System.out.println(sum);
이거하라는줄..										*/
