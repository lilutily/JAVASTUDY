package javaapp.thread;

import javax.swing.JProgressBar;

// 프로그래스 바를 증가시킬 쓰레드 정의
// 메인쓰레드는 무한루프나, 대기상대에 빠지게 해서는 안된다
// 메인 쓰레드는 GUI 프로그램을 운영하는 업무를 해야하기 때문이다(이벤트 처리, 그래픽 처리)
public class MyThread extends Thread {
	JProgressBar bar;

	int n=0;
	int speed;
	
	public MyThread(JProgressBar bar, int speed) {
		this.bar=bar;
		this.speed=speed;

	}
	// 개발자는 쓰레드 정의시 , 원하는 로직을 run메서드에 작성(run 오버라이딩)
	// 추후, run메서드는 JVM에게 선택되어지며 이 순간을 가리켜 running 상태라 한다.
	public void run() {
		while(true) {
			n=n+speed;
			bar.setValue(n);

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
