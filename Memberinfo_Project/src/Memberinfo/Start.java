package Memberinfo;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//회원정보객체
		//Info s = new Info();
		
		
		//========================================================//
		// 2명의 회원정보객체를 생성한 후 그것들을 객체배열에 저장(Array)  
		// 객체배열(컨테이너)에 저장된것들을 접근해서 정보저장/반환/출력 해준다 
		// 2명의 회원정보가 처리되어야한다(반복문사용안함)
		// 문제가없는지 멤버를 늘려서 확인한다.
		//========================================================//
		
		
		
		//Info Member1 = new Info();
		//Info Member2 = new Info();
		//Info Member3 = new Info();
		//Info[] Members = new Info[3]; // 객체배열만들기
		
		
		// 반복문을 사용해서 처리하는 버전으로 바꿔본다
		// 중요한건 Members 컨테이너에 몇개가 저장되었는지를 알아내는 속성이나 메소드가 있는가 하는 점이다.
		// 예를들어 Members.length 라는 속성이 있다젼 그것을 반복문에서 사용하도록 한다.
		//String yournames=null; // 반드시 초기화 할것
	//	Members[0]=Member1; Members[1]=Member2; Members[2]=Member3;
	//	for(int i=0; i<Members.length; i++) {
	//		Members[i].setMember();
	//		yournames = Members[i].getMembername();
	//		System.out.println("당신의 이름은 " + yournames);
	//		Members[i].putMember();
	//	}
		
	/*	 ArrayList pitches = new ArrayList();
	        pitches.add("138"); // [0]
	        pitches.add("129"); // [1]
	        pitches.add("142"); // [2]
		
	        System.out.println(pitches.get(0));
	        System.out.println(pitches.remove(0));
	        System.out.println(pitches.get(0));
	        System.out.println(pitches.size());
	        //현재 리스트에 저장된 갯수를 출력하라
	        if(pitches.contains("129")) { System.out.println("ok");}
	        // 리스트 안에 있는 항목인지 판단하고 결과값을 boolean으로 표현
	        pitches.clear(); // 전체 삭제
	        System.out.println(pitches.size()); */
		
		//===================================================================================//
		//우리가 만든 회원정보객체를 ArrayList에 저장할수 있도록 코드를 작성
		//중요한것은 ArrayList에 특정타입(클래스)을 어떻게 저장 할 것인지에 대한 부분(문법)
		//List의 가장큰 특징은 객체를 새로만들때마다 새로 추가할 수 있다.(돈적컨테이너)
		//그리고, 검색(조회)이 간단하게 처리될수있다
		//===================================================================================//
	    Info m1= new Info();
	    Info m2= new Info();
		ArrayList<Info> a = new ArrayList<>();
		a.add(m1);
		a.add(m2);
		a.get(0).setMember(); // 첫 번째 회원의 정보를 세팅
		a.get(0).putMember(); // 회원정보 출력
		a.get(1).setMember(); // 두 번째 회원의 정보를 세팅
		a.get(1).putMember(); // 회원정보 출력
		
		
	/*	Members[0]=Member1; // 객체배열(컨테이너)에 저장된것들을 접근해서 정보저장/반환/출력 해준다
		Members[0].setMember(); // 0번칸에 저장
		String yourname = Members[0].getMembername(); // 첫번째 회원정보를 저장
		System.out.print("당신의 이름은 " + yourname); // 이름을 가져옴
		Members[0].putMember(); // 0번칸에 저장된 객체의 정보를 모두 출력
		
		
		Members[1]=Member1; // 객체배열(컨테이너)에 저장된것들을 접근해서 정보저장/반환/출력 해준다
		Members[1].setMember(); // 0번칸에 저장
		String yourname1 = Members[1].getMembername(); // 첫번째 회원정보를 저장
		System.out.print("당신의 이름은" + yourname1); // 이름을 가져옴
		Members[1].putMember(); // 0번칸에 저장된 객체
		
		System.out.println("컨테이너에 저장된 객체의 개수는 " + Members.length + "입니다."); */
		
		//정보저장
	/*	s.setMember();
		//정보반환 
		String tmpName=s.getMembername();
		String tmpId=s.getMemberid();
		String tmpPw=s.getMemberpw();
		String tmpNum=s.getMembernumber();
		
		//반환된정보학인
		System.out.println(tmpName+tmpId+tmpPw+tmpNum);
		//정보확인
		s.putMember(); */
		
	}

}
