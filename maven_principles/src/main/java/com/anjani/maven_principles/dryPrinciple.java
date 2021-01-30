package com.anjani.maven_principles;

public class dryPrinciple {
	public static void main(String[] args) {
		MyData myData=new MyData();
		myData.setYear(2017);
		myData.setMonth(15);
		myData.setDay(36);
		System.out.println(myData);
		
		MyData myData2=new MyData();
		myData2.setYear(2017);
		myData2.setMonth(15);
		myData2.setDay(36);
		System.out.println(myData2);//by using the dry principles rule ,in order to not repeate the code multiple times we used tostring

	}

	}
	class MyData{
	private long year;
	private int month;
	private int day;
	private String era="A.D";
	private String dayOfTheWeek="monday";

	public String toString() {
		return "MyDate{"+"year="+year+",month="+month+",day="+day+",era="+era+",dayOfTheWeek="+dayOfTheWeek+"}";
	}

	public String getEra() {
		return era;
	}
	public void setEra(String era)
	{
		this.era=era;
	}
	public String getDayOfTheWeek() {
		return dayOfTheWeek;
	}
	public void setDayOfTheWeek(String dayOfTheWeek)
	{
		this.dayOfTheWeek=dayOfTheWeek;
	}
	 long getyear() {
		return year;
	}
	 int getMonth()
	 {
		 return month;
	 }
	 int getDay()
	 {
		 return day;
	 }
	 void setYear(int y)
	 {
		 year=y;
	 }
	 void setMonth(int m)
	 {
		 month=m;
	 }
	 void setDay(int d)
	 {
		 day=d;
	 }

}
