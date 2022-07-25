package Bank_Project;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Play {
	public static void main(String[] args) throws InterruptedException {
		 Runtime runtime = Runtime.getRuntime();
		 //메뉴구성부분
		 
		 try {
			 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();			 
			 

			
		 Scanner input = new Scanner(System.in);
		 
		 
		 System.out.println("==========================");
		 System.out.println("1. 계좌 개설 : ");
		 System.out.println("2. 입금 : ");
		 System.out.println("3. 출금 : ");
		 System.out.println("4. 잔액조회 : ");
		 System.out.println("5. 통장조회 : ");
		 System.out.println("6. 종료 : ");
		 System.out.println("원하시는 번호를 선택해주세요 : ");
		 boolean isExit = false;
			
			do {
			
			 int menu = 0;
		 switch(menu)
		 {
		 case 1:{System.out.println("1. 계좌 개설 : ");	} break;	
		 case 2:{System.out.println("2. 입금 : "); 	} break;
		 case 3:{System.out.println("3. 출금 : ");	} break;
		 case 4:{System.out.println("4. 잔액조회 : ");	} break;
		 case 5:{System.out.println("5. 통장조회 : ");	} break;
		 case 6:{System.out.println("6. 종료 : "); System.exit(0); } break;
		 default : {System.out.println("다시 선택해주세요 : ");		 
		 }
		 }
		 } while(!isExit);
		 }
		 catch (IOException e) {//그 명령어가 실패했을때 처리하는곳(예외처리)
			e.printStackTrace();
		}
		 
		 
	}	
}



