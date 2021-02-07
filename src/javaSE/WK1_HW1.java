package javaSE;

import java.util.Calendar;
import java.util.Date;
/*
We have a parrot that likes to squawk at night in its cage when it’s scared. 
Write a method named getUp that has 2 parameters
1st parameter  should be a boolean and be named squawking it represent the parrot.
2nd parameter represents the hour of the day and is an int named currentHour has a valid range of 0-23.
We have to get up if the parrot is squawking before 6 or after 22 hours so in that case return true.
All other cases will return false. If the currentHour parameter is less than 0 or greater than 23 return false
*/

public class WK1_HW1 {
	static boolean getUp(int currentHour)
	{
	    if(currentHour < 6 || currentHour > 22)	return true;
	    else return false;
	};
	public static void main(String[] args) {

//call getUp method depending upon system time(hours)
Date dt = new Date();
Calendar calendar = Calendar.getInstance();
calendar.setTime(dt);
int hours = calendar.get(Calendar.HOUR_OF_DAY);
//int hours = 15;
boolean flag = getUp(hours);
if(flag)
	System.out.println("Hour now is: "+ hours + " boolean returned is: " + flag + " so don't wake up");
else
	System.out.println("Hours now is: "+ hours + " boolean returned is: " + flag + " so time to wake up");

	}

}
