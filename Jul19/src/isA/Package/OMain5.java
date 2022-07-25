package isA.Package;

import java.util.Random;

public class OMain5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상속
		// 홀수만 나오는 객체만들기
		// 랜덤 구현
		OddNumber ran = new OddNumber();
		System.out.println(ran.nextInt(50));		
//		Random random = new Random();
//		int r = random.nextInt(500);	
//		System.out.println(ran);
		
	}

}
