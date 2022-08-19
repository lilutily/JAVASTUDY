package javaapp.thread;

// 별을 출력하는 쓰레드 정의
public class Star extends Thread{
	String mark;
	public Star(String mark) {
		this.mark=mark;
	}
	// 쓰레드의 실행순서는 개발자가 결정짓는게 아니지만 적어도 로직은 개발자가 작성해야하므로
	// run 메서드를 재정의해야한다.
	// run 메서드 호출자는? JVM이 호출
	public void run() {
		while(true) {
			System.out.println(mark);
			//while문은 속도가 너무 빠르므로, jvm에게
			// 너무 많은 run을 수행해버린다 따라서 지정한 시간동안
			// non-Runnable 영역으로 빼놓을수있는 기능ㅇ ㅣ지원됨
			// sleep(시간);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
