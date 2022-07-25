package Memberinfo;

import java.util.Scanner;

public class Info {
	private String name;
	private String id;
	private String pw;
	private String number;
	
	
	public void setMember() {
		//Scanner 클래스를 이용한 사용자 입력부분 처리
		Scanner input = new Scanner(System.in);
		System.out.println("이름을 입력해주세요 : "); 
		name=input.nextLine();
		System.out.println("아이디를 입력해주세요 : "); 
		id=input.nextLine();
		System.out.println("패스워드를 입력해주세요 : "); 
		pw=input.nextLine();
		System.out.println("휴대폰 번호를 입력해주세요 : "); 
		number=input.nextLine();
		
	}
	public void putMember() {
		// 회원의 모든 정보를 출력
		System.out.println(name+" "+id+" "+pw+" "+number);

	}
	
	public String getMembername() {return(name);}
	public String getMemberid() {return(id);}
	public String getMemberpw() {return(pw);}
	public String getMembernumber() {return(number);}
	
	
}




// 프로젝트 (Memberinfo_Project) 패키지 (Memberinfo)
// 로그인 기능을 클래스로 구현 (회원정보 클래스 부터 구현)
// @회원정보 클래스의 구조
// 데이터 : 회원이름, 아이디, 암호, 번호
// 기능 : 회원정보를 모두 입력받아서 저장할수있는 기능
// 모든 회원정보를 출력하는 기능
// 회원정보를 각각 반환(return)하는 기능 (정보의 갯수 만큼 필요)
// getMemberName getMemberId getMemberPass getMemberPhone
// 코드 동작 테스트 : member클래스로 객체 생성 생성된객체에 회원정보저장 저장된 정보들을 각각확인(get개열의 메소드들을 이용하여 정보들을 반환받은후 출력)
// 저장된 정보들을 출력함
