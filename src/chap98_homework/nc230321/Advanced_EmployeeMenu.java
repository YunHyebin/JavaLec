package chap98_homework.nc230321;

import java.util.Scanner;

public class Advanced_EmployeeMenu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu;
		boolean run = true;
		Advanced_Employee emp = null;
		System.out.println("-----------[[기본 정보 입력]]------------");
		System.out.print("이름 입력: ");
		String name = sc.next();
		System.out.print("사원번호 입력: ");
		int eno =  sc.nextInt();
		System.out.print("연봉 입력: ");
		int pay = sc.nextInt();
		while (run) {
			System.out.println("\n==========[[메뉴선택]]==========");
			System.out.println("1. 정규직 저장\n2. 임시직 저장\n3. 계약직 저장"
					+ "\n4. 전체 정보 출력\n5. 월급\n6. 프로그램 종료\n===================");
			System.out.println("선택> ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: 
				emp = new Advanced_FullTime(eno, name, pay); break;
			case 2: 
				emp = new Advanced_temporary(eno, name, pay);break;
			case 3:	
				emp = new Advanced_contract(eno, name, pay); break;
			case 4:
				if(emp == null) {
					System.out.println("고용 종류를 먼저 입력해주세요");
				} else {
					emp.showEmployeeInfo();
				}
				break;
			case 5: 
				System.out.println(emp.name + "님의 월급: " + emp.getMonthPay());
				break;
			case 6: System.out.println("\n프로그램 종료"); run = false; break;
			default: System.out.println("잘못 입력하셨습니다."); break; 
			}
			
		}

	}

}
