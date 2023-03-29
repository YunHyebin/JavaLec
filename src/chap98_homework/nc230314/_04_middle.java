package chap98_homework.nc230314;

public class _04_middle {

	public static void main(String[] args) {
		System.out.println("----------------------Middle 문제2----------------\n");
		// 첫번째 풀이
		for (int i = 1; i * 3 <= 100; i++) {
			int multiple = i * 3;
			if (multiple % 6 == 0) {
				System.out.print(multiple + ", ");
			}
		}
		System.out.println("");
		// 두번째 풀이
		for (int i = 1; i <= 100; i++) {
			if (i % 6 == 0) {
				System.out.print(i + ", ");
			}
		}

	}

}
