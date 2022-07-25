package TestPackage3;

public class Human {
	//클래스 내부의 데이터들(속성 -> fields -> properties)
		//공통점 (ex-이름(문자열타입) = hName, 체력(숫자타입-실수) = hHp, 마나(숫자타입-실수) = hMp, 스테미너(숫자타입-실수) = tSt
		String hName;
		float hHp;
		float hMp;
		float hSt;
		
		//=======================================================================================================// 
		// 생성자(Constructor) 라는것은 이 클래스로 객체를 만들어낼때, 가지고있는 데이터들을 초기화할때 사용한다
		// 특징은 클래스와 이름이 같고, 리턴타입이 아예없다는것(void가 아니고 없음)
		// new를 사용해서 객체를 만들어낼때 자동으로 작동
		//=======================================================================================================//
		Human() {
			// 이 생성자는 이름, 체력, 마나, 스테미너를 모두 초기화 해준다.(문자열은 NULL, 숫자는 0)
			hName=null; hHp=0.0f; 
			hMp=0.0f; hSt=0.0f;
			
		}
		// 생성자 오버로딩(직접적으로 데이터를 전달해서 그 값으로 객체를 세팅해준다)
		Human(String n, float h, float m, float s) {
			hName=n;
			hHp=h; 
			hMp=m;
			hSt=s;
		}		
		public void Check() {
			//Human Class 소속의 메소드라는것을 출력해줌.(알려줌)
			System.out.println("Human Class");
		}
		
		public void Attack() {System.out.println("공격중...");
		
		}
		
		//출력기능(초기화가 잘되었나 확인)
		public void putHumanInfo() {
			System.out.println(hName+" "+ hHp+" "+hMp+" "+hSt+" ");
	 }
	}