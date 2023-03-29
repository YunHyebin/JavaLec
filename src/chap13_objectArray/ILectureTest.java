package chap13_objectArray;

import java.util.Scanner;

public class ILectureTest {

	public static void main(String[] args) {
		ILectureClass[] lecArr = new ILectureClass[100];
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		
		while(run) {
			System.out.println("=============[[강의 등록 메뉴]]============");
			System.out.println("1. 강의 등록\\n2. 강의 정보 출력\n3. 강의 정보 업데이트\n4. 종료");
			System.out.println("선택> ");
			int FirstMenu = sc.nextInt();
			
			switch(FirstMenu) {
			case 1: LectureCreate();
			case 2: LectureResearch(); break;
			case 3: LectureUpdate(); break;
			case 4: System.out.println("종료합니다."); run = false; break;
			default: System.out.println("잘못 입력하셨습니다."); break;
			}
			
		}

		// 강의 정보 출력 메뉴
		System.out.println("============[[강의정보 출력 메뉴]]=============");
		System.out.println("1. 영어\t2. 수학\t3. 프로그래밍 선택");
		System.out.println("선택> ");
		int lecMenu3 = sc.nextInt();
		switch(lecMenu3) {
		case 1: lecArr[0].proceedLecture(); break;
		case 2: lecArr[1].proceedLecture(); break;
		case 3: lecArr[2].proceedLecture(); break;
		default : System.out.println("잘못 입력하셨습니다."); break;
		}
		
		
	

	}

}
