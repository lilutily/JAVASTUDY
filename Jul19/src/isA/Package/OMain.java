// a is a b
// 상품은 컴퓨터
// 컴퓨터는 전자제품
// 상속이라는 것은? -> extends 로 사용
 package isA.Package;

public class OMain {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 x
		// 상품 객체를 만들건데
		// 품명은 테스트 가격은10원
		// 정보출력
		Product p = new Product();
		p.name="test";
		p.price=10;
		p.Print();
		
		// 펜이라는 객체들 들건데
		// 이름, 가격, 색
		// 정보출력
		Pen pen = new Pen();
		pen.name="깃슨";
		pen.price=300000;
		pen.color="시안블랙";
		// color는 프린트가 안된다 왜 why? 상속받은곳에 color는 없었으니까
		pen.Print();
	}

}
