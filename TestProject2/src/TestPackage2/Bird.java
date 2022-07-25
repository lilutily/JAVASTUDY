package TestPackage2;

public class Bird extends Animal {
	
	/*public Bird(String n, int h, boolean da) {
		// TODO Auto-generated constructor stub
		aName=n;
		aHp=h;
		aDeadorAlive=da;
	} */
	Bird() {} //형식상으로 사용
	Bird(String n, int h, boolean da) {
		super(n,h,da);
		;
	}

	public void putBirdInfo() {
		System.out.println("이름은 : "+aName+ " 히트포인트는 : "+aHp+" 생존여부는 "+ aDeadorAlive);
	}
	
	public void fly() {
		System.out.println("날수있다");
	}
}
