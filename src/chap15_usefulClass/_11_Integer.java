package chap15_usefulClass;

public class _11_Integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Integer 생성자 자바 9 버전부터는 사용불가
		Integer num1 = Integer.valueOf(100);
		Integer num2 = Integer.valueOf(100);
		// BigInteger, BigDecimal
		
		// 주소값 비교 같은 객체를 바라보는지 확인
		// equals 메소드가 오버라이딩 되어있어 값만 비교한다.
		System.out.println(num1 == num2);			//true
		System.out.println(num1.equals(num2));		//true
		System.out.println(num1.compareTo(num2));	// 같으면 0, 작으면 -1, 크면 1
		
		// 문자열을 정수형으로 변환
		String numStr = "1000";
		String numStr2 = "1000";
		System.out.println(numStr == numStr2);	//true
		numStr2 = "2000";
		System.out.println(numStr == numStr2);	//false
		System.out.println(numStr.equals(numStr2)); // false
		
		int convertNum = Integer.parseInt(numStr);
		System.out.println(convertNum);
		System.out.println(Integer.valueOf(convertNum).getClass());	//class java.lang.Integer
		
		//int의 최대값, 최소값을 상수 멤버변수로 지정해놔서
		//멤버변수를 호출하면 확인 가능하다.
		System.out.println(Integer.MAX_VALUE);	//2147483648
		System.out.println(Integer.MIN_VALUE);	//-2147483648
		
		// 문자열로 변환
		String convertStr = num1.toString();
		System.out.println(convertStr.getClass().getName());	//java.lang.String
		
		// 사이즈, 바이트, 타입 확인
		System.out.println("size: " + num1.SIZE);
		System.out.println("bytes: " + num1.BYTES);
		System.out.println("type: " + num1.TYPE);
		
		// 문자열을 정수형으로 변환
//		System.out.println(Integer.parseInt("FF"));
		System.out.println(Integer.parseInt("FF", 16));
		

	}

}
