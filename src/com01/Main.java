package com01;

import java.util.Date;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Months;

public class Main {
	public static void main(String[] args) {
		DateTime dt = new DateTime(new Date());// 年,月,日,时,分,秒,毫秒
		System.out.println(dt.toString("yyyy-MM-dd HH:mm:ss"));
		DateTime dt2 = new DateTime("1995-6-24");// 年,月,日,时,分,秒,毫秒
		System.out.println(dt2.toString("yyyy-MM-dd HH:mm:ss"));
		Date date=new Date(dt.getMillis());
		System.out.println(date);
		System.out.println(dt2.plusDays(90).toString("yyyy-MM-dd HH:mm:ss"));
		Months m=null;
		Days day=Days.daysBetween(new DateTime("1995-5-5"), new DateTime(new Date()));
		System.out.println(day.getDays());
		System.out.println(day.getDays());
		System.out.println(day.getDays());
		System.out.println(day.getDays());

	} 
	
}
