package chap98_homework.nc230316;

public class PhoneInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneInfo test = new PhoneInfo();
		
		test.insertPhoneInfo("홍길동", "0000");
		test.insertPhoneInfo("강사님", "1111");
		test.printAllPhoneInfo();
		test.printPhoneInfo(3);

	}

}
