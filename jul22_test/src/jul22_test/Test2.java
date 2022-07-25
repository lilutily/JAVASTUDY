package jul22_test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.print("자전거 둘레 입력 : "); 
		double A=scan.nextDouble();
		System.out.print("회전수 입력 : "); // 지름은 66센치미터로
		double B=scan.nextDouble();
		System.out.print("앞 톱니 개수 : "); 
		double C=scan.nextDouble();
		System.out.print("뒷 톱니 개수 : ");
		double D=scan.nextDouble();
		System.out.println(A*(B*(C/D)));
	
	}

}
/**
 * 
 * 바퀴의 지름, 회전수, 걸린 시간이 주어졌을 때,
 *  총 이동 거리와 평균 속도를 계산
 *  자전거 둘레 : 입력 CM
 *  페달 돌린 횟수 + 톱니 갯수 (앞, 뒤)
 *
 * 
 * 
 */
