package chap98_homework.nc230323._advanced;

import java.util.Scanner;

public class MainPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Student student [] = new Student[4];
		while(true) {
			System.out.println("=========[[학적관리]]========");
			System.out.println("1. 학생정보 입력\n2. 학생정보 검색\n3. 학생정보 전체출력\n4. 학과별 성적 순위\n5. 종료");
			System.out.print("입력>>");
			int choiceMenu = sc.nextInt();
			
			switch(choiceMenu) {
			case 1: 
				
				break;
			case 2: break;
			case 3: break;
			case 4: break;
			case 5: 
				System.out.println("학적관리 프로그램을 종료합니다.");
				sc.close();
				System.exit(0);
			default:
				System.out.println("잘못 입력하셨습니다.");
				continue;
				
			}
		}

	}

}
