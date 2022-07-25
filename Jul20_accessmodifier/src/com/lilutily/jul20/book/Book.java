package com.lilutily.jul20.book;

// public : 어떤곳이든 접근가능
// protected : 같은 패키지 or 다른 패키지지만 상속관계면 접근가능
// (default/ friendly) : 같은 패키지만 접근 가능
// private : 외부에서 접근 불가능(내부에서만 사용 가능)

// public : 어떤곳이든 접근가능
// protected == (default/ friendly) : 같은 패키지에서만 접근가능
// private : 외부에서 접근 불가능
public class Book {
	public String title;
	protected String writer;
	int price;
	private int pageCount;
}
