package Bank_Project;

import java.util.Scanner;

public class AccountMgr {
	
	static int index=0;
	static Account[] accounts = new Account[100];	
	
	public static void createAccount() { // 생성
		
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : "); 
		String name=scan.nextLine();
		System.out.print("계좌번호를 입력해주세요 : "); 
		String accountNumber=scan.nextLine();
		System.out.print("비밀번호 입력해주세요 : "); 
		String pwd=scan.nextLine();
		System.out.print("잔액을 입력해주세요 : "); 
		int balance=Integer.parseInt(scan.nextLine());
		Account account = new Account(accountNumber, name, pwd, balance);
		accounts[index++] = account;
		
	}
	public static void retrieveAccount() { // 조회		
		for(int i=0; i<index; i++) {
			accounts[i].printAccounts();
		}	
	}
	public static void credit() { // 입금
		Scanner input = new Scanner(System.in);
		System.out.print("계좌번호 : ");
 		String accountNumber= input.nextLine();
 		
 		Account account = findAccountByAccountNumber(accountNumber);
 		
		
	}
	public static Account findAccountByAccountNumber(String accountNumber) {
		for(int i=0; i<index; i++) {
			if(accounts[i].equals(accountNumber)) {
				return accounts[i];
			}
		} return null;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean isExit = false;
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("★=========================★");
			System.out.println("1. 계좌 개설 : ");
			System.out.println("2. 입금 : ");
			System.out.println("3. 출금 : ");
			System.out.println("4. 잔액조회 : ");
			System.out.println("5. 통장조회 : ");
			System.out.println("6. 종료 : ");
			System.out.print("원하시는 번호를 선택해주세요 ");
			
			int menu = Integer.parseInt(scan.nextLine());
			
			switch(menu) {
			case 1: // 계좌개설
			{
				createAccount();	
				
			}				
			break;
			case 2: // 입금
			{
				credit();	
					
			}		
				break;
			case 3: // 출금
			{
				
				
			}	
				break;
			case 4: // 잔액조회
			{
				
				
			}
				break;
			case 5: // 전체계좌조회
			{
				retrieveAccount();			
				
			}		
				break;
			case 6: // 종료
				isExit =true;
				break;
			}
		} 
		while(!isExit);		
		}
	}

