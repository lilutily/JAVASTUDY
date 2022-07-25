package Jul.Package;

// 개발자가 java 소스로 만든다 (개발)
// -> 번역-(컴파일) -> 기계어(.class) -> 실행
// static 멤버변수들을 모두 static 영역에 먼저 부르고
// -> JVM 하는 -> JVM이 main을 부르는데
// 

// OOD
// static 메소도는 공통메소드라서 용량을 줄여준다?
// static은 공통 속성이니까 메소드도 공통으로 속성을 가진다?
public class OMain2 {

	public static void main(String[] args) {
		Cumputer.staticprint();
		// TODO Auto-generated method stub
		// 게장 객체를 만들어 주세요
		// 이름과 가격을 넣어주세요
		// 만든사람은 김수미로 해주세요
		
		// 이름이 무엇인지 - ??
		// 가격이 얼망? - ??
		// 만든 사람이 누구? -> 수미요
		System.out.println(Crab.producer);
		
		
		Crab c = new Crab();
		c.name="양념게장";
		c.price=20000;
		
	}

}
