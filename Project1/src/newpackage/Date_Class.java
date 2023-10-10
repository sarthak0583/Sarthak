package newpackage;

import java.util.Date;

public class Date_Class
{

	public static void main(String[] args)
	{
		Date d1=new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());//
		Date d2=new Date(d1.getTime()+1000*60*60*24*1);
		Date d3=new Date(d1.getTime()-1000*60*60*24*5);//millisec*hours*mins*24hours*day
		System.out.println(d2);
		System.out.println(d3);
		String dateformat=d2.toString();
		String dateformat1=d3.toString();
		int length=dateformat.length();
		System.out.println(length);
		String year=dateformat.substring(24);
		System.out.println(year);
		String month=dateformat.substring(4,7);
		System.out.println(month);
		String date=dateformat.substring(8,10);
		System.out.println(date);
		System.out.println(date.concat("-").concat(month).concat("-").concat(year));
		String year1=dateformat1.substring(24);
		System.out.println(year1);
		String month1=dateformat1.substring(4,7);
		System.out.println(month1);
		String date1=dateformat1.substring(8,10);
		System.out.println(date1);
		System.out.println(date1.concat("/").concat(month1).concat("/").concat(year1));
	}

}
