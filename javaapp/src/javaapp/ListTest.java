/*
 *  List는 순서있는 집합이므로 ,배뎔과 상당히 흡사함 
 *  차이점
 *  1) 대상 - 
 *  		List : 객체만을 대상으로 함
 *  		배열 : 기본자료형, 객체가 대상이 될 수 있음
 *  
 *  2) 유연셩 -
 *  		List : 생성시 크기를 명시하지 않아도 됨
 *  		배열 : 반드시 개발자가 크기를 명시하여 생성해야 한다.
 * */

package javaapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ListTest extends JFrame { // ListTest는 윈도우 창이다
	// 멤버변수는 사실, 부품이 온다 자바에서는 부품관계를 has a 관계라 한다.
	// 객체를 멤버변수로 선언한 경우를 has a 관계라 한다.
	JButton bt_create, bt_color;
	JPanel p; // 그냥 비어있는 컴포넌트 -- div 느낌
	
	// 앞으로 생성된 버튼을 담을 배열
	//JButton[] btArray= new JButton[20]; => 유저가 동적으로 버튼을 생성하므로 배열으로는 해결안됨
	// 그러면? 배열의 특징을 모두 갖고있으면서 크기가 유연한 list로 처리
	List<JButton> btList= new ArrayList<JButton>();
	public ListTest() {
		bt_create = new JButton("버튼생성");
		bt_color = new JButton("색상적용");
		p=new JPanel();
		
		p.setBackground(Color.yellow);
		p.setPreferredSize(new Dimension(380,450));
		this.setLayout(new FlowLayout());
		// this는 heap 영역에 올라온 자기 자신을 가르킴 -> 레퍼런스 변수
		add(bt_create);
		add(bt_color);
		add(p);
		setSize(400,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // public static final
		
		// 이벤트 연결 코드는 1회성 이므로, 즉 .java로 만들 실익이 없다 따라서 내부익명 클래스로 만들기
		bt_create.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				// 동적으로 버튼 생성하기
				setColor();
				createBtn();
			}
		});
	}
	public void createBtn() {
		JButton bt = new JButton("버튼1");
		
		btList.add(bt);
		System.out.println("현재 생성된 버튼의 수는 " + btList.size());
		p.add(bt); // 버튼을 패널에 부착 / 패널은 디폴트가 이미 FlowLayout 이다.
		p.updateUI();// 화면 갱신 요청
	}
	public void setColor() {
		// 동적으로 생성된 모든 버튼의 배경색을 blue색으로 변경
		// 버튼.setBackground(Color.Blue)
//		for(int i=0; i<btList.size(); i++) {
//			JButton bt=btList.get(i); // 제너릭 타입이므로, 형변환이 필요없어짐
//			bt.setBackground(Color.BLUE);
//		}
		
		// 컬렉션 프레임워크를 다룰떄 사용가능한 improved for 문 (jdk 1.5부터 지원)
		for(JButton bt: btList) {
			bt.setBackground(Color.BLUE);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ListTest();	
	}

}
