package Bank_Project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Bank {
	// 사용자 정보를 저장할 컨테이너
	static int index=0;
	static User[] accounts = new User[100];	
	
	public static User findAccountByAccountNumber(String accountNumber) {
		for(int i=0; i<index; i++) {
		//	if(accounts[i].equals(accountNumber)) { //if(accounts[i].getAccountNumber().equals(accountNumber)
				return accounts[i];
		//	}
		} return null;	
	}
	
	public static void retrieveBalance() { // 잔액조회
		Scanner input = new Scanner(System.in);
		
		System.out.print("계좌번호 : ");
		String accountNumber = input.nextLine();
		
		User account = findAccountByAccountNumber(accountNumber);
 		if(account == null) {
 			System.out.println("계좌번호를 정확히 입력해주세요");
 			return;
 		} System.out.printf("잔액 : %,d원%n", account.getBalance());
	}
	public static void devit() { // 출금
		Scanner input = new Scanner(System.in);
		
		System.out.print("계좌번호 : ");
		String accountNumber = input.nextLine();
		
		User account = findAccountByAccountNumber(accountNumber);
 		if(account == null) {
 			System.out.println("계좌번호를 정확히 입력해주세요");
 			return;
 		}
 		System.out.print("금액 : ");
 		int amount =Integer.parseInt(input.nextLine());
 		account.withdraw(amount);
 		System.out.print("출금 완료");
	}
	
	public static void credit() { // 입금
		Scanner input = new Scanner(System.in);
		System.out.print("계좌번호 : ");
 		String accountNumber= input.nextLine();
 		
 		User account = findAccountByAccountNumber(accountNumber);
 		if(account == null) {
 			System.out.print("계좌번호를 정확히 입력해주세요");
 			return;
 		}
 		System.out.print("금액 : ");
		int amount = Integer.parseInt(input.nextLine());
		
		account.deposit(amount);
		System.out.print("입금 완료");
		
	}
	//계좌번호에 해당하는 고객계좌를 조회
	
	public static void createAccount()  { // 생성
			Scanner input = new Scanner(System.in);
			System.out.print("이름을 입력해주세요 : "); 
			String name=input.nextLine();
			System.out.print("계좌번호를 입력해해주세요 : "); 
			String accountNumber=input.nextLine();
			System.out.print("잔액을 입력해주세요 : "); 
			int balance=Integer.parseInt(input.nextLine());
			User account = new User(accountNumber, name, balance);
			accounts[index++] = account;
			
			/* try {
				FileOutputStream output = new FileOutputStream("c:/out.txt");
				User str = new User(accountNumber, name, balance);
				str= account[i].printAccounts();
				output.write(str);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} */
		}
	
	public static void referenceAccount() { // 조회		
		for(int i=0; i<index; i++) {
			accounts[i].printAccounts();
		}	
	}
	
	public static void main(String[] args) throws InterruptedException {
		 Runtime runtime = Runtime.getRuntime();
		 //메뉴구성부분
		 
		 try {
			 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();	//창을 초기화 홰준다
		boolean isExit = false;
		
		do {
			Scanner input = new Scanner(System.in);
			System.out.println("★=========================★");
			System.out.println("1. 계좌 개설 : ");
			System.out.println("2. 입금 : ");
			System.out.println("3. 출금 : ");
			System.out.println("4. 잔액조회 : ");
			System.out.println("5. 통장조회 : ");
			System.out.println("6. 종료 : ");
			System.out.print("원하시는 번호를 선택해주세요 ");
			
			int menu = Integer.parseInt(input.nextLine());
			
			switch(menu) {
			case 1: // 계좌개설
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				createAccount();
				
			}				
			break;
			case 2: // 입금
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				credit();
					
			}		
				break;
			case 3: // 출금
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				devit();
				
			}	
				break;
			case 4: // 잔액조회
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				retrieveBalance();
				
			}
				break;
			case 5: // 전체계좌조회
			{
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				referenceAccount();		
				
			}		
				break;
			case 6: // 종료
				isExit =true;
				break;
			}
		} 
		while(!isExit);		
		} catch(IOException e) {
			e.printStackTrace();
		}
		}
	}

