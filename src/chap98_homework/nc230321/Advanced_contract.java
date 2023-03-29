package chap98_homework.nc230321;

public class Advanced_contract extends Advanced_Employee{
	final static int WORKDAY = 30;
	
	//--------------------생성자----------------
	public Advanced_contract(int eno, String name, int pay) {
		super(eno, name, pay);
	}

	@Override
	public double getMonthPay() {
		return pay*WORKDAY;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("근무 일수: " + this.WORKDAY);
	}

}
