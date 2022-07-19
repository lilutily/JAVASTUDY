package TestPackage;

public class Warrior extends Human {
	
	String weapon; // 무기
	
	Warrior() {
		this.hName=null;
		this.hHp=0.0f; 
		this.hMp=0.0f;
		this.hSt=0.0f;
		this.weapon=null; // this 생략가능ㅋ`
	}
	
	//Human 클래스가 가지고있던 풋터를 오버라이드함(무기정보출력때문)
	public void putHumanInfo() {
		System.out.println("이름 : " + this.hName+" 체력 :  "+ this.hHp+" 마나 : "+this.hMp+" 스테미너 : "+this.hSt+" 무기 : "+this.weapon);
	}
	
	public Warrior(String n, float h, float m, float s) {
		// TODO Auto-generated constructor stub
		this.hName=n;
		this.hHp=h; 
		this.hMp=m;
		this.hSt=s;
		this.weapon="목검";
		
	}
	public void Attack() {
		System.out.println("공격중..");
	}
	public void Check() {
		System.out.println("Warrior Class");
	}
}
