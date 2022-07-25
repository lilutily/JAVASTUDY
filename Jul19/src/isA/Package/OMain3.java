package isA.Package;

public class OMain3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		=== 식당에서 운영한다 ====
		// 커피
		// (이름, 가격), 사이즈, 온도 -> 정보 출력
		Coffee c = new Coffee();
		c.name="아메리카노";
		c.price=3000;
		c.size="venti";
		c.temp="hot";
		c.print();
		System.out.println("=================");
		// 김밥
		// (이름, 가격) -> 정보 출력
		Kimbap kb = new Kimbap();
		kb.name="야채김밥";
		kb.price=2500;
		kb.print();
		System.out.println("=================");
		// 소주
		// (이름,가격), 도수 -> 정보 출력
		Soju sj = new Soju();
		sj.name="진로";
		sj.price=5000;
		sj.alcohol=20;
		sj.print();
		
	}

}
