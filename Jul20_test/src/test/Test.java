package test;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		// 여기에 정답 입력 횟수을 알아볼수있게 해야될듯
		int cnt= 1;
		int num=0; 
		int r = random.nextInt(100)+1; // 임의의 숫자 생성
//		System.out.println(r); 나오는지 확인
		while(true) {
			System.out.println("===============================");
			System.out.print("숫자를 입력해주세요 : ");
			num=scan.nextInt();
			if(num == r) {
				System.out.println(cnt + "번째에 정답을 맞추셨습니다");
				break;
			} if(num > r) {
				System.out.println("입력하신 숫자보다 작습니다");
				cnt++;
			} if(num < r) {
				System.out.println("입력하신 숫자보다 큽니다");
				cnt++;
			}
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	/*
	 int cnt=0;
	 int num;
	 while(true) {
	 cnt++;
			System.out.println("===============================");
			System.out.print("숫자를 입력해주세요 : ");
			num=scan.nextInt();
			 if(num > r) {
				System.out.println("입력하신 숫자보다 작습니다");
			}else if(num < r) {
				System.out.println("입력하신 숫자보다 큽니다");
			} else (num == r) {
				System.out.println(cnt + "번째에 정답을 맞추셨습니다");
				break;
			}
		}
	 */	
		
		// 랜덤으로 1~100까지 만들고
		// 콘솔창에서 숫자를 입력
		
		// 클 경우 더 작은 숫자 입력하라고 출력
		// 작을 경우 더 큰 숫자 입력하라고 출력
		// 성공 시 n번만에 맞췄다고 출력
 	}

}
