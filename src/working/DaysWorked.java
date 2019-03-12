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
	public void calculatepayforworkafterstarttime() {
		//5 is hours worked if start at 5 pm til 10p
		MellieWageCalculator potentialPay = new MellieWageCalculator(5); 
		assertEquals(60, potentialPay.calculatePay());
	}

}
