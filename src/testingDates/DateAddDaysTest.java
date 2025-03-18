package testingDates;

import static org.junit.Assert.*;
import org.junit.Test;

public class DateAddDaysTest {

		//Testing two test case scenarios to retrieve the incremented date that can be found in the same month 
		@Test
		public void addDateInSameMonth1() {
			Date d = new Date("January",1,2019);
			d.addOneDay();
			assertEquals(new Date("January",2,2019),d);
		}
		
		@Test
		public void addDateInSameMonth2() {
			Date d = new Date("February",1,2019);
			d.addOneDay();
			assertEquals(new Date("February",2,2019),d);
		}
		
		@Test
		public void stayInMonth1() {
			Date d = new Date("March",1,2019);
			d.addOneDay();
			assertEquals(new Date("March",2,2019),d);
		}
		
		@Test
		public void stayInMonth2() {
			Date d = new Date("April",15,2019);
			assertEquals("Invalid", new Date("April",16,2019),d.addOneDay());
		}
		
		//Setting up test cases to add one day for both month and year 
		@Test 
		public void crossMonthDateBoundary() {
			Date d1 = new Date("June",31,2020);
			Date d2 = new Date("April", 30,2020);
			d1.addOneDay();
			d2.addOneDay();
			assertEquals(new Date("July",1,2020),d1);
			assertEquals(new Date("May",1,2020), d2);
		}
		
		@Test
		public void crossYearDateBoundary() {
			Date d = new Date("December",31,2019);
			d.addOneDay();
			assertEquals(new Date("January",1,2020),d);
		}
			
	}

