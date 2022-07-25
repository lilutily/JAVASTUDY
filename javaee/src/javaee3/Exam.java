package javaee3;

public class Exam {
	// 데이터 구역

	int a=0;
	int b=0;
	int c=0;
	int sum=0;
	float re=0;
	String name=""; // private 해준다 = 캡슐화 = 보안
	
	void set_Score() {
		name="Sung Tae Woong";
		a=50; b=100; c=80;
		sum=(a+b+c);
		re=sum/3.0f;
	}
	void get_Score() {
		
		System.out.println(name+"님의 국어 점수는 " +a+ "영어 점수는 " +b+ "수학 점수는 " +c+ "총점은 " +sum+"이며 평균 점수는 " + re +" 입니다.");
	}



	public static void main(String[] args) {
	// TODO Auto-generated method stub
		Exam exam = new Exam();
		exam.set_Score();
		exam.get_Score();
		
	
	

}

}
