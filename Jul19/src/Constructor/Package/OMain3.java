package Constructor.Package;
//왜 객체를 시용하는지
//객체들관게
//A has a b
//A is a b
// gura가 펜을 가지고있다.
// 가지고있는 펜은 brown계열 왓슨 펜
public class OMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 펜 : 이름, 가격, 색깔
		// 프린트 메소드
		Pen p = new Pen("왓슨", 35000, "brown");
//		p.printP();
		Student s= new Student("gura", 20, p);
		s.printS();
		
		// 개 객체하나
		// 이름, 나이
		Dog d = new Dog("뽀삐", 3, s);
		d.printD();
		System.out.println(d.owner.name);
		System.out.println(d.name);
		//d 개의 주인이 가지고 있는 펜의 색깔
		System.out.println(d.owner.pen.color);
	}

}
