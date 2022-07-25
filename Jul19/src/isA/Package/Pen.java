// pen is product -> o
// human is product -> x


package isA.Package;

public class Pen extends Product {
	// 펜만이 가질수 있는 것들을 넣어보자
	String color;
	// 아무것도 없어 보이지만
	// 상위 클래스 멤버변수랑 메소드를 물려받는 extends
	// 상위 클래스 / 부모 클래스 / super 클래스 라고 부름
	// 
	
	// @ : 경로들를 적는
	@Override // = annotation : 다른데 붙으면 에러남
	// 기능: 원래대로라면 수동으로 작업해야 하는걸 자동으로 바꿔준다.
	// 오버라이딩은 부모 클래스에게 상속받는걸 내가 쓰고 싶을때
	public void Print() {
		// TODO Auto-generated method stub
		super.Print(); // 생략 가능, 단 안나올뿐
		// 상속받은 product에서 온것을 super라고한다.
		// 즉 extends 받은 객체를 의미한다.
		// 기능을 물려받고 추가할거있으면 추가해라
//		System.out.println(name);
//		System.out.println(price);
		System.out.println(color);
	}
	
}
