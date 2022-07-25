package com.lilutliy.Jul22.main;

import com.lilutliy.Jul22.avengers.Ben;
import com.lilutliy.Jul22.avengers.MemberInfo;
import com.lilutliy.Jul22.avengers.Toni;

public class OMain {
	public static void main(String[] args) {
		// 객체를 만들면서 1회용으로 클래스를 만드는 상황
		// anonymous class . 익명 클래스
		// memberinfo의 하위 객체인 1회용 객체
		MemberInfo info = new MemberInfo() {
			
			@Override
			public void Attack() {
				// TODO Auto-generated method stub
				System.out.println("test 1");
			}

			@Override
			public void d() {
				// TODO Auto-generated method stub
				System.out.println("smoker interface");
				
			}
		}; info.print(); info.Attack(); 
		
		Toni iron = new Toni("토니", 40, "자비스");
		iron.print();
		iron.Attack();
		iron.d();
		Ben hulk = new Ben("배너",35,40);
		hulk.print();
		hulk.Attack();
		
	}
}
