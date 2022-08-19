/*
 *  쓰레드란? 하나의 <프로세스 내>에서 <독립적>으로 수행될 수 있는 세부실행 단위
 *  우리가 사용하는 OS가 여러 프로세스들을 시분할하여 마치 동시에 실행되는 것처럼 효과를 내듯, 
 *  자바 JVM은 현재 실행중인 프로세스내의 여러 쓰레드들을 대상으로 시분할하여 마치 쓰레드들이 동시에 실해되는 것처럼
 *  효과를 낼수 있다..
 * */

package javaapp.thread;

public class PrintStar {
	public static void main(String[] args) {
		// 쓰레드 한개를 생성하여 일시켜보자
		Star s1=new Star("★");
		Star s2=new Star("☆");
		// run()을 호출하면 안되는 이유?
		// 실행 순서는 시스템인 jvm에게 맡겨야함
		// run()을 직접호출할 경우 일반 메서드 수행일뿐 쓰레드 효과x 우린 시분할할거임
		s1.start();
		s2.start();
		
	}
}
