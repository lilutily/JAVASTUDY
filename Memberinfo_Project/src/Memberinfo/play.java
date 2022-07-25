package Memberinfo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class play {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		// 메뉴구현 프로토타입
		// 무한반복문
		String cmd = "cmd 명령어";
		Process p =Runtime.getRuntime().exec("cmd /c" + cmd);
		BufferedReader r = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String l = null;
		StringBuffer sb = new StringBuffer();
		sb.append(cmd);
		
		while((l = r.readLine()) != null) {
			sb.append(l);
			sb.append("\n");
		}
		while(true) {
			//메뉴출력
			System.out.println("1. 등록 ");
			System.out.println("2. 조회 ");
			System.out.println("3. 츨력 ");
			System.out.println("4. 종료 ");
 
			// 메뉴선택
			int menu;
			Scanner scan = new Scanner(System.in);
			System.out.print("메뉴 선택 : ");
			menu = scan.nextInt(); // 메뉴처리
			
			switch(menu) {
			case 1: {System.out.println("1번 실행 ");}
				break;
			case 2: {System.out.println("2번 실행 ");}
			break;
			case 3: {System.out.println("3번 실행 ");}
			break;
			case 4: {System.out.println("4번 실행 ");}
			break;
			case 5: {System.out.println("종료");}
			
			}
		}
	}

}
