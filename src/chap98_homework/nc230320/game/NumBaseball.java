package chap98_homework.nc230320.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumBaseball extends gameMenu {
	// 게임 룰: 컴퓨터가 3개의 랜덤값을 가지고
	// 사용자가 3개의 숫자를 입력 (중복 불가능)
	// 컴퓨터의 3개의 숫자와 사용자의 3개의 숫자를 비교하는데
	// 숫자만 같으면 볼로 판정
	// 숫자와 위치까지 같으면 스트라이크로 판정
	// 몇 스트라이크, 몇 볼인지 출력
	// 3스트라이크 되면 몇 회만에 맞췄는지 출력 후 게임 종료
	// 다시 게임 진행할 지 물어보고 1이면 리스타트 0이면 종료
	// 랜덤값은 0~9

	// -------------------멤버변수 정의--------------------------

	private int strike = 0; // 스트라이크 횟수 담을 변수
	private int ball = 0; // 볼 횟수 담을 변수

	private int gameCnt = 0; // 3번 스트라이크 맞추기 전까지 몇 회에만에 맞췄는지 (시도했는지) 담을 변수

	int[] com = new int[3]; // 컴퓨터 랜덤값 담아줄 배열
	int[] user = new int[3]; // 사용자 입력값 저장할 배열

	Scanner sc = new Scanner(System.in);

	// 게임 시작 메소드
	public void start() {
		while (true) {
			generateRandom(); // 컴퓨터 랜덤 값 3개 발생 & 중복체크

			while (true) {
				// 컴퓨터 배열 확인
				System.out.println("---------------------게임시작------------------------");
				System.out.println("컴퓨터 배열: " + com[0] + ", " + com[1] + ", " + com[2]);
				strike = 0;
				ball = 0;

				getUserInput();

				// 사용자 입력값 확인
				System.out.println("사용자 배열: " + user[0] + ", " + user[1] + ", " + user[2]);

				if (judgetStrike()) {
					break;
				} else {
					continue;
				}
			}

			if (reGame()) {
				continue;
			} else {
				break;
			}
		}
	}

	// 컴퓨터 랜덤 값 3개 생성하고 배열에 넣어주는메소드
	public void generateRandom() {
		Random rand = new Random();

		for (int i = 0; i < com.length; i++) {
			com[i] = rand.nextInt(10);
			// 중복체크
			if (checkDuplicate(com, com[i]) == false) {
				com[i] = rand.nextInt(10);
			} else {
				continue;
			}

		}
	}

	// 배열 안 중복요소를 체크해주는 메소드
	public boolean checkDuplicate(int[] arr, int num) {
		boolean isDuplicated = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				isDuplicated = true;
				break;
			}
		}
		return isDuplicated;
	}

	// 유저의 입력값을 받아서 배열에 담아주는 메소드
	public void getUserInput() {
		for (int i = 0; i < user.length; i++) {
			System.out.print("중복되지 않은 숫자 3개 입력: ");
			user[i] = sc.nextInt();
			// 중복체크
			if (checkDuplicate(user, user[i]) == false) {
				user[i] = sc.nextInt();
			} else {
				continue;
			}
		}
	}

	// 스트라이크 볼 판정하는 메소드
	public boolean judgetStrike() {
		for (int comElement = 0; comElement < com.length; comElement++) {
			for (int userElement = 0; userElement < user.length; userElement++) {
				if (com[comElement] == user[userElement]) {
					if (comElement == userElement) {
						strike++;
					} else {
						ball++;
					}
				}
			}
		}
		gameCnt++;
		System.out.println(strike + "스트라이크\t" + ball + "볼");
		if (strike == 3) {
			System.out.println("지금까지 시도한 횟수: " + gameCnt);
			return true;
		} else {
			return false;
		}
	}

	// 재게임 여부
	public boolean reGame() {
		gameCnt = 0;
		System.out.print("다시 게임을 시작하시려면 1을 눌러주세요: ");
		if (sc.nextInt() == 1)
			return true;
		return false;
	}

}
