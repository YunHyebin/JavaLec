package chap05_array;

public class _05_advancedFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 100, 84, 92, 65, 71 };

		int sum = 0;
		double avg;

		for (int a : score) {
			System.out.println(a);
			sum += a;
		}
		System.out.println("점수의 총합: " + sum);
		avg = (double) sum / score.length;
		System.out.println("평균 점수: " + avg);


		}

	}
}
