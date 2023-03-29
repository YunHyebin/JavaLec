package chap12_nestedClass;

class NestedClass2 {
	class Add{
		int num1;
		int num2;
		final static int num5 = 10;
		
		int result;
		int add() {
			result = num1 + num2;
			return result;
		}
		
	}
	static class Sub{
		static int num3;
		static int num4;
		
		static int result1;
		static int sub() {
			result1 = num3/num4;
			return result1;
		}
		
	}
}



public class _03_instanceOfNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 정적 static 중첩 클래스 사용
		NestedClass2.Sub.num3 = 10;
		NestedClass2.Sub.num4 = 5;
		System.out.println(NestedClass2.Sub.sub());
		
		// 2. 인스턴스 중첩 클래스 사용
		NestedClass2 nc = new NestedClass2();
		NestedClass2.Add add = nc.new Add();
		add.num1 = 12;
		add.num2 = 11;
		System.out.println(add.add());
		System.out.println(NestedClass2.Add.num5);
		

	}

}
