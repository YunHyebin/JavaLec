package chap06_class;

import chap06_class.calc.Add;
import chap06_class.calc.Calc;
import chap06_class.calc.Divide;
import chap06_class.calc.Minus;
import chap06_class.calc.Multiple;

public class _01_Instance {

	public static void main(String[] args) {
		Add add = new Add();
		add.setNum1(10);
		add.setNum2(20);
		add.setResult(add.getNum1() + add.getNum2());
		int result = add.add();
		System.out.println(result);
		
		Minus minus = new Minus();
		minus.setNum1(10);
		minus.setNum2(20);
		int minusResult = minus.minus();
		System.out.println(minusResult);
		
		Divide divide = new Divide();
		divide.setNum1(20);
		divide.setNum2(5);
		int divideResult = divide.divide();
		System.out.println(divideResult);
		
		Multiple multiple = new Multiple();
		multiple.setNum1(5);
		multiple.setNum2(3);
		int multipleResult = multiple.multiple();
		System.out.println(multipleResult);
		
		// 설계도로 부품을 만드는 작업 == 인스턴스화, 객체화
		// 항상 new 키워드를 사용해야 함
		// 인스턴스화: 생성자를 통해서 객체를 생성하고 heap 메모리에 영역 저장
		Calc cal = new Calc();
		int receiveNum = cal.add(10,  20);
		cal.add(10, 20);
		System.out.println(cal.minus(cal.add(10, 20), cal.divide(20, 10)));
		
		cal = new Add(); //cal에 선언된 변수에 부모클래스 Calc도 들어감.
		System.out.println(cal.add(4, 3));
		
		
		// 부모객체 안에 자식 클래스를 넣을 수 있다.
		Calc cal2 = new Add();
		Calc cal3 = new Minus();
		System.out.println(cal3.minus(4, 3)); //7
		
		
		
	}
}
