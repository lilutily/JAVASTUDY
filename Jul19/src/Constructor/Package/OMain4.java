package Constructor.Package;

public class OMain4 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사람 객체
		// 이름, 나이
		// 정보출력
		
		// 사는곳 행성단위 ->
		People p = new People("human", 25);
		p.printP();
		
		People p2= new People("kaxi", 19);
		p2.printP();
		//---------------------
		// 이름, 나이
		// 정보출력
		
		// people 이름 c, c가 살고 있는 행성 
		System.out.println(p.name);
		System.out.println(p.home.capital);
		
		//사람들의 공용 속성 홈
		People.home.printTerra();
		
		// window linux os
		System.out.println();
	}

}
