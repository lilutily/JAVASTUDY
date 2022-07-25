package com.lilutily.Jul22.main;

import com.lilutily.Jul22.product.Monitor;
import com.lilutily.Jul22.product.Mouse;
import com.lilutily.Jul22.product.Product;

// 변수 : 데이터를 담는 그릇

// product라는 변수를 만들어 놓고
// 그 하위 객체를 만들어 넣는 
public class OMain {
	public static void main(String[] args) {
		Monitor mo = new Monitor();
		Mouse m = new Mouse();
		
		
		// 상품을 담을 수 있는 그릇 p에 상품을 만들어넣음
		Product p = new Product();
		// 마우스만 담을 수 있는 그릇 m2 상품이 들어간...
//		Mouse m2 = new Product();
		// 모니터만 담을 수 있는 그릇 a에 마우스가 들어간...
//		Monitor a = new Mouse();
		
		// 상품만 담을 수 있는 그릇 p2에 모니터가 들어간...
		Product p2 = new Monitor();
		
		// p3 = monitor
		Product p3;
		p3 = new Monitor(); // 상위 객체에 하위 객체를 묶는
		
		
//		int[] b= {1,6,7,"2"};
		Product b[]= {m, mo};
	}
	public Mouse print() {
		return new Mouse();
	}
	public Product print2() {
		return new Monitor();
	}
	public Product print3(Product b) {
		return new Monitor();
	}
}
