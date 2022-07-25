package Score_project;

import java.util.Scanner;

public class Student {
	// 데이터 영역
	private String Name;
	private int sKor, sEng, sMat, sTot;
	private float sAvg, sAvg2;

	// 메소드 영역	
	//셋터(데이터 세팅)
	
	//-----------------------------------------
	//새로운 setScore 메소드가 필요
	//3개의 점수를 사용자로부터 입력받아서 저장
	//에러처리 해야됨(데이터가 정상적인지 판단)
	//음수가 입력되었다면 에러메시지를 출력하고 중단
	//-----------------------------------------
	/*	public void setScore(int k, int e, int m) {
		sKor=k; sEng=e; sMat=m;
	}*/
	public int setScore() {
		
		//Scanner클래스로 입력받음.
		Scanner input = new Scanner(System.in);
		System.out.println("국어점수를 입력해주세요 : "); int k=input.nextInt();
		System.out.println("영어점수를 입력해주세요 : "); int e=input.nextInt();
		System.out.println("수학점수를 입력해주세요 : "); int m=input.nextInt();
			
		if((k<0) || (e<0) || (m<0)) {
			System.out.println("움수가 입력되었습니다");
			return(-1); // 메소드를 중단하고 빠져나간다
		} sKor=k; sEng=e; sMat=m;
		System.out.println("정상적으로 압력되었습니다");  
		return(0);
		
	} 
	//겟터(데이터를 변환)
	public int getTotScore() {
		// 총점을 리턴해준다
		sTot=sKor+sEng+sMat;
		return sTot;
	}
	public float getAvgScore() {
		// 평균점수를 리턴해준다.
		sAvg=sTot/3.0f;	
		return sAvg;
	}
	//풋터(데이터를 출력)
	public void putScore() {
		System.out.println("국어 : " +sKor+ " 영어 : " +sEng+" 수학 : " +sMat);
		System.out.println("총점 : "+sTot+" 평균 : "+Math.round(sAvg));
	}


}
