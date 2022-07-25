package MiniPackage;

public class Park {
	// 차량번호
	private String CarNumber;
	// 들어온 시간
	private int InTime;

	// 필드에 대한 게터/세터
	public String getCarNumber() {
		return CarNumber;
	}

	public void setCarNumber(String carnumber) {
		this.CarNumber = carnumber;
	}

	public int getInTime() {
		return InTime;
	}

	public void setInTime(int inTime) {
		this.InTime = inTime;
	}

	// equals() 메소드
	public boolean equals(Object obj) {
		if (obj instanceof Park) {
			Park park = (Park) obj;
			if (CarNumber.equals(park.CarNumber)) {
				return true;
			}
		}

		return false;
	}

	// 생성자
	public Park() {
		CarNumber = new String();
		InTime = 0;
	}

}
