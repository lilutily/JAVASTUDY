package javaee2;

import java.util.Scanner;

public class javaee2 {
	public static void main(String[] args) {
		/* boolean money = true;
		if (money) {
		    System.out.println("택시를 타고 가라");
		}else {
		    System.out.println("걸어가라");
		}
	 */
	/*	String id;
		String pw;
		Scanner input = new Scanner(System.in);
		id=input.nextLine();
		pw=input.nextLine(); */

// 각각의 if문 id가 admin일 경유 pw가 123##일 경우 둘다 만족하는 경우와 그것도 아닐 경우
		// if(id.equals("admin")) {System.out.println("로그인되었습니다");	}		
		// if(pw.equals("123##")) {System.out.println("ok");	}
		// if(id.equals("admin") && pw.equals("123##")) {System.out.println("로그인되었습니다");	} else {System.out.println("로그인에 실패하였습니다");}
		
		
// 중첩된 if문을 사용해서 아이다가 틀렸는지, 암호가 틀렸는지 알수있게 설정		
		/* if(id.equals("admin")) {
		   if(pw.equals("123##")) {
			System.out.println("로그인 되었습니다");
		}  else {
			System.out.println("패스워드가 잘못 입력되었습니다");
		} 
			} else {
			System.out.println("아이디가 잘못 입력되었습니다");} */
		
		
// if else 문을 이용하여 정리해보기		
/*		if(id.equals("admin") && pw.equals("123##")) {
			System.out.println("로그인 되었습니다");			
		} 
		else if(id.equals("admin")) {
			System.out.println("패스워드가 잘못 입력되었습니다");
		} else if(pw.equals("123##")) {
			System.out.println("아이디가 잘못 입력되었습니다");
		} else {
			System.out.println("정보가 일치 하지않습니다");
		} */
		
		
//for문 테스트	
	/*	int i, j;
		for(i=1; i<=10; i++) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		} */
		
// 비밀번호를 3번까지 물어보고, 그 이상 틀릴시 더이상 로그인 불가능
// 코드 순서 비밀번호를 입력받는다		반복문 3번 제한		일치하면 로그인		불일치시 n번 틀렸다 		3회가 넘었을 경우 비밀번호 입력 불가능	
		String id;
		String pw;
		int i;
		Scanner input = new Scanner(System.in);
		//id=input.nextLine();
	//	pw=input.nextLine();
		
		
		for(i=1; i<=4; i++) {
	    pw=input.nextLine();
	    if(pw.equals("123##")) {
			System.out.println("로그인성공");
		} else {
				if(i<4) {
				System.out.println("패스워드가 " +i+"번 잘못 입력되었습니다 ");
				continue;			
			}
			if(i == 4)
				System.out.println("더 이상 비밀번호를 입력할 수 없습니다.");
		}
			
		} 
	
		
		
		
		
		
				
	}
}
