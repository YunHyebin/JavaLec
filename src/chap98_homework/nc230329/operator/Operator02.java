package chap98_homework.nc230329.operator;

public class Operator02 {

	public static void main(String[] args) {
//		2. int형 변수 20을 증감연산자를 사용해서 다음과 같은 순서로 출력되도록 구현하세요.
//		21, 22, 22, 22, 20, 20, 19, 마지막 변수의 값(증감연산자 없이) : 20
		int num = 20;
		System.out.println(++num);	
		System.out.println(++num); 
		System.out.println(num);	
		System.out.println(num--);	 
		System.out.println(--num);	 
		System.out.println(num--);	 
		System.out.println(num);	

	}

}
