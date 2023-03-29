package chap12_nestedClass.clazz;

import chap12_nestedClass.clazz.NestedClass.Div;

public class _02_instanceOfNestedClass {
	public void main(String[] args) {
		// TODO Auto-generated method stub
		// 외부클래스 객체 생성
		NestedClass nc = new NestedClass();
		
		// 중첩클래스의 객체 생성
		
		// 중첩클래스의 객체 생성은 외부클래스의 객체를 생성하고 사용해서 
		//외부클래의 객체.new 중첩클래스 생성자();
		NestedClass.Mul mul2= nc.new Mul();
		
		System.out.println(mul2.result);
		
		// static으로 선언된 정적 중첩클래스의 객체는 
		// 외부 클래스의 객체없이도 생성 가능함.
		NestedClass.Div div = new Div();
		System.out.println(div.result);
		


	}

}
