package chap98_homework.nc230321;

public class Advanced_temporary extends Advanced_Employee{
	final static int HIREYEAR = 2;

	//--------------------생성자----------------
	public Advanced_temporary(int eno, String name, int pay) {
		super(eno, name, pay);
	}
	@Override
	public double getMonthPay() {
		return pay/12;
	}

	@Override
	public void showEmployeeInfo() {
		super.showEmployeeInfo();
		System.out.println("고용 년수: " + this.HIREYEAR);
		
	}

}
