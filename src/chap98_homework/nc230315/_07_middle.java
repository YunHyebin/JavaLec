package chap98_homework.nc230315;

public class _07_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. while문을 이용해서 1부터 10까지 중에 짝수만 출력하세요
		int i = 0;
		while (true) {
			i++;
			if (i > 10)
				break;
			if (i % 2 == 0) {
				System.out.println(i);
			}

		}

	}

}
