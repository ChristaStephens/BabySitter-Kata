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
		MellieWageCalculator potentialPay = new MellieWageCalculator(5); 
		assertEquals(12, potentialPay.calculatePay());
	}

}
