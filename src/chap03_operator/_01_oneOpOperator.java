package chap03_operator;

public class _01_oneOpOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 부호연산자
		int num1 = 10;
		System.out.println(+num1); //출력: 10, 값: 10
		System.out.println(-num1); //출력: -10, 값: 10
		System.out.println("------------------\n");
		
		//2. 전위증감연산
		int num2 = 10;
		System.out.println(++num2); //출력: 11, 값: 11
		System.out.println(--num2);//출력: 10 , 값: 10
		System.out.println("------------------\n");
		
		//2-2. 후위 증감 연산자
		int num3 = 10;
		System.out.println(num3++); //출력: 10, 값: 11
		System.out.println(num3--); //출력: 11, 값: 10
		System.out.println("------------------\n");
		
		//3. 전위, 후위 증감연산자 혼합
		int num4 = 10;
		System.out.println(++num4); //출력:11, 값:11
		System.out.println(num4--); //출력: 11, 값: 10
		System.out.println(num4++); //출력: 10, 값: 11
		System.out.println(num4); //출력: 11, 값: 11
		System.out.println("------------------\n");
		
		
		
	}

}
