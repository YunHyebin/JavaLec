package chap02_variable;

public class _11_varVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var str = "hello";
		
		// 변수의 클래스 확인 (원시타입은 클래스 확인 불가능)
		// str은 참조형타입이기 때문에 클래스 확인 가능
		System.out.println("str의 타입: " + str.getClass().getName());

		//원시타입의 래퍼클래스 # 클래스에서 객체로 변환해서 사용해야한다.
		//int => Integer
		//long => Long
		var num1 = 100;
		System.out.println(((Object)num1).getClass().getName());
		var num2 = 12.25;
		System.out.println(((Object)num2).getClass().getName());
	}
	
	

}
