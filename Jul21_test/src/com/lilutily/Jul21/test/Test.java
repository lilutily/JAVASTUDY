package com.lilutily.Jul21.test;

import java.util.Random;
import java.util.Scanner;

public class Test {
public static void main(String[] args) {
	//가위바위보
	// 1.가위 2. 바위 3. 보
	// 1~3입력
	// 컴퓨터가 랜덤으로 하나나오고
	// 결과를 콘솔에 나오게하기
	Scanner scan = new Scanner(System.in);
	Random ran = new Random(); 
	int r = ran.nextInt(3)+1;
	String k[]= {null,"가위","바위","보"};
	
	while(true) {
		System.out.println("===============================");
		System.out.println("1. 가위");
		System.out.println("2. 바위");
		System.out.println("3. 보");
		System.out.print("가위바위보를 입력해주세요 : ");	
		int my=scan.nextInt();
		
		int result= my-r;
		//int result my%r;
		if(result == 0) {
			System.out.println("내가 낸 것 : "+k[my]+"\t상대가 낸 것 :"+k[r] +"\t비겼습니다");
		} else if(result == -2 || result == 1) {
			System.out.println("내가 낸 것 : "+k[my]+"\t상대가 낸 것 :"+k[r] +"\t결과는 승리");
		} else
			System.out.println("내가 낸 것 : "+k[my]+"\t상대가 낸 것 :"+k[r] +"\t결과는 패배");
	//		break;
	}
	
}
}

