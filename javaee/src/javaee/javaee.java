package javaee;

import java.util.Scanner;

public class javaee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, j=0; // 초기화	
		Scanner input = new Scanner(System.in);
		i=input.nextInt();
		j=input.nextInt();
		
		float a=(float)i/(float)j;
		System.out.println(a);
		float a2=Math.round(a);
		System.out.println(a2);
		 
		 
		 
	}

}
