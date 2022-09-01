package com.academy.web0829.xml;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.academy.web0829.board.repository.Member;

/*
 *  xml을 구성하는 모든 노드마다 이벤트를 발생시켜주는 이벤트 핸들러를 재정의하자
 * */
public class MyHandler extends DefaultHandler {
	List<Member> list; // null
	Member member=null;
	boolean isName=false; // 실행부가 name태그를 지나치고있는지 여부를 판단해주는 논리값
	boolean isNation=false;
	
	public void startDocument() throws SAXException {
		System.out.println("문서의 시작");
	}
	// 시작태그를 만날때 호출 되는 메서드
	public void startElement(String uri, String localName, String tag, Attributes attributes) throws SAXException {
		System.out.print("<"+tag+">");
		// 시작태그의 종류에 따라 알맞는 처리를 해야하므로 조건문을 써야한다..
		if(tag.equals("members")) { // 가장 바깥쪽 태그를 만나면
			list = new ArrayList<Member>();
		} else if(tag.equals("member")) { // 한명의 회원정보를 담을 DTO 준비
			member = new Member();
		} else if(tag.equals("name")) {
			isName=true;
		} else if(tag.equals("nation")) {
			isNation=true;
		}
		
	}
	// 태그 사이의 데이터를 만날때 호출되는 메서드
	public void characters(char[] ch, int start, int length) throws SAXException {
		String content=new String(ch, start, length);
		System.out.print(content);
		if(isName) {
			member.setName(content);
		} 
		if(isNation) {
			member.setNation(content);
		}
	}
	// 닫는 태그를 만날때 호출되는 메서드
	public void endElement(String uri, String localName, String tag) throws SAXException {
		System.out.print("</"+tag+">");;
		
		if(tag.equals("name")) {
			isName=false;
		}
		else if(tag.equals("nation")) {
			isNation=false;
		}
		else if(tag.equals("member")) {
			list.add(member);
		}
	}
	public void endDocument() throws SAXException {
		System.out.print("문서의 끝, 총 회원수 : " + list);
	}
}
