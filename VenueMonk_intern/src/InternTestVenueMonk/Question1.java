package InternTestVenueMonk;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Question1 {

	public static void main(String[] args) {

		//calling function
	    System.out.println(numberOfSundays());
	}
	
	private static int numberOfSundays() {
		Calendar c = (GregorianCalendar)GregorianCalendar.getInstance();
		
		//setting 1st day of month
		c.set(Calendar.DAY_OF_MONTH, 1);
		int ans = 0;
		for(int i=1901;i<2000;i++)
		{
			//set the current year to the calendar
			c.set(Calendar.YEAR, i);
			
			//for each month of given year
			for(int j=0;j<12;j++)
			{
				//set cuurent month to the calendar
				c.set(Calendar.MONTH, j);
				
				//if day of week is sunday
				if(c.get(Calendar.DAY_OF_WEEK)==6) {
					ans++;
				}
			}
		}
		return ans;
	}
}

