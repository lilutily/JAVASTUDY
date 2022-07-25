package test;

public class Test2 {
	public static void printPay(String name, double basePay, int hours) {
		double pay=0;
		if(basePay<8) {
			System.out.println("최저시급 미달 다시 확인해주세요");
			return;
		}
		if(hours<=40) {
			pay=basePay*hours;
		}else if(hours>60) {
			System.out.println("초과근무시간을 넘겼습니다");
			return;
		} else if(hours>40) {
			pay=(basePay*40)+(basePay*(hours-40)*1.5);
		} 
			
		
		System.out.printf("%s씨가 받아가실 금액 :$%.2f\n",name,pay);
	}
public static void main(String[] args) {
	// 이름, 시급, 근무시간
	
	printPay("user1",10.00, 40);
	printPay("user2",12.50, 70);
	printPay("user3",20.00, 45); // 800+(20*5)*1.5=800+150=950
	printPay("user4",6.00, 60); // 6*40+(6*20)*1.5=240+180=420
}
}
