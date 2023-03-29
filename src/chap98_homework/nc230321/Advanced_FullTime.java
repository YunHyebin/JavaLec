package chap98_homework.nc230321;

public class Advanced_FullTime extends Advanced_Employee {
	final static int BONUS = 300;
	
	
	//--------------------생성자----------------
	public Advanced_FullTime(int eno, String name, int pay) {
		super(eno, name, pay);
	}

	//-----------상속받은 추상메소드------------
	@Override
	public double getMonthPay() {
		return this.getPay()/12+BONUS/12;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("보너스: " + this.BONUS);		
	}
	

}
