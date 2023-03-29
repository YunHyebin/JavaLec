package chap98_homework.nc230316;

public class PhoneInfo {
	String[] name = new String[100];
	String[] phoneNum = new String[100];

	int count = 0;

	// 이름과 번호를 배열에 저장
	public void insertPhoneInfo(String name, String number) {
		this.name[count] = name;
		this.phoneNum[count] = number;
		count++;
	}

	public void printAllPhoneInfo() {
		// 유효한 값이 저장된 배열 요소 개수만큼 반복문 실행
		for (int cnt = 0; cnt < count; cnt++) {
			System.out.println("이름: " + this.name[cnt] + "\t번호: " + this.phoneNum[cnt]);
		}
	}

	// 번호에 해당하는 이름과 번호 출력
	public void printPhoneInfo(int index) {
		if (index > count)
		{}
		if (this.name[index] == null && this.phoneNum[index] == null) {
			System.out.println("해당 정보가 없습니다.");
		}
		else {System.out.println("이름: " + this.name[index] + "\t번호: " + this.phoneNum[index]);
		}
	}
}
