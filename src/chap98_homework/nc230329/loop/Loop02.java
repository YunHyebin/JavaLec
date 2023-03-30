package chap98_homework.nc230329.loop;

public class Loop02 {

	public static void main(String[] args) {
		// 2. 2의 거듭제곱을 10회동안 반복하며 출력하세요.
		//(2 * 2 = 4, 2 * 2 * 2 = 8 .....) 10회 반복 출력
		for(int i=1; i<=10; i++) {
			System.out.println("2 * " + i + " = " + Math.round(Math.pow(2, i)));
		}

	}

}
