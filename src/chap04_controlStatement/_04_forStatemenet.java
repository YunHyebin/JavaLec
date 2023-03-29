package chap04_controlStatement;

public class _04_forStatemenet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지의 합
		int sum = 0;
		int i;
		for (i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("1~100까지의 합: " + sum);
		System.out.println("for문 종료시 i의 값" + i);

		int num2 = 0;
		System.out.println("12와 23의 공배수:");
		for (int j = 0; j <= 1000; j++) {
			if (j % 13 == 0 && j % 23 == 0) {
				System.out.print(j + ",");
				num2 += j;
				if (num2 > 500) {
					break;
				}
			}
		}
		System.out.println("\n12, 13의 공배수의 합이 500을 넘어갈 때까지의 합: " + num2);
	}

}
