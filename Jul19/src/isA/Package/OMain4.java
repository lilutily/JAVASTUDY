package isA.Package;

public class OMain4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사람 객체
		// 이름,나이
		Human h = new Human();
		// 학생 객체
		// 이름, 나이, 학교
	//	Student s= new Student("대학교");
		Student ss = new Student("이름", 31,"대학교");
		ss.print();
	}

}
