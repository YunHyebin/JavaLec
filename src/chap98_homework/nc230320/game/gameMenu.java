package chap98_homework.nc230320.game;

import java.util.Scanner;

public class gameMenu {
	public void start() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		boolean end = true;
		while(end) {
			System.out.println("게임을 선택하세요");
			System.out.println("1. 가위바위보\n2. 야구게임\n3. 로또게임\n4. 종료");
			int menuChoice = sc.nextInt();
			switch(menuChoice) {
			case 1: gameMenu game = new NumBaseball(); game.start();
			case 2: game = new NumBaseball(); game.start();
			case 3: game = new Lotto(); game.start();
			case 4: break;
			}
			end = false;
			
		}
		
		

	}

}
