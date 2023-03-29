package chap98_homework.nc230316;

public class _01_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1.int배열을 10개 생성해라.
//		 int배열에 3의 배수를 차례대로 저장해라.
//		 그리고 거꾸로 출력해라.
		int[] array = new int[10];
		int num = 0;
		int index = 0;

		while (index < array.length) {
			num++;
			if (num % 3 == 0) {
				array[index++] = num;
			}
		}
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}

	}

}
