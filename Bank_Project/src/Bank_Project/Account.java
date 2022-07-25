package Bank_Project;

public class Account {
	private String name; // 이름
	private String accountNumber; // 계좌번호 
	private String pwd;
	private int balance; // 금액
	
	//디폴트 생성자 메소드
	public Account() {
		
	}
	//매개변수 메소드
	public Account(String name, String accountNumber,String pwd, int balance) {
		this.name= name;
		this.accountNumber = accountNumber;
		this.pwd = pwd;
		this.balance = balance;
	}
	public void printAccounts() { // 정보출력
		System.out.printf("계좌번호 : %s, 이름 : %s, 금액 : %,d원%n",
				accountNumber, name, balance);  
	}
	//실무에서 처리할만한 에러는 글자입력과 공백입력
/*public void deposit(int amount) { // 입금
	this.balance+=amount;
}
public void withdraw(int amount) { // 출금
	this.balance-=amount;
}
	
	public int getBalance() { // 조회
		return this.balance;
	}
	//실무에서 처리할만한 에러는 글자입력과 공백입력
	
*/

	

}