package working;

public class MellieWageCalculator {
	
	private int hoursWorked= 0;
	public MellieWageCalculator(int hoursWorked) {
	    // TODO Auto-generated constructor stub
	    this.hoursWorked= hoursWorked;
	}

	public Object calculatePay() {
		int potentialPayBefore10 = 12;
		int potentialPayAfter10 = 8;

		// $12 hour * 5 hours worked
		//$8 hour * 2 hours worked
		//hoursWorked is being passed from MellieWageCalc
		 potentialPayBefore10 = 12 * hoursWorked;
		 potentialPayAfter10 = 8 * hoursWorked;

		// TODO Auto-generated method stub

		if (potentialPayBefore10 < 60) {
			return potentialPayAfter10;
		} else
			return potentialPayBefore10;

	}

}
