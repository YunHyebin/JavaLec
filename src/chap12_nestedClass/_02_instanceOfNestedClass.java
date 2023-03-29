package chap12_nestedClass;

import chap12_nestedClass.clazz.NestedClass2_;

public class _02_instanceOfNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 외부클래스 객체 생성
		NestedClass2_ nc = new NestedClass2_();
		
		// 1. 인스턴스 클래스의 객체 생성
		NestedClass2_.Mul mul = nc.new Mul();
		//2. 정적 중첩 클래스의 객체 생성
		NestedClass2_.Div divInstance = new NestedClass2_.Div();
		//3-1. 정적 중첩클래스의 정적 멤버에 접근
		System.out.println(divInstance.getResult());
		System.out.println(NestedClass2_.Div.result2);
		//3-2. 정적 중첩 클래스의 일반 멤버에 접근
		System.out.println(divInstance.getNum3());
		//4. 인스턴스 중첩 클래스
		mul.setNum1(150);
		mul.setNum2(15);
		mul.setResult(mul.getNum1() * mul.getNum2());
		System.out.println(mul.getResult());
		
	}

}
