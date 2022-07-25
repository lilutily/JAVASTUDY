package Member;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;


@SuppressWarnings({ "rawtypes", "unchecked", "nls" })
public abstract class MemberInfo implements Serializable { // 조상클래스 = 공통점
	
	
		private String tName;
		private String tId;
		private String tPw;
		private String tNumber;
	//	private boolean tSex;
	//	private String tAdress;
	//	private int tAge;
		
		abstract String getA();	// 추상클래스
		static boolean tSex;
		static String tAdress;
		static int tAge;
		 void A() {
				System.out.println(tSex+tAdress+tAge+"추가로 입력된 정보 입니다.");
			}
		 
		
		
		public void createMember() { // 멤버 생성
			Scanner input = new Scanner(System.in);
			System.out.print("이름 : "); 
			String tName=input.nextLine();
			System.out.print("아이디 : "); 
			String tId=input.nextLine();
			System.out.print("패스워드 : "); 
			String tPw=input.nextLine();
			System.out.print("핸드폰 : "); 
			String tNumber=input.nextLine();
			System.out.print("성별 : "); 
			boolean tSex =input.nextLine() != null;
			System.out.print("주소 : "); 
			String tAdress=input.nextLine();		
			System.out.print("나이 : "); 
			int tAge=input.nextInt();
		} 
		

		public void infoMember() { 
			
		}
		
		
		public void ProductA(String name, String id, String pw, String number) { //, boolean sex, String adress, int age
			tName=name;
			tId=id;
			tPw=pw;
			tNumber=number;
		//	tSex=sex;
		//	tAdress=adress;
		//	tAge=age;
			
		}
		public void ProductB(boolean sex, String adress, int age) {
			tSex=sex;
			tAdress=adress;
			tAge=age;
			
		} 
		public void setMember() {
			//Scanner 클래스를 이용한 사용자 입력부분 처리
			Scanner input = new Scanner(System.in);
			System.out.println("이름을 입력해주세요 : "); 
			tName=input.nextLine();
			System.out.println("아이디를 입력해주세요 : "); 
			tId=input.nextLine();
			System.out.println("패스워드를 입력해주세요 : "); 
			tPw=input.nextLine();
			System.out.println("휴대폰 번호를 입력해주세요 : "); 
			tNumber=input.nextLine();
			
		}
		public void putMember() {
			// 회원의 모든 정보를 출력
			System.out.println(tName+" "+tId+" "+tPw+" "+tNumber+" "+tSex+" "+tAdress+" "+tAge);

		}
		
		public String getMembername() {return(tName);}
		public String getMemberid() {return(tId);}
		public String getMemberpw() {return(tPw);}
		public String getMembernumber() {return(tNumber);}
		public boolean getMembersex() { if(tSex = true) {
			System.out.println("Man");
		} if(tSex = false)  return(tSex); {
			System.out.println("Woman");
		} return(tSex);}
		public String getMemberadress() {return(tAdress);}
		public int getMemberage() {return(tAge);}
		

	}

//===============================================================================================================//
//프로젝트 (Memberinfo_Project) 패키지 (Memberinfo)
//로그인 기능을 클래스로 구현 (회원정보 클래스 부터 구현)
//@회원정보 클래스의 구조
//데이터 : 회원이름, 아이디, 암호, 번호
//기능 : 회원정보를 모두 입력받아서 저장할수있는 기능
//모든 회원정보를 출력하는 기능
//회원정보를 각각 반환(return)하는 기능 (정보의 갯수 만큼 필요)
//getMemberName getMemberId getMemberPass getMemberPhone
//코드 동작 테스트 : member클래스로 객체 생성 생성된객체에 회원정보저장 저장된 정보들을 각각확인(get개열의 메소드들을 이용하여 정보들을 반환받은후 출력)
//저장된 정보들을 출력함

//@회원정보클래스를 확장해서 데이터를 추가한다.
//*성별(boolean타입)
//*주소(String타입)
//*나이(Int타입)

// 추상클래스 -> 누가 조상클래스에 들어가고 누가 후손 클래스에 들어가는가?
// ex 게임에 관련된 클래스를 상속구조로 만든다면
// 인간 (HUMAN)- 조상 클래스 (추상클래스 : abstract--> 이건 객체로 생성해낼수없음.(new를 사용하지못함)
// 인간들이 가질수있는 모든공통점(이름,체력,마나,스테미너,생사여부) 이것들을 물려받음
// 전사 -> 후손클래스(자신만의 특징 : 무기사용 )
// 마법사 -> 후손클래스(자신만의 특징 : 마법 )
// 도적 -> 후손클래스(자신만의 특징 : 유틸리티 )
//   제작할 프로그램 내용
//  *새로운 데이터에 대한 셋터/겟터/풋터를 만들어 준다. 게터 세터 개념이 부족함.. 일단된듯?
//1) 회원정보클래스를 기존의 클래스는 조상클래스(base), 새로운 클래스는 후손 클래스(child)로 사용 // 해야됨
//2) 실제 만들어지는 객체는 새로운클래스로 만들고, 그것들을 리스트에 저장하는 방식을 사용함. 기존의 p1을 이용하면 조상클래스 설정은 정상적으로 작동
//3) 회원정보는 최초에 1회입력(초기멤버정보) 해주고, 그것을 파일에 저장해줌. 
//4) 그 다음부터는 기존의 파일에 저장된 데이터를 불러오는 식으로 처리

//   메뉴구성
//   [1] 회원정보등록  후손클래스로 등록
//   [2] 회원정보 불러오기
//   [3] 회원정보 출력하기
//===============================================================================================================//