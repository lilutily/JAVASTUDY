package Constructor.Package;

public class BMaka {
	//board marker
	String name;
	int price;
	String color;
	// 생성자 메소드 ctrl + space 
	// 생성자를 따로 만들지 않으면 -> 기계어로 바꿀때 그때 자동으로 만들어준다
	// spring jsp -> 자동으로 객체를 생성해주는 서비스를 이용
	// 위랑 같은 프로그램 이 기본생성자를 사용함
	// 이후에 나올 상속 -> 기본 생성자가 필요하다
	public BMaka() {
		// TODO Auto-generated constructor stub	
		// 기본생성자
	}
	// 개발자들은 이걸 주력으로 사용
	public BMaka(String name, int price, String color) {
		super();
		this.name = name;
		// this을 안붙일경우 가장 가까운 name을 가져온다
		this.price = price;
		this.color = color;
		// 마우스 우클릭 -> source -> Gererate Constuctor using field 설정
		// window preferences keys 검색후 Gererate Constuctor using field 
		// 단축키 설정 (지금은 ctrl shift a)
	}
	public void print() {
		System.out.println(name);
		System.out.println(price);
		System.out.println(color);
	}
}
