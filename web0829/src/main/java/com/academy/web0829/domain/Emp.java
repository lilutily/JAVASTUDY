package com.academy.web0829.domain;

import lombok.Data;
// lombok을 이용하여 게터 세터 자동 생성
@Data 
public class Emp {
	private int empno;
	private String ename;
	private String job;
	private int mgr;
	private String hiredate;
	private int sal;
	private int comm;
	private Dept dept; // Emp가 부모를 보유한다 has a 관계,. foreign키는 has a 관계로 표현
}
