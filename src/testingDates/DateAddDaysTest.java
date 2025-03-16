package testingDates;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateAddDaysTest {

		//Testing two test case scenarios to retrieve the incremented date that can be found in the same month 
		@Test
		public void dateInSameMonth1() {
			Date d = new Date(1,1,2019);
			d.addOneDay();
			assertEquals(new Date(1,2,2019),d);
		}
		
		@Test
		public void dateInSameMonth2() {
			Date d = new Date(2,1,2019);
			d.addOneDay();
			assertEquals(new Date(2,2,2019),d);
		}
		
		
		//Setting up test cases to add one day for both month and year 
		@Test 
		public void crossMonthDateBoundary1() {
			Date d = new Date(1,30,2019);
			d.addOneDay();
			assertEquals(new Date(2,1,2019), d);
		}
		
		@Test 
		public void crossMonthDateBoundary2() {
			Date d = new Date(3,1,2020);
			d.addOneDay();
			assertEquals(new Date(4,2,2020), d);
		}
		
		@Test
		public void crossYearDateBoundary() {
			Date d = new Date(12,31,2019);
			d.addOneDay();
			assertEquals(new Date(1,1,2020),d);
		}
		
		@Test
	    public void testIncrementFebruary() {
	        Date d = new Date(2, 28, 2019);
	        d.addOneDay();
	        assertEquals(new Date(3, 1, 2019), d);
	    }
	
	}

