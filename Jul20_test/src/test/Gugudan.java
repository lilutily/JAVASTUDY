package test;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int num=0; int i=0;
//		Scanner scan = new Scanner(System.in);
//		System.out.println("===============================");
//		System.out.print("숫자를 입력해주세요 : ");
//		num=scan.nextInt();
//		for(i=1; i<10;i++) {
////			System.out.printf("%d x %d = %d\r\n", num, i, num*i);
//			System.out.println(num+" * " +i+ " = "+num*i);
//		}
		int i,j;
		for(i=1; i<10; i++) {
			for(j=2; j<10; j++) {
	//			System.out.printf("%d x %d = %d\r\n", i, j, i*j);
				System.out.print(j+" * " +i+ " = "+String.format("%02d", i*j)+"\t");
//				System.out.printf("%d x %d = %02d\t", j, i, j*i);
			}
			System.out.println();
		}
	}

}
