package testingDates;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateSetDateTest {
	
		//Setting  up two case scenarios to test any acceptable dates 
		@Test
		public void testAcceptableDate1() {
			Date d = new Date("January",1,2019);
			d.setDate("February", 28, 2019);
			assertEquals(new Date("February", 28, 2019),d);
		}
		
		@Test
		public void testAcceptableDate2() {
			Date d = new Date("January",1,2019);
			d.setDate("March", 31, 2019);
			assertEquals(new Date("March", 31, 2019),d);
		}
		
		//Setting up two case scenarios to test any unacceptable dates that try to change
		@Test
		public void testUnacceptableDate1() {
			Date d = new Date("January",1,2019);
			d.setDate("February", 30, 2019);
			assertEquals(new Date("January",1,2019), d);
		}
		
		@Test
		public void testUnacceptableDate2() {
			Date d = new Date("January",1,2019);
			Date expected = new Date(d);
			d.setDate("December", 34, 2019);
			assertEquals(new Date("January",1,2019), d);
		}
		
		@Test
	    public void testSetUnacceptableYear() {
	        Date d = new Date("January", 1, 2019);
	        Date expected = new Date(d);
	        d.setDate("December", 31, 999); 
	        assertEquals(new Date("January", 1, 2019), d); 
	    }
		
		 @Test
		    public void testLeapYearAcceptable() {
		        Date d = new Date("January", 1, 2020);
		        d.setDate("February", 29, 2020); 
		        assertEquals(new Date("February", 29, 2020), d);
		}

		    @Test
		    public void testLeapYearUnacceptable() {
		        Date d = new Date("January", 1, 2019);
		        d.setDate("February", 29, 2019); 
		        assertEquals(new Date("January", 1, 2019), d);
		}
		
}
