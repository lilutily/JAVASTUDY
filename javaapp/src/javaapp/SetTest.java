package javaapp;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 *  컬넥션 프레임워크 중 set을 학습
 *  Set : 순서없는 객체 집합
 * */
public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); // Generic 타입
		
		set.add("소리");
		set.add("커줭");
		set.add("젭알");
		set.add("이러다");
		set.add("나 죽음");
		
		System.out.println("담겨진 수 : " + set.size());
		
		// 담겨진 수 출력하기(반복문으로)
		// 순서없는 집합이므로 , 별도의 도구를 이용해야한다. 이때 지원되는
		// 도구들은 객체들을 일렬로 늘어뜨리는 기능을 가진 Enumeration, Iterator가 있다
		Iterator<String> it= set.iterator();
		
		while(it.hasNext()) {
			String name= it.next();
			System.out.println(name);
		}
	}
}
