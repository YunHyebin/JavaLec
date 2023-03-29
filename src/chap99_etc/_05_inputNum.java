package chap99_etc;

import java.util.Random;
import java.util.Scanner;

public class _05_inputNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 201이면 while문 종료
		// com == input 이면
		// 맞췄습니다.
		// 계속 하시겠습니까?
		// 1 -> com = 새로운 난수 1~200까지의 난수 발생 & 다시 게임 시작
		// 0 -> 게임종료

		// com!= input 이면
		// 틀렸습니다. 다시 입력하세요.
		// 다시 입력값 받음

		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		// 컴퓨터는 변수에 1~200 랜덤값 생성
		int com;
		boolean regameFlag = false;

		while (true) {
			// 사용자 입력 정수 받기 nextInt
			System.out.println("201입력 시 종료");
			System.out.println("1~200사이의 숫자를 입력하세요: ");
			com = rand.nextInt(100) + 1;
			System.out.println("힌트: " + com);
			int player = sc.nextInt();

			if (player == 201) {
				System.out.println("201입력! 종료합니다.");
				break;
			} else {
				if (player != com) {
					System.out.println("틀렸습니다. 계속하세요.");
					continue;
				}
				System.out.println("맞췄습니다. 계속 하시겠습니까? (1 계속 / 0 종료");
				while (true) {
					int regame = sc.nextInt();
					if (regame == 0) {
						break;
					} else if (regame == 1) {
						regameFlag = true;
						break;
					} else {
						System.out.println("잘못 입력하셨습니다.");
						continue;
					}
				}

			}

		}
		sc.close();
	}
}
