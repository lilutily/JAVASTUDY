package Jul.Package;
// 함수없음 전부 객체임
// static 변수
// static (ram) 영역 딱 하나만 만들어
// -> 여러객체들이 공통속성으로 표현으로 사용
// -> 메모리 절약의 효과
public class Dog {
	
	// 속성
	// 멤버변수, 속성, 필드(기억해둘것)
	int Dog_Age;
	String Dog_Name;
	// 만약 여기에 String Dog_Name="나르"; 를 넣으면 힙에 저장이 되는데
	// 모든 개의 이름이 나르가 맞음? -> nope
	// if 만약 모든 개의 이름이 나르가 맞으면 static String Dog_Name="나르"; 가 된다.
	// static을 사용하면 heap 부분이 아닌 static 부분에 저장, 즉 데이터 RAM을 아낄수있다.
	
	
	// 액션 : 함수 => 메소드라고 부름
	// 데이터를 좀더 입체적으로 담기 위해 객체를 사용함
	public void action() {
		System.out.println("물어");
	}
	
	}
