package chap98_homework.nc230321;

public class Middle_CalTest {

	public static void main(String[] args) {
		Middle_Calculator mc = new Middle_Calculator ();
		Middle_Calculator.Add addInstance = mc.new Add();
		Middle_Calculator.Substitude subInstance = mc.new Substitude();
		Middle_Calculator.Multiply multiInstance = mc.new Multiply();
		Middle_Calculator.Divide divInstance = mc.new Divide();
		
		System.out.println("----------Middle_Calculator 클래스 안 Add 클래스 실행-------------");
		addInstance.setNum1(10);
		addInstance.setNum2(5);
		System.out.println("add인스턴스 숫자1: " + addInstance.getNum1() + "\nadd인스턴스 숫자2: " + addInstance.getNum2());
		System.out.println(addInstance.getNum1() + "+" + addInstance.getNum2() + "=" + addInstance.add());
		
		System.out.println("\n----------Middle_Calculator 클래스 안 Substitude 클래스 실행-------------");
		subInstance.setNum3(120);
		subInstance.setNum4(87);
		System.out.println("sub인스턴스 숫자1: " + subInstance.getNum3() + "\nsub인스턴스 숫자2: " + subInstance.getNum4());
		System.out.println(subInstance.getNum3() + "-" + subInstance.getNum4() + "=" + subInstance.sub());
		
		System.out.println("\n----------Middle_Calculator 클래스 안 Multiply클래스 실행-------------");
		multiInstance.setNum5(11);
		multiInstance.setNum6(2);
		System.out.println("multi인스턴스 숫자1: " + multiInstance.getNum5() + "\nmulti인스턴스 숫자2: " + multiInstance.getNum6());
		System.out.println(multiInstance.getNum5() + "*" + multiInstance.getNum6() + "=" + multiInstance.mul());
		
		System.out.println("\n----------Middle_Calculator 클래스 안 Divide클래스 실행-------------");
		divInstance.setNum7(12);
		divInstance.setNum8(3);
		System.out.println("div인스턴스 숫자1: " + divInstance.getNum7() + "\ndiv인스턴스 숫자2: " + divInstance.getNum8());
		System.out.println(divInstance.getNum7()+ "/" + divInstance.getNum8() + "=" + divInstance.div());
		
		
		
		

	}

}
