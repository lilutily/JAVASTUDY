
public class exam44 {
//	String date; 
//	String name;
//	int price;
//	static String producer="수미";
	// producer은 static 영역 번지수에 저장되고 나머지는 heap에 저장된다.
	// static final일 경우 바뀔수가없다.(불변한다)
	String cpu;
	String ram;
	String hdd;
	static final String producer="SamSung";
	//속성값
	
	public void hab(int x, int y) { // (int x, int y) -> 파라미터 값
		// 지역변수 = 메소드 안에서 사용하고 버릴것들
		int z = x+y;
		System.out.println(z);
		
		// return;
	}

}
