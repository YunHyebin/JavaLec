package chap98_homework.nc230317.middle;

public class Div extends ParentsCalc{
	public int calculate() {
		if (num1 >= num2) {
			return num1/num2;
		}else {
			return num2/num1;			
		}
	}

}
