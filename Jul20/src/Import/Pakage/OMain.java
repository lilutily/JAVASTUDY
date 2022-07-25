package Import.Pakage;

import java.util.Scanner;

public class OMain {
	public static void main(String[] args) {
		Book b = new Book("삼국지",10000,"나에요");	
		b.print();
		
		Yogurt y=new Yogurt("엔요",1000,"20xx-xx-xx");
		y.print();
		
		Cup c = new Cup("유리컵", 6000, "regular");
		c.print();
		
		
		Scanner s= new Scanner(System.in);
		// 만약 클래스 이름이 같으면?
		// 사용못함? 사용할수있으면 어떻게?
		Scan sc= new Scan("SSSSCANNER", 80000, 10);
		sc.print();

	}
}


/* 조건문
 * 반복문
 * 배열
 * 특징 -> java -> 남이 작업한것을 공유 -> 남이 작업한거 잘쓰기
 * 
 * jsp.jar - spring.jar
 * 
 * 
 * 쇼핑몰
 * 첵 : 삼국지, 10000, 나관증
 * 정보출력메소드
 * 
 * 요구르트 엔요, 1000, 20xx-xx-xx
 * 
 * 컵: 이름, 가격, 크기
 * 
 * 스캐너 : 이름, 가격, 무게
 * */
