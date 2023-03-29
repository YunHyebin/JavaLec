package chap98_homework.nc230317.middle;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentsCalc [] calcArr = new ParentsCalc[4];
		calcArr[0] = new Add();
		calcArr[1] = new Sub();
		calcArr[2] = new Mul();
		calcArr[3] = new Div();
		
		calcArr[0].setValue(2, 3);
		calcArr[1].setValue(2, 3);
		calcArr[2].setValue(2, 3);
		calcArr[3].setValue(2, 3);
		System.out.println("Add 클래스 결과: " + calcArr[0].calculate());
		System.out.println("Sub 클래스 결과: " + calcArr[1].calculate());
		System.out.println("Mul 클래스 결과: " + calcArr[2].calculate());
		System.out.println("Dib 클래스 결과: " + calcArr[3].calculate());
		
		for (int i =0; i < calcArr.length; i++) {
			calcArr[i].setValue(20, 10);
			System.out.println(calcArr[i].calculate());
		}
		

	}

}
