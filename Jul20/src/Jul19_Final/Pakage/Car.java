package Jul19_Final.Pakage;

// 멤버변수에 static 붙이고 final 붙이면 상수화한다
// 멤버변수에서 final 붙이면 변경불가

// final 메소드에 붙이면?
// -> 메소드에 final을 붙이면 오버라이딩이 불가능하다
// final이 클래스에 붙으면 상속을 못한다.
public class Car {
	static final String NAME="차"; // 상수화 했으면 대문자로 바꿔주는 약속
	
	public void run() { // public final void run
		System.out.println("달달달");
	}
	
}
