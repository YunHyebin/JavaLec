package chap98_homework.nc230315;

public class _14_advanced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4. 다음과 같이 출력하세요.
//	    *
//	   ***
//	  *****
//	 *******
//	*********
		int inputNum = 5;
		for (int i = 0; i < inputNum; i++) {
			System.out.println(" ".repeat(inputNum - i) + "*".repeat(i*2+1) );
		}
		
		
		
	}
}