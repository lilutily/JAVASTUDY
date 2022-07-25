package isA.Package;

import java.util.Random;


public class OddNumber extends Random {
	@Override
	public int nextInt(int bound) {
		// TODO Auto-generated method stub
		
			int x = super.nextInt(bound);
			if(x%2 !=1) { 			
				return nextInt(bound);
				// 재귀함수를 계속 돌려준다.
			} 		
			return x;
		
		
		
		
//		int x = super.nextInt(bound);
//		if(x%2==1) {
//			return x;
//		} else {
//			return x+1;
//		}
	
		
		
//		int x = super.nextInt(bound);
//		return (x%2==1) ? x:nextInt(bound);
		
		
		
		
		
/*while(true) {
			int x = super.nextInt(bound);
			if(x%2 ==1) { 			
				return x;
			} 					
		}
 * 		 
 */
	}
//	조건 ? 참인 경우 반환 값 : 거짓인 경우 반환 값
	
}
