package chap98_homework.nc230327;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Middle {

	public static void main(String[] args) {
		/*
		 * 1. 학생이름을 key로 시험점수를 value로 가지는 Map<String, Integer>를 생성하고 4명의 학생 데이터를 입력한 후
		 * 4명 중 최고 점을 맞은 학생의 이름과 점수을 출력하세요.
		 */

		// Map<String, Integer> 생성
		Map<String, Integer> students = new HashMap<String, Integer>();

		// 데이터 입력
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("이름 입력: ");
			String tempName = sc.nextLine();
			System.out.println("시험점수 입력: ");
			Integer tempScore = Integer.valueOf(sc.nextLine());
			students.put(tempName, tempScore);
		}

		// 최고 점수의 maxEntry 선언 및 초기화
		Map.Entry<String, Integer> maxEntry = null;

		// 최고 점수 찾고 maxEntry에 대입
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
				maxEntry = entry;
			}
		}
		System.out.println("최고점 맞은 학생 이름: " + maxEntry.getKey() + "점수: " + maxEntry.getValue());

		/*
		 * 2. 정수 배열 {1, 2, 3, 4, 5}에서 두 수의 합을 구할 때 같은 값이 나오는 개수를 세서 Map<String,
		 * Integer>에 담은 후 출력하세요. ex) {"3" : 1({1, 2}), "4" : 1({1, 3}), "5" : 2({1, 4},
		 * {2, 3})}
		 */

//		int[] intArr = {1, 2, 3, 4, 5};
//		Map<String, Map<Integer, Integer>> map2 = new HashMap<String, Map<Integer, Integer>>();

	}

}
