package TestPackage2;

public class Animal {
	String aName;
	int aHp;
	boolean aDeadorAlive;
	// 기본생성자
	Animal() {
		aName=null;
		aHp=0;
		aDeadorAlive = true;

	}
	// 오버로딩된 생성자
	Animal(String n, int h, boolean da) {
		aName=n;
		aHp=h;
		aDeadorAlive=da;
	}
	
	public void move() {
		System.out.println("움직인다.");
	}
	
	public void DA() {
		aDeadorAlive=false;
		System.out.println("사망");
	}
	public void AnimalInfo() {
		System.out.println("이름은 : "+aName+ " 히트포인트는 : "+aHp+" 생존여부는 "+ aDeadorAlive);
	}
}
