package Bank_Project;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
	private String name; // 이름
	private String accountNumber; // 계좌번호 
	private int balance; // 금액
	
	//디폴트 생성자 메소드
	public User() {
		
	}
	//매개변수 메소드
	public User(String name, String accountNumber,int balance) {
		this.name= name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	//실무에서 처리할만한 에러는 글자입력과 공백입력
public void deposit(int amount) { // 입금
	this.balance+=amount;
}
public void withdraw(int amount) { // 출금
	this.balance-=amount;
}
	
	public int getBalance() { // 조회
		return this.balance;
	}
	//실무에서 처리할만한 에러는 글자입력과 공백입력
	public void printAccounts() { // 정보출력
		System.out.printf("계좌번호 : %s, 이름 : %s, 금액 : %,d원%n",
				accountNumber, name, balance);  
	}


	

}

/*
은행입출금 프로젝트
프로젝트*패키지*클래스
=============================
고객정보 클래스
[데이터] -이름, 계좌번호, 잔액 O
=============================
기능
-입금 : 사용자에게 금액을 받아서 잔액에 누적시킨다. 단 음수입력시 에러메세지 출력 O
-출금 : 사용자에게 금액을 입력받은후 잔액에서 뺀다. 단 잔액보다 많을경우 에러메세지 출력 O
-잔액조회 : 현재잔액을 화면에 출력 O
=============================
프로그램을 실행하는 클래스
1. 반복문을 사용해서 여러명의 고객들의 정보(객체생성)를 저장(세터)한다
2. 저장된 모든 고객들의 정보를 출력하도록한다.(반복문사용)
3. 특정고객의 이름이나 계좌번호를 입력받아서 검색이 가능하도록 한다,
(사용자 입력 -> 이름or계좌 -> 해당 데이터를 contains로 검색 - > 결과출력) */ //Bank에서 실행