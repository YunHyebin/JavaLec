package chap98_homework.nc230327;

import java.util.Scanner;

public class PhoneInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PhoneInfoList pil = new PhoneInfoList();
		
		boolean run = true;
		Scanner sc = new Scanner(System.in);
		while(run) {
			System.out.println("-------메뉴 입력--------");
			System.out.println("1. 정보 입력\t2. 모든 정보 출력\t그 외 입력 시 종료");
			switch(sc.nextInt()){
			case 1:
				System.out.println("------정보 입력-----");
				pil.addData();
				break;
				
			case 2: 
				pil.showAllInfo();
				break;
				
			default:
				run = false;
				break;
				
				
				
				
			}
		}
		

	}

}
