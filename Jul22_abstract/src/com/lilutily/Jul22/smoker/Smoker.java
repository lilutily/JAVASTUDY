package com.lilutily.Jul22.smoker;


// 일반 클래스 : 멤버변수, 멤버상수, 메소드
// 추상 클래스 : 멤버변수, 멤버상수, 메소드, 추상메소드 -> 객체를 못만듬
// 인터페이스 : 멤버상수, 추상메소드만 가능 -> 객체를 못만듬
// 추상 클래스를 가지고있는 것들은 extends를 받을때 추상메소드를 완성 시켜야만한다.
// 추상클래스 보다 기능이 떨어짐
public interface Smoker {
//	int a; 멤버변수 불가능
	public static final int B =1; // 멤버상수는 가능
	
//	public void b() {} // 메소드 불가능
		
	public void d();

}
