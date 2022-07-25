package com.lilutily.jul20.send;


import com.lilutily.jul20.Animal.Cat;


// jdbc.jar		Spring.jar
// jar 파일 이용하기
public class SMain {
	public static void main(String[] args) {
		
		Cat c = new Cat("나르",3);
		c.cat_print();

	}
}

/* 프로젝트 우클릭
 * build path -> configure bulid path 클릭
 * library 클릭후 Add External jars 클릭후 아까 만들어둔
 * jar파일을 apply해준다.
 * 
 * 파일을 줄때 아까 만들어둔 jar파일도 같이 넣어서 줘야된다.
 * 링크만 달아둔것이기 때문이다.
 * */
