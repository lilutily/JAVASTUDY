import java.util.Arrays;

public class OMain7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 로또 프로그램
//		for (int i = 0; i < 10; i++) {
//			여기로 올라오는?			
//			if(i==5) {
//				break; // 다시 사용못하도록 부셔버리기
//				continue; // 다시 for문 위로 올라가는 느낌
//			} System.out.println(i);
//		}
		int i, j;
		int lotto[] = new int[6];
		for(i=0; i<lotto.length; i++) {  // i=0;
			lotto[i] = (int) (Math.random()*45+1);
			for(j=0; j<i; j++) { // j=0 || j<i이면 실행x
				lotto[j] = (int) (Math.random() *45+1);
				if(lotto[i]==lotto[j]) {
					i--;
					break; // 반복문이라 써줘야되는듯?
				} 
		} 
		} 
		Arrays.sort(lotto); // 정렬 시켜달라는 함수
		for(i=0; i<6; i++) { // for문을 벗어나서 다시 써야됨 안쓰면 하나만 출력
		System.out.print(lotto[i]+" ");
		}
	}

}

/*
 * java 1.5이상부터 추가된 기능
 *  gd:for(int i=0; i<args.length; i++) {
 *  gd2:for(int j=0; j<args.length; j++)  {
 *    break g2;
 *    	}
 *  }
 *  Ajax
 * 
 */