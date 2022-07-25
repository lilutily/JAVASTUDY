package com.lilutily.Jul25.main;

import java.util.StringTokenizer;

public class UCMain {
	public static void main(String[] args) {
		String s="sadf";
		String a= new String("오늘 날씨 참 좋네요");
		// 몇번째 문자 출력
		System.out.println(a.charAt(4));
//		System.out.println(a.contains("오늘")); 이건 포함하는지
		// 오늘로 시작하는지 검사
		System.out.println(a.startsWith("오늘"));
		// 2~6사이 문자 출력
		System.out.println(a.substring(2, 6));
		// 전체 길이 출력
		System.out.println(a.length());
		// 오늘 -> 내일로 변경
		System.out.println(a.replace("오늘","내일"));
		a+="zzz";
//		a= a+new String("zzz"); // 이렇게 하면 ram을 얼마나 먹을까?
//		String에서 덧셈을 할경우 기존의 STACK이 사라지고 heap에 추가한 부분이 붙는다.
		System.out.println(a);
		
		// 글자를 대량으로 붙여야되는 상황
		StringBuffer sb = new StringBuffer();
		sb.append("zzz");
		String s2=sb.toString();
		System.out.println(s2);
		// StringBuffer 같은 경우 heap에 하나 만들고 계속 사용
		
		System.out.printf("%02d\r\n", 5);
		String s3= String.format("%02d", 8);
		System.out.println(s3);
		
		// 글자를 분리해야 할때
		String s4="주르륵/25/직업"; // 정형 데이터 ->형태가 정해져있는것
		String[] ss4 = s4.split("/"); // /의 기준에 맞게 분리
		System.out.println(ss4[2]);
		
		String s5="오늘 날씨 참 좋네요"; // 비정형 데이터
		StringTokenizer st= new StringTokenizer(s5, " "); // s5를 띄워쓰기 기준으로 자르겠다 선언
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}
}
