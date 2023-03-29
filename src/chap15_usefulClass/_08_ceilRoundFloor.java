package chap15_usefulClass;

public class _08_ceilRoundFloor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num = 123.45678;
		System.out.println(Math.ceil(num));	//124.0
		System.out.println(Math.round(num));	//123
		System.out.println(Math.floor(num));	//123.0
		
		System.out.println(Math.round(num * 1000) / 1000);	//123

	}

}
