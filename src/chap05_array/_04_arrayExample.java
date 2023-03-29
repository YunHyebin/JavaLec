package chap05_array;

import java.util.Random;
import java.util.Scanner;

public class _04_arrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 가위바위보 10판 진행
		// 배열에 각 판의 승무패 저장
		// 배열에 저장된 승, 무, 패 세서 몇승 몇무 몇패인지 출력
		
		// 승무패를 담아줄 배열
		String [] wdl = new String[10]; 
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String [] computer = new String [] {"가위", "바위", "보"};
		
		for (int i = 0; i < wdl.length; i++) {
			String com = computer[rand.nextInt(3)];
			System.out.print("\n가위 바위 보! : ");
			String player = sc.next();

			switch (player) {
			case "가위" : if(com == "가위"){wdl[i] = "비겼습니다";}else if(com == "바위"){wdl[i] = "졌습니다";}else{wdl[i] = "이겼습니다";} 
			case "바위" : if(com == "바위"){wdl[i] = "비겼습니다";}else if(com == "보") {wdl[i] = "졌습니다";}else{wdl[i] = "이겼습니다";}
			case "보" : if(com == "보"){wdl[i] = "비겼습니다";}else if(com == "가위"){wdl[i] = "졌습니다";}else{wdl[i] = "이겼습니다";}
			}
			System.out.println("컴퓨터:" + com + " \t플레이어:" + player + "\n결과:" +wdl[i]);
		}
		int winCnt, loseCnt, drawCnt;
		winCnt = loseCnt = drawCnt = 0;
		for (int i=0; i < wdl.length; i++) {
			switch(wdl[i]){
				case "이겼습니다" : ++winCnt; break;
				case "비겼습니다" : ++drawCnt; break;
				case "졌습니다" : ++loseCnt; break;
			}
		}
		System.out.println(winCnt+"승\t" + drawCnt + "무\t" + loseCnt + "패");	

	}

}
