package Prac;

import java.util.Scanner;

public class Calender {
	public static void main(String[] args) {
		int year,month;
		
		try (Scanner sc = new Scanner(System.in)){
			System.out.print("년도 월 입력");
			year = sc.nextInt();
			month = sc.nextInt();
			
			printCalender(year,month);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	} // main

	private static void printCalender(int year, int month) {
		
		int dayOfWeek = getDayOfWeek(year,month,1);
		int lastDay = getLastDay(year,month);
		
		System.out.printf("\t\t[%d년 %d월]\n",year,month);
		System.out.println("-".repeat(60));
		String week = "일월화수목금토";
		for (int i = 0; i < week.length(); i++) {
			System.out.printf("\t%c",week.charAt(i));
		} // for
		System.out.println();
		System.out.println("-".repeat(60));
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.println("\t");
			if ( (i + dayOfWeek ) %7 ==0) {
				System.out.println();
			} // if
		} // for
		System.out.println();
		System.out.println("-".repeat(60));
	}

	private static int getDayOfWeek(int year, int month, int day) {
		
		int totalDays = getTotalDays(year,month, day);
		int dayOfWeek = totalDays%7;
		System.out.println("일월화수목금토일".charAt(dayOfWeek));
		return dayOfWeek;
		}

	private static int getTotalDays(int year, int month, int day) {
		int totalDays =0;
		totalDays = (year-1)*365+(year-1)/4-(year-1)/10+(year-1)/400;
		for (int i = 0; i <month; i++) {
			totalDays +=getLastDay(year, i);
		} // for
		return totalDays;
	}

	private static int getLastDay(int year, int month) {
		int lastDay =0;
		int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
		lastDay = months[month-1];
		if(month == 2 && days08.Ex05.isLeapYear(year)) lastDay++;
		return lastDay;
	}

}
