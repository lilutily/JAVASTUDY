import java.util.Scanner;

public class exam3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요 : "); 
		String name=sc.nextLine();
		System.out.print("몸무게를 입력해주세요 : "); 
		Double kg=sc.nextDouble();
		System.out.print("키를 입력해주세요 : "); 
		Double hi=sc.nextDouble();
		
		System.out.println("이름 : "+name);
		System.out.println("몸무게 : "+kg);
		System.out.println("키 : "+hi);
		double k1= hi/100;
		double result = kg/(k1*k1);
		System.out.println("BMI 수치 : "+String.format("%.1f", result));
		String bim;
		if(result >= 30) {
			bim = "비만";
		//	System.out.println("과체중");
		} else if(result >= 25) {
			bim = "비만";// 위에 조건 30이상을 통과해야되기 때문에 25이상으로 설정한다 <30을 쓸필요가없다
		//	System.out.println("비만");
		} else if(result >=20) 
			bim = "비만";
		//	System.out.println("정상");
		else {
			bim = "비만";
		}
		//	System.out.println("저체중");	} 
		System.out.printf("%s 는 bmi %.1f %s", name, kg, hi);
		sc.next();
	}
	
	}


