package jdbc_package;

import java.util.Scanner;

public class MemberInfo {
	private String tname;
	private String tid;
	private String tpw;
	private String tnumber;
	
	
	public void setMember() {
		//Scanner 클래스를 이용한 사용자 입력부분 처리
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : "); 
		tname=input.nextLine();
		System.out.println("아이디를 입력해주세요 : "); 
		tid=input.nextLine();
		System.out.println("패스워드를 입력해주세요 : "); 
		tpw=input.nextLine();
		System.out.println("휴대폰 번호를 입력해주세요 : "); 
		tnumber=input.nextLine();
		
	}
	public void putMember() {
		// 회원의 모든 정보를 출력
		System.out.println(tname+" "+tid+" "+tpw+" "+tnumber);

	}
	
	public String getMembername() {return(tname);}
	public String getMemberid() {return(tid);}
	public String getMemberpw() {return(tpw);}
	public String getMembernumber() {return(tnumber);}
	
	
}