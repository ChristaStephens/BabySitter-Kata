package working;

public class MellieWageCalculator {

	public MellieWageCalculator(int potentialPay) {
		// TODO Auto-generated constructor stub
	}

	public Object calculatePay() {
		int potentialPayBefore10 = 12;
		int potentialPayAfter10 = 8;
		
		//$12 hour * 5 hours worked
		potentialPayBefore10 = 12*5;
		potentialPayAfter10 = 8*2;
		
		int totalPayAfter10 = potentialPayAfter10;
		// TODO Auto-generated method stub
		
		if (potentialPayBefore10 != potentialPayAfter10) {
			return totalPayAfter10;
		}
		
		return potentialPayBefore10;
	}

}
