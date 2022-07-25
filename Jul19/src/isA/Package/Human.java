package isA.Package;

public class Human {
	String name;
	int age;
	
	// 생성자 하나도 안만들면 컴파일할때 자동으로 만들어준다.
	// 기본생성자는 잘안쓰지만
	// spring
	// 상속할때도 상위 클래스를 상속시키면 기본적으로
	// 기본 생성자를 실행시킨다.
	public Human() {
		System.out.println("sword beat guns");
	}
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public void print() {
		System.out.println(name);
		System.out.println(age);
	}

}
