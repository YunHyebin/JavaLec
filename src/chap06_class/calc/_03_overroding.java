package chap06_class.calc;

public class _03_overroding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple mul = new Multiple();
		mul.setNum1(4);
		mul.setNum2(3);
		
		System.out.println("매개변수가 없는 multi함수");
		System.out.println(mul.multiple());
		
		System.out.println("매개변수가 1개 있는 multi함수 ");
		System.out.println(mul.multiple(4));
		
		System.out.println("매개변수가 2개 있는 multi함수");
		System.out.println(mul.multiple(4, 3));

	}

}
