package jul22_test;

import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int r = ran.nextInt();

//		String arr[] = {"ㄱ","ㄴ","ㄷ","ㄹ","ㅁ"};	
//		char[] ex = {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ'};
//		while(true) {
//			int sl = ran.nextInt(5);					
//			System.out.println(arr[sl]);					
//			if(arr[sl].equals('ㅁ')) {
//				System.out.println("end");
//				break;	
//			}
//		}

		String arr2 = "ㄱㄴㄷㄹㅁ";
		while (true) {
			int s2 = ran.nextInt(5);
			System.out.println(arr2.charAt(s2));
			if (arr2.charAt(s2) == 'ㅁ') { // arr2.charAt(s2) == arr2.charAt(4)
				System.out.println("end");
				break;
			}
		}
	}
}
