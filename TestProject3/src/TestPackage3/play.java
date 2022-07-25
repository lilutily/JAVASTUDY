package TestPackage3;

import java.util.ArrayList;
import java.util.Random;



public class play  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Human> ClassList = new ArrayList<Human>();
		Warrior w1 =new Warrior("Warload1", 250000f, 11000f,3400f);
		Warrior w2 =new Warrior("Warload2", 310000f, 1000f,2000f);
		Wizard w3 =new Wizard("Bard1", 180000f, 11100000f, 400f);		
		Wizard w4 =new Wizard("Bard2", 150000f, 4100000f, 600f);
		Wizard w5 =new Wizard("Bard3", 110000f, 6100000f, 800f);

		Random random = new Random();
		for(int i=1; i<=5; i++) {
			// max 값이 3이면 (0~2)까지 생성한다 그래서 +1
			System.out.println(random.nextInt(2)+1 + " ");		
			}
		
		
		ClassList.add(w1);
		ClassList.add(w2);
		ClassList.add(w3);
		ClassList.add(w4);   
		ClassList.add(w5);
		
		Human ob1 = ClassList.get(0);
		Human ob2 =ClassList.get(1);
		Human ob3 =ClassList.get(2);
		Human ob4 =ClassList.get(3);
		Human ob5 =ClassList.get(4);
		w1.putWarriorInfo(); 
		w2.putWarriorInfo(); 
		w3.putWizardInfo();w3.useMagic();
		w4.putWizardInfo();w4.useMagic();
		w5.putWizardInfo();w5.useMagic();
		
		
		
	}
}


/* @다형성 테스트 문제
 * 1. 아까 만든 Human클래스와 Warrior 클래스를 사용
 * 단, Human 클래스로부터 상속된 마법사 클래스를 하나 더 만든다
 * 마법사의 기능은 useMagic() 메소드가 있고, 실행하면 특정메시지가 출력
 * 
 * 2. Human 클래스로 컨테이너를 만들고, 그 안에 Warrior와 Wizard 객체들을 저장한다
 * 단, 랜덤기능을 사용해서 어떤객체가 만들어질지 모르도록 해준다.(실행할때마다 결과값이 다름)
 * 객체의 갯수는 총 5개로 설정하고, 5개의 객체가 순차적으로 컨테이너에 저장되도록해준다(.add)
 * 
 * 3. 저장된 이후 5개의 객체를 순차적으로 추출해서(.get) 그것들의 타입이 어떤것인지 판단해서 결과를 출력한다(해당객체의 특수기능을 사용하도로한다)
 * 예를 들어 Warrior 클래스였다면 useWeapon() 메소드를 작동시키고, 마법사였으면 useMagic()을 사용하도록한다.
 */
