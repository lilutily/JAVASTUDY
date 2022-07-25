package Jul.Package;

public class Cumputer {
	static final String MADE="SAMSUNG";
	// 만약에 삼성이라는 것을 바뀌지않게 설정하면 static final로 설정
	String ram;
	String hdd;
	String cpu;
	
	public void print() {
		System.out.println(cpu);
		System.out.println(ram);
		System.out.println(hdd);
		System.out.println(MADE);	
	}
	
	public static void staticprint() {
		// 메소드에 static을 붙인다면?
		// 1. static 메소도는 공통메소드라서 용량을 줄여준다?
		// 2. static은 공통 속성이니까 메소드도 공통으로 속성을 가진다?
		System.out.println("추워...");
	}
}
