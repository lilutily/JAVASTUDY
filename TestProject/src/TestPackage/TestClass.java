package TestPackage;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Human h =new Human(); 추상클래스이기 때문에 객체생성이 안된다(new사용안됨)
		// 생성자(No parameters)
		 Warrior w = new Warrior();
		 w.putHumanInfo();
		Warrior w3=  new Warrior("부재실", 179352f, 3400f, 320f);
		w3.putHumanInfo();// 목검을 가지고있는지
	 
		 //w.Check();  // 누구의 메소드가 실행되는가? (오버라이드)
		 //w.Attack();
		 
	}

}

/*class HouseDog extends Dog {
void sleep() { 파라미터 X
    System.out.println(this.name + " zzz in house");
}

void sleep(int hour) { 파리미터 O -> (int hour)
    System.out.println(this.name + " zzz in house for " + hour + " hours");
} */