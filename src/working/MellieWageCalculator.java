package working;

public class MellieWageCalculator {

	private int hoursWorked = 0;

	public MellieWageCalculator(int hoursWorked) {
		// TODO Auto-generated constructor stub
		this.hoursWorked = hoursWorked;
	}

	public Object calculatePay() {
		int payBefore10 = 12;
		int payAfter10 = 8;
		int payAfter12 = 16;

		// $12 hour * 5 hours worked
		// $8 hour * 2 hours worked
		// hoursWorked is being passed from MellieWageCalc
		payBefore10 = 12 * hoursWorked;
		payAfter10 = 8 * hoursWorked;
		payAfter12 = 16 * hoursWorked;

		//Mental note:if potential money before 10 is less than 60
		//give back potential money after 10
		//changed to hoursWorked in conditional so that user
		//can input the hours that they worked to generate pay.
		
		if (hoursWorked != 5) {
			return payAfter10;
		}
		if (hoursWorked < 5) {
			return payAfter12;
		} else
			return payBefore10;
		

//		else if(hoursWorked>5) {
//			return payAfter10;
//		}
//		else return payBefore10 ;
//		
//		}

//		if (potentialPayBefore10 < 60) {
//			return potentialPayAfter12;
//		} 
//		else if (potentialPayBefore10<100) {
//			return potentialPayBefore10;
//		}
//		else
//			return potentialPayAfter10;
//
//	}

}
	}

//something like this:
//else if(potentialPayBefore10 != potentialPayAfter12) {
//	return potentialPayAfter12;
//}