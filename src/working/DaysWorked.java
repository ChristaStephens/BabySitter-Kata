package working;

import static org.junit.Assert.*;

import org.junit.Test;

public class DaysWorked {

/*	Story:
		As a babysitter
		In order to get paid for 1 night of work
		I want to calculate my nightly charge*/
	
	//Project Goal: Create test to show Mellie being paid
	
	//Start with calc time for 1 hour of work
	@Test
	public void calculatepayforworkafterstarttimeat12hourly() {
		//5 is hours worked if start at 5 pm til 10p
		MellieWageCalculator potentialPay = new MellieWageCalculator(5); 
		//assert equals gives -> (expected, actual)
		assertEquals(60, potentialPay.calculatePay());
	}
	
	@Test
	public void calculatepayforworkafter10pmat8hourly() {
		//2 hours worked if start at 10pm til 12 pm
		MellieWageCalculator potentialPay = new MellieWageCalculator(2);
		assertEquals(16, potentialPay.calculatePay());
		
	}

}
