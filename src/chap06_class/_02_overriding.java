package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Minus;

public class _02_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc cal = new Calc();
		Add add = new Add();
		Minus min = new Minus();
		
		System.out.println(cal.add(4, 3));
		System.out.println(cal.minus(4, 3));
		System.out.println("-----------------------");
		System.out.println(add.add(4, 3));	// 상속받은 부모 Calc의 메소드를 씀 ( 재정의
		System.out.println(add.add());		// 자신의 메소드를 씀
		System.out.println(min.minus(4, 3)); // 부모에 있는 minus메소드가 동작함.
		
		

	}

}
