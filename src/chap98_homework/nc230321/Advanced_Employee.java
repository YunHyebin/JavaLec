package chap98_homework.nc230321;

public abstract class Advanced_Employee {
	protected int eno;
	protected String name;
	protected int pay;

	// --------------------생성자----------------
	public Advanced_Employee(int eno, String name, int pay) {
		this.eno = eno;
		this.name = name;
		this.pay = pay;
		}

	// ---------------getter&setter-------------
	public int getEno() {
		return eno;
	}

	public void setEno(int eno) {
		this.eno = eno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}
	
	//-----------추상메소드------------
	public abstract double getMonthPay();
	public void showEmployeeInfo() {
		System.out.println("\n-----[["+this.name+"님 정보]]-----");
		System.out.println("사번: " + this.getEno());
		System.out.println("이름: " + this.getName());
		System.out.println("연봉: " + this.getPay());
		System.out.println("월급: " + this.getMonthPay());
	}

	
	

}
