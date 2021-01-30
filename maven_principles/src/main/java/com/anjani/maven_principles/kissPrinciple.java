package com.anjani.maven_principles;

public class kissPrinciple {
	public static void main(String[] args) {
	    try {
			System.out.println(weekday(1));
			}catch(Exception e)
		     {
				System.out.println(e.getMessage());
		     }
	}
	private static String weekday(int day) throws Exception{
		if((day<1)||(day>7)) throw new Exception("day must be range 1 to 7");
		String[] days= {
				"monday",
				"tuesday",
				"wednesday",
				"thursday",
				"friday",
				"saturday",
				"sunday"
		};
		return days[day-1];
	}
}
