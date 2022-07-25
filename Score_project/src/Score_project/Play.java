package Score_project;

public class Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s =new Student(); // 객체생성
		@SuppressWarnings("unused")
		int err = s.setScore(); // 점수처리
		//만약 에러처리를 여기서 하게된다면 -1 or 0에 따라 메시지가 출력  
		s.getTotScore();// 총점처리
		s.getAvgScore();// 평균처리
		s.putScore(); // 점수출력
	}

}
