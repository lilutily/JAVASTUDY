package TestPackage3;



public class Warrior extends Human {
	
	String weapon; // 무기
	
	Warrior() {
		hName=null;
		hHp=0.0f; 
		hMp=0.0f;
		hSt=0.0f;
		weapon=null; // this 생략가능ㅋ`
	}
	
	//Human 클래스가 가지고있던 풋터를 오버라이드함(무기정보출력때문)
	public void putWarriorInfo() {
		System.out.println("이름 : " + hName+" 체력 :  "+ hHp+" 마나 : "+hMp+" 스테미너 : "+hSt+" 무기 : "+weapon);
	}
	
	Warrior(String n, float h, float m, float s) {
		// TODO Auto-generated constructor stub
		hName=n;
		hHp=h; 
		hMp=m;
		hSt=s;
		weapon="목검";
		
	}
	public void Attack() {
		System.out.println("공격중..");
	}
	public void Check() {
		System.out.println("Warrior Class");
	}
}
