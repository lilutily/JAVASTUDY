package javaapp.thread;
/*
 *  쓰레드란? 하나의 프로세스 내에 독립적으로 실행될 수 있는 세부실행단위
 * */

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressApp extends JFrame {
	JProgressBar bar,bar2,bar3; // 누르고 shift + f2누르면 api로 연결해줌
	JButton bt;
	MyThread myThread,myThread2,myThread3;
	public ProgressApp() {
		// TODO Auto-generated constructor stub
		bar = new JProgressBar();
		bar2 = new JProgressBar();
		bar3 = new JProgressBar();
		
		bt = new JButton("download");
		myThread = new MyThread(bar, 10);
		myThread2 = new MyThread(bar2, 5);
		myThread3 = new MyThread(bar3, 20);
		
		// 스타일
		bar.setPreferredSize(new Dimension(380,50));
		bar2.setPreferredSize(new Dimension(380,50));
		bar3.setPreferredSize(new Dimension(380,50));
		
		// 배치관리자 적용
		setLayout(new FlowLayout());
		
		// 조립
		add(bar);
		add(bar2);
		add(bar3);
		add(bt);
		
		
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 창 닫을때  프로세스도 죽여버림
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 생성된 쓰레드를 jvm의 runnable 영역으로 넣어버리자
				myThread.start();
				myThread2.start();
				myThread3.start();
			}
		});
	}
	
	public static void main(String[] args) {
//		int[] arr= {1,2,3};
//		System.out.println(arr[4]);
		new ProgressApp();
	}
}
