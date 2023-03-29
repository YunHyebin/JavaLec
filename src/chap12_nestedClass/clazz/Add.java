package chap12_nestedClass.clazz;

public class Add implements Calc {

	@Override
	public void calculator(int a, int b) {
		// TODO Auto-generated method stub
		Calc calc = new Calc() {
			
			public void calculator(int a, int b) {
				System.out.println("결과는" + (a+b));
			}
			
		};
		
		calc.calculator(10, 20);
		
	}

}
