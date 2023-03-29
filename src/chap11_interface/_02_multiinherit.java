package chap11_interface;

import chap11_interface.buildings.SeoulMultiflexStadium;
import chap11_interface.multiInherit.multiflexStadium;

public class _02_multiinherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiflexStadium ms = new SeoulMultiflexStadium();
		
		ms.getSportsSchedule(3);
		int sportsTicket = ms.getSportsTicketPrice(10);
		
		ms.getSupportersItem(2);
		

	}

}
