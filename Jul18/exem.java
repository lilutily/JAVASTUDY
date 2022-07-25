
public class exem {

	public static void main(String[] args) {
		
		int a=60;
		int b=70;
		int c=90;
		// int + int = int
		// int double = double
		// int + string = string
		
		
		if((a+b+c)/3.0 >=60 && a >= 40 && b >= 40 && c >= 40) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		
		// TODO Auto-generated method stub
		/*int jumsu[] = { 20, 50, 80 };
		// 변수 -> 객체 좀 더 데이터를 저장하고 싶어서 사용함
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = s1;

		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		s1 = null;
		s3 = null;
		s2 = null; 

		System.out.println("test\b"); */
		// c++는 한 글자가 1byte
		// java 한 글자는 2byte
		//
		// System.out.println("test\rtset");
		// System.out.println("test\r\ntset");
		// \r\n -> 정석적인 엔터
		// \n -> 알어서 해줌..
		// int a= 0;
		// double b=3.1;
		// char c='x';
		// 기본형, 참조형
		// 변수라는게 ram에 저장되는데 ram 어디에 저장되는지
		// ex) int a =4; ram에 4 저장
		// String h="hello"; 번지 수가 저장이 되고 heap에 "hello"가 저장된다.
		// 가비지 컬렉션
	/*	
		int age = 19;

		if (age < 20) {
			System.out.println("");
		}
		if (age > 20) {
			System.out.println("");
		} // 검사를 두번함<cpu>

		if (age < 20) {
			System.out.println("");
		} else {
			System.out.println("");
		} // 검사를 한번함

		
		if (age < 20) {
			System.out.println("");
		} else if (age < 40) {
			System.out.println("");
		} else {
			System.out.println("");
		} // 값이 참이면 나머지는 실행하지않는다.
 */
	}

} // 여기에서 힙 영역을 지워준다
