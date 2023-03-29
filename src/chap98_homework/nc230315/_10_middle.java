package chap98_homework.nc230315;

import java.util.Random;
import java.util.Scanner;

public class _10_middle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 4. 가위, 바위, 보 게임을 만드세요.
//		com에 0~2까지의 랜덤값을 발생시키고

//		(0:가위, 1:바위, 2:보)
//		사용자가 가위, 바위, 보를 입력하여
//		com과의 승무패를 출력하세요.

//		(예시) com = 2, 사용자가 바위를 입력하면 => 졌습니다.
//		com=1, 사용자가 바위를 입력하면 => 비겼습니다.
//		com=0, 사용자가 바위를 입력하면 => 이겼습니다.
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String [] computer = new String [] {"가위", "바위", "보"};
		String com = computer[rand.nextInt(2)];
		String result = "";

		System.out.println("가위 바위 보");
		String player = sc.next();
		switch (player) {
		case "가위" : if(com == "가위"){result = "비겼습니다";}else if(com == "바위"){result = "졌습니다";}else{result = "이겼습니다";} 
		case "바위" : if(com == "바위"){result = "비겼습니다";}else if(com == "보") {result = "졌습니다";}else{result = "이겼습니다";}
		case "보" : if(com == "보"){result = "비겼습니다";}else if(com == "가위"){result = "졌습니다";}else{result = "이겼습니다";}
		}
		System.out.println("컴퓨터:" + com + " \t플레이어:" + player + "\n결과:" +result);

	}
}
