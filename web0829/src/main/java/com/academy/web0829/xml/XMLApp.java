package com.academy.web0829.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/*
 *  자바언어에서 xml 다루기
 *  xml 자바언어에서 연동하는 비중이 크므로, 이미 자체적으로 파서가 지원된다
 *  xml 파싱방법은 크게 2가지가 있음
 *  1)DOM 방식 : 프로그램으로 처리하기가 용이하지만, 즉 쓰기는 쉬우나 최대 단점이라면
 *  					수많은 DOM객체가 메모리에 무조건 생성되므로, 스마트폰과 같이 메모리가 넉넉하지 않는
 *  					시스템에서는 사용을 하지 않음
 *  2)SAX 방식 : DOM 방식과는 달리, 한꺼번에 객체를 메모리에 올리는 방식이 아닌, 각각의 tag를 발견할때 마다 이벤트를 지원하여 개발자가 적절한 처리를 하는 방식
 * */
public class XMLApp {
	SAXParserFactory factory=SAXParserFactory.newInstance(); // 싱글턴 패턴
	
	public XMLApp() {
		try {
			SAXParser saxParser=factory.newSAXParser(); // 파서 준비
			MyHandler handler = new MyHandler();
			saxParser.parse(new File("D:/jsp_workspace/web0829/src/main/java/com/academy/web0829/xml/member.xml"), handler);
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new XMLApp();
	}
}
