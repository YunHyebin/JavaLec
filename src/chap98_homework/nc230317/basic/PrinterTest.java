package chap98_homework.nc230317.basic;

public class PrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer baseP = new Printer();
		InkjetPrinter inkP = new InkjetPrinter();
		LazerPrinter lazerP = new LazerPrinter();
		
		//
		baseP.setModelName("기본 프린터");
		baseP.setInterfaceType("USB");
		baseP.setNumberOfPrint(5);
		baseP.setNumRemainPaper(10);
		
		inkP.setModelName("삼성 잉크젯 프린터");
		inkP.setInterfaceType("Paraller Port");
		inkP.setNumRemainPaper(10);
		inkP.setNumRemainInk(100);
		
		lazerP.setModelName("레이저 프린터");
		lazerP.setInterfaceType("USB");
		lazerP.setNumRemainPaper(15);
		lazerP.setNumRemainToner(13);
		
		lazerP.print();
		lazerP.showAllInfo();
		
		baseP.print();
		baseP.showAllInfo();

	}

}
