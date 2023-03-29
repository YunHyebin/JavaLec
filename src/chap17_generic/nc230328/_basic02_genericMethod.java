package chap17_generic.nc230328;

public class _basic02_genericMethod {

	private static Object result;

	public static void main(String[] args) {
		/*2. public static <T> String add(T t1, T t2) 제네릭 메소드를 정의하고 
		 * 매개변수로 어떤 값이 들어오던 문자열
		결합연산이 돼서 스트링값으로 리턴하도록 만드세요.*/
		
		String string1 = "abc";
		String string2 = "ABC";
		String resultString = add(string1, string2);
		System.out.println("String형 결과: " + resultString);
		
		int int1 = 10;
		int int2 = 30;
		String resultInt = add(Integer.valueOf(int1), Integer.valueOf(int2));
		System.out.println("int형 결과: " + resultInt);
		
		double double1 = 10.2;
		double double2 = 20.3;
		String resultDouble = add(Double.valueOf(double1), Double.valueOf(double2));
		System.out.println("double형 결과: " + resultDouble);
		
		char ch1 = 'A';
		char ch2 = 'D';
		String resultChar = add(String.valueOf(ch1), String.valueOf(ch2));
		System.out.println("char형 결과: " + resultChar);
		
	}
	
	public static <T> String add(T t1, T t2) {
		String result = String.valueOf(t1) + String.valueOf(t2);
//		String result2 = t1.toString() + t2.toString();		방법2 
		return result;
		
	}

}
