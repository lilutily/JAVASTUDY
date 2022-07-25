package TestPackage3;

public class Wizard extends Human {
	
	Wizard() {
		hName=null;
		hHp=0.0f; 
		hMp=0.0f;
		hSt=0.0f;
		
	}
	Wizard(String n, float h, float m, float s) {
		// TODO Auto-generated constructor stub
		hName=n;
		hHp=h; 
		hMp=m;
		hSt=s;
		
		
	}
	public void putWizardInfo() {
		System.out.println("이름 : " + hName+" 체력 :  "+ hHp+" 마나 : "+hMp+" 스테미너 : "+hSt);
	}
	void useMagic() {
		System.out.println("마법 사용");
	}

}
