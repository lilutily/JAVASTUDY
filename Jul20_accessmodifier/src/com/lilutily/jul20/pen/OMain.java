package com.lilutily.jul20.pen;
import com.lilutily.jul20.book.Book;



// 접근제어자/접근관리자/접근지정자 (access modifier)
// 클래스의 멤버들(멤버변수/ 메소드/ 클래스) 들 외부에서 접근여부를 조절하는
public class OMain extends Book {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 펜 : 이름, 가격

// 패키지는 다르지만 상속을 받고있는 상황		
		Book b = new Book();
		b.title="1";
		b.writer="1";
		b.price=1;
		b.pageCount=1;
	}

}
