package TestPackage2;

public class Fish extends Animal {
	/*public Fish(String n, int h, boolean da) {
		// TODO Auto-generated constructor stub
		aName=n;
		aHp=h;
		aDeadorAlive=da;
	} */
	Fish() {} //형식상으로 사용
	Fish(String n, int h, boolean da) {
		super(n,h,da);
		;
	}
	public void putFishInfo() {
		System.out.println("이름은 : "+aName+ " 히트포인트는 : "+aHp+" 생존여부는 "+ aDeadorAlive);
	}
	public void swim() {
		System.out.println("헤엄칠수있다.");
	}
}
