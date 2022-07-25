package Bank_Project;
import java.util.Scanner;
public class BankAccount {
	private String bName, bId;
	private int bBalance;
	
	public void setBInfo(String n, String i, int b) {bName=n; bId=i; bBalance=b;}
	public void putBInfo(){System.out.println(bName+" "+bId+" "+bBalance);}

	public String getBName() {return(bName);}
	public String getBId() {return(bId);}
	public int getBbalance() {return(bBalance);}
	
	public void putMoney(int money) {bBalance+=money;} 
	public void getMoney(int money){bBalance-=money;}
	public void showMoney() { System.out.println("잔액은 "+this.getBbalance()+"원");}
}
