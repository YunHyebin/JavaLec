package chap98_homework.nc230317.advanced;

import java.util.Random;
import java.util.Scanner;

public class RockScissPaper {
	// 승무패 카운트 셀 변수
	private int cntWin = 0;
	private int cntDraw = 0;
	private int cntLose = 0;

	// 승점 카운트 변수(승:1. 무:0, 패:-1)
	private int score = 0;

	// 승무패 기록 배열
	private int[] wdlArray;

	// 게임 실행 메소드
	public void start() {
		while (true) {
			Scanner sc = new Scanner(System.in);

			// 사용자 숫자 입력 -> 입력 수만큼 게임 진행
			System.out.print("진행할 게임의 판 수 입력: ");
			int round = sc.nextInt();
			wdlArray = new int[round];

			// 최대 10판 진행
			// 클래스 안에 랜덤 변수 발생시키는 메소드
			// 1~3까지 랜덤 변수 발생(1:가위, 2:바위, 3:보)

			for (int i = 0; i < wdlArray.length; i++) {
				int randomVal = generateRandom();
				int randomVal2 = generateRandom();

				// 사용자 입력 값 받아서 정수형 변환 메소드
				int userNum = convertUserInput(sc);

				if (userNum == 0) {
					System.out.println("잘못 입력하셨습니다");
					// 해당 게임을 다시 진행하기 위해 1감소
					// for ㅁ누에서 continue문 만나면 증감식으로 이동
					i--;
					continue;
				}

				// 승, 무, 패 판단해주는 메소드
				// 가위, 바위, 보 비교
				// 무승부
				judgeWdl(userNum, randomVal, i);
			}

			// 승점 계산 메소드
			// 승점 계산
			sumScore();

			if (reGame()) {
				break;
			} else {
				continue;
			}

		}
	}

	// 1~3 랜덤 값 발생시키는 메소드
	public int generateRandom() {
		Random rand = new Random();
		int com = rand.nextInt(2) + 1;
		return com;
	}

	// 사용자 입력 값을 정수형으로 변환해주는 메소드
	public int convertUserInput(Scanner sc) {
		System.out.println("가위 바위 보");
		String before = sc.next();
		int after = 0;
		switch (before) {
		case "가위":
			after = 1;
		case "바위":
			after = 2;
		case "보":
			after = 3;
		}
		return after;
	}

	// 승, 무, 패 판단 메소드
	public void judgeWdl(int userNum, int randomVal, int i) {
		switch (userNum) {
		case 1:
			if (randomVal == 1) {
				System.out.println("비겼습니다");
				cntDraw++;
				wdlArray[i] = 0;
			} else if (randomVal == 2) {
				System.out.println("졌습니다");
				cntLose++;
				wdlArray[i] = -1;
			} else {
				System.out.println("이겼습니다");
				cntWin++;
				wdlArray[i] = 1;
			}
		case 2:
			if (randomVal == 2) {
				System.out.println("비겼습니다");
				cntDraw++;
				wdlArray[i] = 0;
			} else if (randomVal == 3) {
				System.out.println("졌습니다");
				cntLose++;
				wdlArray[i] = -1;
			} else {
				System.out.println("이겼습니다");
				cntWin++;
				wdlArray[i] = 1;
			}
		case 3:
			if (randomVal == 3) {
				System.out.println("비겼습니다");
				cntDraw++;
				wdlArray[i] = 0;
			} else if (randomVal == 1) {
				System.out.println("졌습니다");
				cntLose++;
				wdlArray[i] = -1;
			} else {
				System.out.println("이겼습니다");
				cntWin++;
				wdlArray[i] = 1;
			}
			System.out.println("컴퓨터:" + randomVal + " \t플레이어:" + userNum);
		}
	}

	// 승점 계산 및 출력 메소드
	public void sumScore() {
		for (int j = 0; j < wdlArray.length; j++) {
			score += wdlArray[j];
		}
		System.out.println(cntWin + "승" + cntDraw + "패" + cntLose + "패\n 총 승점: " + score);
		System.out.println("--------------------------------------------");
	}
	// 재게임 여부
	public boolean reGame() {
		score = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("다시 게임을 시작하시려면 1을 눌러주세요: ");
		if (sc.nextInt() == 1)
			return true;
		return false;
		}

}
