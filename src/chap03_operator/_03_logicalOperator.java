package chap03_operator;

public class _03_logicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 관계 연산자
		int num1 = 100;
		int num2 = 300;		
		System.out.println("num1 < num6 : " + (num1 < num2)); // 결과: true
		
		System.out.println("num1 > num6 : " + (num1 > num2)); // result: false
		
		System.out.println("num1 <= num6 : " + (num1 <= num2)); // result: true
		
		System.out.println("num1 >= num6 : " + (num1 >= num2)); // result: false
		
		System.out.println("num1 == num6 : " + (num1 == num2)); // result: false

		System.out.println("num1 != num6 : " + (num1 != num2)); // result: true
		System.out.println("------------\n");

		//2. 논리 연산자
		int num3 = 10;
		int num4 = 20;
		
		System.out.println("num1 < num2 &&" + "num3 / num4 == 0 ->" + ((num1 < num2) && ((num3 / num4) == 0)));
		// result : true
		System.out.println("false || num4" + " * num2 < 100 = " + (false || ((num4 * num2) < 100)));
		// result: false
		System.out.println("!(num4 < 2000) = " + !(num4 < 2000));
		// result:  false
		
		// String은 같은 값인지 비교하지 않고 같은 객체인지 비교함. 같은 값을 비교하려면 .equals() 메소드 사용
		String str1 = "hello";
		String str2 = "hello";
		System.out.println(str1 == str2); // true
		System.out.println(str1.equals(str2));	// true
		
		

	}

}
