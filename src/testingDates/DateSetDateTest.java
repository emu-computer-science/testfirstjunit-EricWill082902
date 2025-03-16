package testingDates;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateSetDateTest {
	

		//Setting  up two case scenarios to test any acceptable dates 
		@Test
		public void testAcceptableDate1() {
			Date d = new Date(1,1,2019);
			d.setDate("February", 28, 2019);
			assertEquals(new Date(2, 28, 2019),d);
		}
		
		@Test
		public void testAcceptableDate2() {
			Date d = new Date(1,1,2019);
			d.setDate("March", 31, 2019);
			assertEquals(new Date(3, 31, 2019),d);
		}
		
		//Setting up two case scenarios to test any unacceptable dates that try to change
		@Test
		public void testUnacceptableDate1() {
			Date d = new Date(1,1,2019);
			d.setDate("February", 30, 2019);
			assertEquals(new Date(1,1,2019), d);
		}
		
		@Test
		public void testUnacceptableDate2() {
			Date d = new Date(1,1,2019);
			d.setDate("December", 33, 2019);
			assertEquals(new Date(1,1,2019), d);
		}
		
		@Test
	    public void testSetUnacceptableYear() {
	        Date d = new Date(1, 1, 2019);
	        d.setDate("December", 31, 999); 
	        assertEquals(new Date(1, 1, 2019), d); 
	    }
		
		 @Test
		    public void testLeapYearAcceptable() {
		        Date d = new Date(1, 1, 2020);
		        d.setDate("February", 29, 2020); 
		        assertEquals(new Date(2, 29, 2020), d);
		}

		    @Test
		    public void testLeapYearUnacceptable() {
		        Date d = new Date(1, 1, 2019);
		        d.setDate("February", 29, 2019); 
		        assertEquals(new Date(1, 1, 2019), d);
		}

		   
		    @Test
		    public void testUnacceptableMonthName() {
		        Date d = new Date(1, 1, 2019);
		        d.setDate("MadUpMonth", 10, 2019); 
		        assertEquals(new Date(1, 1, 2019), d);
		}
		
}
