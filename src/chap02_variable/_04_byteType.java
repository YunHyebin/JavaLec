package chap02_variable;

public class _04_byteType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. byte 타입의 변수 선언 및 초기화
		byte num1 = -128;
		byte num2 = 127;
		
		//2. byte 범위를 넘어가는 값의 할당
		// 타입의 표현 범위보다 큰 값을 할당하면 에러 발생
		// byte num3 = -129;
		// byte num4 = 128;
		
		//3. 선언된 변수의 값을 범위를 초과하도록 변경했을 때
		//증감연산자 --, ++
		// num1-- -> num1 = num1 -1;
		// 범위의 최솟값보다 작아질경우 127부터 다시 시작함
		// num2++ -> num1 = num1 +1;
		// 범위의 최댓값보다 커질경우 -128부터 다시 시작
		num1--;
		num2++;
		System.out.println(num1);
		System.out.println(num2);
		
//		char empty = ''; // char로 초기화 선언할 땐 빈칸을 무조건 띄워야 함. unicode가 존재하지 않기 때문에
		char empty = ' ';
		
	}

}
