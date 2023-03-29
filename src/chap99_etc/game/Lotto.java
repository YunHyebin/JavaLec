package chap99_etc.game;

import java.util.Random;
import java.util.Scanner;

public class Lotto {
	int[] lottoArr = new int[7]; // 로또 랜덤값 담아줄 배열
	int[] userArr = new int[6]; // 사용자 입력값 저장할 배열
	int score = 0; // 맞춘 로또 번호 카운트?
	int bonusScore = 0; // 보너스 점수
	Scanner sc = new Scanner(System.in);
	
	// 게임 실행 메소드
	public void LottoStart(){
		generateRandom();
		getUserInput();
		checkScore();
		printResult();
	}

	// 중복제거 메소드
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

	// 1~45까지 7개의 난수(로또) 생성 메소드 (중복제거 메소드 사용)
	public void generateRandom() {
		Random rand = new Random();

		for (int i = 0; i < lottoArr.length; i++) {
			lottoArr[i] = rand.nextInt(45) + 1;
			if (checkDuplicate(lottoArr, lottoArr[i]) == false) {
				lottoArr[i] = rand.nextInt(45) + 1;
			} else {
				continue;
			}
		}
	}

	// 사용자가 1~45까지 6개 숫자 선택하는 로또 번호 받기 메소드 (중복제거 메소드 사용)
	public void getUserInput() {
		for (int i = 0; i < userArr.length; i++) {
			System.out.print("중복되지 않은 숫자 6개 입력");
			userArr[i] = sc.nextInt();
			if (userArr[i] < 1 && userArr[i] > 45) {
				userArr[i] = sc.nextInt();
			} else {
				if (checkDuplicate(userArr, userArr[i]) == false) {
					userArr[i] = sc.nextInt();
				} else {
					continue;
				}
			}
		}
	}

	// 사용자의 로또 번호가 lottoArr에 있는지 확인하는 메소드
	public void checkScore() {
		for (int i = 0; i < userArr.length; i++) {
			for (int j : lottoArr) {
				if (userArr[i] == j) {
					score++;
				}
			}
			if (userArr[i] == lottoArr[6]) {
				bonusScore++;
			}
		}
	}

	// 몇등인지 출력하는 메소드
	public void printResult() {
		if (bonusScore == 1) {
			if (score == 5) {
				System.out.println("2등입니다.");
			}
		} else {
			if (score >= 6) {
				System.out.println("1등입니다.");
			} else if (score >= 5) {
				System.out.println("3등입니다.");
			} else if (score >= 4) {
				System.out.println("4등입니다.");
			} else if (score >= 3) {
				System.out.println("5등입니다.");
			} else {
				System.out.println("꽝입니다.");
			}
		}

	}

}
