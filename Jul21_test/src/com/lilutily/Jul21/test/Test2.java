package com.lilutily.Jul21.test;

import java.util.Random;
import java.util.Scanner;

public class Test2 {
	static int count = 0; // 게임 횟수 
	static int strike = 0; // 스트라이크 횟수
	static int ball = 0; // 볼 횟수
	static int cp[] = new int[3]; // 컴퓨터 숫자 3칸
	static int player[] = new int[3]; // 사용자 숫자 3칸
	static int out=1;
public static int[] randompick() { // 랜덤으로 숫자 3개 받기 // static int
	Random ran = new Random();	
	// 랜덤 숫자 생성
	for(int i=0; i<cp.length; i++) {
		cp[i] = (int) (Math.random()*9+1); // 처음에 Math.random()*10으로 했는데 그러면 0~9까지 출력이 된다 +1할 경우 1~10까지라서 *9로 변경하고+1을 해줌
		for(int j=0; j<i; j++) {
			if(cp[i]==cp[j]) {
				i--;				
			}
		} System.out.print(cp[i]+""); // 값이 어떻게 찍히는지 테스트 + for문을 완전히 벗어나지 못했기때문에 만약 중복이있으면 중복이뜬횟수도 같이 print에 찍힌다
	} 
	return cp;
}
public static void playerpick() {
	System.out.println("\r\n"); // 테스트 확인용 / 줄바꿈이없어서 임시로 해둠
	Scanner scan = new Scanner(System.in);
	for(int i=0; i<player.length; i++) {
		System.out.print((i+1)+"번째 수: ");
		player[i] = scan.nextInt();
		if(player[i] > 9 || player[i] <= 0) {
			System.out.println("숫자 범위는 1~9 입니다. 다시 입력해주세요");
			return;
		}
	}
	int i,j;
	for(i=0; i<cp.length; i++) {
		for(j=0; j<player.length; j++) {
			if(cp[i] == player[j] && i==j) { // 숫자가 위치도 같으면 strike
				strike++;
			} else if(cp[i] == player[j] && i!=j) {  // 숫자는 같지만 위치가 다르면 ball
				ball++;
			}
		}
	}System.out.println(strike+" Strike "+ball+" Ball "+out+" OUT");
	out++;
	count++;	
	if(strike == 3) 
		System.out.println("GG\n" + count + "번째 성공");
	ball=0; strike=0; // 넣으면 초기화가 되서 게임이 안끝남
}	
 	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자 야구 게임
		// 랜덤으로 3개 뽑고
		// 3개 입력
		randompick();
		while(true) {
			playerpick();
		}
	}
}